import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int x;
	   System.out.println("Por favor digite um numero inteiro");
	   x = sc.nextInt();
	   if (x%2==0) {
		   System.out.println("Numero é par");
	   }else {
		   System.out.println("Numero é impar");
	   }
	   
	   sc.close(); 
      
	}

}
