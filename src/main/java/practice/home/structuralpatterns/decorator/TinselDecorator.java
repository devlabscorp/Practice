package practice.home.structuralpatterns.decorator;

public class TinselDecorator extends TreeDecorator {

    public TinselDecorator(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + addAddlDecoration();
    }

    public String addAddlDecoration() {
        return " with Tinsel";
    }
}
