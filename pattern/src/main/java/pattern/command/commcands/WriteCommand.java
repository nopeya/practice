package pattern.command.commcands;


import pattern.command.Commcand;
import pattern.command.Editor;

public class WriteCommand implements Commcand {

    private final Editor editor;
    private final String data;

    public WriteCommand(Editor editor, String data) {
        this.editor = editor;
        this.data = data;
    }

    @Override
    public void act() {
        this.editor.write(data);
    }
}
