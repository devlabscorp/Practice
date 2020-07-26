package practice.home.behavioralpatterns.observer;

public class CBSChannel implements Channel {
    private String state;

    @Override
    public void update(Object state) {
        this.state = (String) state;
    }

    @Override
    public String toString() {
        return "CBSChannel{" +
                "state='" + state + '\'' +
                '}';
    }
}
