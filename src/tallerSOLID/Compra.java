package tallerSOLID;

/*
 * En la clase Compra se violaba el principio DIP, puesto que la clase Compra depende 
 * de las implementaciones de Pago, existiendo un metodo compra para cada clase de pago.
 * Se soluciono haciendo que las clases de pago implementen la interfaz IPago, de esta 
 * manera la implementacion del metodo compra no necesita preguntar por instancias, pues le
 * es transparente.
 */
public class Compra {
	private IPago pago;
	private List articulos;
	public Compra(IPago pago) {
		//inicializaciones
	}
	public void agregarArticulo(Articulo articulo) {
		//agregar un articulo a la compra
	}
	public void removerArticulo(Articulo articulo) {
		//remover un articulo a la compra
	}
}
