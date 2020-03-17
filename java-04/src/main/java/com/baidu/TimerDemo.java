package com.baidu;


import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
    public static void main(String[] args) {
        TimerTask task = new TimerPrinter();
        // 1000ms = 1s
        long delay = 5000;
        // 定义每次执行的间隔时间
        long intevalPeriod = 5 * 1000;
        Timer timer = new Timer();
        // schedules the task to be run in an interval
        timer.scheduleAtFixedRate(task, delay, intevalPeriod);
    }
}

class TimerPrinter extends TimerTask {

    @Override
    public void run() {
        System.out.println("定时器");
    }
}
