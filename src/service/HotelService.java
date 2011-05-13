package service;

import interfaces.HotelIF;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;

import models.Hospede;
import models.Hotel;
import models.Quarto;
import models.Reserva;
import dao.HotelDAO;

public class HotelService extends UnicastRemoteObject implements  HotelIF {
	HotelDAO daoHotel; 
	
	public HotelService() throws Exception {
	}
	
//	Hotel
	
	@Override
	public Hotel getHotelByNome(String nomeHotel) throws RemoteException {
		return daoHotel.getHotelByNome(nomeHotel);
	}

	@Override
	public void removeHotelByNome(String nomeHotel) throws RemoteException {
		daoHotel.removeHotelByNome(nomeHotel);
	}

	@Override
	public String listarHoteis() throws RemoteException {
		return daoHotel.listarHoteis();
	}
	
	@Override
	public HashMap<Quarto, ArrayList<Reserva>> getAllReservasPorQuarto(String nomeHotel) throws RemoteException {
		return daoHotel.getAllReservasPorQuarto(nomeHotel);
	}
	
//	Quarto
	
	@Override
	public boolean addQuarto(String nomeHotel, Quarto q) throws RemoteException {
		return daoHotel.addQuarto(nomeHotel, q);
    }

	@Override
    public boolean deleteQuarto(String nomeHotel, int num) throws RemoteException {
    	return daoHotel.deleteQuarto(nomeHotel, num);
    }
    
//	Hospede
	
	@Override
    public boolean cadastrarHospede(String nomeHotel, String nome, String cpf, String email, String telefone) throws RemoteException {
    	return daoHotel.cadastrarHospede(nomeHotel, nome, cpf, email, telefone);
    }
    
	@Override
    public boolean reservarQuarto(String nomeHotel, int numQuarto, String cpf, String dataEntrada, String dataSaida) throws RemoteException {
    	return daoHotel.reservarQuarto(nomeHotel, numQuarto, cpf, dataEntrada, dataSaida);
    }
    
	@Override
    public boolean alocarHospedeQuarto(String nomeHotel, int num, String cpf) throws RemoteException {
    	return alocarHospedeQuarto(nomeHotel, num, cpf);
    }
    
	@Override
    public boolean pagarDivida(String nomeHotel, String cpf, double valor) throws RemoteException {
    	return daoHotel.pagarDivida(nomeHotel, cpf, valor);
    }
    
	@Override
    public void consultarPendenciaFinanceiraHospede(String nomeHotel, String cpf) throws RemoteException {
    	consultarPendenciaFinanceiraHospede(nomeHotel, cpf);
    }
       
	@Override
    public Hospede getHospedeByCpf(String nomeHotel, String cpf) throws RemoteException {
    	return daoHotel.getHospedeByCpf(nomeHotel, cpf);
    }
    
	@Override
	public boolean removeHospedeByCpf(String nomeHotel, String cpf) throws RemoteException {
		return daoHotel.removeHospedeByCpf(nomeHotel, cpf);
	}
    
	@Override
	public double gerarContaHospede(String nomeHotel, String cpf) throws RemoteException {
		return daoHotel.gerarContaHospede(nomeHotel, cpf);
	}

	@Override
	public Quarto getQuartoByNum(String nomeHotel, int num) throws RemoteException {
		return daoHotel.getQuartoByNum(nomeHotel, num);
	}


}
