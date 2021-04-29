public class ShapeFactory {
    private ShapeFactory(){
    }

    public static Shape getShape(String type){
        switch (type){
            case "circle": {
                return new Circle();
            }
            case "square": {
                return new Square();
            }
            case "rectangle": {
                return new Rectangle();
            }
            default: {
                throw new IllegalArgumentException("Such shape doesn't exist yet");
            }
        }
    }
}
