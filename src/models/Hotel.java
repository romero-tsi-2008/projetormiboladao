/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import interfaces.HotelIF;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
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
    private double diaria;
    private List<Quarto> quartos;
    private List<Hospede> hospedesCadastrados;
    

    public Hotel() throws RemoteException {
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

    public void setDiaria(double diaria) {
		this.diaria = diaria;
	}

	public double getDiaria() {
		return diaria;
	}

	public List<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(List<Quarto> quartos) {
        this.quartos = quartos;
    }
    
	public void setHospedesCadastrados(List<Hospede> hospedesCadastrados) {
		this.hospedesCadastrados = hospedesCadastrados;
	}

	public List<Hospede> getHospedesCadastrados() {
		return hospedesCadastrados;
	}
	
	public int getNumQuartosOcupados() {
		int cont = 0;
		for (Quarto q : quartos) {
			if (q.isOcupado() == true) {
				cont++;
			}
		}
		return cont;
	}
	
	public int getNumQuartosLivres() {
		int cont = 0;
		for (Quarto q : quartos) {
			if (q.isOcupado() == false) {
				cont++;
			}
		}
		return cont;
	}
	
    @Override
    public String toString() {
    	String impressora = "";
    	int contador = 1;
    	impressora = "Nome: "+ getNome() + "\nEndereço: "+ getEndereco() + "\nQuantidade de quartos: "+quartos.size()+
    					"\nQuartos livres: "+getNumQuartosLivres()+"\nQuartos ocupados: "+getNumQuartosOcupados()+"\nHóspedes cadastrados: "+
    					hospedesCadastrados.size()+"\nLista de hóspedes:";
    	for (Hospede h : hospedesCadastrados) {
    		impressora += "\n"+String.valueOf(contador) + ".\n";
    		impressora += h.toString();
    		contador += 1;
    	}
    	impressora += "\n\n---";
    	return impressora;
    }
}