package AbstractFactoryPattern;


import static AbstractFactoryPattern.ColorFactory.ColorType.RED;
import static AbstractFactoryPattern.FactoryProducer.FactoryType.COLOR;
import static AbstractFactoryPattern.FactoryProducer.FactoryType.SHAPE;
import static AbstractFactoryPattern.ShapeFactory.ShapeType.CIRCLE;

/**
 * Created by alexyang on 6/2/17.
 *
 * An abstract factory is a factory of factories.
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.createFactory(SHAPE);
        Shape shape = factory.createShape(CIRCLE);
        shape.draw();

        factory = FactoryProducer.createFactory(COLOR);
        Color color = factory.createColor(RED);
        color.fill();
     }
}
