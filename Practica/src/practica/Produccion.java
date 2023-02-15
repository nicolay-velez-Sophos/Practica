package practica;

import java.util.ArrayList;
import java.util.List;

public class Produccion {

	private ArrayList<Producto> productos = new ArrayList<>();
	private ArrayList<Material> material = new ArrayList<>(); 
	
	public Produccion() {
		
		material = new ArrayList<>(List.of(
				new Material("cono", 5, 1),
				new Material("vaso", 5, 1),
				new Material("chocolate", 5, 2),
				new Material("chicle", 5, 2),
				new Material("chispitas", 5, 3),
				new Material("goma", 5, 3)
				));
		
	}
	
	public void agregarProducto(Producto p) {
		
		productos.add(p);
		
	}
	
	
	
	  
}
