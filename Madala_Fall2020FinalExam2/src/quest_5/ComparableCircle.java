package quest_5;
/**
 *
 * @author Sreenidhi Madala
 */
public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    /**
     * no argument constructor for ComparableCircle
     */
    public ComparableCircle() {
    }

    /**
     * constructor for ComparableCircle with radius as parameter
     * @param r
     */
    public ComparableCircle(double r) {
        super(r);
    }

    /**
     * compareto method to compare two different objects 
     * @param cir
     * @return integer
     */
    @Override
    public int compareTo(ComparableCircle cir) {
        if (getArea() > cir.getArea()) {
            return 1;
        } else if (getArea() < cir.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    /**
     * prints the values of ComparableCircle
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + "\n Area: " + getArea();
    }
}
