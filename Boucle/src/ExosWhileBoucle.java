
public class ExosWhileBoucle 
{

	public static void main(String[] args) 
	{
		
		// Exercice 1 : afficher les entiers de 1 à 100.
		System.out.println("-> Résultats de l'exercice 1 :" );
		
		
		int a =1;
		while (a<=100) 
		{
		System.out.println("La variable a = " +a);
		a++;
		}
		
		//Exercice 2 : Afficher les entiers de 100 à 1.
		System.out.println("-> Résultats de l'exercice 2 :" );
		int b =100;
		while (b>=1) 
		{
		System.out.println("La variable b = " +b);
		b--;
		}
		
		//Exercice 3 : Afficher les nombres pairs de 2 jusqu'à 100
        System.out.println("-> Résultats de l'exercice 3 :" );
		
		int c =2;
		while (c<=100) 
		{
		System.out.println(c);
		c=c+2;
		}
		
		//Exercice 4 : Afficher les nombres pairs de 100 jusqu'à 2
        System.out.println("-> Résultats de l'exercice 4 :" );
		
		int d =100;
		while (d>=2) 
		{
		System.out.println(d);
		d=d-2;
		}
		
		//Exercice 5 : Afficher à la fois deux colonnes des nombres de 1 à 100 et de 100 à 1.
        System.out.println("-> Résultats de l'exercice 5 :" );
        
        int x =1;
        int y=100;
        while (x<=100 && y>=1) 
		{
		System.out.println( "x = " + x + " et y = " + y);
		x++;
		y--;
		}
        
		

	}

}
