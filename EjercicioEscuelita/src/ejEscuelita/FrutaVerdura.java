package ejEscuelita;

public class FrutaVerdura extends Producto{
	
	private String unidadVenta;
	
	public FrutaVerdura(String nombre, int precio, String unidadVenta) {
		super(nombre, precio);
		this.unidadVenta = unidadVenta;
	}
	
	public String toString() {
		return "Nombre: " + getNombre() + " /// Precio: $" + getPrecio() + " /// Unidad de venta: " + unidadVenta;
	}
	
	public int compareTo(Producto o) {
		return getPrecio() - o.getPrecio();
	}

}
