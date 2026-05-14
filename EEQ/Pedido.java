package EEQ;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private String codigo;
	private Cliente cliente;
	private List<LineaPedido> lineas = new ArrayList<LineaPedido>();
	
	public Pedido(String codigo, Cliente cliente) {
		this.codigo = codigo;
		this.cliente = cliente;
	}
	
	public void agregarLinea(Juego juego, int cantidad) {
		lineas.add(new LineaPedido(juego, cantidad));
	}
	
	public double calcularTotal() {
		double total = 0;
		for (LineaPedido lineaPedido : lineas) {
			total += lineaPedido.calcularSubtotal();
		}
		return total;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public List<LineaPedido> getLineas(){
		return lineas;
	}

}
