package app;

import interfaces.HotelIF;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import service.HotelService;

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
			Registry registry = LocateRegistry.getRegistry(Registry.REGISTRY_PORT);
			HotelIF hotel = (HotelIF) registry.lookup("HotelService");
			hotel.testar();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}