package practica;

import java.util.ArrayList;
import java.util.Scanner;

public class Producto {
	
	private ArrayList<Etapa> etapas = new ArrayList<>();
	private int unidadesRestantes;
	private int valorUsuario;
	
	public Producto() {
		
	}
	
	public void addEtapa(Etapa etapa) {
		
		etapas.add(etapa); // cuando se cree una etapa se añade a el producto
	}
	
	public void mostrarEtapas() {
		int aux = 1;
		for (Etapa etapa : etapas) {
			System.out.println("Etapa "+aux+": "+etapa.getM1().getNombre()+" "+etapa.getM2().getNombre());
			aux++;
		}
	}
	
	public void mostrarCantidad() {
		int id = 1;
		
		for (Etapa etapa : etapas) {
			
			System.out.println("Etapa "+id);
			Scanner sc = new Scanner(System.in);
			System.out.print("Elija el material: \n[1] "
			           +etapa.getM1().getNombre()+"\n[2] "
			           +etapa.getM2().getNombre() +" \n--> ");
			int materialUsuario = sc.nextInt();
			
			switch (materialUsuario) {
			case 1:
				
				System.out.println("Has elegido el material "+etapa.getM1().getNombre());
				System.out.print("Ingrese la cantidad a utilizar: ");
				valorUsuario = sc.nextInt();
				abastecer(etapa);
				int unidades = etapa.getM1().getCantidad();
				etapa.getM1().setCantidad(unidades - valorUsuario);
				System.out.println("Unidades que quedaron: "+etapa.getM1().getCantidad());
				break;
			case 2:
				System.out.println("Has elegido el material "+etapa.getM2().getNombre());
				System.out.print("Ingrese la cantidad a utilizar: ");
				valorUsuario = sc.nextInt();
				abastecer2(etapa);
				int unidades2 = etapa.getM2().getCantidad();
				etapa.getM2().setCantidad(unidades2 - valorUsuario);
				System.out.println("Unidades que quedaron: "+etapa.getM2().getCantidad());
				break;
				
			default:
				System.out.print("Ingresó un valor incorrecto\nPor favor ingrese uno válido -->");
				materialUsuario = sc.nextInt();
			}
			
			id++;
		} 
	}
	public void abastecer(Etapa etapa) {
		
		int unidades = etapa.getM1().getCantidad();
		unidadesRestantes = unidades - valorUsuario;
		// Verificar cuantos materiales faltan y cuantos se deben de enviar.
			while(unidadesRestantes < valorUsuario ) {
				int aux = 1; // variable que almacena la cantidad de materiales que se envían
				System.out.println("Enviando "+etapa.getM1().getNombre()+"...");
				while (unidades < 5 && aux <=3 ) { // las unidades no superen las 5 unidades
												  //y las 3 del abastecedor.
					etapa.getM1().setCantidad(unidades+1);
					unidades = etapa.getM1().getCantidad(); //se actualiza el valor de las unidades
					aux++;
				}
				System.out.println("Cono enviados: "+(aux-1)); 
				
				unidadesRestantes = unidades; // se actualiza el valor de las unidades.
				 
			}
		//System.out.println("Unidades: "+unidades);
	}
	
public void abastecer2(Etapa etapa) {
		
		int unidades = etapa.getM2().getCantidad();
		unidadesRestantes = unidades - valorUsuario;
		// Verificar cuantos materiales faltan y cuantos se deben de enviar.
			while(unidadesRestantes < valorUsuario ) {
				int aux = 1; // variable que almacena la cantidad de materiales que se envían
				System.out.println("Enviando "+etapa.getM2().getNombre()+"...");
				while (unidades < 5 && aux <=3 ) { // las unidades no superen las 5 unidades
												  //y las 3 del abastecedor.
					etapa.getM2().setCantidad(unidades+1);
					unidades = etapa.getM2().getCantidad(); //se actualiza el valor de las unidades
					aux++;
				}
				System.out.println("Cono enviados: "+(aux-1)); 
				
				unidadesRestantes = unidades; // se actualiza el valor de las unidades.
				 
			}
		System.out.println("Unidades: "+unidades);
	}
	
	
	public void heladoTerminado() {
		
		System.out.println("\nSu helado terminado utilizó los siguientes productos\n");
		
		
		System.out.println("Caracteristica del helado que se creó");
	}
	
}
