/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Sreenidhi Madala
 */
public class Random_Integers {
    public static void main(String[] args) {
//       creating a scanner object to read the input   
        Scanner sc = new Scanner(System.in);
//        creating a new random object
        Random random = new Random();
//        creating an array with 100
        int[] array = new int[100];
//        creating a new random object of tyoe integer
        int random_no;
//        for loop to get the random integer
        for (int j = 0; j < 100; j++) {
            random_no = random.nextInt(100);
            array[j] = random_no;
        }
//      asking to enter the index of an array
        System.out.println("Enter index of the array : ");
        int index = sc.nextInt();
//        try and catch block to catch ArrayIndexOutOfBoundsException
        try {
            System.out.println("The Element at index " + index + " is = " + array[index]);
        } catch (ArrayIndexOutOfBoundsException exe) {
            System.out.println("Out of Bounds exception");

        }

    }

}
