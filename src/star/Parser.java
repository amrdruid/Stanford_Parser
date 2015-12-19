package star;

import java.util.*;

public class Parser {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter 1 for Arabic, 2 For english : ");
		
		int choice = in.nextInt();
		in.nextLine(); // to skip the '\n'
		
		//The list of pair where the parsing result will be saved
		List<Pair<String,String>> parsingResult = new ArrayList<Pair<String,String>>();
		
		if(choice == 1){
			System.out.print("Enter the phrase in Arabic : ");
			String s = in.nextLine();
			StanfordParser parser = new StanfordParser();
			parsingResult = parser.parseArabicPhrase(s);
			
			for (Pair<String,String> p : parsingResult) {
				System.out.println(p.getL() + " " + p.getR());
			}
		}
		
		
		if(choice == 2){
			System.out.print("Enter the phrase in English : ");
			String s = in.nextLine();
			StanfordParser parser = new StanfordParser();
			parsingResult = parser.parseEnglishPhrase(s);
			
			for (Pair<String,String> p : parsingResult) {
				System.out.println(p.getL() + " " + p.getR());
			}
		}
	 }

}
