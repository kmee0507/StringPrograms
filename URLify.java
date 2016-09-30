import java.util.*;
public class URLify {
	
	public static void urlify(String url){
		String[] str = url.split("");
		String finalString = "";
		for (int i = 0; i<str.length;i++){
			if(str[i].equals(" "))
				finalString+="%20";
			else
				finalString+=str[i];
		}
		System.out.println("After being URLified......");
		System.out.println(finalString);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sentence you want to be URLified: ");
		String url = sc.nextLine();
		urlify(url);
		sc.close();
	}

}
