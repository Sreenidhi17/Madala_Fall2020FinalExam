/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_11;

import java.util.Comparator;

/**
 *
 * @author Sreenidhi Madala
 */
public class NameSorter implements Comparator<Employee>{

    /**
     * no argument constructor
     */
    public NameSorter() {
    }
    
    /**
     * compare method for name sorter
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare(Employee o1, Employee o2) {
    return o1.getEmpName().compareTo(o2.getEmpName());
    }
}
