import java.util.*;
public class PigLatin {
	
	public static String convertToPig(String s){
		String[] array = s.split(" ");
		String pig = "";
		for (int i = 0; i< array.length;i++){
			String curr = array[i];
			pig += curr.substring(1, curr.length());
			pig += curr.substring(0,1);
			pig += "ay";
			pig += " ";
		}
		
		return pig;
		
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sentence you want to translate to pig latin: ");
		String english = sc.nextLine();
		String pig = convertToPig(english);
		System.out.println("\nEnglish:        " + english.toUpperCase());
		System.out.println("Pig Latin:      " + pig.toUpperCase());
		
	}
	

}
