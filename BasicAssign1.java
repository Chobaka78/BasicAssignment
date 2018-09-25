//BasicAssign1.java
// Usman Farooqi
// This program takes a word from the user and makes a hallow square
import java.util.*;
class BasicAssign1{
	public static void main (String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a word: "); // This part of the program takes a word from the user
		String word = kb.next();
		String [] set = word.split(""); // This part of the program splits the word into letters 
		int len = word.length();
		int sum = len + 1;
		String spce = "";
		System.out.println(word + set[0]); // This part prints the word plus the first letter(ie. four --> fourf)
		
		for (int i = 0; i<=len-2; i++){ // This loop runs to check how many spaces are needed in between the letter (length of word - 2)
			spce += " ";
		} 
			
		for ( int i = 1; i< len; i++){ // This loop runs to get the middle letters (ie - fourf ---> r   o , u   u , o   r)
			System.out.println(set[len-i] + spce + set[i]);
		}
		
		String rev = "";
		for (int i = len-1; i >= 0; i--){ // This loop takes the original word and reverses it by adding each letter to an empty string in reverse order
			rev += set[i]; // fourf ---> fruof
		}
		System.out.println(set[0] + rev);
	}
}