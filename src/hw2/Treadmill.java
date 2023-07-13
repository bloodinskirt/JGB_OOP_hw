package hw2;

public class Treadmill {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public void runOnTreadmill(Runnable runnable) {
        runnable.run(length);
    }
}

