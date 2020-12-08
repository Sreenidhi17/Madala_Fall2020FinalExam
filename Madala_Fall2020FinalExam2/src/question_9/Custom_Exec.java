/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_9;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Sreenidhi Madala
 */
public class Custom_Exec {
    public static void main(String[] args) throws FileNotFoundException, ParseException, InsufficentFundsException{
        Scanner sc = new Scanner(new File("input.txt"));
        throw new InsufficentFundsException("test");
    }    
}
