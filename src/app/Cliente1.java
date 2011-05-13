package app;

import interfaces.HotelIF;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import util.Servico;

import models.Hospede;
import models.Hotel;
import models.Quarto;
import dao.GenericDAO;
import dao.HotelDAO;

public class Cliente1 {

	protected Cliente1() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Servico.getServico().cadastrarHotel("Hotel Teste", "Romero", "Rua sem nome", 100.0);

	    	Servico.getServico().cadastrarQuarto("Hotel Teste", 1);
	    	Servico.getServico().cadastrarQuarto("Hotel Teste", 2);
	    	Servico.getServico().cadastrarQuarto("Hotel Teste", 3);
	    	
	    	Servico.getServico().cadastrarHospede("Hotel Teste", "Zekinha", "12312312312", "zeca@a.com.br", "2222-2222");
	    	Servico.getServico().cadastrarHospede("Hotel Teste", "Maria", "14512312312", "maria@a.com.br", "2222-99999");
	    	
	    	Servico.getServico().alocarHospedeQuarto("Hotel Teste", 10, "12312312312", "15/05/2011");
	    	Servico.getServico().alocarHospedeQuarto("Hotel Teste", 30, "14512312312", "15/05/2011");
	    	
	    	Servico.getServico().consultarPendenciaFinanceiraHospede("Hotel Teste", "12312312312");
	    	
	    	Servico.getServico().reservarQuarto("Hotel Teste", 10, "12312312312", "10/06/2011", "11/06/2011");
	    	
	    	Servico.getServico().acharPendenciaFinanceiraHospede("12312312312");
	    	
	    	Servico.getServico().gerarContaHospede("Hotel Teste", "12312312312");
//	    	Servico.getServico().pagarDivida("Hotel Teste", "12312312312", 500);
	    	
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}