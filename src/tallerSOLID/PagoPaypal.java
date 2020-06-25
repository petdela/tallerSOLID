package tallerSOLID;

/*
 * En la clase PagoPaypal se violaba el principio de Liskov Substitution
 * puesto que PagoPaypal no podia reemplazar el funcionamiento de la clase Pago, puesto
 * que si no se esta loggeado no se realiza transaccion alguna. Por eso se modifico la 
 * implementacion del metodo realizar cobro y la creacion del metodo loggearse. Para 
 * solucionar tambien el problema con el principio DIP se opto por eliminar la herencia 
 * con la clase Pago y hacer que ambas implementen la interfaz IPAGO.
 */

public class PagoPaypal implements IPago{
	private boolean loggedIn;
	public void realizarCobro(double monto) {
		if(!loggedIn) {
			loggearse();
		}
		//logica
	}
	public void loggearse() {
		//logica
	}
}

