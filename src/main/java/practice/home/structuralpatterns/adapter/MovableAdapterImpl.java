package practice.home.structuralpatterns.adapter;

// Adapter lets you connect two incompatible interfaces together by composing the adaptee.
public class MovableAdapterImpl implements MovableAdapter {
    private MovableAdaptee movableAdaptee;

    public MovableAdapterImpl(MovableAdaptee adaptee) {
        this.movableAdaptee = adaptee;
    }

    @Override
    public double _5secSpeed() {
        return this.movableAdaptee.speed() * 1.6;
    }
}
