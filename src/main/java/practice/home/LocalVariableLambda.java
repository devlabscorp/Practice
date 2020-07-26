package practice.home;

import java.util.concurrent.Executor;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class LocalVariableLambda {

    private int counter = 5;

    private volatile boolean lambdaRun = true;

    // Variables used in lambda expression should be final or effectively final
    // But, why does it make a copy? Well, notice that we are returning the lambda from our method.
    // Thus, the lambda won't get run until after the start method parameter gets garbage collected.
    // Java has to make a copy of start in order for this lambda to live outside of this method.
    Supplier<Integer> increment(int start) {
        //return () -> start ++;
        return () -> start;
    }

    // Simply put, it's about where member variables are stored. Local variables are on the stack,
    // but member variables are on the heap. Because we're dealing with heap memory,
    // the compiler can guarantee that the lambda will have access to the latest value of counter.
    Supplier<Integer> incrementValue() {
        return () -> counter ++;
    }


    public void localVariableMultithreading(Executor executor) {
        boolean run = true;
        executor.execute(() -> {
            //while (run) {
                // do operation
            //}
        });

        run = false;
    }

    public void localVariableMultithreading_2(Executor executor) {
        executor.execute(() -> {
            while (lambdaRun) {
                // do operation
            }
        });

        lambdaRun = false;
    }

    public int workaroundSingleThread() {
        int[] holder = new int[] { 2 };
        IntStream sums = IntStream
                .of(1, 2, 3)
                .map(val -> val + holder[0]);

        return sums.sum();
    }

    public static void main(String[] args) {
        LocalVariableLambda lambda = new LocalVariableLambda();

        System.out.println(lambda.workaroundSingleThread());
    }


}
