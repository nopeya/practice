package pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Node extends Tree {

    private List<Tree> children = new ArrayList<Tree>();

    public Node(String name, int level) {
        super(name, level);
    }

    public void addChild(Tree tree) {
        this.children.add(tree);

    }

    void print() {
        for (int i = 0; i < getLevel(); i++) {
            System.out.print("  ");
        }
        System.out.println("+" + getName());
        for (Tree child: children) {
            child.print();
        }
    }
}
