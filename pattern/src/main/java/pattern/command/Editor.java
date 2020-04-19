package pattern.command;

public interface Editor {

    void open();

    void write(String data);

    void save();
}
