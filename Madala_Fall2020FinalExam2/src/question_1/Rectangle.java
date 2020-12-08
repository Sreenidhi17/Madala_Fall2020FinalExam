/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_1;

/**
 *
 * @author Sreenidhi Madala
 */
class Rectangle extends Figure {

    Rectangle(double i, double j) {
        super(i, j);
    }

    double area() {
        System.out.println("Inside Area for Rectangle.");
        return dimension1 * dimension2;
    }
}
