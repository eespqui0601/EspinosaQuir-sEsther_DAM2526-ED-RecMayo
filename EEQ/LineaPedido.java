package EEQ;

public class LineaPedido {
	
	private Juego juego;
	private int cantidad;
	
	public LineaPedido(Juego juego, int cantidad) {
		this.juego = juego;
		this.cantidad = cantidad;
	}
	
	public double calcularSubtotal() {
		return juego.getPrecio() * cantidad;
	}
	
	public Juego getJuego() {
		return juego;
	}
	
	public int getCantidad() {
		return cantidad;
	}

}
