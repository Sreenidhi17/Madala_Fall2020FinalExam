/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_9;

/**
 *
 * @author Sreenidhi
 */
public class Throws {

    public static void main(String[] args) {
        try {
            throwS();
        } catch (IllegalAccessException exc) {
            System.out.println("exception Caught " + exc);
        }
    }

    private static void throwS() throws IllegalAccessException {
        System.out.println("Inside throwS.");
        throw new IllegalAccessException("test");
    }

}
