
public class Ville 

{
	String nom;
	int nombreHabitants;
	int sup;
	
// constructeur sans param�tre (par d�faut)
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
		System.out.println("Les lumi�res de la ville de "+nom+" sont allum�es");
	}
	
}
