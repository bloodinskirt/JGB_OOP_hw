package hw2;

public class Cat {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " успешно пробежал " + distance + " метров.");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " метров.");
        }
    }

    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " успешно прыгнул на " + height + " метров.");
        } else {
            System.out.println(name + " не смог прыгнуть на " + height + " метров.");
        }
    }
}
