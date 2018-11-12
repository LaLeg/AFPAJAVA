package fr.Leghtas.animals;

public class Chat extends Animal
{


	// Constructeur sans Params
	
	public Chat () {}
	
	// Constructeur avec params
		
	public Chat (String nomP, int tailleP, int poidsP, String couleurP, String raceP) 
			
		{
			super(nomP, tailleP, poidsP, couleurP, raceP);
		}
	
	// Methodes spécifiques Chat (miauler, griffer)
		
			public void miauler()
			{
				System.out.println("mon chat " + nom +" est en train de miauler !" );
			}
			
			public void griffer()
			{
				System.out.println("Attention " + nom +" peut te griffer" );
			}
}

