import java.util.Scanner;
public class ScanTabBoooleanExo 
{

	public static void main(String[] args) 
	{Scanner sc = new Scanner(System.in);
    
    System.out.print("Veuillez saisir un nom : ");
    
    String chaine = sc.nextLine();

    
    System.out.println("Vous avez saisi le nom : " + chaine);
    
    String cours [] = {"Java", "Html", "CSS", "Javascript", "PHP", "C++", "NodeJS", ".NET", "Typescript", "Golang", "Scala", "Kotlin"};
    boolean existepas = true;
    for (int i =0; i<cours.length; i++) 
    {
			if (cours[i].equals (chaine)) 
			{
				System.out.println( chaine + " se trouve à l'indice " + i + " du tableau cours");
				existepas = false;
			}
			
	  }
    if (existepas) {System.out.println("la matière saisie n'existe pas dans le tableau cours !!");}
		// TODO Auto-generated method stub

	}

}
