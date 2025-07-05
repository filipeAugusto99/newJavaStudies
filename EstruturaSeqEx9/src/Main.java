
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double measure_a, measure_b, measure_c;
		double square, triangle, trapezoid;
		
		System.out.print("Digite a medida A: ");
		measure_a = sc.nextDouble();
		System.out.print("Digite a medida B: ");
		measure_b = sc.nextDouble();
		System.out.print("Digite a medida C: ");
		measure_c = sc.nextDouble();
		
		square = measure_a * measure_a;
		triangle = (measure_a * measure_b) / 2;
		trapezoid = ((measure_a + measure_b) * measure_c) / 2;
		
		System.out.printf("AREA DO QUADRADO = %.4f%n", square);
		System.out.printf("AREA DO TRIANGULO = %.4f%n", triangle);
		System.out.printf("AREA DO TRAPEZIO = %.4f", trapezoid);
		
		sc.close();
	}

}
