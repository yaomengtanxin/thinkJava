package com.yoloho;

/**
 * Created by zhaolei on 16-6-7.
 */
public class CommandOn implements Command {

    private  Tv tv;

    public  CommandOn(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        System.out.println(tv + "---开机");
    }
}
