package BuilderPattern;

/**
 * Created by yangale on 6/3/17.
 */
public class ConcreteBuilderB implements AbstractBuilder{
    @Override
    public void buildPartA() {
        System.out.println("Build part A in builder B.");
    }

    @Override
    public void buildPartB() {
        System.out.println("Build part B in builder B.");
    }
}
