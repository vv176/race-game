package islandgame.game;

public class Boat implements Vehicle {
    private final boolean hasWheels;

    private final int weight;

    public Boat(boolean hasWheels, int weight) {
        this.hasWheels = hasWheels;
        this.weight = weight;
    }
    @Override
    public boolean traverse(Connection connection) {
        if (connection.canTraverse(this)) {
            connection.traverse(this);
            return true;
        }
        return false;
    }

    public boolean hasWheels() {
        return hasWheels;
    }

    public int getWeight() {
        return weight;
    }
}
