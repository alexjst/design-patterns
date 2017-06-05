package ObserverPattern;

/**
 * Created by alexyang on 6/5/17.
 */
public class MagSubscriber extends Subscriber {
    public void update(Integer state) {
        System.out.println("Magazine update..." + state);
    }
}
