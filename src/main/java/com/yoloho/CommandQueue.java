package com.yoloho;

/**
 * Created by zhaolei on 16-6-8.
 */
public class CommandQueue {

    private String msg;

    CommandQueue(String msg) {
        this.msg = msg;
    }

    public void operation() {
        System.out.println(msg);
    }
}
