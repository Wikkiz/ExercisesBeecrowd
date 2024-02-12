import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner (System.in);
    
        
        double sal = sc.nextDouble();
        double novSal;
        double reajuste;
        int percent;
    
        if (sal <= 400.00) {
            reajuste = sal * 0.15;
            novSal = reajuste + sal;
            percent = 15;

        }else if (sal > 400.00 && sal <= 800.00) {
            reajuste = sal * 0.12;
            novSal = reajuste + sal;
            percent = 12;
        }else if (sal > 800.00 && sal <= 1200.00) {
            reajuste = sal * 0.10;
            novSal = reajuste + sal;
            percent = 10;
        }else if (sal > 1200.00 && sal <= 2000.00) {
            reajuste = sal * 0.07;
            novSal = reajuste + sal;
            percent = 7;
        }else {
            reajuste = sal * 0.04;
            novSal = reajuste + sal;
            percent = 4;
        }
        System.out.printf("Novo salario: %.2f", novSal); 
        System.out.printf("%nReajuste ganho: %.2f%n", reajuste);  
        System.out.println("Em percentual: " + percent + " %");  
        sc.close();
		
    }
    
}