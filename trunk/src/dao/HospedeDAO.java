package dao;

import java.util.ArrayList;
import java.util.Iterator;

import models.Hospede;
import models.Hospede;

public class HospedeDAO extends GenericDAO {

	public HospedeDAO(String nomeBanco) throws Exception {
		super(nomeBanco);
		// TODO Auto-generated constructor stub
	}

	public Hospede getHospedeByCpf(String cpf) {
		ArrayList<Object> hospedes = new ArrayList<Object>();
		for (String s : banco.keySet()) {
			if (s.equals("Hospede")) {
				hospedes = banco.get("Hospede");
				Iterator it = hospedes.iterator();
				while (it.hasNext()) {
					Hospede h = (Hospede) it.next();
					if (h.getCpf().equals(cpf)) {
						return h;
					}
				}
			}
		}
		return null;
	}
	
	public void removeHospedeByCpf(String cpf) {
		ArrayList<Object> hospedes = new ArrayList<Object>();
        for (String s : banco.keySet()) {
            if (s.equals("Hospede")) {
            	hospedes = banco.get(cpf);
            	Iterator it = hospedes.iterator();
            	while (it.hasNext()) {
            		Hospede h = (Hospede) it.next();
            		if (h.getNome().equals(cpf)) {
            			banco.get(cpf).remove(h);
            		}
            	}
            }
        }
	}
}
