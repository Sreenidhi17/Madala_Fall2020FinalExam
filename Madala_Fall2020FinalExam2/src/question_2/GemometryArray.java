/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_2;

/**
 *
 * @author Sreenidhi Madala
 */
public class GemometryArray {
    public static void main(String[] args) {
// creates a GeometricObject of array with 5 parameters
        GeometricObject[] obj = {new Square(20), new Square(3),
                          new Square(6), new Square(4), new Square(3.8)};

//display the area when Iterates through array object
        for (int i = 0; i < obj.length; i++) {

            System.out.println("The Area of object is " + obj[i].getArea());

//Checks wether the object is an instance of Colorable interface.
            if (obj[i] instanceof Colorable) {

//Invokes the method pin the interface
                ((Colorable) obj[i]).howToColor();

            }

        }

    }
    
    
}
