package practice.home.creationalpatterns.abstractfactory;

public class Bear implements Animal {
    @Override
    public String getType() {
        return "wild";
    }

    @Override
    public String makeSound() {
        return "grawl";
    }
}
