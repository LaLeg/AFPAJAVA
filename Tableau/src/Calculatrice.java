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
		
		//Saisie du deuxi�me nombre
		System.out.print("Veuillez saisir votre deuxi�me nombre : ");
		int nombre2 = sc.nextInt();
		System.out.println("Vous avez saisi nombre2 = " + nombre2);
		
		///Afficher le r�sultat de l'op�ration somme
		///int r�sultat;
		
		///System.out.print("R�sultat de l'op�ration = " + (nombre1+nombre2));
		
		//Op�ration quelconque
		System.out.print("Veuillez saisir votre op�ration : ");
		String operation = sc.next();
		System.out.println("Vous avez saisi l'op�ration : " + operation);
		
		//Affichage du r�sultat de l'op�ration choisie
		if (operation.equals("+")) {System.out.println ("R�sultat de votre op�ration : " +nombre1 + " + " +nombre2 +" = "+ (nombre1+nombre2));}
		else if (operation.equals ("-")) {System.out.println (nombre1 + " - " +nombre2 +" = "+ (nombre1-nombre2));}
		else if (operation.equals ("*")) {System.out.println (nombre1 + " * " +nombre2 +" = "+ (nombre1*nombre2));}
		else if (operation.equals ("/")) {System.out.println (nombre1 + " / " +nombre2 +" = "+ (nombre1/nombre2));}
		
		// TODO Auto-generated method stub

	}

}
