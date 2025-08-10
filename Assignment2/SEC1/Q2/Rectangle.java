package shapes;
public class Rectangle implements Shape {
    private double length, width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter(){
        return 2*(length + width);
    }
}
