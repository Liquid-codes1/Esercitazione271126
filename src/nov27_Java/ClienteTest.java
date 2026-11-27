package nov27_Java;

public class ClienteTest {
	public static void main (String args[]) {
		Cliente mioCliente = new Cliente();
		// inizializzazione campi dell'istanza
		
		mioCliente.clienteID = 66074;
		mioCliente.clienteNuovo = false;
		mioCliente.importoTotale = 79.99;
		mioCliente.displayInfoCliente();
		
		System.out.println("--------------------------------------------------------------------------------");
		
		Cliente mioCliente2 = new Cliente();
		// inizializzazione campi dell'istanza
		
		mioCliente2.clienteID = 66074;
		mioCliente2.clienteNuovo = true;
		mioCliente2.importoTotale = 0.0;
		mioCliente2.displayInfoCliente();
		
	}
}