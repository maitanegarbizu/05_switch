import java.util.Scanner;

public class Areas_calcular {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int opcion; //definimos
		int largo;
		
		do{
			System.out.println("Introduce un número");
			System.out.println("Área del círculo");
			System.out.println("Área del cuadrado");
			System.out.println("Área del triángulo");
			
		opcion = scan.nextInt();
		
		switch(opcion){
		
		case 1:
			System.out.println("Calculando..");
			
			largo = scan.nextInt();
			System.out.println("Área del circulo es:" + (Math.PI*Math.pow(largo,  2)));
			break;
		case 2:
			System.out.println("Calculando..");
			
			largo = scan.nextInt();
			System.out.println("Área del cuadrado es:" + (Math.pow(largo, 2)));
			break;
		case 3:
			System.out.println("Calculando..");
			
			largo = scan.nextInt();
			System.out.println("Área del triángulo es:" + ((Math.sqrt(3)/4)*(Math.pow(largo, 2))));
			break;
		case 4:
			System.out.println("Salir");
			
			break;
		default:
			System.out.println("Opción mal");
			break;
			}	
		}
		while(opcion != 4);{
			System.out.println("Fin");
			
		}
	}

}
