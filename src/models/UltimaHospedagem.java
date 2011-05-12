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
class UltimaHospedagem implements Serializable {
    private Calendar data;
    private Hotel hotel;
    private Quarto quarto;
    private double divida;
    
    public UltimaHospedagem() {
    	divida = 0;
    }
   
    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
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
}
