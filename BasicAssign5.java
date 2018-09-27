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