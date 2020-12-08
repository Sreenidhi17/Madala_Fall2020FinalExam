package quest_5;
/**
 *
 * @author Sreenidhi madala
 */
class Circle {

    private double r;
    /**
     * no argument constructor for Circle
     */
    public Circle() {
    }
    /**
     * constructor for Circle with single parameter
     */
    public Circle(double r) {
        this.r = r;
    }
    /**
     * gets the radius 
     * @return
     */
    public double getR() {
        return r;
    }
    /**
     * sets the radius
     * @param r
     */
    public void setR(double r) {
        this.r = r;
    }
    /**
     * gets the area 
     * @return double
     */
    public double getArea() {
        return r * r * Math.PI;
    }

    /**
     * gets the info of circle 
     * @return string
     */
    @Override
    public String toString() {
        return "\nRadius: " + r;
    }
}
