package fr.leghtas.Algo;
import java.util.Scanner;
public class Factorielle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Veuillez saisir un nombre : ");
		int nombreSaisi;
		nombreSaisi = sc.nextInt();
		System.out.println("Vous avez saisi le nombre "+ nombreSaisi);
		int resultat=1;
		for (int i=1; i<=nombreSaisi; i++) {
			 resultat = resultat*i;
		}
		System.out.println("Factorielle de "+ nombreSaisi + " est égale à "+resultat);
		
		// TODO Auto-generated method stub
	}

}
