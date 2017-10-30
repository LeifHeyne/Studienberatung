import java.util.*;

public class Studienberatung{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Hast du Abitur?");
		String ans = s.next();
		

		if(ans.equalsIgnoreCase("n")){
			System.out.println("Hast du Fachabitur?");
			 ans = s.next();
			if(ans.equalsIgnoreCase("j")){
				System.out.println("Hast du eine Berufsausbildung?");
			}
			else if(ans.equalsIgnoreCase("n")){
				System.out.println("Nicht Studieren");
			}
		}

		else if( ans.equalsIgnoreCase("j")){
			System.out.println("Bist du wissbegierig?");
			 ans = s.next();
			if(ans.equalsIgnoreCase("j")){
				System.out.println("Auf jeden Fall studieren!");
			}
			else if(ans.equalsIgnoreCase("n")){
				System.out.println("Nicht Studieren");
			}

		}
		else{
			
		}
		
	}
}