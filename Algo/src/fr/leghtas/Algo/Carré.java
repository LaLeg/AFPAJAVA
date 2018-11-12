package fr.leghtas.Algo;
import java.util.Scanner;

public class Carré {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Veuillez saisir un nombre : ");
		int nombreSaisi;
		nombreSaisi = sc.nextInt();
		System.out.println("Vous avez saisi le nombre "+ nombreSaisi);
		for(int j=1; j<=nombreSaisi; j++) {
			for(int i=1; i<= nombreSaisi; i++) {
				System.out.print("* ");

			}System.out.println("");}

		// TODO Auto-generated method stub

	}

}
