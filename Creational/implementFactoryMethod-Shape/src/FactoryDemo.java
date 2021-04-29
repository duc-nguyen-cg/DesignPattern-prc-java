public class FactoryDemo {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("square");
        shape2.draw();

        Shape shape3 = ShapeFactory.getShape("rectangle");
        shape3.draw();

        Shape shape4 = ShapeFactory.getShape("eclipse");  //runtime error
        shape4.draw();
    }
}
