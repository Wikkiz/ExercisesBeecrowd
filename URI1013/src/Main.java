import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int MaiorAB;
		int MaiorABC;
		
		MaiorAB = ((a+b+Math.abs(a-b))/2);
		MaiorABC = ((MaiorAB+c+Math.abs(MaiorAB-c))/2);
		
		System.out.println(+ MaiorABC + " eh o maior");
					
		sc.close();
	}

}