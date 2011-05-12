/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import dao.GenericDAO;

/**
 *
 * @author romero
 */
public class Hotel implements Serializable {
    private String nome;
    private String endereco;
    private String nomeGerente;
    private List<Quarto> quartos;
    private List<Reserva> reservas;
    private List<Hospede> hospedesCadastrados;

    public Hotel() {
        quartos = new ArrayList<Quarto>();
        hospedesCadastrados = new ArrayList<Hospede>();
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeGerente() {
        return nomeGerente;
    }

    public void setNomeGerente(String nomeGerente) {
        this.nomeGerente = nomeGerente;
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(List<Quarto> quartos) {
        this.quartos = quartos;
    }
    
    public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setHospedesCadastrados(List<Hospede> hospedesCadastrados) {
		this.hospedesCadastrados = hospedesCadastrados;
	}

	public List<Hospede> getHospedesCadastrados() {
		return hospedesCadastrados;
	}

	public void addQuarto(Quarto q) {
        this.quartos.add(q);
    }

    public void deleteQuarto(int num) {
        for (int i = 0; i<= quartos.size(); i++) {
            if (num == (quartos.get(i).getNum())) {
                quartos.remove(i);
            }
        }
    }
    
    @Override
    public String toString() {
    	String impressora = "";
    	int contador = 1;
    	impressora = "Nome: "+ getNome() + "\nEndereço: "+ getEndereco() + "\nHóspedes cadastrados: "+hospedesCadastrados.size()+"\nLista de hóspedes:";
    	for (Hospede h : hospedesCadastrados) {
    		impressora += "\n"+String.valueOf(contador) + ".\n";
    		impressora += h.toString();
    		contador += 1;
    	}
    	impressora += "\n\n---";
    	return impressora;
    }
    
    // MÉTODOS DE GERENCIAMENTO DO HOTEL
    
    public void cadastrarCliente(String nome, String cpf, String email, String telefone) throws Exception {
    	for (Hospede h : hospedesCadastrados) {
    		if (h.getCpf().equals(cpf)) {
    			System.out.println("ERRO: o hóspede "+h.getNome()+" já se encontra cadastrado em no hotel "+this.nome+"!");
    			return;
    		}
    	}
    	
    	Hospede novoHospede = new Hospede();
    	novoHospede.setNome(nome);
    	novoHospede.setCpf(cpf);
    	novoHospede.setEmail(email);
    	novoHospede.setTelefone(telefone);
    	
    	hospedesCadastrados.add(novoHospede);
    	
//    	GenericDAO dao = new GenericDAO("banco.bin");
//    	dao.insertObject("Hospede", novoHospede);
//    	dao.commit();
//    	dao.close();
    }
    
    public boolean reservarQuarto(int numQuarto, String cpf, String dataEntrada, String dataSaida) {
    	Hospede hospedeEmQuestao = new Hospede();
    	for (Quarto q : quartos) {
    		if (q.getNum() == numQuarto) {
    			if (!q.isOcupado()) {
    				try {
    					SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    					Calendar saidaCalendar = new GregorianCalendar();
    					saidaCalendar.setTime(formatador.parse(dataEntrada));

    					Calendar entradaCalendar = new GregorianCalendar();
    					entradaCalendar.setTime(formatador.parse(dataSaida));    						

    					for (Reserva r : q.getReservas()) {
    						if (r.getDataSaida().before(saidaCalendar)) { //se a data 
    							Calendar hoje = new GregorianCalendar(); //pegando a data atual

    							Reserva novaReserva = new Reserva();
    							novaReserva.setDataPedido(hoje);
    							novaReserva.setDataEntrada(entradaCalendar);
    							novaReserva.setDataSaida(saidaCalendar);   		
    							
    							for (Hospede h : hospedesCadastrados) {
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
    							System.out.println("Desculpe, não é possível reservar o quarto "+q.getNum()+" do hotel "+this.getNome()+" no período requisitado");
    							return false;
    						}
    					}
    				}
    				catch (Exception e) {
    					e.printStackTrace();
    				}    				
    				
    				System.out.println("O quarto "+q.getNum()+" do hotel "+this.getNome()+" foi reservado com sucessp para o hóspede "+hospedeEmQuestao.getNome()+" para o período de "+dataEntrada+ " a "+dataSaida);
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
    
}