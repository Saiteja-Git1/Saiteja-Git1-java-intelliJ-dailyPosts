package dayFour;

public class Driver {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(5,6);

        System.out.println(circle.area());
        System.out.println(circle.perimeter());

        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());

    }
}
