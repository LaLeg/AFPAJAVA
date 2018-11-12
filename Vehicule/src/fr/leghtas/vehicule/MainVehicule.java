package fr.leghtas.vehicule;

public class MainVehicule 

{

	public static void main(String[] args) 
	{
//instanciation de l'objet c3 du type Voiture
		
		Voiture c3 = new Voiture();
		
// Affectation des valeurs des propriétés de l'objet c3 du type Voiture
		
		c3.setMarque("C3");
		c3.setCouleur("rouge");
		c3.setVitesse(230);
	    c3.setPuissance(6);
		c3.setPrix(15000);
		c3.setKilometrage(0);
		c3.setNombreDePortes(5);
		
//Affichage des propriétés de l'objet c3

		System.out.println("-------------l'objet c3 du type Voiture-----------------------");
		System.out.println("Marque de l'objet c3 : " + c3.getMarque());
		System.out.println("Couleur de l'objet c3 : " + c3.getMarque());
		System.out.println("Vitesse max de l'objet c3 : " + c3.getVitesse());
		System.out.println("Marque de l'objet c3 : " + c3.getMarque());
		System.out.println("Puissance de l'objet c3 : " + c3.getPuissance());
		System.out.println("Prix de l'objet c3 : " + c3.getPrix());
		System.out.println("Kilometrage de l'objet c3 : " + c3.getKilometrage());
		System.out.println("Nombre de portes de l'objet c3 : " + c3.getNombreDePortes());

//Faire rouler la voiture c3
		
		System.out.println("-------------Faire rouler la voiture c3-----------------------");
		c3.demarrer();
		c3.accelerer();
		c3.rouler();
		
// la voiture C3 roule depuis une heure déja, gerer la durée à l'aide d'une exception
		
		/*try 
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) 
		{
			System.out.println(e.getMessage());
		}*/
		
    /* un autre exemple d'exception : try{...} catch{...}
	int i = 0 ;
	try{
			System.out.println(10 / 0);
		}catch (Exception e) {
			System.out.println("Impossibe lde div par 0 ");
		}*/
		
		System.out.println("Je roule depuis une heure, j'ai besoin d'une PAUSE");
		
// instanciation de l'objet volvo du type Camion
		
	Camion volvo = new Camion();
		
// Affectation des valeurs des propriétés de l'objet volvo du type Camion
		
	volvo.setMarque("Volvo");
	volvo.setCouleur("Vert");
	volvo.setVitesse(180);
	volvo.setPuissance(24);
	volvo.setPrix(100000);
	volvo.setKilometrage(5000);
	volvo.setCapacite(26);
				
// Affichage des proprités de l'objet volvo du type Camion
				
	System.out.println("-------------l'objet volvo du type Camion-----------------------");
	
	System.out.println("Marque de l'objet volvo : " + volvo.getMarque());
	System.out.println("Couleur de l'objet volvo : " + volvo.getCouleur());
	System.out.println("Vitesse max de l'objet volvo : " + volvo.getVitesse());
	System.out.println("Puissance de l'objet volvo : " + volvo.getPuissance());
	System.out.println("Prix de l'objet volvo: " + volvo.getPrix());
	System.out.println("Kilometrage de l'objet volvo : " + volvo.getKilometrage());
	System.out.println("Capacité de l'objet volvo : " + volvo.getCapacite());

// instantiation de l'objet mecedes du type Camion
	
	
// Affectation des valeurs des propriétés de l'objet mercedes du type Camion
	/*mercedes.setMarque("Mercedes");
	mercedes.setCouleur("Blanc");
	mercedes.setVitesse(200);
	mercedes.setPuissance(75);
	mercedes.setPrix(150000);
	mercedes.setKilometrage(0);
	*/
				
// Faire un traitement avec un camion de capacité > 25t
	
	System.out.println("------------ Faire une livraison de capacité > 25t -----------------------");
	
	c3.demarrer();
	c3.accelerer();
	c3.rouler();
	
	if (volvo.getCapacite()<25) 
	{
	Camion mercedes = new Camion();
	//
	mercedes.setCapacite(30);
	mercedes.setMarque("Mercedes");
	mercedes.setCouleur("Blanc");
	mercedes.setVitesse(200);
	mercedes.setPuissance(75);
	mercedes.setPrix(150000);
	mercedes.setKilometrage(0);
	//
	mercedes.demarrer();	
	mercedes.accelerer();
	mercedes.rouler();
	}
	else 
	{
		volvo.demarrer();	
		volvo.accelerer();
		volvo.rouler();
	}
	

// TODO Auto-generated method stub

	}

}
