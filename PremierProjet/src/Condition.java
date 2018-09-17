
public class Condition {

	public static void main(String[] args) {
		// = : affectation
		// == : comparaison
		if(1 == 1) {
			System.out.println("la condition est vraie");
		}
		// Autre Exemple
		int prix = 10;
		if(prix == 10) {System.out.println("le prix = 10");}
		int tva = 20;
		if(tva==20) {System.out.println("la tva = 20");}
		
		//
		boolean bool = true;
		if(bool == false) {System.out.println("la variable bool = false");}
		if(bool == true) {System.out.println("la condition bool = true");}
		
		//
		char car = 'a';
		if (car == 'a') {System.out.println("la variable car = 'a'");}
		
		//
		String chaine = "bonjour";
		if (chaine=="bonjour") {System.out.println("la variable chaine = bonjour");}
		
		//
		if (chaine == "Bonjour") {System.out.println("Bonjour avec b majuscule");}
		
		// conditions avec les opérateurs < , > , <= , >= , !=
		int somme = 15;
		if (somme > 11) {System.out.println("le produit est trop chère");}
		if (somme <= 11) {System.out.println("le somme est parfaite");}
		if (somme !=13) {System.out.println("la somme est != de 13");}
		
		}

}
