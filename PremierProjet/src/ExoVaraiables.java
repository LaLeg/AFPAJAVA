
public class ExoVaraiables {

	public static void main(String[] args) {
		
		//Exercice 1 : déclaration et affectation
		int coef = 3;
		double note = 14.5;
		double resultat = coef*note;
		System.out.println("resultat = " + resultat);
		
		//Exercice 2 : nouvelle affectation
		note = 12.3;
		coef = 5;
		
		//Afficher le Résultat note*coef
		System.out.println("Resultat = " + (note*coef));
		
		// Exercice 3 : declaration et affectation notes
		double noteJava = 10.5;
		double noteHtml = 13.2;
		double noteJavaScript = 11.3;
		double noteCSS = 8.5;
		double moyenne = (noteJava + noteHtml + noteJavaScript + noteCSS)/4;
		
		// Afficher la moyenne
		System.out.println("La moyenne = " + moyenne);
		
		//Exercice 4 : Moyenne précédente avec coefficients
		
		//--Declaration/Affectation coefficients
		int coefJava = 3;
		int coefHtml = 2;
		int coefJavaScript = 3;
		int coefCSS = 1;
		
		//--SommePondere & somecoef
		int somecoef = coefJava + coefHtml +coefJavaScript + coefCSS;
		double SommePondere = coefJava*noteJava + coefHtml*noteHtml + coefJavaScript*noteJavaScript + coefCSS*noteCSS;
		
		//--Afficher la nouvelle moyenne
		System.out.println("La nouvelle moyenne = " + (coefJava*noteJava + coefHtml*noteHtml + coefJavaScript*noteJavaScript + coefCSS*noteCSS)/9);
		System.out.println("nouvelle moyenne = " + (coefJava*noteJava + coefHtml*noteHtml + coefJavaScript*noteJavaScript + coefCSS*noteCSS)/(coefJava + coefHtml + coefJavaScript + coefCSS));
		System.out.println("La moyenne est = " + (coefJava*noteJava + coefHtml*noteHtml + coefJavaScript*noteJavaScript + coefCSS*noteCSS)/somecoef);
		
		//Affichage Moyenne - écriture simplifiée
		System.out.println("Moyenne = " + SommePondere/somecoef);
		
		//Exercice 5 : Déclaration et affectation séparées
		// déclaration
		// [type] [nomDeLaVariable]
		int quantite;
		//Affectation
		// [nomDeLaVariable] = [laValeur]
		quantite = 100;
		//Déclaration et Affectation
		//[type] [nomDeLaVariable]=[laValeur]
		int Variable = 123;
		
				
				
		

	}

}
