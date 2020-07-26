package practice.home.behavioralpatterns.observer;

public class AbcChannel implements Channel {
    private String state;

    @Override
    public void update(Object state) {
        this.state = (String) state;
    }

    @Override
    public String toString() {
        return "AbcChannel{" +
                "state='" + state + '\'' +
                '}';
    }
}
