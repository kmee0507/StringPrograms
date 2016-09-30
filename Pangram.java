import java.util.*;
public class Pangram {
	
	public static boolean isPangram(String sentence){
		
		for (char ch = 'A'; ch <= 'Z'; ch++) {
            if (sentence.indexOf(ch) < 0
                    && sentence.indexOf((char) (ch + 32)) < 0) {
                return false;
            }
        }
 
        return true;
		
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string to check if it is a pangram: ");
		String pangram = sc.nextLine();
		boolean b = isPangram(pangram.toUpperCase());
		sc.close();
		if(b)
			System.out.println("IS A PANGRAM!");
		else
			System.out.println("IS NOT A PANGRAM!");
	}

}
