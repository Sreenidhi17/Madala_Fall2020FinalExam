/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_2;

import java.util.Date;

/**
 *
 * @author Sreenidhi Madala
 */
public abstract class GeometricObject {
   
    private String colour = "red";
    private boolean fild;
    private Date date;
    
    /**
     * GeometricObject for date 
     */
    protected GeometricObject() {
        date = new java.util.Date();
    }

    /**
     * Constructor for GeometricObject
     * @param colour
     * @param fild
     */
    protected GeometricObject(String colour, boolean fild) {
        date = new java.util.Date();
        this.colour = colour;
        this.fild = fild;
    }

    /**
     * gets the color
     * @returncolor
     */
    public String getColour() {
        return colour;
    }

    /**
     * sets the color 
     * @param colour
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * checks if the color is filled
     * @return true or false
     */
    public boolean isFild() {
        return fild;
    }

    /**
     * sets the color filled
     * @param fild
     */
    public void setFild(boolean fild) {
        this.fild = fild;
    }

    /**
     * gets the date
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * sets the date
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * gives the information of the object
     * @return String
     */
    @Override
    public String toString() {
        return "On " + date + "\n color: " + colour +
                " and filled: " + fild;
    }

    /**
     * a Compare method to compare the area between the objects
     * @param o
     * @return
     */
    public int compareTo(GeometricObject o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    /**
     * compares two different objects
     * @param obj1
     * @param obj2
     * @return
     */
    public static GeometricObject max(GeometricObject obj1, GeometricObject obj2) {
        return (obj1.compareTo(obj2) >= 0) ? obj1 : obj2;
    }

    /**
     * method for sum the Area
     * @param obj
     * @return double
     */
    public static double sumArea(GeometricObject[] obj) {
        double sum = 0;
        for (GeometricObject o : obj) {
            sum += o.getArea();
        }
        return sum;
    }
    
    /**
     * abstract method for Perimeter
     * @return
     */
    public abstract double getPerimeter();
    
    /**
     * abstract method for area
     * @return
     */
    public abstract double getArea();
}
        

