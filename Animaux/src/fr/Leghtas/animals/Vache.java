package fr.Leghtas.animals;

public class Vache extends Animal
{


	// Constructeur sans Params
	
		public Vache () {}
		
		// Constructeur avec params
			
		public Vache (String nomP, int tailleP, int poidsP, String couleurP, String raceP) 
				
			{
			super(nomP, tailleP, poidsP, couleurP, raceP);
			}
		
	// Methodes dans Vache (beugler)
		
		
			public void beugler()
			{
				System.out.println(nom + " est en train de beugler !" );
			}
			
			
	
}
