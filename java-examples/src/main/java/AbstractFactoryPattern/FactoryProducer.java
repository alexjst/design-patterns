package AbstractFactoryPattern;

/**
 * Created by alexyang on 6/2/17.
 */
public class FactoryProducer {
    enum FactoryType {
        SHAPE,
        COLOR
    }

    static AbstractFactory createFactory(FactoryType type) {
        switch (type) {
            case SHAPE: return new ShapeFactory();
            case COLOR: return new ColorFactory();
            default: return null;
        }
    }
}
