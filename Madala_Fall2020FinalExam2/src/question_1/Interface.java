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
public class Interface {

    public static void main(String[] args) {
        One.NestedIF abc = new Two();
        if (abc.isNotNegative(10)) {
            System.out.println("10 is not a negative number");
        } if (abc.isNotNegative(-12)) {
            System.out.println("this will not be displayed");
        }
    }

}
