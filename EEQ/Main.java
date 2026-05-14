package EEQ;

public class Main {
	public void main() {
		
		EntradaSalida consola = new  Consola();
		ServicioPedidos servicio = new ServicioPedidos(consola);
		
		servicio.mostrarResumen(servicio.crearPedido());
		
	}
	public static void main(String[] args) {
		new Main().main();
	}
}
