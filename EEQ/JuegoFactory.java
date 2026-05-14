package EEQ;

public class JuegoFactory {
	
	/* Clase encargada de crear objetos Juego según el tipo indicado.
	 * Aplica el patrón Factory para centralizar la creación de juegos. */
	
	/* crearJuego(String tipo, String nombre)
	 * Crea un juego online asignando su precio según el tipo recibido.
	 * @param tipo de juego y nombre del juego.
	 * @return objeto Juego con el precio correspondiente. */
	public Juego crearJuego(String tipo, String nombre) {
		double precio;
		if (tipo.equalsIgnoreCase("basico")) {
			precio = 10;
		}
		else if (tipo.equalsIgnoreCase("medio")) {
			precio = 25;
		}
		else if (tipo.equalsIgnoreCase("premium")) {
			precio = 50;
		}
		else {
			precio = 0;
		}
		return new Juego(nombre, precio);
	}

}
