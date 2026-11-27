package nov27_Java;

public class Cliente {
	
	public int clienteID;
	public boolean clienteNuovo; //uso un boolean dato che è una variabile che ha solo due possibilità, non ha senso usare la stringa
	double importoTotale;

	public void displayInfoCliente() {
		String statoCliente; //me la dichiaro qui, tanto mi servirà solo per un valore, inutile dichiararlo prima
		
		if (clienteNuovo == true) {
			statoCliente = "Nuovo";
		} else {
			statoCliente = "Preesistente";
		}
		System.out.println("Il tuo ID cliente è: " + clienteID + ".");
		System.out.println("Sei un utente: " + statoCliente + "."); //statoCliente e non clienteNuovo, sennò mi stampa true o flase
		System.out.println("Il totale del tuo carrello è: " + importoTotale + " €.");
	}

}
