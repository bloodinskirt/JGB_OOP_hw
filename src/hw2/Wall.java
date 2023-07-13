package hw2;

public class Wall {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public void jumpOverWall(Jumpable jumpable) {
        jumpable.jump(height);
    }
}
