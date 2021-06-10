package com.zeroedmc.surfID;

import java.util.concurrent.TimeUnit;

public class surfID extends PrintSting {

    public static void main(String[] args) throws InterruptedException {
        if (args.length == 0) {
            exit();
        }
    }
    public static void exit() throws InterruptedException {
        System.out.println("You will be exiting in 5");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("You will be exiting in 4");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("You will be exiting in 3");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("You will be exiting in 2");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("You will be exiting in 1");
    }
}
