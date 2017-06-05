package ObserverPattern;

/**
 * Created by alexyang on 6/5/17.
 */
public class ObserverDemo {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        Subscriber sub1 = new NewsSubscriber();
        Subscriber sub2 = new MagSubscriber();
        sub1.subscribe(publisher);
        sub2.subscribe(publisher);

        publisher.setState(1);
        publisher.setState(9);

        sub1.unsubscribe(publisher);

        publisher.setState(1);
        publisher.setState(9);
    }
}
