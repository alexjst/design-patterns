package AbstractFactoryPattern;

/**
 * Created by alexyang on 6/2/17.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draws rectangle.");
    }
}
