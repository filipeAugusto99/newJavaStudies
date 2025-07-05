
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name;
		double hours_for_value, payment;
		int work_hours;
		
		System.out.print("Nome: ");
		name = sc.nextLine();
		
		System.out.print("Valor por hora: ");
		hours_for_value = sc.nextDouble();
		
		System.out.print("Horas trabalhadas: ");
		work_hours = sc.nextInt();
		
		payment = hours_for_value * work_hours;
		
		System.out.printf("O pagamento para %s deve ser %.2f", name, payment);
		
		sc.close();
	}
}
