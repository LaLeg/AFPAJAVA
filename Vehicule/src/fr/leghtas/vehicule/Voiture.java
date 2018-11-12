package fr.leghtas.vehicule;

public class Voiture extends Vehicule

{
//propriété spécifique Voiture (nombre de portes)
	private int nombreDePortes;
	
//Constructeur sans parametres
	public Voiture() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
//Constructeur avec paramètres
	public Voiture(String marque, String couleur, int vitesse, int puissance, int prix, int kilometrage) 
	{
		super(marque, couleur, vitesse, puissance, prix, kilometrage);
		// TODO Auto-generated constructor stub
	}

//Getters and Setters
	public int getNombreDePortes() 
	{
		return nombreDePortes;
	}

	public void setNombreDePortes(int nombreDePortes) 
	{
		this.nombreDePortes = nombreDePortes;
	}
	

}
