package EEQ;

public class ServicioPedidos {
	
	private EntradaSalida entradaSalida;
	private JuegoFactory juegoFactory;
	
	public ServicioPedidos(EntradaSalida entradaSalida) {
		this.entradaSalida = entradaSalida;
		juegoFactory = new JuegoFactory();
	}
	
	public Pedido crearPedido() {
		String codigo = entradaSalida.leerTexto("Introduzca el codigo del pedido: ");
		String nombre = entradaSalida.leerTexto("Introduzca el nombre del cliente: ");
		String email = entradaSalida.leerTexto("Introduzca el email del cliente: ");
		Pedido pedido = new Pedido(codigo, new Cliente(nombre, email));
		try {
			int juegos = entradaSalida.leerEntero("Introduzca el numero de juegos: ");
			for (int i = 0; i < juegos; i++) {
				entradaSalida.leerTexto("-----Datos del juego-----");
				String nombreJuego = entradaSalida.leerTexto("Introduzca el nombre del juego: ");
				String tipoJuego = entradaSalida.leerTexto("Introduzca el tipo del juego: ");
				int cantidad = entradaSalida.leerEntero("Introduzca el numero de copias del juego: ");
				pedido.agregarLinea(juegoFactory.crearJuego(tipoJuego, nombreJuego), cantidad);
			}
		} catch (Exception e) {
			entradaSalida.mostrarMensaje("Error: debes introducir un número entero.");
			e.getMessage();
		}
		return pedido;
	}
	
	public void mostrarResumen(Pedido pedido) {
		entradaSalida.mostrarMensaje("Código: " + pedido.getCodigo());
		entradaSalida.mostrarMensaje("Nombre: " + pedido.getCliente().getNombre());
		entradaSalida.mostrarMensaje("Email: " + pedido.getCliente().getEmail());
		for (LineaPedido lineaPedido : pedido.getLineas()) {
			entradaSalida.mostrarMensaje("Subtotal: " + lineaPedido.calcularSubtotal());
			entradaSalida.mostrarMensaje("Cantidad: " + lineaPedido.getCantidad());
			entradaSalida.mostrarMensaje("Nombre del juego: " + lineaPedido.getJuego().getNombre());
			entradaSalida.mostrarMensaje("Precio del juego: " + lineaPedido.getJuego().getPrecio());
		}
	}

}
