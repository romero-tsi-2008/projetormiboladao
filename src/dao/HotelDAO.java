package dao;

import java.text.SimpleDateFormat;
import java.util.*;

import models.Hospede;
import models.Hotel;
import models.Quarto;
import models.Reserva;

public class HotelDAO extends GenericDAO {
	Hotel hotel;
	
	public Hotel getHotel() {
		return hotel;
	}

	public HotelDAO(String nomeHotel) throws Exception {
		super();
		hotel = getHotelByName(nomeHotel);
	}
	
	public Hotel getHotelByName(String name) {
		ArrayList<Object> hoteis = new ArrayList<Object>();
        for (String s : banco.keySet()) {
            if (s.equals("Hotel")) {
            	hoteis = banco.get(name);
            	Iterator it = hoteis.iterator();
            	while (it.hasNext()) {
            		Hotel h = (Hotel) it.next();
            		if (h.getNome().equals(name)) {
            			return h;
            		}
            	}
            }
        }
        return null;
	}
	
	public void removeHotelByNome(String name) {
		ArrayList<Object> hoteis = new ArrayList<Object>();
        for (String s : banco.keySet()) {
            if (s.equals("Hotel")) {
            	hoteis = banco.get(name);
            	Iterator it = hoteis.iterator();
            	while (it.hasNext()) {
            		Hotel h = (Hotel) it.next();
            		if (h.getNome().equals(name)) {
            			banco.get(name).remove(h);
            		}
            	}
            }
        }
	}
	
    public void removeHotel(String HotelName) {
    	if(banco.containsKey("Hotel")) {
	    	for (int i=0; i<banco.get("Hotel").size(); i++) {
	    		Hotel hotelAux = (Hotel) banco.get("Hotel").get(i); 
	    		if (hotelAux.getNome().equals(HotelName)) {
	    			banco.get("Hotel").remove(i);
	    		}
	    	}
    	}
    }
	
	public String listarHoteis() {
		String impressora = "";
		ArrayList<Object> hoteis = new ArrayList<Object>();
		for (String s : banco.keySet()) {
			Iterator it = hoteis.iterator();
			while (it.hasNext()) {
				Hotel h = (Hotel) it.next();
				impressora += h.getNome()+"\n";
			}
		}
		return impressora;
	}
	
	public boolean addQuarto(Quarto q) {
        hotel.getQuartos().add(q);
        return true;
    }

    public boolean deleteQuarto(int num) {
        for (int i = 0; i<= hotel.getQuartos().size(); i++) {
            if (num == (hotel.getQuartos().get(i).getNum())) {
                hotel.getQuartos().remove(i);
                return true;
            }
        }
        return false;
    }
    
    public boolean cadastrarCliente(String nome, String cpf, String email, String telefone) {
    	for (Hospede h : hotel.getHospedesCadastrados()) {
    		if (h.getCpf().equals(cpf)) {
    			System.out.println("ERRO: o hóspede "+h.getNome()+" já se encontra cadastrado em no hotel "+hotel.getNome()+"!");
    			return false;
    		}
    	}
    	
    	Hospede novoHospede = new Hospede();
    	novoHospede.setNome(nome);
    	novoHospede.setCpf(cpf);
    	novoHospede.setEmail(email);
    	novoHospede.setTelefone(telefone);
    	
    	hotel.getHospedesCadastrados().add(novoHospede);
    	return true;
    }
    
    public boolean reservarQuarto(int numQuarto, String cpf, String dataEntrada, String dataSaida) {
    	Hospede hospedeEmQuestao = new Hospede();
    	for (Quarto q : hotel.getQuartos()) {
    		if (q.getNum() == numQuarto) {
    			if (!q.isOcupado()) {
    				try {
    					SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    					Calendar saidaCalendar = new GregorianCalendar();
    					saidaCalendar.setTime(formatador.parse(dataEntrada));

    					Calendar entradaCalendar = new GregorianCalendar();
    					entradaCalendar.setTime(formatador.parse(dataSaida));    						

    					if (q.getReservas().size() == 0) {
    						Calendar hoje = new GregorianCalendar(); //pegando a data atual

							Reserva novaReserva = new Reserva();
							novaReserva.setDataPedido(hoje);
							novaReserva.setDataEntrada(entradaCalendar);
							novaReserva.setDataSaida(saidaCalendar);   		
							
							for (Hospede h : hotel.getHospedesCadastrados()) {
		    					if (h.getCpf().equals(cpf)) {
		    						hospedeEmQuestao = h;
		    						if (h.getUltimaHospedagem().getDivida() == 0) {
		    							novaReserva.setHospede(h);
		    						}
		    						else {
		    							System.out.println("ERRO: não é possível realizar reserva pois o hóspede "+h.getNome()+"possui pendência financeiras relativas à sua última hospedagem");
		    							return false;
		    						}
		    					}
		    				}
    					}
    					
    					for (Reserva r : q.getReservas()) {
    						if (r.getDataSaida().before(saidaCalendar)) { //se a data 
    							Calendar hoje = new GregorianCalendar(); //pegando a data atual

    							Reserva novaReserva = new Reserva();
    							novaReserva.setDataPedido(hoje);
    							novaReserva.setDataEntrada(entradaCalendar);
    							novaReserva.setDataSaida(saidaCalendar);   		
    							
    							for (Hospede h : hotel.getHospedesCadastrados()) {
    		    					if (h.getCpf().equals(cpf)) {
    		    						hospedeEmQuestao = h;
    		    						if (h.getUltimaHospedagem().getDivida() == 0) {
    		    							novaReserva.setHospede(h);
    		    						}
    		    						else {
    		    							System.out.println("ERRO: não é possível realizar reserva pois o hóspede "+h.getNome()+"possui pendência financeiras relativas à sua última hospedagem");
    		    							return false;
    		    						}
    		    					}
    		    				}
    						}
    						else {
    							System.out.println("Desculpe, não é possível reservar o quarto "+q.getNum()+" do hotel "+hotel.getNome()+" no período requisitado");
    							return false;
    						}
    					}
    				}
    				catch (Exception e) {
    					e.printStackTrace();
    				}    				
    				
    				System.out.println("O quarto "+q.getNum()+" do hotel "+hotel.getNome()+" foi reservado com sucessp para o hóspede "+hospedeEmQuestao.getNome()+" para o período de "+dataEntrada+ " a "+dataSaida);
    				return true;
    			}
    			else {
    				System.out.println("Desculpe, o quarto está ocupado e não pode ser reservado");
    				return false;
    			}
    		}
    	}
    	return true;
    }
    
