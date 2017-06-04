package PrototypePattern;

import static PrototypePattern.ShapeRepository.ShapeType.RECTANGLE;
import static PrototypePattern.ShapeRepository.ShapeType.SQUARE;
import static PrototypePattern.ShapeRepository.ShapeType.CIRCLE;

/**
 * Created by yangale on 6/4/17.
 *
 * Prototype pattern is basically about cloning objects from prototype objects. Instead of copy the references
 * of given objects, the prototype pattern actually clones the object into a different one. This is particularly
 * important for Java since everything in Java is by default object reference! If we need to clone an object into
 * multiple copies, try to think of Cloneable class and this prototype pattern.
 */
public class PrototypeDemo {
    public static void main(String[] args) {
        ShapeRepository repository = new ShapeRepository();
        Shape shape1 = repository.createShape(RECTANGLE);
        Shape shape2 = repository.createShape(SQUARE);
        Shape shape3 = repository.createShape(CIRCLE);

        shape1.draw();
        shape2.draw();
        shape3.draw();

        Shape shape4 = repository.createShape(RECTANGLE);
        Shape shape5 = repository.createShape(SQUARE);
        Shape shape6 = repository.createShape(CIRCLE);

        shape4.draw();
        shape5.draw();
        shape6.draw();

        if (shape1 != shape1) {
            System.out.println("Shape 1 is NOT equal to Shape 1");
        } else {
            System.out.println("Shape 1 is equal to Shape 1 because it's the same reference.");
        }

        if (shape1 != shape4) {
            System.out.println("Shape 1 is NOT equal to Shape 4 because they are two different objects despite cloning");
        } else {
            System.out.println("Shape 1 is equal to Shape 4");
        }
     }
}
