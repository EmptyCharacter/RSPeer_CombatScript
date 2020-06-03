package Script;

import Script.Data.Enemy;
import Script.Data.Location;
import Script.Tasks.Banking;
import Script.Tasks.Eating;
import Script.Tasks.ToggleRun;
import Script.Tasks.Traverse;
import Script.UI.GUI;
import org.rspeer.script.ScriptMeta;
import org.rspeer.script.task.TaskScript;
import org.rspeer.ui.Log;

@ScriptMeta(name = "Combat Script", desc = "Kills NPC's", developer = "empty")
public class CombatScript extends TaskScript {

    public static Enemy enemy;
    public static Location location;

    @Override
    public void onStart() {
        submit(new GUI(),
                new Banking(),
                new ToggleRun(),
                new Traverse(),
                new Eating());
    }

    @Override
    public void onStop() {
        Log.severe("Script Stopped");
    }
}
