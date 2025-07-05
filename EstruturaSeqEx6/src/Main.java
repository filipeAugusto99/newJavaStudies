import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		final double PI = 3.14159;
		double area, radius;
		
		
		System.out.print("Digite o valor do raio do círculo: ");
		radius = sc.nextDouble();
		
		area = PI * (Math.pow(radius, 2));
		
		System.out.printf("AREA: %.3f", area);
		
		sc.close();
	}

}
