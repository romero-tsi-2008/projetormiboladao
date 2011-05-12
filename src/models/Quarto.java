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
    private List<Reserva> reservas;

    public Quarto() {}

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