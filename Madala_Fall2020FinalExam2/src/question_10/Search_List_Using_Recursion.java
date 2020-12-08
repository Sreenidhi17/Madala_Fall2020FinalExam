/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_10;

/**
 *
 * @author S541226
 */
public class Search_List_Using_Recursion {
    public static void main(String[] args) {
        List list = new List();
        list.push_List(25);
        list.push_List(60);
        list.push_List(32);
        list.push_List(28);
        list.push_List(10);
        
//        checks the list and prints if the value is found or not
        if (list.search_List(list.a, 32)) 
            System.out.println("Yes found"); 
        else
            System.out.println("No not found"); 
    }
    
}
