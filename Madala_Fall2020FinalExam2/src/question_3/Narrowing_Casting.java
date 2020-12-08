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
public class Narrowing_Casting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a = 150.09;
//      here we are doing casting explicitly of type long 
        long b = (long)a;
//      here we are doing casting explicitly of type int         
        int c= (int)b;        
//      Printing the values of type double  
        System.out.println("value of double " +a);
//        Printing the values of type long  
        System.out.println("value of long " +b);
//        Printing the values of type int  
        System.out.println("value of int " +c);
    }
    
}
