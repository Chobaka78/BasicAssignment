//BasicAssign4.java
//Usman Farooqi
//
import java.util.*;
class BasicAssign4{
	public static void main(String [] args){
		int number [] = new int[365];
		Random x = new Random();
		//int x = (int)(Math.random()*365) + 1;
		int counter = 0;
		for (int i = 0; i< 10000; i++){
			number = new int[365];
			while (true){
				int w= x.nextInt(365);
				counter += 1;
				if (number[w] == 0){
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