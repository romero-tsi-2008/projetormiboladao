package dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import models.Hospede;
import models.Hotel;
import models.Quarto;
import models.Reserva;

public class HotelDAO extends GenericDAO {
	
	public HotelDAO() throws Exception {
		super();
	}
	
	public Hotel getHotelByName(String name) {
		ArrayList<Object> hoteis;
        for (String s : banco.keySet()) {
            if (s.equals("HOTEL")) {
            	hoteis = banco.get(s);
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
	
	public Quarto getQuartoByNum(String nomeHotel, int num) {
		Hotel hotelAux = getHotelByName(nomeHotel);
        for (Quarto q : hotelAux.getQuartos()) {
        	if (q.getNum() == num) {
        		return q;
        	}
        }
        return null;
	}
		
	public boolean addQuarto(String nomeHotel, Quarto q) {
		Hotel hotel = getHotelByName(nomeHotel);
        hotel.getQuartos().add(q);
        return true;
    }

    public boolean deleteQuarto(String nomeHotel, int num) {
    	Hotel hotel = getHotelByName(nomeHotel);
        for (int i = 0; i<= hotel.getQuartos().size(); i++) {
            if (num == (hotel.getQuartos().get(i).getNum())) {
                hotel.getQuartos().remove(i);
                return true;
            }
        }
        return false;
    }
    
    public boolean cadastrarCliente(String nomeHotel, String nome, String cpf, String email, String telefone) {
    	Hotel hotel = getHotelByName(nomeHotel);
    	
    	if (hotel.getHospedesCadastrados().size() > 0) {
    		for (Hospede h : hotel.getHospedesCadastrados()) {
    			if (h.getCpf().equals(cpf)) {
    				System.out.println("ERRO: o hospede "+h.getNome()+" ja se encontra cadastrado em no hotel "+hotel.getNome()+"!");
    				return false;
    			}
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
    
    public boolean reservarQuarto(String nomeHotel, int numQuarto, String cpf, String dataEntrada, String dataSaida) {
    	Hotel hotel = getHotelByName(nomeHotel);
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
		    							System.out.println("ERRO: nao eh possivel realizar reserva pois o hospede "+h.getNome()+"possui pendencia financeiras relativas a sua ultima hospedagem");
		    							return false;
		    						}
		    					}
		    				}
    					}
    					
    					for (Reserva r : q.getReservas()) {
    						if (r.getDataSaida().before(entradaCalendar)) { //se a data de entrada da nova reserva for depois da data de saida da ultima reserva
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
    		    							System.out.println("ERRO: nao eh possivel realizar reserva pois o hopede "+h.getNome()+"possui pendencia financeiras relativas a sua ultima hospedagem");
    		    							return false;
    		    						}
    		    					}
    		    				}
    						}
    						else {
    							System.out.println("Desculpe, nao eh possivel reservar o quarto "+q.getNum()+" do hotel "+hotel.getNome()+" no periodo requisitado");
    							return false;
    						}
    					}
    				}
    				catch (Exception e) {
    					e.printStackTrace();
    				}    				
    				
    				System.out.println("O quarto "+q.getNum()+" do hotel "+hotel.getNome()+" foi reservado com sucessp para o hospede "+hospedeEmQuestao.getNome()+" para o periodo de "+dataEntrada+ " a "+dataSaida);
    				return true;
    			}
    			else {
    				System.out.println("Desculpe, o quarto estao ocupado e nao pode ser reservado");
    				return false;
    			}
    		}
    	}
    	return true;
    }
    
    public boolean alocarHospedeQuarto(String nomeHotel, int num, String cpf, String dataTermino) throws ParseException {
    	Hotel hotel = getHotelByName(nomeHotel);
    	Quarto quartoAux = getQuartoByNum(nomeHotel, num);
    	Hospede hospedeAux = getHospedeByCpf(nomeHotel, cpf);
    	for (Quarto q : hotel.getQuartos()) {
    		if (q.getNum() == num && !q.isOcupado()) {
    			q.setHospede(hospedeAux);
    			q.setOcupado(true);
    			quartoAux = q;
    			
    			//setando a data de inicio e fim quando um hospede eh alocado ao quarto
    			SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
				Calendar terminoCalendar = new GregorianCalendar();
				terminoCalendar.setTime(formatador.parse(dataTermino));
				
				Calendar hoje = new GregorianCalendar();
    			hospedeAux.getUltimaHospedagem().setDataInicio(hoje);
    			hospedeAux.getUltimaHospedagem().setDataTermino(terminoCalendar);
    			long diferenca = terminoCalendar.getTimeInMillis() - hoje.getTimeInMillis();
    			int diasEntreDatas = (int) (diferenca / (86400000));
    			hospedeAux.getUltimaHospedagem().setNumDiarias(diasEntreDatas);
    			
    			System.out.println("Hospede "+hospedeAux.getNome()+" alocado ao quarto "+quartoAux.getNum()+" com sucesso");
    			return true;
    		}
    	}
    	return false;
    }
    
    public boolean pagarDivida(String nomeHotel, String cpf, double valor) {
    	Hotel hotel = getHotelByName(nomeHotel);
    	Hospede hospedeAux = getHospedeByCpf(nomeHotel, cpf);  
    	if (hospedeAux.getUltimaHospedagem().getDivida() > 0) {
    		double valorDivida = hospedeAux.getUltimaHospedagem().getDivida();
    		if (valor == valorDivida) {
    			hospedeAux.getUltimaHospedagem().setDivida(valor - hospedeAux.getUltimaHospedagem().getDivida());
    			System.out.println("Divida do hospede "+ hospedeAux.getNome()+" do quarto "+ hospedeAux.getUltimaHospedagem().getQuarto().getNum()+ " com valor de R$:"+ hospedeAux.getUltimaHospedagem().getDivida()+ " paga com sucesso");
    			return true;
    		}
    	}
    	else {
    		System.out.println("Voce nao possui dividas!");
    		return false;
    	}
    	return true;
    }
    
    public void consultarPendenciaFinanceiraHospede(String nomeHotel, String cpf) {
    	Hospede hospedeAux = getHospedeByCpf(nomeHotel, cpf);
    	if (hospedeAux.getUltimaHospedagem().getDivida() > 0) {
    		System.out.println("O hospede "+hospedeAux.getNome()+ " de CPF = "+hospedeAux.getCpf()+" possui dividas no valor de R$:"+hospedeAux.getUltimaHospedagem().getDivida()+" devido a sua ultima hospedagem no quarto " +hospedeAux.getUltimaHospedagem().getQuarto().getNum()+" do hotel "+nomeHotel);
    	}
    	else {
    		System.out.println("O hospede "+hospedeAux.getNome()+ " de CPF = "+hospedeAux.getCpf()+" nao possui dividas no hotel "+ nomeHotel);
    	}
    }
    
    public Hospede getHospedeByCpf(String nomeHotel, String cpf) {
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
    	Hotel hotelAux = getHotelByName(nomeHotel);
    	
    	for (Hospede h : hotelAux.getHospedesCadastrados()) {
    		if (h.getCpf().equals(cpf)) {
    			return h;
    		}
    	}
    	return null;
	}
	
	public boolean removeHospedeByCpf(String nomeHotel, String cpf) {
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
		Hospede hospedeAux = getHospedeByCpf(nomeHotel, cpf);
		Hotel hotelAux = getHotelByName(nomeHotel);
		
    	for (Hospede h : hotelAux.getHospedesCadastrados()) {
    		if (h.getCpf().equals(cpf)) {
    			hotelAux.getHospedesCadastrados().remove(h);
    			return true;
    		}
    	}
    	return false;
	}
	
	public double gerarContaHospede(String nomeHotel, String cpf) {
		Hotel hotelAux = getHotelByName(nomeHotel);
		Hospede hospedeAux = getHospedeByCpf(nomeHotel, cpf);
		
		for (Quarto q : hotelAux.getQuartos()) {
			if (q.getHospede().getCpf().equals(cpf)) {
				if (q.isOcupado()) {
					return 100 * (q.getHospede().getUltimaHospedagem().getNumDiarias());
				}
			}
		}
		return 0;
	}
	
}
