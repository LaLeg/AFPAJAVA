
public class ExosTableau1D 
{

	public static void main(String[] args) 
	{
		String cours [] = {"Java", "Html", "CSS", "Javascript", "PHP", "C++", "NodeJS", ".NET", "Typescript", "Golang", "Scala", "Kotlin"};

		// Exercice 1 : Affichage des �l�ments du tableau
		System.out.println("-> Exercice 1 :");
		for (int i =0; i<cours.length; i++) 
		{
			System.out.println(cours[i]);
		}

		// Exercice 2 : Afficher les �l�ment sur la m�me ligne s�par�s par ","
		System.out.println("");
		System.out.println("-> Exercice 2 :");
		for (int i =0; i<cours.length; i++)

		{System.out.print( cours[i]);
		{System.out.print(", ");}}

		// Exercice 3 : Afficher les �l�ment sur la m�me ligne s�par�s par "," sauf le dernier. avec point � la fin.
		System.out.println("");
		System.out.println("-> Exercice 3 :");

		for (int i =0; i<cours.length; i++)	 
		{
			System.out.print( cours[i]);
			if (i < cours.length-1) {
				System.out.print(", ");
				
			}
		}

		System.out.print(".");

		// Exercice 4 : afficher l'indice et la mati�re correspondante
		System.out.println();
		System.out.println("-> Exercice 4 :");

		for (int i =0; i<cours.length; i++) 
		{
			System.out.println( "indice " + i +" : " +cours[i]);
		}
		
		// Exercice 5 : Recherche d'un �l�ment du Tableau, exemple php.
		System.out.println("-> Exercice 5 :");
		for (int i =0; i<cours.length; i++) {
			if (cours[i].equals ("PHP")) {
				System.out.println( "PHP se trouve � l'indice " + i);
			}
			
		}	


	}

}
