package BuilderPattern;

/**
 * Created by yangale on 6/3/17.
 */
public class BuilderDemo {
    public static void main(String[] args) {
        ConcreteBuilderA builderA = new ConcreteBuilderA();
        ConcreteBuilderB builderB = new ConcreteBuilderB();
        Director director = new Director();
        director.buildParts(builderA);
        director.buildParts(builderB);
    }
}
