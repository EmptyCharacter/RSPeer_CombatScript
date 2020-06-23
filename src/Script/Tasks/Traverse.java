package Script.Tasks;

import Script.CombatScript;
import org.rspeer.runetek.adapter.scene.Player;
import org.rspeer.runetek.api.movement.Movement;
import org.rspeer.runetek.api.scene.Players;
import org.rspeer.script.task.Task;

public class Traverse extends Task {
    @Override
    public boolean validate() {

        return !CombatScript.location.getTrainingArea().contains(Players.getLocal());
    }

    @Override
    public int execute() {
        Movement.walkTo(CombatScript.location.getTrainingArea().getCenter());
        return 1000;
    }
}
