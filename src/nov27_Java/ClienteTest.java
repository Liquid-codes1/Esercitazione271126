package nov27_Java;

public class ClienteTest {
	public static void main (String args[]) {
		Cliente mioCliente = new Cliente();
		// inizializzazione campi dell'istanza
		
		mioCliente.clienteID = 66074;
		mioCliente.clienteNuovo = true;
		mioCliente.importoTotale = 79.99;
		
		mioCliente.displayInfoCliente();
	}
}