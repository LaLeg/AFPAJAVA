
public class Main 
{

	public static void main(String[] args) 
	
	{
		Ville paris = new Ville();
		paris.nom = "Paris";
		paris.nombreHabitants = 100;
		paris.sup = 100;
		
		System.out.println("Traitement des données de l'objet paris du type Ville");
		
		System.out.println("Nom de l'objet paris de type Ville : "+ paris.nom );
		System.out.println("Nombre d'Habitants de l'objet paris : "+ paris.nombreHabitants  );
		System.out.println("Superficie de l'objet paris " + paris.sup);
		
		//appeler une méthode crée dans la classe ville (allumerLesLumieres)
		
		paris.allumerLesLumieres();

	}

}
