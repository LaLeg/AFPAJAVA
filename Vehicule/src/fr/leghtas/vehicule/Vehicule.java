package fr.leghtas.vehicule;

public class Vehicule 
{
	
// Attributs de Vehicule
	
    protected String marque;
	protected String couleur;
	protected int vitesse;
	protected int puissance;
	protected int prix;
	protected int kilometrage;
	
//Constructeur sans paramètres
	
	public Vehicule() 
	{
		super();
// TODO Auto-generated constructor stub
	}
	
//Constructeur avec paramètres
	
	public Vehicule(String marque, String couleur, int vitesse, int puissance, int prix, int kilometrage) 
	
	{
		super();
		this.marque = marque;
		this.couleur = couleur;
		this.vitesse = vitesse;
		this.puissance = puissance;
		this.prix = prix;
		this.kilometrage = kilometrage;
	}
	
// methodes communes dans Vehicule
	
	public void demarrer ()
	{
		System.out.println("le vehicule "+ marque + " démarre" );
	}
	public void accelerer ()
	{
		System.out.println("le vehicule "+ marque + " accélère" );
	}
	public void freiner ()
	{
		System.out.println("le vehicule "+ marque + " freine, il ya danger en face !!" );
	}
	public void rouler ()
	{
		System.out.println("le vehicule "+ marque + " roule " );
	}
	
// Getters and Setters
	
	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getVitesse() {
		return vitesse;
	}

	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getKilometrage() {
		return kilometrage;
	}

	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}
	
}
