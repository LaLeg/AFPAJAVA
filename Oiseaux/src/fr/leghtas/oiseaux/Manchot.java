package fr.leghtas.oiseaux;

public class Manchot extends Oiseaux
{

// Constructeur sans paramètres
	public Manchot() 
	
	{
		super();
	}

// Constructeur avec parametres
	public Manchot(String nom, int taille, int poids, String race, boolean plumes) 
	
	{
		super(nom, taille, poids, race, plumes);
	}

// Méthodes spécifiques Manchot  (Nager)
		public void nager () 
		
		{
			System.out.println(nom +" est en train de nager" );
		}
}
