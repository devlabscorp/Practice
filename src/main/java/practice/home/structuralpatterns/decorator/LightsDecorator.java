package practice.home.structuralpatterns.decorator;


public class LightsDecorator extends TreeDecorator {
    public LightsDecorator(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + addAddlDecoration();
    }

    @Override
    String addAddlDecoration() {
        return " with Lights";
    }

}
