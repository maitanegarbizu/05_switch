import java.util.Scanner;

public class Main_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un n�mero para contar hasta �l");
		int max = scan.nextInt();
		
		while(contador < max){
			System.out.println("contador" + contador);
			contador = contador +1;
		}
	}

}
