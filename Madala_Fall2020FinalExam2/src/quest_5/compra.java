package quest_5;

import java.util.Scanner;

/**
 *
 * @author Sreenidhi Madala
 */
public class compra {

    public static void main(String[] args) {
//creating a scanner object to read the input values
        Scanner sc = new Scanner(System.in);
//        entering the value 1 and assigning to ComparableCircle
        System.out.println("enter the ComparableCircle for 1 : ");
        double cira = sc.nextDouble();
        ComparableCircle cir1 = new ComparableCircle(cira);
        //        entering the value 2 and assigning to ComparableCircle       
        System.out.println("enter the ComparableCircle for 2 : ");
        double cirb = sc.nextDouble();
        ComparableCircle cir2 = new ComparableCircle(cirb);
        //Comparint the Result of the different objects
        if (cir1.compareTo(cir2) > 0)
            //            if value is greater it prints cir1 else cir2
        {
            System.out.println(cir1 + " is greater than other.");
        } else if (cir1.compareTo(cir2) < 0) {
            System.out.println(cir2 + " is greater than other.");
        } else {
            System.out.println("Both are equal.");
        }
    }

}
