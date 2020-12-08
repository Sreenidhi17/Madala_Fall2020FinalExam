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
public class Circle extends GeometricObject {

    private double radus;

    /**
     * circle constructor with no parameters
     */
    public Circle() {
    }

    /**
     * circle constructor with radius as parameter
     * @param radus
     */
    public Circle(double radus) {
        this.radus = radus;
    }

    /**
     * gets the radius 
     * @return radius
     */
    public double getRadus() {
        return radus;
    }

    /**
     * sets the radius
     * @param radus
     */
    public void setRadus(double radus) {
        this.radus = radus;
    }

    /**
     * gets the perimeter
     * @return perimeter
     */
    public double getPerimeter() {
        return 2 * radus * Math.PI;
    }

    /**
     * gets the diameter
     * @return diameter
     */
    public double getDiameter() {
        return 2 * radus;
    }

    /**
     * gets the area
     * @return area
     */
    @Override
    public double getArea() {
        return radus * radus * Math.PI;
    }

    /**
     * gives the information of the circle
     */
    public void circle() {
        System.out.println("The circle is created " + getDate()
                + " and the radius is " + radus);
    }
}
