import java.util.Scanner;

public class Menu {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner scan = new Scanner(System.in);
		int opcion; //definimos
		
		do{
			System.out.println("Introduce un número");
			System.out.println("MENÚ");
			System.out.println("1 - Copiar");
			System.out.println("2 - Grabar");
			System.out.println("3 - Reproducir");
			System.out.println("4 - Salir");
			
			//leer la opción
			
			opcion = scan.nextInt(); //asignamos el valor
			
			//
			
			switch(opcion){
			
				case 1:
					System.out.println("Copiando..");
					Thread.sleep (1000);
					System.out.println("Copiado!!!");
					break;
				case 2:
					System.out.println("Grabando..");
					System.out.println("Grabado!!!");
					break;
				case 3:
					System.out.println("Reproduciendo..");
					System.out.println("Reproducido!!!");
					break;
				case 4:
					System.out.println("Cerrando sistema");
					
					break;
				default:
					System.out.println("Opción mal");
					break;
			}	
		}
			while(opcion != 4);{
				
				System.out.println("Fin del programa");
			}
				
			
		

	}

}
