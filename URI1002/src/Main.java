import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		double Raio, π, Area, Raio2 ;
		
		Raio =sc.nextDouble();
		π = 3.14159;
		
		Raio2 = Math.pow(Raio, 2.0);
		Area = π * Raio2;
		System.out.printf("A=%.4f%n", Area);
					
		sc.close();
	}

}