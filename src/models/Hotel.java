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
    
    // MÉTODOS DE GERENCIAMENTO DO HOTEL
    
    public boolean reservarQuarto(int numQuarto, String cpf, String dataEntrada, String dataSaida) {
    	for (Quarto q : quartos) {
    		if (q.getNum() == numQuarto) {
    			if (!q.isOcupado()) {
    				SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    				try {
    					Calendar c = new GregorianCalendar();
    					c.setTime(formatador.parse(dataEntrada));
    					q.getReserva().setDataEntrada(c);
    					
    					c.setTime(formatador.parse(dataSaida));
    					q.getReserva().setDataSaida(c);
    				}
    				catch (Exception e) {
						e.printStackTrace();
					}
    				
    				for (Hospede h : hospedesCadastrados) {
    					if (h.getCpf().equals(cpf)) {
    						q.getReserva().setHospede(h);
    					}
    				}
    				
    				//falta verificar se o hospede possui debito com o hotel de acordo com a ultima hospedagem
    				
    				q.setOcupado(true);
    				System.out.println("Reserva realizada com sucesso!");
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