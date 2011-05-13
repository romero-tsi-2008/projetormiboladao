package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;

import exceptions.InexistentEntityException;

import models.Hospede;
import models.Hotel;
import models.Quarto;
import models.Reserva;

public interface HotelIF extends Remote{
	
//	Hotel
	
	public String cadastrarHotel(String nomeHotel, String nomeGerente, String endereco, double valorDiaria) throws RemoteException, InexistentEntityException, Exception;
	
	public Hotel getHotelByNome(String nomeHotel) throws RemoteException, Exception;
	
	public void removeHotelByNome(String HotelNome) throws RemoteException, Exception;
	
	public String listarHoteis() throws RemoteException, Exception;
	
	public HashMap<Quarto, ArrayList<Reserva>> getAllReservasPorQuarto(String nomeHotel) throws RemoteException, Exception;
	
    public String estenderReserva(String nomeHotel, String cpf, int numQuarto, int numDias) throws RemoteException, ParseException, Exception;

	
//	Quarto
	
	String cadastrarQuarto(String nomeHotel, int num) throws RemoteException, Exception;

    public boolean deleteQuarto(String nomeHotel, int num) throws RemoteException, Exception;
    
    public Quarto getQuartoByNum(String nomeHotel, int num) throws RemoteException, Exception;
    
    public String reservarQuarto(String nomeHotel, int numQuarto, String cpf, String dataEntrada, String dataSaida) throws RemoteException, ParseException, Exception;
    
//    Hospede
    
    public String cadastrarHospede(String nomeHotel, String nome, String cpf, String email, String telefone) throws RemoteException, Exception;
    
    public boolean removeHospedeByCpf(String nomeHotel, String cpf) throws RemoteException, Exception;
	
    public Hospede getHospedeByCpf(String nomeHotel, String cpf) throws RemoteException, Exception;
    
    public String alocarHospedeQuarto(String nomeHotel, int num, String cpf, String dataTermino) throws ParseException, RemoteException, Exception;
    
    public String pagarDivida(String nomeHotel, String cpf, double valor) throws RemoteException, Exception;
    
    public String consultarPendenciaFinanceiraHospede(String nomeHotel, String cpf) throws RemoteException, Exception;
	
	public String gerarContaHospede(String nomeHotel, String cpf) throws RemoteException, Exception;

    public String acharPendenciaFinanceiraHospede(String cpf) throws RemoteException, Exception;

	String printDB() throws Exception;


}