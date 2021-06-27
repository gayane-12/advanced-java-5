package timer.threads;

import timer.models.Timer;
import timer.services.TimerService;

import javax.swing.*;

public class ResultPrintThread extends TimerThread {

    public ResultPrintThread(Timer timer, JLabel label) {
        super(timer, label);
    }

    @Override
    public void run() {
        label.setText(TimerService.formatTimeToDecimal(timer));
    }
}
