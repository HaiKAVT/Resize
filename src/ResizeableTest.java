public class ResizeableTest {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random()*10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("yellow", false , x );
        shapes[1] = new Rectangle("infinity" , false, x,x );
        shapes[2] =  new Square( "melida", true , x);
        for (Shape a : shapes
             ) {
            System.out.println(a);
        }
        for (Shape a: shapes) {
            a.resize(Math.random() * 1000);
        }
        System.out.println("\n");
        Shape.printShape(shapes);
    }
}
