public class Square extends Shape implements Resizeable {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public  double getArea(){
        return side*side;
    }
    public  double getPerimeter(){
        return side*2;
    }

    @Override
    public String toString() {
        return " A Square with " +
                "side=" + getSide() +
                " , which is subclass of "+
                super.toString() +
                ", Area = " +
                getArea();
    }

    @Override
    public void resize(double percent) {
        this.side *= (percent / 200);
    }
}
