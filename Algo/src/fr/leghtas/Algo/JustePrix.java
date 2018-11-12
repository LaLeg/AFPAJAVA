package fr.leghtas.Algo;
import java.util.Random ;
import java.util.Scanner;

public class JustePrix 
{

	public static void main(String[] args) 
	{
		/* G�n�rer un nombre Aleatoire : La m�thode Math.random() */
		
		/*double nombreInconnu;
		nombreInconnu = Math.random();
		System.out.println(nombreInconnu);*/
		
		/* La classe java.util.Random :
		 * G�n�rer des nombres entiers entre z�ro et n en java 
		 * La m�thode next(int n) g�n�re un nombre uniform�ment situ� entre 0 et n-1 */
		
		Random random = new Random();
		int inconnu = random.nextInt(11);
		
		/*System.out.println(inconnu);*/
		
		/*Saisir au clavier un nombe � l'aide de la m�thode Scanner*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Veuillez saisir un nombre : ");
		
		
		int nombreSaisi;
		int nombreTentatives=0;
		do {
		
		nombreSaisi = sc.nextInt();
		nombreTentatives++;
		System.out.println("Vous avez saisi : " + nombreSaisi);
		
	
	    if (nombreSaisi <inconnu)
			{System.out.println("nombre saisi est inf�rieur au random");
			System.out.print("Veuillez saisir un autre nombre : ");}
		
	    else if(nombreSaisi >inconnu)
		{System.out.println("nombre saisi est sup�rieur au random");
		System.out.print("Veuillez saisir un autre nombre : ");}
		
	    else if (nombreSaisi==inconnu) 
		{System.out.println("Bravo : Vous avez gagn�");}
			
	
		}while(nombreSaisi != inconnu);
		{System.out.println("Vous avez gagn� en "+nombreTentatives+" tentatives");}
		
		
		// TODO Auto-generated method stub

	}

}
