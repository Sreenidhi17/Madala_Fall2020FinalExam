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
public class Abstract {
    public static void main(String[] args) {
        
        Rectangle rect = new Rectangle(9, 5);
        Triangle tri = new Triangle(10, 8);
        Figure fig; 
        fig = rect;
        System.out.println("Area calculated is " + fig.area());
        fig = tri;
        System.out.println("Area calculated is " + fig.area()); 
    }    
}
