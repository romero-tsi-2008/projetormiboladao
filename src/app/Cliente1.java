package app;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import models.Hotel;

public class Cliente1 extends UnicastRemoteObject {

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
			Hotel hotel = (Hotel) Naming.lookup("rmi://localhost/HotelService");
			hotel.testar();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
