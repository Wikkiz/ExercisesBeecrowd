import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int X, Y, Z;
		
		X =sc.nextInt();
		Y =sc.nextInt();
		Z = Y * X;
		System.out.println("PROD = "+ Z);
					
		sc.close();
	}

}