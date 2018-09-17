
public class WhileBoucle {

	public static void main(String[] args) {
		//incrémentation 
		int a = 10;
		System.out.println("La variable a =" +a);
		a = a+1;
		System.out.println("La variable a =" +a);
		a++;
		System.out.println("La variable a =" +a);
		
		// Boucle While
		System.out.println("Resultat de la boucle while");
		
		while (a>2) {
			System.out.println("La variable a =" +a);
			System.out.println("La variable a est > 2" );
			a--;
		}
		
		System.out.println("La variable a =" +a);
	}

}
