package app;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import models.Hotel;

public class Servidor {
	
	public Servidor () {
		try {
			LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
			Hotel hotel = new Hotel();
			Naming.rebind("rmi://localhost/HotelService", hotel);
			
			System.out.println("---Servidor rodando---");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Servidor();
	}

}
