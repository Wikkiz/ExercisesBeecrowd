import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		double x;
		String y;
		int z;
		
		x = sc.nextDouble();
		y= sc.next();			
		z = sc.nextInt();
		
		System.out.println("Você digitou: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		sc.close();
	}

}
