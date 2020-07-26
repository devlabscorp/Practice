package practice.home.structuralpatterns.decorator;

public class DecoratorClient {

    public static void main(String[] args) {
        ChristmasTree tree = new ChristmasTreeImpl();
        System.out.println(tree.decorate());

        tree = new GarlandDecorator(new ChristmasTreeImpl());
        System.out.println(tree.decorate());

        tree = new GarlandDecorator(new LightsDecorator(new TinselDecorator(new ChristmasTreeImpl())));
        System.out.println(tree.decorate());
    }
}
