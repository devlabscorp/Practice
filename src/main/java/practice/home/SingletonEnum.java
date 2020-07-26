package practice.home;

public enum SingletonEnum {
    INSTANCE;

    int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
