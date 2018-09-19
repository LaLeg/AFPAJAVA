import java.util.Scanner;
public class Calculatrice 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//Saisie du premier nombre
		System.out.print("Veuillez saisir votre premier nombre : ");
		int nombre1 = sc.nextInt();
		
		System.out.println("Vous avez saisi nombre1 = " + nombre1);
		
		//Saisie du deuxième nombre
		System.out.print("Veuillez saisir votre deuxième nombre : ");
		int nombre2 = sc.nextInt();
		System.out.println("Vous avez saisi nombre2 = " + nombre2);
		
		///Afficher le résultat de l'opération somme
		///int résultat;
		
		///System.out.print("Résultat de l'opération = " + (nombre1+nombre2));
		
		//Opération quelconque
		System.out.print("Veuillez saisir votre opération : ");
		String operation = sc.next();
		System.out.println("Vous avez saisi l'opération : " + operation);
		
		//Affichage du résultat de l'opération choisie
		if (operation.equals("+")) {System.out.println ("Résultat de votre opération : " +nombre1 + " + " +nombre2 +" = "+ (nombre1+nombre2));}
		else if (operation.equals ("-")) {System.out.println (nombre1 + " - " +nombre2 +" = "+ (nombre1-nombre2));}
		else if (operation.equals ("*")) {System.out.println (nombre1 + " * " +nombre2 +" = "+ (nombre1*nombre2));}
		else if (operation.equals ("/")) {System.out.println (nombre1 + " / " +nombre2 +" = "+ (nombre1/nombre2));}
		
		// TODO Auto-generated method stub

	}

}
