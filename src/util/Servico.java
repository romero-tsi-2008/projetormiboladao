package util;

import interfaces.HotelIF;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public abstract class Servico {
	private static HotelIF servico;
	
	public static HotelIF getServico() throws RemoteException {
		if (servico == null) {
			try {
				Registry registry = LocateRegistry.getRegistry(1099);
				servico = (HotelIF) registry.lookup("HotelService");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		return servico;
	}
}
