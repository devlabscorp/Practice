package practice.home.structuralpatterns.decorator;


// Decorator let you add additional responsibilities dynamically, the decorator implements and compose the parent
// decorator interface
public abstract class TreeDecorator implements ChristmasTree {
    private ChristmasTree christmasTree;

    public TreeDecorator(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    @Override
    public String decorate() {
        return christmasTree.decorate();
    }

    abstract String addAddlDecoration();
}
