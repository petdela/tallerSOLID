package tallerSOLID;

public class Email implements Notificacion{

	@Override
	public void notificar(IPago pago) {
		// TODO Auto-generated method stub
		enviarEmail();
	}
	public void enviarEmail() {
		//logica
	}
}
