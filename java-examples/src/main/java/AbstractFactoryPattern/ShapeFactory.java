package AbstractFactoryPattern;

import AbstractFactoryPattern.ColorFactory.ColorType;

/**
 * Created by alexyang on 6/2/17.
 */
public class ShapeFactory extends AbstractFactory {
    enum ShapeType {
        RECTANGLE,
        SQUARE,
        CIRCLE
    }

    @Override
    Shape createShape(ShapeType type) {
        switch (type) {
            case RECTANGLE: return new Rectangle();
            case SQUARE: return new Square();
            case CIRCLE: return new Circle();
        }
        return null;
    }

    @Override
    Color createColor(ColorType type) {
        return null;
    }
}
