// Name: Arsalan Arif Radhu
// Student ID: 100813965
// Description: ICE 9

package ca.durhamcollege;

import java.util.Scanner;

//driver class (entry point to main program)
public class Main {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Vector2D point1 = new Vector2D();
        Vector2D point2 = new Vector2D();
        String prompt = "";

        System.out.print("Enter the first point (x, y): ");
        prompt = keyboard.nextLine();
        var values = prompt.split(",");
        point1.set(Float.parseFloat(values[0]), Float.parseFloat(values[1]));



        System.out.println("\n----------------------------------------------------------------------------");
        System.out.println ("You Entered " + point1.toString() + " for the first point");
        System.out.println("----------------------------------------------------------------------------\n");

        System.out.print("Enter the second point (x, y): ");
        prompt = keyboard.nextLine();
        values = prompt.split("," );
        point2.set(Float.parseFloat(values[0]), Float.parseFloat(values[1]));

        System.out.println("\n----------------------------------------------------------------------------");
        System.out.println ("You Entered " + point2.toString() + " for the second point");
        System.out.println("----------------------------------------------------------------------------\n");

        System.out.println("\n----------------------------------------------------------------------------");
        System.out.printf("Magnitude of Point 1 is : %.3f", point1.getMagnitude() );
        System.out.printf("\nMagnitude of Point 2 is : %.3f", point2.getMagnitude() );
        System.out.printf("\nDistance between Point 1 and Point 2 is: %.3f", Vector2D.distance(point1, point2));
        System.out.println("\n----------------------------------------------------------------------------\n\n");
    }
}
