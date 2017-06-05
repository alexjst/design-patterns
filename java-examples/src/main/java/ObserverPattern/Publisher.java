package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexyang on 6/5/17.
 */
public class Publisher {
    protected List<Subscriber> subscriberList = new ArrayList<Subscriber>();
    Integer state = 0;

    protected void notifyStateToAll() {
        for (Subscriber subscriber : subscriberList) {
            subscriber.update(state);
        }
    }
    public void add(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    public void remove(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    public void setState(Integer state) {
        this.state = state;
        notifyStateToAll();
    }
}
