package practice.home.creationalpatterns.abstractfactory;

public class Cow implements Animal {
    @Override
    public String getType() {
        return "pet";
    }

    @Override
    public String makeSound() {
        return "maa";
    }
}
