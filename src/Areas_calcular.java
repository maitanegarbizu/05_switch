import java.util.Scanner;

public class Areas_calcular {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int opcion; //definimos
		int largo;
		
		do{
			System.out.println("Introduce un n�mero");
			System.out.println("�rea del c�rculo");
			System.out.println("�rea del cuadrado");
			System.out.println("�rea del tri�ngulo");
			
		opcion = scan.nextInt();
		
		switch(opcion){
		
		case 1:
			System.out.println("Calculando..");
			
			largo = scan.nextInt();
			System.out.println("�rea del circulo es:" + (Math.PI*Math.pow(largo,  2)));
			break;
		case 2:
			System.out.println("Calculando..");
			
			largo = scan.nextInt();
			System.out.println("�rea del cuadrado es:" + (Math.pow(largo, 2)));
			break;
		case 3:
			System.out.println("Calculando..");
			
			largo = scan.nextInt();
			System.out.println("�rea del tri�ngulo es:" + ((Math.sqrt(3)/4)*(Math.pow(largo, 2))));
			break;
		case 4:
			System.out.println("Salir");
			
			break;
		default:
			System.out.println("Opci�n mal");
			break;
			}	
		}
		while(opcion != 4);{
			System.out.println("Fin");
			
		}
	}

}
