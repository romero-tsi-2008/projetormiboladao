package service;

import interfaces.HotelIF;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.ParseException;
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
import exceptions.InexistentEntityException;

public class HotelService extends UnicastRemoteObject implements  HotelIF {
	HotelDAO daoHotel; 
	
	public HotelService() throws Exception {
	}
	
//	Hotel
	

	@Override
	public String cadastrarHotel(String nomeHotel, String nomeGerente, String endereco, double valorDiaria) throws Exception {
		return daoHotel.cadastrarHotel(nomeHotel, nomeGerente, endereco, valorDiaria);
	}
	
	@Override
	public Hotel getHotelByNome(String nomeHotel) throws Exception {
		return daoHotel.getHotelByNome(nomeHotel);
	}

	@Override
	public void removeHotelByNome(String nomeHotel) throws Exception {
		daoHotel.removeHotelByNome(nomeHotel);
	}

	@Override
	public String listarHoteis() throws Exception {
		return daoHotel.listarHoteis();
	}
	
	@Override
	public HashMap<Quarto, ArrayList<Reserva>> getAllReservasPorQuarto(String nomeHotel) throws Exception {
		return daoHotel.getAllReservasPorQuarto(nomeHotel);
	}
	
	@Override
	public String estenderReserva(String nomeHotel, String cpf, int numQuarto, int numDias) throws Exception {
		return daoHotel.estenderReserva(nomeHotel, cpf, numQuarto, numDias);
	}
	
//	Quarto
	
	@Override
	public String cadastrarQuarto(String nomeHotel, int num) throws Exception {
		return daoHotel.cadastrarQuarto(nomeHotel, num);
    }

	@Override
    public boolean deleteQuarto(String nomeHotel, int num) throws Exception {
    	return daoHotel.deleteQuarto(nomeHotel, num);
    }
    
//	Hospede
	
	@Override
    public String cadastrarHospede(String nomeHotel, String nome, String cpf, String email, String telefone) throws Exception {
    	return daoHotel.cadastrarHospede(nomeHotel, nome, cpf, email, telefone);
    }
    
	@Override
    public String reservarQuarto(String nomeHotel, int numQuarto, String cpf, String dataEntrada, String dataSaida) throws Exception {
    	return daoHotel.reservarQuarto(nomeHotel, numQuarto, cpf, dataEntrada, dataSaida);
    }
    
	@Override
    public String alocarHospedeQuarto(String nomeHotel, int num, String cpf, String dataTermino) throws Exception {
    	return daoHotel.alocarHospedeQuarto(nomeHotel, num, cpf, dataTermino);
    }
    
	@Override
    public boolean pagarDivida(String nomeHotel, String cpf, double valor) throws Exception {
    	return daoHotel.pagarDivida(nomeHotel, cpf, valor);
    }
    
	@Override
    public String consultarPendenciaFinanceiraHospede(String nomeHotel, String cpf) throws Exception {
    	return daoHotel.consultarPendenciaFinanceiraHospede(nomeHotel, cpf);
    }
       
	@Override
    public Hospede getHospedeByCpf(String nomeHotel, String cpf) throws Exception {
    	return daoHotel.getHospedeByCpf(nomeHotel, cpf);
    }
    
	@Override
	public boolean removeHospedeByCpf(String nomeHotel, String cpf) throws Exception {
		return daoHotel.removeHospedeByCpf(nomeHotel, cpf);
	}
    
	@Override
	public double gerarContaHospede(String nomeHotel, String cpf) throws Exception {
		return daoHotel.gerarContaHospede(nomeHotel, cpf);
	}

	@Override
	public Quarto getQuartoByNum(String nomeHotel, int num) throws Exception {
		return daoHotel.getQuartoByNum(nomeHotel, num);
	}

	@Override
	public String acharPendenciaFinanceiraHospede(String cpf) throws Exception {
		return daoHotel.acharPendenciaFinanceiraHospede(cpf);
	}


}
