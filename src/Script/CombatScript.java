package Script;

import Script.Data.Enemy;
import Script.Data.Food;
import Script.Data.Location;
import Script.Tasks.*;
import Script.UI.GUI;
import org.rspeer.runetek.api.commons.StopWatch;
import org.rspeer.runetek.api.component.tab.Skill;
import org.rspeer.runetek.api.component.tab.Skills;
import org.rspeer.runetek.event.types.RenderEvent;
import org.rspeer.script.ScriptMeta;
import org.rspeer.script.task.Task;
import org.rspeer.script.task.TaskScript;
import org.rspeer.ui.Log;

import java.awt.*;

@ScriptMeta(name = "Combat sScript", desc = "Kills NPC's", developer = "empty")
public class CombatScript extends TaskScript {

    private static final Task[] TASKS = {
            new GUI(),
            new ToggleRun(),
            new Eating(),
            new Traverse(),
            new Fighting()};

    public static Enemy enemy;
    public static Location location;
    public static Food food;

    private StopWatch runtime;
    private int startXP;

    @Override
    public void onStart() {
        Log.fine("Script Started");
        runtime = StopWatch.start();
        startXP = Skills.getExperience(Skill.ATTACK);

        submit(TASKS);
    }

    @Override
    public void onStop() {
        Log.severe("Script Stopped");
    }

    public void notify(RenderEvent renderEvent)
    {
        Graphics g = renderEvent.getSource();

        int gainedXP = (Skills.getExperience(Skill.ATTACK) - startXP);

        g.drawString("Runtime: " + runtime.toElapsedString(), 20, 20);
        g.drawString("XP Gained: " + gainedXP, 20, 40);
        g.drawString("XP Per Hour: " + runtime.getHourlyRate(gainedXP), 20, 60);
    }

}
