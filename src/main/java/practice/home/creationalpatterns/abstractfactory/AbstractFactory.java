package practice.home.creationalpatterns.abstractfactory;

// let you produce family of related objects with out providing their concrete classes
public interface AbstractFactory<T> {
    T create(String animalType);
}
