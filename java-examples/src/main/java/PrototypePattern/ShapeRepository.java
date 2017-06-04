package PrototypePattern;

/**
 * Created by yangale on 6/4/17.
 */
public class ShapeRepository {
    protected Rectangle rectangle = new Rectangle();
    protected Square square = new Square();
    protected Circle circle = new Circle();

    enum ShapeType {
        RECTANGLE,
        SQUARE,
        CIRCLE
    }

    Shape createShape(ShapeType type) {
        try {
            switch (type) {
                case RECTANGLE:
                    return (Shape)rectangle.clone();
                case SQUARE:
                    return (Shape)square.clone();
                case CIRCLE:
                    return (Shape)circle.clone();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
