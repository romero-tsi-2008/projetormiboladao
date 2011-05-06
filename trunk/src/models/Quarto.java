/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;

/**
 *
 * @author romero
 */
public class Quarto implements Serializable {
    private int num;
    private boolean ocupado;
    private Reserva reserva;

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

    public Reserva getReserva() {
        return reserva;
}

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}