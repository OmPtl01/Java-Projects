public class Circle {
    private double rads;

    public Circle (double z)
    {
        rads = z;
    }
    public double area(){
        double area1= Math.PI*(rads*rads);
        return area1;
    }
    public double circumference(){
        double c=Math.PI*(2*rads);
        return c;
    }

}
