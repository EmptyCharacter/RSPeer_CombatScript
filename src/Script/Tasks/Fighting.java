package Script.Tasks;

import org.rspeer.runetek.api.scene.Players;
import org.rspeer.script.task.Task;

public class Fighting extends Task {
    @Override
    public boolean validate() {
        return Players.getLocal();

    }

    @Override
    public int execute()  {
        return 1000;
    }
}
