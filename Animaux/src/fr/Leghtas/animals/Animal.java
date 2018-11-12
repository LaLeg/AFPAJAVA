package fr.Leghtas.animals;

public class Animal 
{
	// propriétés de la classe Animal
	protected String nom;
	protected int taille;
	protected int poids;
	protected String couleur;
	protected String race;
	
	//Constructeur sans paramètres
	public Animal() {}
	
	//Constructeur avec paramètres
	public Animal(String nom, int taille, int poids, String couleur, String race) 
	
	{
		this.nom = nom;
		this.taille = taille;
		this.poids = poids;
		this.couleur = couleur;
		this.race = race;
	}
	
//Methodes communes dans Animal
	
	public void manger()
	{
		System.out.println(nom +" a mangé" );
	}
    
	public void dormir()
	{
		System.out.println(nom +" dort en ce moment" );
	}
	
	public void jouer()
	{
		System.out.println(nom +" veut jouer" );
	}
	
//getter et setter
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}
	
}
