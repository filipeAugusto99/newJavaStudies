
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		double annualSalary, monthlySalary, taxSalary, taxServices, taxCapitalGain, grossTax, liquidTax, serviceProvision, capitalGain, medicineExpenses, educationExpenses, totalExpenses;
		double maxDeductible, slaughter;
		
		System.out.print("Renda anual com salario: ");
		annualSalary = sc.nextDouble();
		
		System.out.print("Renda anual com prestação de servico: ");
		serviceProvision = sc.nextDouble();
		
		System.out.print("Renda anual com ganho de capital: ");
		capitalGain = sc.nextDouble();
		
		System.out.print("Gastos medicos: ");
		medicineExpenses = sc.nextDouble();
		
		System.out.print("Gastos educacionais: ");
		educationExpenses = sc.nextDouble();
		
		monthlySalary = annualSalary / 12;
		
		if (monthlySalary < 3000) {
			taxSalary = 0;
		} else if (monthlySalary >= 3000 && monthlySalary < 5000) {
			taxSalary = 0.1 * annualSalary;
		} else {
			taxSalary = 0.2 * annualSalary;
		}
		
		taxServices = 0.15 * serviceProvision;
		
		taxCapitalGain = 0.2 * capitalGain;
		
		grossTax = taxSalary + taxServices + taxCapitalGain;
		
		totalExpenses = medicineExpenses + educationExpenses;
		
		maxDeductible = 0.3 * grossTax;
		
		if (totalExpenses < maxDeductible) {
			slaughter = totalExpenses;
		} else {
			slaughter = maxDeductible;
		}
		
		liquidTax = grossTax - slaughter;
		
		System.out.println();
		System.out.println("RELATORIO DE IMPOSTO DE RENDA");
		System.out.println();
		
		System.out.println("CONSOLIDADO DE RENDA");
		System.out.printf("Imposto sobre salario: %.2f%n", taxSalary);
		System.out.printf("Imposto sobre servicos: %.2f%n", taxServices);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n%n", taxCapitalGain);
		
		System.out.println("DEDUCOES: ");
		System.out.printf("Maximo dedutivel: %.2f%n", maxDeductible);
		System.out.printf("Gastos dedutiveis: %.2f%n%n", totalExpenses);
		
		System.out.println("RESUMO: ");
		System.out.printf("Imposto bruto total: %.2f%n", grossTax);
		System.out.printf("Abatimento: %.2f%n", slaughter);
		System.out.printf("Imposto devido: %.2f%n", liquidTax);
		
		sc.close();
	}

}
