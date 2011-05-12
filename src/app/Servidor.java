package app;

import interfaces.HotelIF;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import service.HotelService;

public class Servidor {
	
	public Servidor () throws RemoteException {
		try {
			Registry registry = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
			HotelIF hotel = new HotelService("Tambau");
			registry.rebind("rmi://localhost:1099/HotelService", hotel);
			
			System.out.println("---Servidor rodando---");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 * @throws RemoteException 
	 */
	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		new Servidor();
	}

}
