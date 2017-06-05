package ObserverPattern;

/**
 * Created by alexyang on 6/5/17.
 */
public abstract class Subscriber {
    void subscribe(Publisher publisher) {
        publisher.add(this);
    }

    void unsubscribe(Publisher publisher) {
        publisher.remove(this);
    }

    abstract void update(Integer state);
}
