package ejEscuelita;

public class Bebida extends Producto{
	
	private Double litros;
	
	public Bebida(String nombre, int precio, double litros) {
		super(nombre, precio);
		this.litros = litros;
	}
	
	public String toString() {
		return "Nombre: " + getNombre() + " /// Litros: " + litros + " /// Precio: $" + getPrecio();
	}
	
	public int compareTo(Producto o) {
		return getPrecio() - o.getPrecio();
	}

		
}
