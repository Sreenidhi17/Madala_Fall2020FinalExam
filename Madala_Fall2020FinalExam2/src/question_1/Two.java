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
public class Two implements One.NestedIF {

    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }

}
