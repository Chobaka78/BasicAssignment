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