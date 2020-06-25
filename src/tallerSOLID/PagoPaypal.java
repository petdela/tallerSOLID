package tallerSOLID;

//El principio que se esta violando es el de Liskov Substitution
//debido a que si alguien invoca el metodo realizarCobro de la clase
//pagoPaypal no se realizara a menos que este logeado, y no es lo
//que se esta esperando que suceda al llamar al metodo lo cual puede
//traer consecuencias pues el codigo no espera ese comportamiento.
//Por lo cual al solucion es que si no esta logeado llamar
//al metodo loggearse.

public class PagoPaypal{
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

