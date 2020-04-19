package pattern.command.commcands;


import pattern.command.Commcand;
import pattern.command.Editor;

public class SaveCommand implements Commcand {

    private final Editor editor;

    public SaveCommand(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void act() {
        this.editor.save();
    }
}
