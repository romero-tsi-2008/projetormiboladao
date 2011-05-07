/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import java.io.Serializable;
import java.util.ArrayList;
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
}