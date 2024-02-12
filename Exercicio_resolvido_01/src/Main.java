import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			
		Scanner sc = new Scanner (System.in);
		
		System.out.printf("Digite a Largura do terreno:");
		double Largura = sc.nextDouble();
		System.out.printf("Digite o Comprimento do terreno:");
		double Comprimento = sc.nextDouble();
		System.out.printf("Digite o preço por m²:");
		double MetroQuadrado = sc.nextDouble();
		
		double Area = Largura * Comprimento;
		double Preco = Area * MetroQuadrado;
		
		System.out.printf("Área = %.2f%n", Area);
		System.out.printf("Preço = %.2f%n", Preco);
		sc.close();
	}

}
