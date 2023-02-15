package practica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Producto> productos = new ArrayList<>();
		ArrayList<Material> material = new ArrayList<>();

		material = new ArrayList<>(
				List.of(new Material("cono", 1, 1), 
						new Material("vaso", 1, 1), 
						new Material("chocolate", 5, 2),
						new Material("chicle", 5, 2), 
						new Material("chispitas", 5, 3), 
						new Material("goma", 5, 3)
						));

		//System.out.println(material);

		
//		System.out.println("Bienvenido\n Seleccione una opcion: ");
//		int op = sc.nextInt();

		Producto p = new Producto();
		
		
		for (int j = 0; j < material.size(); j++) {
			//System.out.println("j: "+j);
			for (int i = 1; i <= 1; i++) {
				
				if(material.get(j).getTipo() == i){	
					Etapa etapa = new Etapa(material.get(j), material.get(j+1));	
					p.addEtapa(etapa);
				}
			
			}
			j= j+1;
			//System.out.println("j final: "+j);
		}
		
		
		
		productos.add(p);
		
		

		//p.mostrarEtapas();
		//EMPIEZA EL PROGRAMA
		Scanner sc = new Scanner(System.in);
		System.out.print("Bienvenido a la heladería\n¿Qué desea hacer?\n"
				+ "[1] Crear un helado\n"
				+ "[0] Cerrar el programa\n"
				+ "--> ");
		int opcion = sc.nextInt();
		
		while(opcion != 0) {
			p.mostrarCantidad();
			p.heladoTerminado();
			System.out.print("Su helado ha sido creado\n¿Qué desea hacer?\n"
					+ "[1] Crear otro helado\n"
					+ "[0] Cerrar el programa\n"
					+ "--> ");
			
			opcion = sc.nextInt();
		}
		
	}

}
