package Script.UI;

import Script.CombatScript;
import Script.Data.Enemy;
import Script.Data.Location;
import net.miginfocom.swing.MigLayout;
import org.rspeer.runetek.api.Game;
import org.rspeer.script.task.Task;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;

public class GUI extends Task {

    private boolean validate;

    private JComboBox enemyComboBox;
    private JComboBox locationsComboBox;
    private JButton startBtn;

    private JFrame frame;

    public GUI(){
        frame = new JFrame("Combat Script v1.0");
        frame.setLayout(new MigLayout());
        frame.setPreferredSize(new Dimension(200,200));

        //Checkboxes
        enemyComboBox = new JComboBox(Enemy.values());
        locationsComboBox = new JComboBox(Location.values());
        startBtn = new JButton("Start");

        frame.add(enemyComboBox, "wrap, growx");
        frame.add(locationsComboBox, "wrap, growx");
        frame.add(startBtn, "growx");

        frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        frame.setLocationRelativeTo(Game.getCanvas());
        frame.pack();

        frame.setVisible(true);
    }

    @Override
    public boolean validate() {
        return false;
    }

    @Override
    public int execute() {
        return 1000;
    }

    private void locationsSelectionHandler(ItemEvent e){
        Location selection = (Location) e.getItem();
        enemyComboBox.setModel(new DefaultComboBoxModel(selection.getEnemies()));
    }

    private void startBtnHandler(){
        CombatScript.enemy = (Enemy) enemyComboBox.getSelectedItem();
        CombatScript.location = (Location) locationsComboBox.getSelectedItem();
        validate = false;
        frame.setVisible(false);
    }
}
