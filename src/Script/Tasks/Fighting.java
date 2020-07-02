package Script.Tasks;

import org.rspeer.runetek.api.scene.Players;
import org.rspeer.script.task.Task;

public class Fighting extends Task {

    private static final String ATTACK_ACTION = new String("Attack");

    @Override
    public boolean validate() {


    }

    @Override
    public int execute()  {
        return 1000;
    }
}
