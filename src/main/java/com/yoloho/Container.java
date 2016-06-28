package com.yoloho;

/**
 * Created by zhaolei on 16-6-7.
 */
public interface Container {

    void add(Object obj);
    void remove(Integer index);
    Object get(Integer index);
    Iterator getIterator();
}
