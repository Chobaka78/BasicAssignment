//BasicAssign2.java
// Usman Farooqi
// This program takes a sentence from the user with a bunch of spaces and makes it to that there is only 1 space in between words
import java.util.*;
class BasicAssign2{
	public static void main (String[] args){
		System.out.print("Enter a sentence: "); // This part of the program prompts the user to enter a sentence
		Scanner kb = new Scanner(System.in);
		String word = kb.nextLine();
		String [] let = word.split(" "); // this is a String array that splits " " and gets only the words
		String ans = "";
		for (String i : let){
			//This loop checks the entire let array to check if there isnt a space
			if (!i.equals("")){
				ans += i + " ";// if there is not a space it adds the word plus 1 space to the answer string 
			}
		}
		System.out.print(ans);
	}
}