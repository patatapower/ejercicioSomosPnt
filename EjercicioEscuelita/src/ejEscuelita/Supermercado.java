package ejEscuelita;

import java.util.ArrayList;
import java.util.Collections;

public class Supermercado {

	private ArrayList<Producto> listaProductos;
	
	public Supermercado() {
		listaProductos = new ArrayList<Producto>();
	}
	
	/** Agrega los productos a la lista */
	private void cargarProductos() {
		Producto p1 = new Bebida("Coca-Cola Zero", 20, 1.5);
		Producto p2 = new Bebida("Coca-Cola", 18, 1.5);
		Producto p3 = new ProducPelo("Shampoo Sedal", 19, "500ml");
		Producto p4 = new FrutaVerdura("Frutillas", 64, "kilo");
		
		listaProductos.add(p1);
		listaProductos.add(p2);
		listaProductos.add(p3);
		listaProductos.add(p4);
	}
	
	/** Carga los productos, los muestra por pantalla, muentra el menor y el mayor */
	public void listarProductos() {
		Producto myProducto;
		
		cargarProductos();
		
		for (int i = 0; i < listaProductos.size(); i++) {
			myProducto = listaProductos.get(i);
			System.out.println( myProducto.toString() );
		}
		
		System.out.println("=============================");
	
		menorMayor();
		
		System.out.println("Producto más caro: " + listaProductos.get(listaProductos.size() - 1 ).getNombre() );
		System.out.println("Producto más barato: " + listaProductos.get(0).getNombre() );
		
	}
	
	/** ordena el precio de los productos de la lista de menor a mayor*/
	private void menorMayor() {	
		Collections.sort(listaProductos);
	}
}
