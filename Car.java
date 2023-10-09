package islandgame.game;

public class Car implements Vehicle {

    private final int weight;

    public Car(int weight) {
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

    public int getWeight() {
        return weight;
    }
}
