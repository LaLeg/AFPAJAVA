package fr.leghtas.vehicule;

public class Car extends Vehicule

{
	
// Propriété spécifique à Car (NombreDePlaces)
	private int NombreDePlaces;
	
//Constructeur sans paramètres
	public Car() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String marque, String couleur, int vitesse, int puissance, int prix, int kilometrage) {
		super(marque, couleur, vitesse, puissance, prix, kilometrage);
		// TODO Auto-generated constructor stub
	}

	//Getters and Setters
	public int getNombreDePlaces() {
		return NombreDePlaces;
	}

	public void setNombreDePlaces(int nombreDePlaces) {
		NombreDePlaces = nombreDePlaces;
	}

}
