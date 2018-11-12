package fr.leghtas.oiseaux;

public class Aigle extends Oiseaux implements OiseauVolant 
{
	
// Constructeur sans paramètres
	public Aigle() {}
	
// Constructeur avec parametres
	public Aigle(String nom, int taille, int poids, String race, boolean plumes) 
	{
		super(nom, taille, poids, race, plumes);
		
	}
	
// Méthodes spécifiques Aigle (Chasser)
	public void chasser () 
	
	{
		System.out.println(nom +" est en train de chasser" );
	}
	
// résultat de "Add..." (ce qui n'a pas été implémenté comme méthode spécifique)
  
	@Override
    public void voler() 
    {
	 System.out.println("Je vole" );
    }

}
