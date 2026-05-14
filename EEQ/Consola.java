package EEQ;

import java.util.Scanner;

public class Consola implements EntradaSalida {
	
	/* Clase que implementa la interfaz EntradaSalida utilizando la consola del sistema.
	 * Permite leer datos por teclado y mostrar mensajes por pantalla. */
	
	private Scanner scanner; 
	
	/* Consola()
	 * Crea un objeto Consola e inicializa el Scanner. */
	public Consola() {
		scanner = new Scanner(System.in);
	}
	
	/* leerTexto(String mensaje)
	 * Muestra un mensaje y lee una cadena de texto.
	 * @param mensaje, texto que se muestra al usuario.
	 * @return texto introducido por el usuario. */
	public String leerTexto(String mensaje) {
		mostrarMensaje(mensaje);
		return scanner.nextLine();
	}
	
	/* leerEntero(String mensaje)
	 * Muestra un mensaje y lee un número entero.
	 * @param mensaje, texto que se muestra al usuario.
	 * @return número entero introducido por el usuario.
	 * @throws NumberFormatException si el valor introducido no es un número entero. */
	public int leerEntero(String mensaje) throws NumberFormatException {
		mostrarMensaje(mensaje);
		return scanner.nextInt();
	}
	
	/* mostrarMensaje(String mensaje)
	 * Muestra un mensaje por pantalla.
	 * @param mensaje, texto que se desea mostrar. */
	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}

}
