package OOP;

public class Square extends Shape {
    private double a;

    public Square(double a) {

        this.a = a;
    }

    public Square() {
    }

    public double getSide() {

        return a;
    }

    public void setSide(double a) {

        this.a = a;
    }


    public double getArea(double a) {

        return a * a;
    }


    public double getPerimeter(double r) {
        return 4 * a;
    }

    public String printShape(){
        return ("This is square with side of " + a);
    }
}
