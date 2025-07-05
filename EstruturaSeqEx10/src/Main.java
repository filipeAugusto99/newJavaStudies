
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int duration;
		int seconds;
		int minutes;
		int hours;
		int rest;
		
		System.out.print("Digite a duracao em segundos: ");
		duration = sc.nextInt();
		
		hours = duration / 3600;
		rest = duration % 3600;

		minutes = rest / 60;
		seconds = rest % 60;
		
		System.out.printf("%d:%d:%d", hours, minutes, seconds);
		
		sc.close();
	}

}
