package EEQ;

public interface EntradaSalida {
	
	/* Interfaz que define las operaciones básicas de entrada y salida del programa.
	 * Permite desacoplar la lógica del programa de una implementación concreta de consola. */
	
	/*leerTexto(String mensaje)
	 * Muestra un mensaje y lee una cadena de texto.
	 * @param mensaje, texto que se muestra al usuario.
	 * @return texto introducido por el usuario. */
	public String leerTexto(String mensaje);
	
	/* leerEntero(String mensaje)
	 * Muestra un mensaje y lee un número entero.
	 * @param mensaje, texto que se muestra al usuario.
	 * @return número entero introducido por el usuario.
	 * @throws NumberFormatException si el valor introducido no es un número entero. */
	public int leerEntero(String mensaje);
	
	/* mostrarMensaje(String mensaje)
	 * Muestra un mensaje por pantalla.
	 * @param mensaje, texto que se desea mostrar. */
	public void mostrarMensaje(String mensaje);

}
