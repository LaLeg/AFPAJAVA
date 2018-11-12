package fr.Leghtas;

import fr.Leghtas.animals.Chat;
import fr.Leghtas.animals.Cheval;
import fr.Leghtas.animals.Chien;
import fr.Leghtas.animals.Lapin;
import fr.Leghtas.animals.Loup;

public class MainAnimaux {

	public static void main(String[] args) 
	
	{
		//Début programme
		System.out.println("Début du programme : ");
		
		//déclaration de l'objet filou du type Chien
		Chien filou = new Chien();
		
		//propriétés de l'objet filou
		filou.setNom("Filou");
		filou.setTaille(50);
		filou.setPoids(20);
		filou.setCouleur("blanc");
		filou.setRace("Caniche");
		
		//Affichage des propriétés de l'objet filou

		System.out.println("------------------------------------");
		
		System.out.println("Nom de l'objet filou : " + filou.getNom());
		System.out.println("taille de filou: " + filou.getTaille());
		System.out.println("poids de filou : " + filou.getPoids());
		System.out.println("couleur de filou : " + filou.getCouleur() );
		System.out.println("race de filou : " + filou.getRace());
		
		//déclaration de l'objet minou de type chien
		
		Chien minou = new Chien("Minou",40, 20, "noir", "Labrador");
	    
		//
		System.out.println("------------------------------------");
	    
		//Affichage des propriétés de l'objet minou
		System.out.println("Nom de l'objet minou : " + minou.getNom());
		System.out.println("taille de minou: " + minou.getTaille());
		System.out.println("poids de minou : " + minou.getPoids());
		System.out.println("couleur de minou : " + minou.getCouleur());
		System.out.println("race de minou : " + minou.getRace());
		
		//appeler des méthode crées dans la classe Chien (manger)
		
		System.out.println("------------------------------------");
		
		minou.manger();
		minou.dormir();
		minou.jouer();
	 
		//déclaration de l'objet tigrou  du type Chat
				
		Chat tigrou = new Chat();
				
		//propriétés de l'objet tigrou
		
		tigrou.setNom("Tigrou"); 
		tigrou.setTaille(30);
		tigrou.setPoids(10);
		tigrou.setCouleur("gris");
		tigrou.setRace("BleuRusse");
		
		//
		System.out.println("------------------------------------");
			    
		//Affichage des propriétés de l'objet tigrou
		
		System.out.println("Nom de l'objet tigrou : " + tigrou.getNom() );
		System.out.println("taille de minou: " + tigrou.getTaille());
		System.out.println("poids de minou : " + tigrou.getPoids());
		System.out.println("couleur de minou : " + tigrou.getCouleur());
		System.out.println("race de minou : " + tigrou.getRace());		
		
		//appeler des méthode crées dans la classe Chat
		
		System.out.println("------------------------------------");
		
		tigrou.manger();
		tigrou.dormir();
		tigrou.jouer();
		tigrou.miauler();
		tigrou.griffer();
		
		//déclaration de l'objet chico du type Cheval
				Cheval chico = new Cheval();
				
		//propriétés de l'objet chico
		chico.setNom("Chico");
		chico.setTaille(150);
		chico.setPoids (100);
		chico.setCouleur ("Noir");
		chico.setRace("Pur-sang");
				
		//Affichage des propriétés de l'objet chico

		System.out.println("------------------------------------");
		
		System.out.println("Nom de l'objet chico du type Cheval : " + chico.getNom());
		System.out.println("taille de chico: " + chico.getTaille());
		System.out.println("poids de chico : " + chico.getPoids());
		System.out.println("couleur de chico : " + chico.getCouleur());
		System.out.println("race de chico : " + chico.getRace());
		
		//appeler des méthode crées dans la classe Cheval
		
		System.out.println("------------------------------------");
		
		chico.manger();
		chico.dormir();
		chico.jouer();
		chico.hennir();
		chico.frapper();
		
		Loup iber = new Loup ("Ibère", 70, 50, "noir", "Ibérique");
		System.out.println(iber.getNom());
		Lapin carotte = new Lapin ("Carotte", 20, 10, "gris", "bleu de vienne" );
		System.out.println(carotte.getRace());
		// TODO Auto-generated method stub

	}

}
