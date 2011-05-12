package dao;

import java.util.ArrayList;
import java.util.Iterator;

import models.Hotel;

public class HotelDAO extends GenericDAO {

	public HotelDAO(String nomeBanco) throws Exception {
		super(nomeBanco);
		// TODO Auto-generated constructor stub
	}
	
	public Hotel getHotelByName(String name) {
		ArrayList<Object> hoteis = new ArrayList<Object>();
        for (String s : banco.keySet()) {
            if (s.equals("Hotel")) {
            	hoteis = banco.get(name);
            	Iterator it = hoteis.iterator();
            	while (it.hasNext()) {
            		Hotel h = (Hotel) it.next();
            		if (h.getNome().equals(name)) {
            			return h;
            		}
            	}
            }
        }
        return null;
	}
	
	public void removeHotelByNome(String name) {
		ArrayList<Object> hoteis = new ArrayList<Object>();
        for (String s : banco.keySet()) {
            if (s.equals("Hotel")) {
            	hoteis = banco.get(name);
            	Iterator it = hoteis.iterator();
            	while (it.hasNext()) {
            		Hotel h = (Hotel) it.next();
            		if (h.getNome().equals(name)) {
            			banco.get(name).remove(h);
            		}
            	}
            }
        }
	}
}
