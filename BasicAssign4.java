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