package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

import models.Hospede;
import models.Quarto;
import dao.HospedeDAO;
import dao.HotelDAO;

public interface HotelIF extends Remote{
	
	public boolean addQuarto(String nomeHotel, Quarto q) throws RemoteException;

    public boolean deleteQuarto(String nomeHotel, int num) throws RemoteException;
    
    public boolean cadastrarCliente(String nomeHotel, String nome, String cpf, String email, String telefone) throws RemoteException;
    
    public boolean reservarQuarto(String nomeHotel, int numQuarto, String cpf, String dataEntrada, String dataSaida) throws RemoteException;
   
    public boolean alocarHospedeQuarto(String nomeHotel, int num, String cpf) throws RemoteException;
    
    public boolean pagarDivida(String nomeHotel, String cpf, double valor) throws RemoteException;
    
    public void consultarPendenciaFinanceiraHospede(String nomeHotel, String cpf) throws RemoteException;
    
	public Hospede getHospedeByCpf(String nomeHotel, String cpf) throws RemoteException;

	public boolean removeHospedeByCpf(String nomeHotel, String cpf) throws RemoteException;
	
	public void testar() throws RemoteException;
}