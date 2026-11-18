public class Rectangle implements Shape {
    double aSide;
    double bSide;
    Double area;
    public void calcArea() {
        this.area = aSide * bSide;
    }
    public Double getArea() {
        return this.area;
    }
}
