package com.yoloho;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaolei on 16-6-7.
 */
public class SubContainer implements Container {

    private List<Object> list = new ArrayList<Object>();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Integer index) {
        list.remove(index);
    }

    @Override
    public Object get(Integer index) {
        return list.get(index);
    }

    @Override
    public Iterator getIterator() {
        return new SubIterator(list);
    }
}
