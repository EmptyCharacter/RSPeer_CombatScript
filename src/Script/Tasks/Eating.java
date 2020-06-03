package Script.Tasks;

import org.rspeer.runetek.api.component.tab.Inventory;
import org.rspeer.runetek.api.local.Health;
import org.rspeer.runetek.api.scene.Players;
import org.rspeer.script.task.Task;

public class Eating extends Task {

    private static final String EAT_ACTION = new String("Eat");

    @Override
    public boolean validate() {
        return !(Health.getPercent() > 60);
    }

    @Override
    public int execute() {
        //eat food
        Inventory.getFirst(Food.)
        return 1000;
    }
}
