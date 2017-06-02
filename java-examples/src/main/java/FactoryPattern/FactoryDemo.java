package FactoryPattern;

import static FactoryPattern.ShapeFactory.ShapeType.RECTANGLE;
import static FactoryPattern.ShapeFactory.ShapeType.SQUARE;
import static FactoryPattern.ShapeFactory.ShapeType.CIRCLE;

/**
 * Created by alexyang on 6/2/17.
 * Factory pattern: assume you have lots of different types of objects to create, encapsulate their creation methods
 * inside a factory class and you have a factory pattern. To make things appear a bit smart, you have an enum or string
 * object passed to the factory's create method so it will create different types of objects accordingly. If all the
 * different types of objects have common ancestor we can manage their definitions in the form an ancestor tree (an
 * abstract interface and different implementations for different types).
 */
public class FactoryDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape1 = factory.createShape(RECTANGLE);
        Shape shape2 = factory.createShape(SQUARE);
        Shape shape3 = factory.createShape(CIRCLE);

        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
