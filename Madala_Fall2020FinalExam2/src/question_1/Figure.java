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
abstract class Figure {

    double dimension1;
    double dimension2;

    Figure(double a, double b) {
        dimension1 = a;
        dimension2 = b;
    }

    abstract double area();
}
