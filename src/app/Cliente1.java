package app;

import interfaces.HotelIF;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

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
			Registry registry = LocateRegistry.getRegistry(1099);
			HotelIF hotel = (HotelIF) registry.lookup("HotelService");
			hotel.testar();
			
			GenericDAO gDao = new GenericDAO();
	    	Hotel hotel1 = new Hotel();
	    	hotel1.setNome("Hotel Teste");
	    	
	    	HotelDAO hotelDao = new HotelDAO();
	    	hotelDao.begin();
	    	
//	    	gDao.createEntity("HOTEL");
//	    	
//	    	hotelDao.insertObject("HOTEL", hotel1);
//	    	
//	    	Quarto q1 = new Quarto(10);
//	    	Quarto q2 = new Quarto(20);
//	    	Quarto q3 = new Quarto(30);
//	    	hotelDao.addQuarto("Hotel Teste", q1);
//	    	hotelDao.addQuarto("Hotel Teste", q2);
//	    	hotelDao.addQuarto("Hotel Teste", q3);
//	    	
//	    	hotelDao.cadastrarCliente("Hotel Teste", "Zekinha", "12312312312", "zeca@a.com.br", "2222-2222");
//	    	hotelDao.cadastrarCliente("Hotel Teste", "Maria", "14512312312", "maria@a.com.br", "2222-99999");
//	    	
//	    	hotelDao.alocarHospedeQuarto("Hotel Teste", 10, "12312312312");
//	    	hotelDao.alocarHospedeQuarto("Hotel Teste", 30, "14512312312");
//	    	
//	    	hotelDao.consultarPendenciaFinanceiraHospede("Hotel Teste", "12312312312");
//	    	
//	    	hotelDao.listarHoteis();
//	    	
//	    	hotelDao.reservarQuarto("Hotel Teste", 10, "12312312312", "10/06/2011", "11/06/2011");
//	    	
	    	hotelDao.commit();
	    	hotelDao.printDb();
	    	hotelDao.close();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}