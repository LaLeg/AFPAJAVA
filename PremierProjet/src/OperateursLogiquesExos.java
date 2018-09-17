
public class OperateursLogiquesExos {

	public static void main(String[] args) {
		
		//déclarations affectations Notes
		double noteJava = 14;
		double noteHtml = 14;
		double noteJavaScript = 9;
		double noteCSS = 14;
		
		//déclarations affectations coefs
		int coefJava = 3;
		int coefHtml = 2;
		int coefJavaScript = 3;
		int coefCSS = 1;
		
		//--moyenne sans coef
		System.out.println("La moyenne sans coef :" );
		int sommecoef = coefJava + coefHtml +coefJavaScript + coefCSS;
		double sommenotes = noteJava + noteHtml + noteJavaScript + noteCSS;
		double moyenne = sommenotes / sommecoef;
		System.out.println("moyenne = " + moyenne);
		
		//--moyenne avec coef
		System.out.println("La moyenne avec coef :" );
		double SommePonderee = coefJava*noteJava + coefHtml*noteHtml + coefJavaScript*noteJavaScript + coefCSS*noteCSS;
		double MoyenneGenerale = SommePonderee / sommecoef;
		System.out.println("MoyenneGenerale = " + MoyenneGenerale);
		
		//Application des conditions
		
		//Question 1 :
		System.out.println("->Résultat de la question 1");
		boolean moyennebool = moyenne > 10;
		boolean MoyenneGeneralebool = MoyenneGenerale > 10;
		if(moyennebool || MoyenneGeneralebool) {System.out.println("Vous avez la moyenne");}
		else {System.out.println("Objectif non atteint");}
		
		//Question 2
		System.out.println("->Résultat de la question 2");
		boolean noteJavabool = noteJava>10;
		if(moyennebool && noteJavabool) {System.out.println("Vous avez eu la moyenne et une bonne note en JAVA");}
		else {System.out.println("Objectif non atteint");}
		
		//Question 3
		System.out.println("->Résultat de la question 3");
		boolean noteCSSbool = noteCSS>10;
		boolean noteHtmlbool = noteHtml>10;
		boolean noteJavaScriptbool = noteJavaScript>10;
		if(noteCSSbool || noteHtmlbool||noteJavaScriptbool) {System.out.println("Vous avez eu une bonne note en html ou Css ou Javascript");}
		else {System.out.println("Objectif non atteint");}
		
		//Question 4
		System.out.println("->Résultat de la question 4");
		if(noteCSSbool && noteJavabool && noteJavaScriptbool) {System.out.println("Vous avez eu une bonne note en html, Css et Javascript ");}
		else {System.out.println("Objectif non atteint");}
		
		//Question 5
		System.out.println("->Résultat de la question 5");
		boolean noteJavabool15 = noteJava>15;
		boolean noteJavaScriptbool15 = noteJavaScript>15;
		if(noteJavabool15 && noteJavaScriptbool15) 
		{System.out.println("Vous avez eu une très bonne note en Java et Javascript ");}
		else {System.out.println("Objectif 'Vous avez eu une très bonne note en Java et Javascript' non atteint");}
		
		//Question 6
		System.out.println("->Résultat de la question 6");
		boolean moyenneboolinf = moyenne < 10;
		boolean MoyenneGeneraleboolinf = MoyenneGenerale < 10;
		if(moyenneboolinf || MoyenneGeneraleboolinf) 
		{System.out.println("Vous n'avez pas eu la moyenne");}
		else {System.out.println("Non (Vous n'avez pas eu la moyenne)");}
		
		//Question 7
		
		System.out.println("->Résultat de la question 7");
		boolean noteJavabool5 = noteJava<5;
		boolean noteJavaScriptbool5 = noteJavaScript<5;
		boolean noteCSSbool5 = noteCSS<5;
		boolean noteHtmlbool5 = noteHtml<5;
		if(noteCSSbool5 || noteHtmlbool5||noteJavaScriptbool5||noteJavabool5) 
		{System.out.println("Vous devez travailler sérieusement une des quatre matières");}
		else {System.out.println("Non affirmation : 'Vous devez travailler sérieusement une des quatre matières' ");}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
