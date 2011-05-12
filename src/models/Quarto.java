/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.*;

/**
 *
 * @author romero
 */
public class Quarto implements Serializable {
    private int num;
    private boolean ocupado;
    private Hospede hospede;
    private List<Reserva> reservas;

    public Quarto(int num) {
    	this.num = num;
    	hospede = new Hospede();
    	ocupado = false;
    	reservas = new ArrayList<Reserva>();
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}

	public Hospede getHospede() {
		return hospede;
	}

	public void setReservas(List<Reserva> reserva) {
		this.reservas = reserva;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}
	
	public void addReserva(Reserva novaReserva) {
		reservas.add(novaReserva);
	}

}