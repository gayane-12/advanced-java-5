package timer.services;

import timer.models.Timer;
import timer.threads.TimerThread;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class TimerService {
    public static void countDownStart(Timer timer, JLabel label) {
        TimerThread newTimerThread = new TimerThread(timer, label);
        newTimerThread.start();
    }

    public static String formatTimeToDecimal(Timer timer) {
        DecimalFormat df = new DecimalFormat("00");
        return df.format(timer.getMinute()) + " : " + df.format(timer.getSecond());
    }

    public static ActionListener timerStartButtonAction(JTextField field1, JTextField field2, JLabel label){
        return e -> {
            Timer timer = new Timer(Integer.parseInt(field1.getText()), Integer.parseInt(field2.getText()));
            TimerService.countDownStart(timer,label);
        };
    }


}
