package app;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import models.Hotel;

public class Servidor extends UnicastRemoteObject {
	
	public Servidor () throws RemoteException {
		try {
			LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
			Hotel hotel = new Hotel();
			Naming.rebind("rmi://localhost:1099/HotelService", hotel);
			
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
