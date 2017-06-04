package BuilderPattern;

/**
 * Created by yangale on 6/3/17.
 */
public class ConcreteBuilderA implements AbstractBuilder {
    @Override
    public void buildPartA() {
        System.out.println("Build part A in builder A.");
    }

    @Override
    public void buildPartB() {
        System.out.println("Build part B in builder A.");
    }
}
