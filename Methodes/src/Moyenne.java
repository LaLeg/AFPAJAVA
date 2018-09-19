
public class Moyenne {

	public static void main(String[] args) 
	{
	
		float MoyenneDesNotes1 = moyenne(11, 11, 9, 8.5f, 3, 2, 3, 1 );
		float MoyenneDesNotes2 = moyenne(11, 11, 9, 8.5f, 1, 3, 2, 3 );
		float MoyenneDesNotes3 = moyenne(11, 11, 9, 8.5f, 3, 3, 4, 3 );
		//Moyenne Sans Condition
		System.out.println("Sans Condition :" + MoyenneDesNotes1);
		
		//Moyenne avec Condition
		if (MoyenneDesNotes1<15) {System.out.println("Avec Condition1 :" + MoyenneDesNotes2);}
		if (MoyenneDesNotes2<10) {System.out.println("Avec Condition2 :" + MoyenneDesNotes3);}
		//else {System.out.println(MoyenneDesNotes1);}
		
	// TODO Auto-generated method stub

	}
	
    public static float moyenne (float noteJava, float noteHtml, float noteJavaScript, float noteCSS, int coefJava, int coefHtml, int coefJavaScript, int coefCSS)
    {
    int SommeCoef = coefJava + coefHtml +coefJavaScript + coefCSS;
    float SommePonderee = coefJava*noteJava + coefHtml*noteHtml + coefJavaScript*noteJavaScript + coefCSS*noteCSS;
	float resultat = SommePonderee/SommeCoef ;
	return resultat;
	}
}
