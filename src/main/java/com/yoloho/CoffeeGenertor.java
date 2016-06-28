package com.yoloho;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by zhaolei on 16-6-21.
 */
public class CoffeeGenertor implements Genertor<Coffee>, Iterable<Coffee> {


    private Integer size = 0;
    private Class[] types = {kbyrCoffee.class, ntCoffee.class, qcCoffee.class};
    private Random random = new Random();

    CoffeeGenertor(Integer size) {
        this.size = size;
    }

    @Override
    public Coffee next() {
        Coffee coffee = null;
        try {
             coffee = (Coffee)types[random.nextInt(types.length)].newInstance();
        } catch (Exception e) {

        }
        return coffee;
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new Iterator<Coffee>() {
            @Override
            public boolean hasNext() {
                return size > 0;
            }

            @Override
            public Coffee next() {
                size--;
                return CoffeeGenertor.this.next();
            }

            @Override
            public void remove() {

            }
        };
    }
}
