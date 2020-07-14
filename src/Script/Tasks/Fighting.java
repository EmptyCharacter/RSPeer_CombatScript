package Script.Tasks;

import Script.CombatScript;
import org.rspeer.runetek.adapter.scene.Npc;
import org.rspeer.runetek.api.component.tab.Combat;
import org.rspeer.runetek.api.scene.Npcs;
import org.rspeer.runetek.api.scene.Players;
import org.rspeer.script.task.Task;

public class Fighting extends Task {

    private static final String ATTACK_ACTION = new String("Attack");

    @Override
    public boolean validate() {
        return !Players.getLocal().isAnimating() && !Players.getLocal().isMoving();

    }

    @Override
    public int execute()  {
        //should also check if that npc is not in combat already n if you are already in combat
        Npc target = Npcs.getNearest(x -> x.getName().equals(CombatScript.enemy.getEnemyName()) && CombatScript.location.getTrainingArea().contains(x));

        if(target != null){
            target.interact(ATTACK_ACTION);
        }
        return 1000;
    }
}
