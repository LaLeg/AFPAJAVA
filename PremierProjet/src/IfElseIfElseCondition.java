
public class IfElseIfElseCondition {

	public static void main(String[] args) {
		
		//Exercice 1
		System.out.println("-> R�sultat de l'Exercice 1 :");
		
		//d�claration
		int note1;
		//affectation
		note1 = 15; 
		
		if (note1>10) {System.out.println("Re�u");}
		else if (note1==10) {System.out.println("Juste ; Examen oral");}
		else {System.out.println("Non Re�u");}
		
		//Exercice 2
		System.out.println("-> R�sultat de l'Exercice 2 :");
		
		//d�claration
		int note2;
		//affectation
		note2 = 10; 
				
		if (note2>10) {System.out.println("Re�u");}
		else if (note2==10) {System.out.println("Juste ; Examen oral");}
		else {System.out.println("Non Re�u");}
				
		//Exercice 3
		System.out.println("-> R�sultat de l'Exercice 3 :");
		
		//d�claration
		int note3;
		//affectation
		note3 = 7; 
				
		if (note3>10) {System.out.println("Re�u");}
		else if (note3==10) {System.out.println("Juste ; Examen oral");}
		else {System.out.println("Non Re�u");}
		
		//Exercice 4
		System.out.println("-> R�sultat de l'Exercice 4 :");
		
		//Cas 1
		System.out.println("--> Cas 1 :");
		
		//d�clarations Notes
		double noteJava = 14;
		double noteHtml = 13;
		double noteJavaScript = 9;
		double noteCSS = 7.5;
		//d�clarations coefs
		int coefJava = 3;
		int coefHtml = 2;
		int coefJavaScript = 3;
		int coefCSS = 1;
		//--SommePondere & somecoef
		int sommecoef = coefJava + coefHtml +coefJavaScript + coefCSS;
		double SommePondere = coefJava*noteJava + coefHtml*noteHtml + coefJavaScript*noteJavaScript + coefCSS*noteCSS;
		//Moyenne
		double Moyenne = SommePondere/sommecoef;
		
		//Affichage r�sultas de l'exercice 4
		System.out.println("Moyenne = " + Moyenne);
		if (Moyenne>18) {System.out.println("Tr�s Bien");}
		else if (Moyenne>15){System.out.println("Bien");}
		else if (Moyenne>12){System.out.println("Assez Bien");}
		else if (Moyenne>10){System.out.println("Moyen");}
		else if (Moyenne>8){System.out.println("PMF : Peut Mieux Faire");}
		else  {System.out.println("Insuffisant, Il faut plus de travail");}
		
		//Cas 2
System.out.println("--> Cas 2 :");
		
		//d�clarations Notes
		double noteJava2 = 19;
		double noteHtml2 = 19;
		double noteJavaScript2 = 18;
		double noteCSS2 = 18;
		//--SommePondere
		double SommePondere2 = coefJava*noteJava2 + coefHtml*noteHtml2 + coefJavaScript*noteJavaScript2 + coefCSS*noteCSS2;
		//Moyenne
		double Moyenne2 = SommePondere2/sommecoef;
		
		//Affichage r�sultas de l'exercice 4
		System.out.println("Moyenne = " + Moyenne2);
		if (Moyenne2>18) {System.out.println("Tr�s Bien");}
		else if (Moyenne2>15){System.out.println("Bien");}
		else if (Moyenne2>12){System.out.println("Assez Bien");}
		else if (Moyenne2>10){System.out.println("Moyen");}
		else if (Moyenne2>8){System.out.println("PMF : Peut Mieux Faire");}
		else  {System.out.println("Insuffisant, Il faut plus de travail");}

		
		
		

	}

}
