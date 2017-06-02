package AbstractFactoryPattern;

/**
 * Created by alexyang on 6/2/17.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Filling red.");
    }
}
