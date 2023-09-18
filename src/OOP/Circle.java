package OOP;

public class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }


    public Circle() {

    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }


    public double getArea(double r) {
        return r * r * Math.PI;
    }


    public double getPerimeter(double r) {
        return 2 * Math.PI * r;
    }

    public String printShape(){
        return ("This is circle with radius of " + r);
    }
}
