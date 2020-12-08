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
public class Recursion {
    public static void main(String[] args) {
        Recur recur = new Recur(10);
        int i;
        for(i=0; i<10; i++) recur.values[i] = i;
        recur.print_Arr(10);
    }
    
}
