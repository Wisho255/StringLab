import java.util.Arrays;

public class stringMet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static String alrevez(String a) {
		String reverse = "";
		for(int i = a.length() - 1; i >= 0; i--) {
			reverse= reverse + a.charAt(i);
		}
		
		return reverse;
	}
	
	public static String mayus(String a) {
		String b = a.substring(0,1);
		String d = b.toUpperCase();
		String z = a.substring(1);
		String c = z.toLowerCase();
		String x = (d+c);
		return x;
	}
	
	public static int weldo(String a){
		int b = a.indexOf("Waldo");
		return b;
	}
	
	public static String[] first(String a, String b) {
		String[] names;
		names = new String[2];
		names[0] = a;
		names[1] = b;
		Arrays.sort(names);
		return names;
		
	}
	
	public static void longa(String a, String b) {
		int c = a.length();
		int d = b.length();
		
		if(c>d) {
			System.out.println(a+" is longer.");
		}
		if(c<d) {
			System.out.println(b+" is longer.");
		}
		if(c==d) {
			System.out.println(a+" and "+b+ " have the same lenght.");
		}
		
	}
	public static void letter(String a) {
		
		for(char b : a.toCharArray()) {
			System.out.println(b);
		}
		
	}
	
	public static void math(String a) {
		int b = a.indexOf("math");
		if(b==-1) {
			System.out.println("dud");
		}
		if(b>1) {
			System.out.println(a.substring(b));
		}
	}
	


}
