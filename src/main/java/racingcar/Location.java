package racingcar;

public class Location {
    private int x;

    Location() {
        this.x = 0;
    }

    public int getX() {
        return this.x;
    }

    public void moveForward() {
        this.x = this.getX() + 1;
    }
}
