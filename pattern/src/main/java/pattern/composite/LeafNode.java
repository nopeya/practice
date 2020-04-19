package pattern.composite;

public class LeafNode extends Tree {

    public LeafNode(String name, int level) {
        super(name, level);
    }

    void print() {
        for (int i = 0; i < getLevel(); i++) {
            System.out.print("  ");
        }
        System.out.println("-" + getName());
    }
}
