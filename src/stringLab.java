
import java.util.Scanner;

public class stringLab {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		System.out.println("Write a Word to put it backwards.");
		String a = scan.nextLine();
		String xd = stringMet.alrevez(a);
		System.out.println("The string backwars is: " + xd);
		
		System.out.println("Write a word");
		String b = scan.nextLine();
		String dx = stringMet.mayus(b);
		System.out.println(dx);
		
		System.out.println("Write a sentence that contanins\"Waldo\"");
		String c = scan.nextLine();
		int t = stringMet.weldo(c);
		System.out.println(t);
		
		System.out.println("Write 2 words to order them alphabeticaly(NO CAPITAL LETTERS)");
		String l = scan.nextLine();
		String p = scan.nextLine();
		String[] names = stringMet.first(l,p);
		for(int i = 0; i<names.length;i++) {
		System.out.println(names[i]);
		}
		
		System.out.println("Write two words, to see which is longer");
		String o = scan.nextLine();
		String q = scan.nextLine();
		stringMet.longa(o,q);
		
		
		System.out.println("Write a word, to letterize it");
		String u = scan.next();
		stringMet.letter(u);
		
		System.out.println("Write a sentence thet contains the word \"math\", the word is optional");
		scan.next();
		String bruh = scan.nextLine();
		stringMet.math(bruh);
		
		
		scan.close();
	}
	

}
