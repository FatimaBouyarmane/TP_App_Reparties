
import java.util.Scanner;
public class secret {

	public static void main(String[] args) {
		int numeroSecret = 42;
		int nombre = 0;
		
        Scanner scanner = new Scanner(System.in);
        
        while(nombre != numeroSecret)
        {
	        System.out.print("Entrez un chiffre : ");
	        nombre = scanner.nextInt();
	        
	        if (nombre > numeroSecret) {
	            System.out.println("Le num�ro est sup�rieur au numero secret.");
	        } else if (nombre < numeroSecret) {
	            System.out.println("Le num�ro est inf�rieur au numero secret.");
	        } else {
	            System.out.println("Vous avez gagn�!");
	        }       
        }
        scanner.close();
		
	}

}