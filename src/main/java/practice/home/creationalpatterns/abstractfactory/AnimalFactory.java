package practice.home.creationalpatterns.abstractfactory;

public class AnimalFactory implements AbstractFactory<Animal> {

    @Override
    public Animal create(String animalType) {

        if ("Dog".equals(animalType)) {
            return new Dog();
        }

        if ("Bear".equals(animalType)) {
            return new Bear();
        }

        if ("Cow".equals(animalType)) {
            return new Cow();
        }

        return null;
    }
}
