package hw2;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("John", 100, 2);
        Cat cat = new Cat("Tom", 50, 3);
        Robot robot = new Robot("Robo", 200, 1);

        Treadmill treadmill = new Treadmill(80);
        Wall wall = new Wall(2);
        Runnable[] runnables = {human, cat, robot};
        Jumpable[] jumpables = {human, cat, robot};

        for (Runnable runnable : runnables) {
            treadmill.runOnTreadmill(runnable);
        }

        for (Jumpable jumpable : jumpables) {
            wall.jumpOverWall(jumpable);

        }
    }
}