    public boolean alocarHospedeQuarto(int num, String cpf) {
    	Quarto quartoAux = null;
    	Hospede hospedeAux = this.getHospedeByCpf(cpf);
    	for (Quarto q : hotel.getQuartos()) {
    		if (q.getNum() == num) {
    			q.setHospede(hospedeAux);
    			q.setOcupado(true);
    			quartoAux = q;
    			System.out.println("Hóspede "+hospedeAux.getNome()+" alocado ao quarto "+quartoAux.getNum()+" com sucesso");
    			return true;
    		}
    	}
    	return false;
    }
    
    public boolean pagarDivida(String cpf, double valor) {
    	Hospede hospedeAux = this.getHospedeByCpf(cpf);  
    	if (hospedeAux.getUltimaHospedagem().getDivida() > 0) {
    		double valorDivida = hospedeAux.getUltimaHospedagem().getDivida();
    		if (valor == valorDivida) {
    			hospedeAux.getUltimaHospedagem().setDivida(valor - hospedeAux.getUltimaHospedagem().getDivida());
    			System.out.println("Dívida do hóspede "+ hospedeAux.getNome()+" do quarto "+ hospedeAux.getUltimaHospedagem().getQuarto().getNum()+ " com valor de R$:"+ hospedeAux.getUltimaHospedagem().getDivida()+ " paga com sucesso");
    			return true;
    		}
    	}
    	else {
    		System.out.println("Você não possui dívidas!");
    		return false;
    	}
    	return true;
    }
    
    public void consultarPendenciaFinanceiraHospede(String cpf) {
    	Hospede hospedeAux = getHospedeByCpf(cpf);
    	if (hospedeAux.getUltimaHospedagem().getDivida() > 0) {
    		System.out.println("O hóspede "+hospedeAux.getNome()+ " de CPF = "+hospedeAux.getCpf()+" possui dívida no valor de R$:"+hospedeAux.getUltimaHospedagem().getDivida()+" devido à sua última hospedagem no quarto " +hospedeAux.getUltimaHospedagem().getQuarto().getNum()+" do hotel "+hospedeAux.getUltimaHospedagem().getHotel().getNome());
    	}
    	else {
    		System.out.println("O hóspede "+hospedeAux.getNome()+ " de CPF = "+hospedeAux.getCpf()+" não possui dívida no hotel "+hospedeAux.getUltimaHospedagem().getHotel().getNome());
    	}
    }
    
    public Hospede getHospedeByCpf(String cpf) {
//		ArrayList<Object> hospedes = new ArrayList<Object>();
//		for (String s : banco.keySet()) {
//			if (s.equals("Hospede")) {
//				hospedes = banco.get("Hospede");
//				Iterator it = hospedes.iterator();
//				while (it.hasNext()) {
//					Hospede h = (Hospede) it.next();
//					if (h.getCpf().equals(cpf)) {
//						return h;
//					}
//				}
//			}
//		}
//		return null;
    	for (Hospede h : hotel.getHospedesCadastrados()) {
    		if (h.getCpf().equals(cpf)) {
    			return h;
    		}
    	}
    	return null;
	}
	
	public boolean removeHospedeByCpf(String cpf) {
//		ArrayList<Object> hospedes = new ArrayList<Object>();
//        for (String s : banco.keySet()) {
//            if (s.equals("Hospede")) {
//            	hospedes = banco.get(cpf);
//            	Iterator it = hospedes.iterator();
//            	while (it.hasNext()) {
//            		Hospede h = (Hospede) it.next();
//            		if (h.getNome().equals(cpf)) {
//            			banco.get(cpf).remove(h);
//            			return true;
//            		}
//            	}
//            }
//        }
//        return false;
    	for (Hospede h : hotel.getHospedesCadastrados()) {
    		if (h.getCpf().equals(cpf)) {
    			hotel.getHospedesCadastrados().remove(h);
    			return true;
    		}
    	}
    	return false;
	}
	
}
