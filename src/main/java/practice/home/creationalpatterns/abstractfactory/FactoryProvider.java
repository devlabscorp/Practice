package practice.home.creationalpatterns.abstractfactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String choice) {
        if ("color".equals(choice)) {
            return new ColorFactory();
        }

        if ("animal".equals(choice)) {
            return new AnimalFactory();
        }

        return null;

    }
}
