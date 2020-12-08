package question_11;
/**
 *
 * @author Sreenidhi Madala
 */
public class Employee implements Comparable<Employee>   {
    public int empId;
    public String empName;
    public int empSalary;

    /**
     * constructor for employee
     * @param empId
     * @param empName
     * @param empSalary
     */
    public Employee(int empId, String empName, int empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    /**
     * gets the employee id
     * @return int
     */
    public int getEmpId() {
        return empId;
    }

    /**
     * sets the empid
     * @param empId
     */
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    
    /**
     * gets the employee name
     * @return String
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * sets the employee name
     * @param empName
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /**
     * gets the employee salary
     * @return int
     */
    public int getEmpSalary() {
        return empSalary;
    }

    /**
     * sets the employee salary
     * @param empSalary
     */
    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    /**
     * compareTo method to compare the values
     * @param o
     * @return int
     */
    @Override
    public int compareTo(Employee o) {
        return this.empId - o.empId;
    }   

    /**
     * prints the values of employee
     * @return
     */
    @Override
    public String toString() {
        return "Employee with " + "empId=" + empId + ", empName=" + empName + 
                " and empSalary=" + empSalary;
    } 
    
}
