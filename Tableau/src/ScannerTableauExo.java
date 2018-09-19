
import java.util.Scanner;

public class ScannerTableauExo 
{

	public static void main(String[] args) 
	
	{
		  Scanner sc = new Scanner(System.in);
	      
	      System.out.print("Veuillez saisir un nom : ");
	      
	      String chaine = sc.nextLine();
	  
	      
	      System.out.println("Vous avez saisi : " + chaine);
	      
	      String cours [] = {"Java", "Html", "CSS", "Javascript", "PHP", "C++", "NodeJS", ".NET", "Typescript", "Golang", "Scala", "Kotlin"};
	      
	      for (int i =0; i<cours.length; i++) 
	      {
				if (cours[i].equals (chaine)) 
				{
					System.out.println( "PHP se trouve à l'indice " + i);
				}else {System.out.println( "PHP ne se trouve pas à l'indice " + i);}
				
		  }
		// TODO Auto-generated method stub

	}

}
