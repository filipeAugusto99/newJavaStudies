import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double unit_price, money_geted, change;
		int buy_qtd;
		
		
		System.out.print("Preco unitario do produto: ");
		unit_price = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		buy_qtd = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		money_geted = sc.nextDouble();
		
		change = money_geted - (unit_price * buy_qtd);
		
		System.out.printf("TROCO: %.2f", change);
		
		sc.close();
		
	}

}
