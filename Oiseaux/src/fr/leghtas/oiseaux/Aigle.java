package fr.leghtas.oiseaux;

public class Aigle extends Oiseaux implements OiseauVolant 
{
	
// Constructeur sans param�tres
	public Aigle() {}
	
// Constructeur avec parametres
	public Aigle(String nom, int taille, int poids, String race, boolean plumes) 
	{
		super(nom, taille, poids, race, plumes);
		
	}
	
// M�thodes sp�cifiques Aigle (Chasser)
	public void chasser () 
	
	{
		System.out.println(nom +" est en train de chasser" );
	}
	
// r�sultat de "Add..." (ce qui n'a pas �t� impl�ment� comme m�thode sp�cifique)
  
	@Override
    public void voler() 
    {
	 System.out.println("Je vole" );
    }

}
