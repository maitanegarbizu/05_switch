import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*double decimal = Math.random()*10;
		int entero = (int) decimal;
		
		System.out.println(decimal);
		System.out.println(entero);*/
		
		// lo anterior y lo siguiente es lo mismo escrito de distinta manera
		
		/*int entero2 = (int)(Math.random()*10);
		
		System.out.println(entero2);*/
		
		//acertar un número que el programa elige al azar
		
		int num_acertar = (int) (Math.random()*10);//numero de 0-9
		int intentos = 0;
	
		System.out.println("Introduce un numero del 0 al 9");
		Scanner scan = new Scanner(System.in);
		
		int numero_del_usuario = scan.nextInt();
		intentos = intentos +1;
		
		while(num_acertar != numero_del_usuario){
			System.out.println("No has acertado, introduce otro numero");
			numero_del_usuario = scan.nextInt();
			intentos = intentos +1; //intentos ++; es lo mismo que la frase anterior
		} 
			
		System.out.println("Has acertado!! el número es: " + num_acertar);
		System.out.println("Has necesitado " + intentos + "intentos");
	}

}
