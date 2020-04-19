package pattern.command;

import java.util.ArrayList;
import java.util.List;

public class CommcandRunner {
    private List<Commcand> commcands = new ArrayList<Commcand>();

    public void run(Commcand c) {
        c.act();
        commcands.add(c);
    }

    public void redo() {
        commcands.forEach(Commcand::act);
    }

    public int countCommand() {
        return commcands.size();
    }
}
