
public class Ville 

{
	String nom;
	int nombreHabitants;
	int sup;
	
// constructeur sans paramètre (par défaut)
	public Ville() {}
	
// constructeur avec params
	public Ville(String nomP, int nombreHabitantsP, int supP) 
	
	{
		nom = nomP;
		nombreHabitants = nombreHabitantsP;
		sup=supP;
		
	}
	
	//une methode dans Ville (exemple allumerLesLumieres)
	
	public void allumerLesLumieres()
	
	{
		System.out.println("Les lumières de la ville de "+nom+" sont allumées");
	}
	
}
