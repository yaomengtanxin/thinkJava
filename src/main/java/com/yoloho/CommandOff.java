package com.yoloho;

/**
 * Created by zhaolei on 16-6-7.
 */
public class CommandOff implements Command {

    private Tv tv;

    public CommandOff(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        System.out.println(tv + "---关机");
    }
}
