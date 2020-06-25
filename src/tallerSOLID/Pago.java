package tallerSOLID;

/*
 * la clase pago violaba el principio Single Responsibility, ya que realizaba muchas
 * actividades correspondientes a diferentes responsabilidades. El calculo de impuestos
 * y generacion de Factura no le competen al pago, por ende, se dispuso la creacion de 
 * la clase Factura que se encarga de estas acciones. Tambien se implemento la interfaz
 * IPago para la solucion del problema con el principio DIP en la clase Compra.
 */
public class Pago implements IPago{
	//atributoss aqui
	public void realizarCobro(double monto) {
		//cargar el monto de compra al medio de pago
	}
}
