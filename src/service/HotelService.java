package service;

import interfaces.HotelIF;

import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;

import models.Hospede;
import models.Hotel;
import models.Quarto;
import models.Reserva;
import dao.HospedeDAO;
import dao.HotelDAO;

public class HotelService extends UnicastRemoteObject implements  HotelIF {
	HotelDAO daoHotel; 
	HospedeDAO daoHospede;
	
	public HotelService(String nomeHotel) throws Exception {
		daoHotel = new HotelDAO(nomeHotel);
		daoHospede = new HospedeDAO();
	}
	
	public boolean addQuarto(Quarto q) {
		return daoHotel.addQuarto(q);
    }

    public boolean deleteQuarto(int num) {
    	return daoHotel.deleteQuarto(num);
    }
    
    public boolean cadastrarCliente(String nome, String cpf, String email, String telefone) {
    	return daoHotel.cadastrarCliente(nome, cpf, email, telefone);
    }
    
    public boolean reservarQuarto(int numQuarto, String cpf, String dataEntrada, String dataSaida) {
    	return daoHotel.reservarQuarto(numQuarto, cpf, dataEntrada, dataSaida);
    }
    
    public boolean alocarHospedeQuarto(int num, String cpf) {
    	return alocarHospedeQuarto(num, cpf);
    }
    
    public boolean pagarDivida(String cpf, double valor) {
    	return daoHotel.pagarDivida(cpf, valor);
    }
    
    public void consultarPendenciaFinanceiraHospede() {
    	consultarPendenciaFinanceiraHospede();
    }
       
    public Hospede getHospedeByCpf(String cpf) {
    	return daoHotel.getHospedeByCpf(cpf);
    }
    
	public boolean removeHospedeByCpf(String cpf) {
		return daoHotel.removeHospedeByCpf(cpf);
	}
    
    public void testar() {
    	System.out.println("---TESTANDO---");
    }

}
