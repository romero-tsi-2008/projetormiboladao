package interfaces;

import java.rmi.Remote;

public interface HotelIF extends Remote{
	
    public void cadastrarCliente(String nome, String cpf, String email, String telefone);
    
    public boolean reservarQuarto(int numQuarto, String cpf, String dataEntrada, String dataSaida);
}