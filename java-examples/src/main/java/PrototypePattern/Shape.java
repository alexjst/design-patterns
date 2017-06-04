package PrototypePattern;

import lombok.Getter;

/**
 * Created by yangale on 6/3/17.
 */

@Getter
public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    abstract void draw();

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object result = null;
        try {
            result = super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
