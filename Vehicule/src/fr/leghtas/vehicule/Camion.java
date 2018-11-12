package fr.leghtas.vehicule;

public class Camion extends Vehicule
{
	
//propriété spécifique à Camion (capacité)
	private int capacite;
	
//Constructeur sans parametres
	public Camion() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
//Constructeur avec parametres
	public Camion(String marque, String couleur, int vitesse, int puissance, int prix, int kilometrage) 
	{
		super(marque, couleur, vitesse, puissance, prix, kilometrage);
		// TODO Auto-generated constructor stub
	}
	
//Getters and Setters
	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	
}
