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

//BasicAssign3.java
//Usman Farooqi
//This program checks if a given point is on a line
import java.util.*;
import java.awt.geom.*; // This is for difining and perfoming the java 2D calsses.
class BasicAssign3 {
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		Line2D line = new Line2D.Double(); // decalring the line
		// Using a scanner the program asks the user for 4 points to make a line and then 2 more points 
		System.out.println("Enter the first X coordinate: ");
		double x1 = kb.nextDouble();
		System.out.println("Enter the first Y coordinate: ");
		double y1 = kb.nextDouble();
		System.out.println("Enter the second X coordinate: ");
		double x2 = kb.nextDouble();
		System.out.println("Enter the second Y coordinate: ");
		double y2 = kb.nextDouble();
		System.out.println("Enter the X point: ");
		double p1 = kb.nextDouble();
		System.out.println("Enter the Y point: ");
		double p2 = kb.nextDouble();
		double dist = line.ptLineDist (x1,y1,x2,y2,p1,p2); // ptLineDist (static double - checks the distance of a given point from a given line (x1,y1,x2,y2)
		if (dist == 0){// This part of the program checks if the last 2 points have a distance of 0 (this means they are on the line)
			System.out.println("The point is on the line");
		}
		else{//if the distance of the last 2 points is greater than 0 (then that means that the point is not on the given line)
			System.out.println("The point is not on the line");
		}
		
	}
}

//BasicAssign4.java
//Usman Farooqi
import java.util.*;
class BasicAssign4{
	public static void main(String [] args){
		int number [] = new int[365];
		Random x = new Random();
		int counter = 0;
		for (int i = 0; i< 10000; i++){
			number = new int[365];// resets the array everytime there is a match
			while (true){
				int w= x.nextInt(365);
				counter += 1; // counter increases when math found
				if (number[w] == 0){ // checking if there is a match
					number[w] += 1;
				}
				else{
					break;
				}
			}
		}
		System.out.print(counter/10000);
	}
}

//BasicAssign5.java
//Usman Farooqi 
import java.util.*;
class BasicAssign5{
	public static void main(String [] args){
		// the first part can only contain capital letters and itegers
		System.out.print("Enter line: ");
		Scanner kb = new Scanner(System.in);
		String input = kb.nextLine();
		String let = "";
		String numbers = "";
		String [] x = input.split(" ");
		char [] fst = x[0].toCharArray();
		int sec = Integer.parseInt(x[1]);
		for(char ch : fst){
			if (ch > '9'){
				let += ch;
			}
			else{
				numbers += ch;
			}
		}
		if (let != let.toUpperCase() || numbers.length() != 6){
			// If the letters entered in are no upper case and the number of integers entered in aren't 6 print invalid
			System.out.print("Invalid");
		}
		else if (Integer.parseInt(numbers.substring(0,2)) * Integer.parseInt(numbers.substring(2,4)) * Integer.parseInt(numbers.substring(4,6)) != sec){
			// If the 6 digits that were entered in the first part do not upp to the product then print invalid
			System.out.println("Invalid");
		}
		else{
			// If the letters are upper case, and there are 6 integers and the number enetered in second part is product of 6 integers
			System.out.println("Valid");
		}
	}
}