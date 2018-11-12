package fr.leghtas.Algo;
import java.util.Scanner;

public class minScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nombreSaisi;
		System.out.print("Veuillez saisir un nombre : ");
		nombreSaisi = sc.nextInt();
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MAX_VALUE + 1);


		System.out.println("Vous avez choisi le nombre : " + nombreSaisi);

		int nombreLePlusPetit = Integer.MAX_VALUE;

		for(int i=1; i<=nombreSaisi; i++) {

			int autreNombreSaisi = sc.nextInt();
			if (autreNombreSaisi < nombreLePlusPetit) {
				nombreLePlusPetit = autreNombreSaisi;
			}

		}
		System.out.println("Le nombre le plus petit parmis ceux que vous avez saisi est : " + 
				nombreLePlusPetit);
		// TODO Auto-generated method stub

	}

}
