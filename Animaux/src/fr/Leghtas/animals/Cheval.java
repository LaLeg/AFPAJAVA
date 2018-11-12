package fr.Leghtas.animals;

public class Cheval extends Animal
{
	
	// Constructeur sans Params
	
	public Cheval () {}
	
	// Constructeur avec params
		
	public Cheval (String nomP, int tailleP, int poidsP, String couleurP, String raceP) 
			
		{
		super(nomP, tailleP, poidsP, couleurP, raceP);
		}
	
	// Methodes dans Cheval (hennir, frapper)
		
			
			public void hennir()
			{
				System.out.println("mon cheval " + nom +" est en train d'hennir !" );
			}
			
			public void frapper()
			{
				System.out.println("Attention " + nom +" peut te frapper" );
			}
}

