
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int distance_km;
		double fuel;
		double avarage_consumption;
		
		System.out.print("Distancia Percorrida: ");
		distance_km = sc.nextInt();
				
		System.out.print("Combustível gasto: ");
		fuel = sc.nextDouble();
		
		avarage_consumption = distance_km / fuel;
		
		System.out.printf("Consumo medio = %.3f", avarage_consumption);
		
		sc.close();
	}
}
