//BasicAssign1.java
import java.util.*;
class BasicAssign1{
	public static void main (String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = kb.next();
		String [] set = word.split("");
		int len = word.length();
		int sum = len + 1;
		String spce = "";
		System.out.println(word + set[0]);
		
		for (int i = 0; i<=len-2; i++){
			spce += " ";
		} 
			
		for ( int i = 1; i< len; i++){
			System.out.println(set[len-i] + spce + set[i]);
		}
		
		String rev = "";
		for (int i = len-1; i >= 0; i--){
			rev += set[i];
		}
		System.out.println(set[0] + rev);
	}
}