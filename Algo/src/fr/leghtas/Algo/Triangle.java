package fr.leghtas.Algo;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Veuillez saisir un nombre : ");
		int nombreSaisi;
		nombreSaisi = sc.nextInt();
		System.out.println("Vous avez saisi le nombre "+ nombreSaisi);


		for(int i=1; i<=nombreSaisi;i++){
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		} 


		// TODO Auto-generated method stub

	}

}
