import java.util.Scanner;
import java.util.Locale;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y, soma;
		
		System.out.print("Digite o valor de X: ");
		x = sc.nextInt();
		System.out.print("Digite o valor de Y: ");
		y = sc.nextInt();
		
		soma = x + y;
		
		System.out.printf("SOMA: %d", soma);
		
		sc.close();
		
		
	}

}
