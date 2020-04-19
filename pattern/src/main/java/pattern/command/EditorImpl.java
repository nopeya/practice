package pattern.command;

public class EditorImpl implements Editor {
    @Override
    public void open() {
        System.out.println("edit open");
    }

    @Override
    public void write(String data) {
        System.out.println("edit write:" + data);
    }

    @Override
    public void save() {
        System.out.println("edit save");
    }
}
