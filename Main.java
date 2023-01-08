/*Geometry Calculator Application
The Geomentry Calculator allows the user to calculate the area of a variety of geometric shapes by entering the appropriate properties.
Programmed By: R. Fader
Initially Programed: May 20th, 2021
Last Updated: May 20th, 2021 By: R. Fader
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   
   Scanner keyboard = new Scanner(System.in);
   int shapeChoice;

   System.out.println("Welcome to the Geomentry Calculator!");
   System.out.println("\n\nWith this program, you will be able to calculate the area of a rectangle, triangle or circle.\n\n");

    do{
      System.out.print("What shape would you like to calculate the area for? Enter 1 for circle, 2 for rectangle or 3 for triangle: ");
      while (!keyboard.hasNextInt()) {
        System.out.println("That is not a valid choice. Please input 1, 2, or 3.");
        keyboard.next();
      }
      shapeChoice = keyboard.nextInt();
    } while (shapeChoice != 1 && shapeChoice != 2 && shapeChoice != 3);

   if (shapeChoice == 1){
    double radius;
    System.out.print("Please enter the radius of the circle: ");
    radius = keyboard.nextDouble();

    Circle myCircle = new Circle();
    myCircle.setRadius(radius);

    System.out.println("The area of the circle is " + myCircle.getArea() +"."); 

   }
   else if(shapeChoice == 2){

     double length, width;
     System.out.print("Please enter the length of the rectangle: ");
     length = keyboard.nextDouble();

     System.out.print("Please enter the width of the rectangle: ");
     width = keyboard.nextDouble();

     Rectangle myRectangle = new Rectangle();
     myRectangle.setLength(length);
     myRectangle.setWidth(width);

     System.out.print("The area of your rectangle is " + myRectangle.getArea());

   }
   else if(shapeChoice == 3){
    double base, height;
    System.out.print("Please enter the base value of the triangle: ");
    base = keyboard.nextDouble();

    System.out.print("Please enter the height value of the triangle: ");
    height = keyboard.nextDouble();

    Triangle myTriangle = new Triangle();
    myTriangle.setBase(base);
    myTriangle.setHeight(height);

    System.out.print("The area of your triangle is " + myTriangle.getArea());
   }
  }
}