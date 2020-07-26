package practice.home.structuralpatterns.decorator;

public class GarlandDecorator extends TreeDecorator {
    public GarlandDecorator(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + addAddlDecoration();
    }

    public String addAddlDecoration() {
        return " with Garland";
    }
}
