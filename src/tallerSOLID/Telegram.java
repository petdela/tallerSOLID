package tallerSOLID;

public class Telegram implements Notificacion{
	@Override
	public void notificar(IPago pago) {
		// TODO Auto-generated method stub
		enviarMensaje();
	}
	public void enviarMensaje() {
		//logica
	}
}
