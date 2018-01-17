import java.util.Scanner;

public class Reponse {
	public void LesReponse() {
		System.out.println("==========Choisissez votre réponse (a,b,ou c)==========");
        Scanner sc = new Scanner(System.in);
        int point = 0;
        
        System.out.print("1.");
        char c1 = sc.next().charAt(0);		
        if (c1 == 'c') {
            //System.out.println("Effectivement, la réponse est bien 4 !");
            point = point + 1;
        } else {
            //System.out.println("Malheureusement pour vous, ce n'était pas la bonne réponse. ");
            }
        System.out.print("2.");
        char c2 = sc.next().charAt(0);		
        if (c2 == 'a') {
            //System.out.println("Effectivement, la réponse est bien 20 !");
            point = point + 1;
        } else {
            //System.out.println("Malheureusement pour vous, ce n'était pas la bonne réponse. ");
        }
        System.out.print("3.");
        char c3 = sc.next().charAt(0);
        if (c3 == 'c') {
            //System.out.println("Oui , c'est Paris.");
            point = point + 1;
        
        }else {
            //System.out.println("Malheureusement pour vous, ce n'était pas la bonne réponse. ");
        }
        System.out.println("point : "+point+"/10");
	}
}
 