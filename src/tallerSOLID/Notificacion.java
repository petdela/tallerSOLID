package tallerSOLID;
/*
 * En la clase Notificacion se violaba el principio Open close. Esto es debido a que
 * si se busca anadir un nuevo tipo de notificacion, se debe modificar el codigo
 * para hacer que el metodo notificar pueda identificar el tipo y accion a seguir. Por
 * esto, se la convirtio en una interfaz, para que solo se deba extender el codigo anadiendo
 * nuevas clase de notificacion sin tener que modificar nada. Ej: clase Telegra, Email, SMS
 */
public interface Notificacion {
	public void notificar(IPago pago);
}
