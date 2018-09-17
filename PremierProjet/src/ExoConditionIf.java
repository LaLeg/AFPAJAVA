
public class ExoConditionIf {

	public static void main(String[] args) {
		
		//Exercice 1
		System.out.println("Les Resultats de l'exercice 1 :");
		
		//declration affectation
		int coef = 3;
		double note = 15;
		double resultat = coef * note;
		
		//conditions - affichages
		if (resultat >= 50) {System.out.println("Resultat = " + resultat);}
		if (resultat <50) {System.out.println("Resultat insuffisant");}
		if (resultat == 45) {System.out.println("Resultat = " + resultat);}
		
		//Exercice 2
		System.out.println("Les Resultats de l'exercice 2 :");
		
		double noteJava = 10.5;
		double noteHtml = 13.5;
		double noteJavaScript = 9.5;
		double noteCSS = 8.5;
		double moyenne = (noteJava + noteHtml + noteJavaScript + noteCSS)/4;
		if (moyenne>=10) {System.out.println("Vous avez eu une bonne note ");}
		if (moyenne<10) {System.out.println("Vous avez eu une mauvaise note ");}
		
		// TODO Auto-generated method stub

	}

}
