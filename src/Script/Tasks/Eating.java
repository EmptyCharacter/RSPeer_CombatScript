package Script.Tasks;

import Script.CombatScript;
import Script.Data.Food;
import org.rspeer.runetek.adapter.component.Item;
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
        Item food = Inventory.getFirst(CombatScript.food.getFoodName());
        food.interact(EAT_ACTION);
        return 1000;
    }
}
