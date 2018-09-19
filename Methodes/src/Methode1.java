
public class Methode1 
{

	/// public static typeDeRetour nomDeLaMethode(args.....){...}

		public static void main(String[] args)
		
		{
			int addition1215 = addition(12, 15);
			System.out.println("résultat de l'addition : " + addition1215);
			
			int soustraction2111 = soustraction(21, 11);
			System.out.println("résultat de la soustraction : " + soustraction2111);
			
			int multiplication2010 = multiplication(20, 10);
			System.out.println("résultat de la multiplication : " + multiplication2010);
			
			int division2010 = division(20, 10);
			System.out.println("résultat de la division : " + division2010);
			
			//autre façon de déclarer une chaine de caractère en utilisant : "new"
			//String s1 = new String("coucou");
			//String s2 = "coucou";
			
			//String s3 = new String();
			//String s4 = "";
			
			//System.out.println(s3);
			//System.out.println();
		}
		
	//declaration methode addition
		public static int addition(int nombre1, int nombre2) 
		
		 { 
				int resultat = nombre1 + nombre2;
				return resultat;
		 }
		
	//declaration methode soustraction
		
		public static int soustraction(int nombre1, int nombre2) 
		
		 { 
				int resultat = nombre1 - nombre2;
				return resultat;
		 }
	
	//declaration methode multiplication
		public static int multiplication(int nombre1, int nombre2) 
		
		 { 
				int resultat = nombre1 * nombre2;
				return resultat;
		 }
	
	//declaration methode division
		public static int division(int nombre1, int nombre2) 
		
		 { 
				int resultat = nombre1 / nombre2;
				return resultat;
		 }
		
	// TODO Auto-generated method stub

}
