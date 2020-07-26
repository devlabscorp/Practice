package practice.home.creationalpatterns.abstractfactory;

public class ColorFactory implements AbstractFactory<Color> {

    @Override
    public Color create(String animalType) {
        if ("Dog".equals(animalType)) {
            return new Black();
        }

        if ("Bear".equals(animalType)) {
            return new Brown();
        }

        if ("Cow".equals(animalType)) {
            return new White();
        }

        return null;
    }
}
