package Script;

import org.rspeer.script.ScriptMeta;
import org.rspeer.script.task.TaskScript;
import org.rspeer.ui.Log;

@ScriptMeta(name = "Combat Script", desc = "Kills NPC's", developer = "empty")
public class CombatScript extends TaskScript {


    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {
        Log.severe("Script Stopped");
    }
}
