package BuilderPattern;

/**
 * Created by yangale on 6/3/17.
 */
public class Director {
    public void buildParts(AbstractBuilder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
