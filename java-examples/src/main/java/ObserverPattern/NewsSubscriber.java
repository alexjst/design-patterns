package ObserverPattern;

import javax.print.attribute.SupportedValuesAttribute;

/**
 * Created by alexyang on 6/5/17.
 */
public class NewsSubscriber extends Subscriber {
    public void update(Integer state) {
        System.out.println("News update..." + state);
    }
}
