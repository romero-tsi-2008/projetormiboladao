package interfaces;

import java.rmi.Remote;
import models.*;

public interface HospedeIF extends Remote {

	public boolean pagarDivida(double valor);

	public void consultarPendenciaFinanceira();
}