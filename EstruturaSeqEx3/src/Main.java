
import java.util.Scanner;
import java.util.Locale;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name1, name2;
		int age1, age2;
		double avarage;
		
		System.out.println("Dados da primeira pessoa:");
		System.out.print("Nome: ");
		name1 = sc.nextLine();
		System.out.print("Idade: ");
		age1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Dados da segunda pessoa:");
		System.out.printf("Nome: ");
		name2 = sc.nextLine();
		System.out.print("Idade: ");
		age2 = sc.nextInt();
		
		avarage = (age1 + age2) / 2.0;
		
		System.out.printf("A idade média de %s e %s é de %.1f anos", name1, name2, avarage);
		
		sc.close();
	}

}
