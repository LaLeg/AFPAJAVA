package fr.leghtas.oiseaux;


import fr.leghtas.oiseaux.Aigle;
import fr.leghtas.oiseaux.Manchot;
import fr.leghtas.oiseaux.Perruche;
import fr.leghtas.oiseaux.Pigeon;
import fr.leghtas.oiseaux.Autruche;

public class MainOiseaux 
{

	public static void main(String[] args) 
	{
		//D�claration des propri�t�s de nos oiseaux
				System.out.println("D�but du programme : ");
		
		//d�claration de l'objet royal du type Aigle
				Aigle royal = new Aigle();
		
		//propri�t�s de l'objet royal
				royal.setNom("Royal");
				royal.setTaille(50);
				royal.setPoids(10);
			    royal.setRace("AquilaFulva");
				royal.setPlumes(true);
		//Affichage des propri�t�s de l'objet royal

				System.out.println("-------------l'objet royal de type Aigle-----------------------");
				
				System.out.println("Nom de l'objet royal : " + royal.getNom());
				System.out.println("taille de royal: " + royal.getTaille());
				System.out.println("poids de royal : " + royal.getPoids());
				System.out.println("race de royal : " + royal.getRace());
				System.out.println("plumes de royal : " + royal.isPlumes());
		
				//d�claration de l'objet royal du type Aigle
		
		
		// D�claration de l'objet empereur du type Manchot
		
				Manchot empereur = new Manchot ();
		
		//propri�t�s de l'objet empereur
				empereur.setNom("Empereur");
				empereur.setTaille(80);
				royal.setPoids(20);
			    royal.setRace("Antarctique");
				royal.isPlumes();
				
		//Affichage des propri�t�s de l'objet empereur

				System.out.println("-------------l'objet empereur de type Manchot-----------------------");
				
				System.out.println("Nom d'empereur : " + empereur.getNom());
				System.out.println("taille d'empereur: " + empereur.getTaille());
				System.out.println("poids d'empereur : " + empereur.getPoids());
				System.out.println("race d'empereur : " + empereur.getRace());
				System.out.println("plumes d'empereur : " + empereur.isPlumes());
		
		// D�claration de l'objet olive du type Perruche
				
				Perruche olive = new Perruche ();
			
		//propri�t�s de l'objet olive
				olive.setNom("Olive");
				olive.setTaille(25);
				olive.setPoids(5);
				olive.setRace("Australienne");
				olive.isPlumes();
		
		//Affichage des propri�t�s de l'objet olive

				System.out.println("--------------l'objet olive de type Perruche----------------------");
				
				System.out.println("Nom d'olive : " + olive.getNom());
				System.out.println("taille d'olive : " + olive.getTaille());
				System.out.println("poids d'olive  : " + olive.getPoids());
				System.out.println("race d'olive  : " + olive.getRace());
				System.out.println("plumes d'olive  : " + olive.isPlumes());
		
		// D�claration de l'objet biset du type Pigeon
				
				Pigeon biset = new Pigeon ();
		
		//propri�t�s de l'objet biset
				biset.setNom("Biset");
				biset.setTaille(15);
				biset.setPoids(1);
				biset.setRace("Standard");
				biset.isPlumes();
				
		//Affichage des propri�t�s de l'objet biset
                System.out.println("-----------l'objet biset du type Pigeon-------------------------");
				
				System.out.println("Nom de biset : " + biset.getNom());
				System.out.println("taille de biset : " + biset.getTaille());
				System.out.println("poids de biset  : " + biset.getPoids());
				System.out.println("race de biset  : " + biset.getRace());
				System.out.println("plumes de biset  : " + biset.isPlumes());
		
				
		// D�claration de l'objet nomade du type Autruche
				
				Autruche nomade = new Autruche ();
		
		//propri�t�s de l'objet nomade
				nomade.setNom("Nomade");
				nomade.setTaille(200);
				nomade.setPoids(100);
				nomade.setRace("Savane");
				nomade.isPlumes();
				
		//Affichage des propri�t�s de l'objet nomade
                System.out.println("-------------l'objet nomade du type Autruche-----------------------");
				
				System.out.println("Nom de nomade : " + nomade.getNom());
				System.out.println("taille de nomade : " + nomade.getTaille());
				System.out.println("poids de nomade  : " + nomade.getPoids());
				System.out.println("race de nomade  : " + nomade.getRace());
				System.out.println("plumes de nomade : " + nomade.isPlumes());
		
		// moyenne taille de deux oiseaux
				double MoyenneTailleAiglePerruche = Utils.calculMoyenneTaille (royal.getTaille(), olive.getTaille());
				
				System.out.println("Moyenne Taille Aigle et Perruche : " + MoyenneTailleAiglePerruche);
				

				
				
				
	}

}
