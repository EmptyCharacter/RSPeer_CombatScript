package Script;

import Script.Data.Enemy;
import Script.Data.Food;
import Script.Data.Location;
import Script.Tasks.*;
import Script.UI.GUI;
import org.rspeer.script.ScriptMeta;
import org.rspeer.script.task.TaskScript;
import org.rspeer.ui.Log;

@ScriptMeta(name = "Combat sScript", desc = "Kills NPC's", developer = "empty")
public class CombatScript extends TaskScript {

    public static Enemy enemy;
    public static Location location;
    public static Food food;

    @Override
    public void onStart() {
        submit(new GUI(),
                new Traverse(),
                new Fighting(),
                new ToggleRun(),
                new Eating());
    }

    @Override
    public void onStop() {
        Log.severe("Script Stopped");
    }
}
