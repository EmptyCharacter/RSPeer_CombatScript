package Script.UI;

import org.rspeer.script.task.Task;

import javax.swing.*;

public class GUI extends Task {

    private boolean validate;

    private JFrame frame;

    @Override
    public boolean validate() {
        return false;
    }

    @Override
    public int execute() {
        return 1000;
    }
}
