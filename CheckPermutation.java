import java.util.*;
public class CheckPermutation {
	
	public static void checkPermutation(String s1, String s2){
		
		ArrayList<String> str1 = new ArrayList<String>();
		ArrayList<String> str2 = new ArrayList<String>();
		boolean flag = false;
		if(s1.length() == s2.length()){
			for (int i = 0; i < s1.length();i++){
				str1.add(s1.substring(i,i+1));
				str2.add(s2.substring(i,i+1));
			}
			for(int j = 0; j < str1.size();j++){
				if(str1.contains(str2.get(j)))
					flag = true;
				else
					flag = false;
			}
			
		}
		else
			System.out.println("The two are different lengths, thus not permutations");
		
		if(flag)
			System.out.println(s1 + " is a permutation of "+ s2);
		else
			System.out.println(s1 + " is NOT a permutation of "+ s2);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string 1: ");
		String str1 = sc.nextLine();
		
		System.out.print("Enter string 2: ");
		String str2 = sc.nextLine();
		
		checkPermutation(str1.toLowerCase(), str2.toLowerCase());
		sc.close();
	}

}
