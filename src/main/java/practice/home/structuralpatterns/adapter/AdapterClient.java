package practice.home.structuralpatterns.adapter;

public class AdapterClient {

    public static void main(String[] args) {
        MovableAdapter adapter = new MovableAdapterImpl(new MovableBugatti());
        System.out.println(adapter._5secSpeed());

        adapter = new MovableAdapterImpl(new MovableLotus());
        System.out.println(adapter._5secSpeed());
    }
}
