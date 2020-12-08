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
public class Square extends GeometricObject implements Colorable {

    public double s;

    /**
     * no parameter constructor
     */
    public Square() {
        s = 0.0;
    }

    /**
     * constructor for square with side
     * @param s
     */
    public Square(double s) {
        this.s = s;
    }

    /**
     * gets the side
     * @return
     */
    public double getS() {
        return s;
    }

    /**
     * sets the side
     * @param s
     */
    public void setS(double s) {
        this.s = s;
    }

    /**
     * method that prints how to color
     */
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }

    /**
     * gets the area of the object
     * @return double
     */
    @Override
    public double getArea() {
        double area = s * s;
        return area;
    }

    /**
     * gets the perimeter
     * @return
     */
    @Override
    public double getPerimeter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
