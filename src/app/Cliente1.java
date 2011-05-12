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
	    	
	    	gDao.createEntity("HOTEL");
	    	
	    	hotelDao.insertObject("HOTEL", hotel1);
	    	
	    	Quarto q1 = new Quarto(10);
	    	Quarto q2 = new Quarto(20);
	    	Quarto q3 = new Quarto(30);
	    	hotelDao.addQuarto("Hotel Teste", q1);
	    	hotelDao.addQuarto("Hotel Teste", q2);
	    	hotelDao.addQuarto("Hotel Teste", q3);
	    	
	    	Hospede h1 = new Hospede();
	    	h1.setNome("Thiago Paulino");
	    	h1.setCpf("08557792417");
	    	
	    	Hospede h2 = new Hospede();
	    	h2.setNome("Fulano Bolado");
	    	h2.setCpf("1234567890");
	    	
	    	hotelDao.insertObject("HOTEL", h1);
	    	hotelDao.insertObject("HOTEL", h2);
	    	
	    	hotelDao.commit();
	    	hotelDao.printDb();
	    	hotelDao.close();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}