package com.yoloho;

/**
 * Created by zhaolei on 16-6-7.
 */
public class Controller {

    private CommandOn on = null;
    private CommandOff off = null;

    public Controller(CommandOn on, CommandOff off) {
        this.on = on;
        this.off = off;
    }

    public void turnOn() {
        this.on.execute();
    }

    public void turnOff() {
        this.off.execute();
    }

}
