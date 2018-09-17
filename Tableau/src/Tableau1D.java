
public class Tableau1D 
{

	public static void main(String[] args) 
	{   
		// Déclaration et Affectation d'un Tableau d'entiers.
		
		int entiersPremiers [] = {2, 3, 5, 7, 11, 13, 19, 23};
		
		// Proporiété : Taille du tableau
		int tailleTableau = entiersPremiers.length;
		
		// Afficher la taille du tableau
		System.out.println("La taille du tableau : " + tailleTableau);
		
		// Afficher les premier et deuxième éléments du tableau
		System.out.println("Le premier élément du tableau : " + entiersPremiers[0]);
		System.out.println("Le deuxième élément du tableau : " + entiersPremiers[1]);
		System.out.println("");
		
		// Afficher  Tous les Element du Tableau à l'aide de la boucle for
		System.out.println("-> Affichage de  Tous les Elements du Tableau");
		
		for (int i =0; i<entiersPremiers.length; i++) 
		{
			System.out.println(entiersPremiers[i]);
		}
		
		// Calcul de la somme des éléments du Tableau 
		int resultat = 0;
		for (int i =0; i<entiersPremiers.length; i++)
		{
			resultat = resultat + entiersPremiers[i];
		}
		System.out.println("");
		System.out.println("La somme des élémenrts du tableau est : " + resultat);
		
		// Calcul de la Multiplication des éléments du Tableau 
		int resultatM = 1;
		for (int i =0; i<entiersPremiers.length; i++)
		{
			resultatM = resultatM * entiersPremiers[i];
		}
		System.out.println("");
		System.out.println("La Multiplication des élémenrts du tableau est : " + resultatM);
		
		// Vérification de l'appartenance d'un élément au tableau
		for (int i =0; i<entiersPremiers.length; i++)
		{
			if (entiersPremiers[i] ==3) 
			{
				System.out.println("Le tableau contient la valeur 3");
			}
		}
		// Autre façon de déclarer un tableau
		int [] entiersP = {2, 4, 6, 8, 10, 12};
		
		// Déclarer un tableau vide avec taille définie
		int [] tableauImp = new int[5];
		tableauImp [0] = 1;
		tableauImp [1] = 3;
		tableauImp [2] = 5;
		
		// Vérification de l'appartenance et la non appartenance dans un tableau
		System.out.println("");
		System.out.println("-> verification de la non existence en plus.");
		int recherche = 20;
		boolean existePas = true;
		for (int i =0; i<entiersPremiers.length; i++)
		{
			if (recherche ==entiersPremiers[i]) 
			{
				System.out.println("Le tableau contient la valeur demandée");
				existePas = false;
			}
		}
		
		if (existePas) {System.out.println("Le tableau ne contient pas la valeur demandée");}
	}

}
