package SingletonPattern;

/**
 * Created by alexyang on 6/2/17.
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();
    public static SingleObject instance() { return instance; }
    void showMessage() {
        System.out.println("Hello, this is myself, only myself only.");
    }
}
