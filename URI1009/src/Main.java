import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		
		String nomeV = sc.next();
		double salarioFixo = sc.nextDouble();
		double valorVendas = sc.nextDouble();
		
		double salarioFinal = salarioFixo + ( valorVendas *0.15);
		System.out.printf("TOTAL = R$ %.2f%n", salarioFinal);
					
		sc.close();
	}

}