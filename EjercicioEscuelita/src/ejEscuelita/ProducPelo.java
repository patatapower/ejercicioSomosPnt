package ejEscuelita;

public class ProducPelo extends Producto{

	private String contenidoMl;
	
	public ProducPelo(String nombre, int precio, String contenidoMl) {
		super(nombre, precio);
		this.contenidoMl = contenidoMl;
	}
	
	public String toString() {
		return "Nombre: " + getNombre() + " /// Contenido: " + contenidoMl + " /// Precio: $" + getPrecio();
	}
	
	public int compareTo(Producto o) {
		return getPrecio() - o.getPrecio();
	}
}
