package Factory;

/**
 * Created by alexyang on 6/2/17.
 */
public class ShapeFactory {
    enum ShapeType {
        RECTANGLE,
        SQUARE,
        CIRCLE
    }

    Shape createShape(ShapeType type) {
        switch (type) {
            case RECTANGLE: return new Rectangle();
            case SQUARE: return new Square();
            case CIRCLE: return new Circle();
            default: return null;
        }
   }
}
