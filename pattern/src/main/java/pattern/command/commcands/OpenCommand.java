package pattern.command.commcands;


import pattern.command.Commcand;
import pattern.command.Editor;

public class OpenCommand implements Commcand {

    private final Editor editor;

    public OpenCommand(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void act() {
        System.out.println("open command act");
        this.editor.open();
    }
}
