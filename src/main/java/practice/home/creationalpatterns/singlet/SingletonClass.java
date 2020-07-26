package practice.home.creationalpatterns.singlet;

import java.io.Serializable;
// Let you create the single object of the class in the jvm
public class SingletonClass implements Serializable {
    private static SingletonClass INSTANCE = null;

    private SingletonClass() {}

    public static SingletonClass getInstance() {
        if (null == INSTANCE) {
            synchronized (SingletonClass.class) {
                if (null == INSTANCE) {
                    INSTANCE = new SingletonClass();
                }
            }
        }

        return INSTANCE;
    }

    protected SingletonClass readResolve() {
        return getInstance();
    }
}