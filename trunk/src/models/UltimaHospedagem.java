/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author romero
 */
public class UltimaHospedagem implements Serializable {
    private Calendar dataInicio;
    private Calendar dataTermino;
    private Hotel hotel;
    private Quarto quarto;
    private double divida;
    private int numDiarias;
    
    public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Calendar getDataInicio() {
		return dataInicio;
	}

	public void setDataTermino(Calendar dataTermino) {
		this.dataTermino = dataTermino;
	}

	public Calendar getDataTermino() {
		return dataTermino;
	}

	public UltimaHospedagem() {
    	divida = 0;
    }
   
    

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

	public void setDivida(double divida) {
		this.divida = divida;
	}

	public double getDivida() {
		return divida;
	}

	public void setNumDiarias(int numDiarias) {
		this.numDiarias = numDiarias;
	}

	public int getNumDiarias() {
		return numDiarias;
	}
}
