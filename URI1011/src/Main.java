import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double volume = ((4.0/3)* pi * Math.pow(raio, 3.0));
	
		System.out.printf("VOLUME = %.3f%n", volume);
					
		sc.close();
	}

}