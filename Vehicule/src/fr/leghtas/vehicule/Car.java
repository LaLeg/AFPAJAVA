package fr.leghtas.vehicule;

public class Car extends Vehicule

{
	
// Propri�t� sp�cifique � Car (NombreDePlaces)
	private int NombreDePlaces;
	
//Constructeur sans param�tres
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
