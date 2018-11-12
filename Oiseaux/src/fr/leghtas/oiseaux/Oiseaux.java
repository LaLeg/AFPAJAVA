package fr.leghtas.oiseaux;

public class Oiseaux 
{
	// propriétés de la classe Oiseaux
		
	    protected String nom;
		protected int taille;
		protected int poids;
		protected String race;
		protected boolean plumes;
		
	
	//Constructeur sans paramètres
		
		public Oiseaux() {}

	//Constructeur avec paramètres
		
		public Oiseaux(String nom, int taille, int poids, String race, boolean plumes) 
		{
	
			this.nom = nom;
			this.taille = taille;
			this.poids = poids;
			this.race = race;
			this.plumes = plumes;
		}
		
	
	//Methodes communes dans Oiseaux
		
		public void manger()
		{
			System.out.println(nom +" a mangé" );
		}
	    
		public void boir()
		{
			System.out.println(nom +" veut boire" );
		}
		
		public void jouer()
		{
			System.out.println(nom +" est en train de jouer" );
		}
		public void courir()
		{
			System.out.println(nom +" court plus vite" );
		}
		public void sauter()
		{
			System.out.println(nom +" saute beaucoup" );
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

		public String getRace() {
			return race;
		}

		public void setRace(String race) {
			this.race = race;
		}

		public boolean isPlumes() {
			return plumes;
		}

		public void setPlumes(boolean plumes) {
			this.plumes = plumes;
		}
		
		
		
		
		
	
		
		
	
		
		
}
