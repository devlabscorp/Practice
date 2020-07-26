package practice.home.creationalpatterns.abstractfactory;

public class Dog implements Animal {
    @Override
    public String getType() {
        return "pet";
    }

    @Override
    public String makeSound() {
        return "bow";
    }
}
