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
public class SalarySorter implements Comparator<Employee>{

    /**
     * no argument constructor
     */
    public SalarySorter() {
    }
    
    /**
     * compare method for salary sorter
     * @param arg0
     * @param arg1
     * @return
     */
    @Override
    public int compare(Employee arg0, Employee arg1) {
        return arg0.getEmpSalary() - arg1.getEmpSalary();    
    }
}
