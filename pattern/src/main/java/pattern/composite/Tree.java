package pattern.composite;

public abstract class Tree {

    private String name;

    private int level;

    public Tree(String name, int level) {
        this.name = name;
        this.level = level;
    }

    abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
