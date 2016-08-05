package pigLatin;

import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String realWord ;
		char pigHead;
		String pigHeadless = null;
		String pigletLatin =null;
		String translation =null;
		
		greeting();
		
		realWord = typeWord (); 
		translation = translate (realWord);
		result (translation);
	}

	public static void greeting() {
		System.out.println("Welcome to the Pig Latin Translator. Please enter a word:");
		
	}
	
	public static String typeWord (){
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();  //method to run
		System.out.println(word); 
		return word;
	}
	
	//public static boolean isLetter() {
	//	return ;
	//}
	
	//is letter?
	
	public static String translate (String word){
		return word;   //translate later
	}

	public static void result (String myWord){
		System.out.println("The translation is " + myWord);
	}
	//complete the translate; maybe validate isLetter
	
}
