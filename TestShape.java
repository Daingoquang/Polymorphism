public class TestShape {
    public static void main(String[] args) {
        Shape shape=new Rectangle("red",6,8);
        System.out.println(shape);
        System.out.println("Area is: "+shape.getArea());
        Shape shape1=new Triangle("green",8,9);
        System.out.println(shape1);
        System.out.println("Area is: "+shape1.getArea());
    }
}
