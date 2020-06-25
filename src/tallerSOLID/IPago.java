package tallerSOLID;
 
/*
 * Interfaz implementada por clases Pagos y PAgosPaypal para
 * solucion conflicto con principio DIP
 */
public interface IPago {
	public void realizarCobro(double monto);
}
