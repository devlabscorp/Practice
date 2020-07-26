package practice.home.structuralpatterns.adapter;

public class MovableLotus implements MovableAdaptee {
    @Override
    public double speed() {
        return 255.0;
    }
}
