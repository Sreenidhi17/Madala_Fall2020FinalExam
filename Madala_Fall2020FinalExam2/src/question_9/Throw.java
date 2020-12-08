/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_9;

/**
 *
 * @author Sreenidhi Madala
 */
public class Throw {
    public static void main(String[] args) {
        try {
            test_excep();
        } catch (NullPointerException exc) {
            System.out.println("Recaught: " + exc);
        }
    }

    private static void test_excep() {
        try {
            throw new NullPointerException("test");
        } catch (NullPointerException exc) {
            System.out.println("Caught inside test_excep");
            // this will rethrow the exception
            throw exc; 
        }
    }

}
