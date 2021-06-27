package timer.threads;

import timer.models.Timer;

import javax.swing.*;

public class TimerThread extends Thread {
    timer.models.Timer timer;
    JLabel label;

    public TimerThread(Timer timer, JLabel label) {
        this.timer = timer;
        this.label = label;
    }

    @Override
    public void run() {
        while (timer.getMinute() >= 0) {
            ResultPrintThread resultPrintThread = new ResultPrintThread(timer, label);
            resultPrintThread.start();
            try {
                resultPrintThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            timer.decrementSecond();
            if (timer.getSecond() < 0) {
                timer.setSecond(59);
                timer.decrementMinute();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        label.setText("THE END");
    }
}
