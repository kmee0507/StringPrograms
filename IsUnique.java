import java.util.*;
public class IsUnique {
	
	public static boolean isUnique(String str){
		String[] split = str.split("");
		for(int i = 0; i <str.length();i++){
			String curr = str.substring(i,i+1);
			for (int j = i+2; j<split.length;j++){
				if(curr.equals(split[j]))
					return false;
			}
			
		}
		return true;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String unique = sc.nextLine();
		
		boolean un = isUnique(unique);
		if(un)
			System.out.println(unique + " contains all unique characters");
		else
			System.out.println(unique + " does NOT contain all unique characters");
		sc.close();
	}
		

}
