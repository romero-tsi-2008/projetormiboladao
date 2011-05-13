package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;

import models.Hospede;
import models.Hotel;
import models.Quarto;
import models.Reserva;

public interface HotelIF extends Remote{
	
//	Hotel
	
	public Hotel getHotelByNome(String nomeHotel) throws RemoteException;
	
	public void removeHotelByNome(String HotelNome) throws RemoteException;
	
	public String listarHoteis() throws RemoteException;
	
	public HashMap<Quarto, ArrayList<Reserva>> getAllReservasPorQuarto(String nomeHotel) throws RemoteException;
	
//	Quarto
	
	public boolean addQuarto(String nomeHotel, Quarto q) throws RemoteException;

    public boolean deleteQuarto(String nomeHotel, int num) throws RemoteException;
    
    public Quarto getQuartoByNum(String nomeHotel, int num) throws RemoteException;
    
    public boolean reservarQuarto(String nomeHotel, int numQuarto, String cpf, String dataEntrada, String dataSaida) throws RemoteException;
    
//    Hospede
    
    public boolean cadastrarHospede(String nomeHotel, String nome, String cpf, String email, String telefone) throws RemoteException;
    
    public boolean removeHospedeByCpf(String nomeHotel, String cpf) throws RemoteException;
	
    public Hospede getHospedeByCpf(String nomeHotel, String cpf) throws RemoteException;
    
    public boolean alocarHospedeQuarto(String nomeHotel, int num, String cpf) throws RemoteException;
    
    public boolean pagarDivida(String nomeHotel, String cpf, double valor) throws RemoteException;
    
    public void consultarPendenciaFinanceiraHospede(String nomeHotel, String cpf) throws RemoteException;
	
	public double gerarContaHospede(String nomeHotel, String cpf) throws RemoteException;

}