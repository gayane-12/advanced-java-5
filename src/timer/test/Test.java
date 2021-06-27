package timer.test;

import timer.services.TimerService;
import timer.views.MainView;
import timer.views.components.Button;
import timer.views.components.Label;
import timer.views.components.LabeledField;


public class Test {
    public static void startTimer() {
        MainView mainView = new MainView("Countdown Timer");
        LabeledField field1 = new LabeledField("Enter the minutes", 120, 50);
        LabeledField field2 = new LabeledField("Enter the seconds", 120, 120);
        Button button = new Button("Start", 145, 190);
        Label resultLabel = new Label("", 120, 250);

        mainView.addLabelField(field1.getTextField(), field1.getLabel());
        mainView.addLabelField(field2.getTextField(), field2.getLabel());
        button.addAction(TimerService.timerStartButtonAction(field1.getTextField(), field2.getTextField(), resultLabel.getLabel()));
        mainView.addButton(button.getButton());
        mainView.addResultField(resultLabel.getLabel());
        mainView.show();
    }
}
