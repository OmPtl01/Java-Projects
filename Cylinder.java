public class Cylinder {
    private Circle circle;
    private double height;


 public Cylinder(double rads, double height ){
    this.circle= new Circle (rads);
    this.height= height;
}
public double vol(){
    double volume= circle.area()*height;
    return volume;
}
public double sa(){
    double SurfaceArea= circle.circumference()*height+(2)*circle.area();
    return SurfaceArea;
}

}
