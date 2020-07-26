package practice.home.structuralpatterns.adapter;

public class MovableBugatti implements MovableAdaptee {
    @Override
    public double speed() {
        return 200.0;
    }
}
