import java.util.Scanner;

public class ExoLectureClavier {

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
	      
	      System.out.println("Saisissez votre valeur debut puis Entr�e ; idem pour la valeur fin.");
	      
	      int debut = sc.nextInt();
	      int fin = sc.nextInt();
	      
	      System.out.println("Vous avez saisi debut = " +debut);
	      System.out.println("Vous avez saisi fin = " +fin);
	      System.out.println("Voici votre s�rie d�but � fin");
	 
	      
	      while (debut<=fin) 
	      {
	    	  System.out.println(debut);
	    	  debut++;
	      }
	      
	      System.out.println("Merci");


	}

}
