package Script.Tasks;

import Script.CombatScript;
import org.rspeer.runetek.adapter.scene.Npc;
import org.rspeer.runetek.adapter.scene.Player;
import org.rspeer.runetek.api.component.tab.Combat;
import org.rspeer.runetek.api.scene.Npcs;
import org.rspeer.runetek.api.scene.Players;
import org.rspeer.script.task.Task;

public class Fighting extends Task {

    private static final String ATTACK_ACTION = new String("Attack");
    private Player local = Players.getLocal();


    @Override
    public boolean validate() {
        return !local.isAnimating() && !local.isMoving();

    }

    @Override
    public int execute()  {
        //should also check if that npc is not in combat already n if you are already in combat
        Npc target = Npcs.getNearest(x -> x.getName().equals(CombatScript.enemy.getEnemyName()) && CombatScript.location.getTrainingArea().contains(x));

        //if target is not null and if target is not already in combat
        if(target != null){
            target.interact(ATTACK_ACTION);
        }
        return 300;
    }
}
