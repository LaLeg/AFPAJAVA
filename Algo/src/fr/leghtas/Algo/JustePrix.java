package fr.leghtas.Algo;
import java.util.Random ;
import java.util.Scanner;

public class JustePrix 
{

	public static void main(String[] args) 
	{
		/* Générer un nombre Aleatoire : La méthode Math.random() */
		
		/*double nombreInconnu;
		nombreInconnu = Math.random();
		System.out.println(nombreInconnu);*/
		
		/* La classe java.util.Random :
		 * Générer des nombres entiers entre zéro et n en java 
		 * La méthode next(int n) génère un nombre uniformément situé entre 0 et n-1 */
		
		Random random = new Random();
		int inconnu = random.nextInt(11);
		
		/*System.out.println(inconnu);*/
		
		/*Saisir au clavier un nombe à l'aide de la méthode Scanner*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Veuillez saisir un nombre : ");
		
		
		int nombreSaisi;
		int nombreTentatives=0;
		do {
		
		nombreSaisi = sc.nextInt();
		nombreTentatives++;
		System.out.println("Vous avez saisi : " + nombreSaisi);
		
	
	    if (nombreSaisi <inconnu)
			{System.out.println("nombre saisi est inférieur au random");
			System.out.print("Veuillez saisir un autre nombre : ");}
		
	    else if(nombreSaisi >inconnu)
		{System.out.println("nombre saisi est supérieur au random");
		System.out.print("Veuillez saisir un autre nombre : ");}
		
	    else if (nombreSaisi==inconnu) 
		{System.out.println("Bravo : Vous avez gagné");}
			
	
		}while(nombreSaisi != inconnu);
		{System.out.println("Vous avez gagné en "+nombreTentatives+" tentatives");}
		
		
		// TODO Auto-generated method stub

	}

}
