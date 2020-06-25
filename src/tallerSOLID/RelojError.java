package tallerSOLID;

public class RelojError {
	public void ImprimirHora(Reloj reloj) {
		reloj.mostrarHora();;
	}
	public static void main(String[] args) {
		//
	}
}
interface Reloj{
	void mostrarHora();
}
class RelojAnalogico implements Reloj {
	public void mostrarHora() {
		//logica
	}
}
class RelojDigital implements Reloj{
	boolean encendido;
	public void mostrarHora() {
		if(!encendido) {
			return;
		}
		//logica
	}
}