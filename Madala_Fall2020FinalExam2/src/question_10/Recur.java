/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_10;

/**
 *
 * @author Sreenidhi Madala
 */
class Recur {

    int values[];

    Recur(int a) {
        values = new int[a];
    }

    void print_Arr(int a) {
        if (a == 0) {
            return;
        } else {
            print_Arr(a - 1);
        }
        System.out.println("at position [" + (a - 1) + "] value is : " + values[a - 1]);
    }
}
