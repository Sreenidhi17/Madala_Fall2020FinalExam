/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_3;

/**
 *
 * @author Sreenidhi Madala
 */
public class Widening_Casting {

    public static void main(String[] args) {
        
        int a = 100;
//      Type casting which is done automatically as they are compatible
        long b = a;
//      Type casting which is done automatically as they are compatible
        float c = b;
        
//      Printing the values of type integer  
        System.out.println("value of int " +a);
//        Printing the values of type long  
        System.out.println("value of long " +b);
//        Printing the values of type float  
        System.out.println("value of float " +c);
        
    }  
}
