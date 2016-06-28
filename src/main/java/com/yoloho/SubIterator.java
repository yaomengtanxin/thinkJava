package com.yoloho;

import java.util.List;

/**
 * Created by zhaolei on 16-6-7.
 */
public class SubIterator implements Iterator{

    private List<Object> list = null;
    private Integer current = 0;
    public SubIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object next() {
        return list.get(current++);
    }

    @Override
    public Boolean hasNext() {
        return (current != list.size()? true : false);
    }
}
