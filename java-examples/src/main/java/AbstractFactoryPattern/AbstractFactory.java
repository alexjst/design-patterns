package AbstractFactoryPattern;

import AbstractFactoryPattern.ShapeFactory.ShapeType;
import AbstractFactoryPattern.ColorFactory.ColorType;

/**
 * Created by alexyang on 6/2/17.
 */
public abstract class AbstractFactory {
    abstract Shape createShape(ShapeType type);
    abstract Color createColor(ColorType type);
}
