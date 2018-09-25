//BasicAssign2.java
import java.util.*;
class BasicAssign2{
	public static void main (String[] args){
		System.out.print("Enter a sentence: ");
		Scanner kb = new Scanner(System.in);
		String word = kb.nextLine();
		String [] let = word.split(" ");
		String ans = "";
		for (String i : let){
			if (!i.equals("")){
				ans += i + " ";
			}
		}
		System.out.print(ans);
	}
}