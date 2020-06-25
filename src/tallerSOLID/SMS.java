package tallerSOLID;

public class SMS implements Notificacion{
	@Override
	public void notificar(IPago pago) {
		// TODO Auto-generated method stub
		enviarSMS();
	}
	public void enviarSMS() {
		//logica
	}
}
