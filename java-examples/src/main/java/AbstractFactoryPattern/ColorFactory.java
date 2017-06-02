package AbstractFactoryPattern;

import AbstractFactoryPattern.ShapeFactory.ShapeType;

/**
 * Created by alexyang on 6/2/17.
 */
public class ColorFactory extends AbstractFactory{
    enum ColorType {
        RED,
        GREEN,
        BLUE
    }

    @Override
    Shape createShape(ShapeType type) {
        return null;
    }

    @Override
    Color createColor(ColorType type) {
        switch (type) {
            case RED: return new Red();
            case GREEN: return new Green();
            case BLUE: return new Blue();
            default: return null;
        }
    }
}
