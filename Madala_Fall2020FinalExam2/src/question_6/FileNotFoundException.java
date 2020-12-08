/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_6;

import java.io.File;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sreenidhi Madala
 */
public class FileNotFoundException {
    public static void main(String[] args) {
        File sc = new File("input.txt");
        try { 
            FileReader reader = new FileReader(sc);
        } catch (java.io.FileNotFoundException ex) {
            Logger.getLogger(FileNotFoundException.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
