package interfaces;

import java.rmi.Remote;

import models.Quarto;
import dao.HospedeDAO;
import dao.HotelDAO;

public interface HotelIF extends Remote{
	
	public boolean addQuarto(Quarto q);

    public boolean deleteQuarto(int num);
    
    public boolean cadastrarCliente(String nome, String cpf, String email, String telefone);
    
    public boolean reservarQuarto(int numQuarto, String cpf, String dataEntrada, String dataSaida);
   
    public boolean alocarHospedeQuarto(int num, String cpf);
    
    public boolean pagarDivida(String cpf, double valor);
    
    public void consultarPendenciaFinanceiraHospede();
    
    public void testar();
}