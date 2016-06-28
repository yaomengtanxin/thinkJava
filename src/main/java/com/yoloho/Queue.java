package com.yoloho;

import java.util.LinkedList;

/**
 * Created by zhaolei on 16-6-8.
 */
public class Queue {

    private java.util.Queue queue = new LinkedList();

    public java.util.Queue fill(Command command) {
        queue.offer(command);
        return queue;
    }
}
