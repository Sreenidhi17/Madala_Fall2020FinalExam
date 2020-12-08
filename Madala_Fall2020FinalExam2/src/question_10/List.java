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
public class List {
    Node a; 
    
    public void push_List(int new_a){ 
        //creating new node and inserting the new data 
        Node n = new Node(new_a); 
  
        //creating the next node 
        n.nxt = a; 
  
        //new Node 
        a = n; 
    } 
    
    // Checks whether i is present in the linked list 
    public boolean search_List(Node a, int i) 
    { 
        // checking the value if null returns false 
        if (a == null) 
            return false; 
  
        // If key is present then returns true
        if (a.a == i) 
            return true; 
  
        // Recurring for remaining list 
        return search_List(a.nxt, i); 
    }
}
