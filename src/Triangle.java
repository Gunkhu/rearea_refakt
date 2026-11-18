public class Triangle implements Shape {
    double base;
    double height;
    Double area;
    public void calcArea(){
        this.area = this.base * this.height / 2;
    }
    public Double getArea() {
        return area;
    }

    
}
