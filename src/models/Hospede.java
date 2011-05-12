/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import interfaces.HospedeIF;

import java.io.Serializable;

/**
 *
 * @author romero
 */
public class Hospede implements Serializable, HospedeIF {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String cpf;
    private UltimaHospedagem ultimaHospedagem;

    public Hospede() {
    	ultimaHospedagem = new UltimaHospedagem();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public UltimaHospedagem getUltimaHospedagem() {
        return ultimaHospedagem;
    }

    public void setUltimaHospedagem(UltimaHospedagem ultimaHospedagem) {
        this.ultimaHospedagem = ultimaHospedagem;
    }
    
    @Override
    public String toString() {
    	return "Nome: "+ getNome() + "\nCPF: "+getCpf()+" \nE-mail: "+ getEmail() + "\nTelefone: " + getTelefone() + " \nEndereço: " + getEndereco() + "\nPossui dívida de: "+getUltimaHospedagem().getDivida()+" reais\n---";
    }
    
    //----------------------------------------------------------------
    
    public boolean pagarDivida(double valor) {
    	if (getUltimaHospedagem().getDivida() > 0) {
    		double valorDivida = getUltimaHospedagem().getDivida();
    		if (valor == valorDivida) {
    			getUltimaHospedagem().setDivida(valor - getUltimaHospedagem().getDivida());
    			System.out.println("Dívida do hóspede "+this.getNome()+" do quarto "+getUltimaHospedagem().getQuarto().getNum()+" com valor de R$:"+getUltimaHospedagem().getDivida()+" paga com sucesso");
    			return true;
    		}
    		 
    	}
    	else {
    		System.out.println("Você não possui dívidas!");
    		return false;
    	}
    	return true;
    }
    
    public void consultarPendenciaFinanceira() {
    	if (getUltimaHospedagem().getDivida() > 0) {
    		System.out.println("O hóspede "+getNome()+ " de CPF = "+getCpf()+" possui dívida no valor de R$:"+getUltimaHospedagem().getDivida()+" devido à sua última hospedagem no quarto " +getUltimaHospedagem().getQuarto().getNum()+" do hotel "+getUltimaHospedagem().getHotel().getNome());
    	}
    	else {
    		System.out.println("O hóspede "+getNome()+ " de CPF = "+getCpf()+" não possui dívida no hotel "+getUltimaHospedagem().getHotel().getNome());
    	}
    }

}
