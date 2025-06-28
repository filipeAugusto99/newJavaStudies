
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double baseRetangle = 0.0;
		double heightRetangle = 0.0;
		double area = 0.0;
		double perimeter = 0.0;
		double diagonal = 0.0;
		
		System.out.print("Base do rentagulo: ");
		baseRetangle = sc.nextDouble();
		
		System.out.print("Altura do retangulo: ");
		heightRetangle = sc.nextDouble();
		
		area = baseRetangle * heightRetangle;
		perimeter = (2 * baseRetangle) + (2 * heightRetangle);
		
		diagonal = Math.sqrt(Math.pow(baseRetangle, 2) + Math.pow(heightRetangle, 2));
		
		System.out.printf("AREA = %.4f%n", area);
		
		System.out.printf("PERIMETRO: %.4f%n", perimeter);
		
		System.out.printf("DIAGONAL: %.4f%n", diagonal);
		
		sc.close();
		
	}

}
