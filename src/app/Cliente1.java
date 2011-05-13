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
			System.out.println(Servico.getServico().cadastrarHotel("Hotel Teste", "Gerente Romero", "Rua sem nome", 100.0));

			System.out.println(Servico.getServico().cadastrarQuarto("Hotel Teste", 1));
	    	System.out.println(Servico.getServico().cadastrarQuarto("Hotel Teste", 2));
	    	System.out.println(Servico.getServico().cadastrarQuarto("Hotel Teste", 3));
	    	
	    	System.out.println(Servico.getServico().printDB());
	    	
	    	System.out.println(Servico.getServico().cadastrarHospede("Hotel Teste", "Zekinha", "12312312312", "zeca@a.com.br", "2222-2222"));
	    	System.out.println(Servico.getServico().cadastrarHospede("Hotel Teste", "Robervalda", "14512312312", "maria@a.com.br", "2222-99999"));
	    	
	    	System.out.println(Servico.getServico().alocarHospedeQuarto("Hotel Teste", 1, "12312312312", "15/05/2011"));
	    	System.out.println(Servico.getServico().alocarHospedeQuarto("Hotel Teste", 2, "14512312312", "15/05/2011"));
	    	
	    	System.out.println(Servico.getServico().consultarPendenciaFinanceiraHospede("Hotel Teste", "12312312312"));
	    	
	    	System.out.println(Servico.getServico().reservarQuarto("Hotel Teste", 1, "12312312312", "10/06/2011", "13/06/2011"));
	    	
	    	System.out.println(Servico.getServico().acharPendenciaFinanceiraHospede("12312312312"));
	    	
	    	System.out.println(Servico.getServico().gerarContaHospede("Hotel Teste", "12312312312"));
	    	System.out.println(Servico.getServico().pagarDivida("Hotel Teste", "12312312312", 500));
	    	
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}