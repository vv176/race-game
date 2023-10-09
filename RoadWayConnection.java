package islandgame.game;

public class RoadWayConnection implements Connection {

    private final int startIsland, endIsland;
    private final int weightLimit;

    public RoadWayConnection(int startIsland, int endIsland, int weightLimit) {
        this.startIsland = startIsland;
        this.endIsland = endIsland;
        this.weightLimit = weightLimit;
    }

    @Override
    public int getStartIsland() {
        return startIsland;
    }

    @Override
    public int getEndIsland() {
        return endIsland;
    }

    @Override
    public boolean canTraverse(Car car) {
        return car.getWeight() <= this.weightLimit;
    }

    @Override
    public void traverse(Car car) {
        System.out.println("Traversing from " + startIsland + " to " + endIsland
                      + " by car...");
    }

    public boolean canTraverse(Boat boat) {
        return boat.hasWheels() && boat.getWeight() <= this.weightLimit;
    }

    @Override
    public void traverse(Boat boat) {
        System.out.println("Traversing from " + startIsland + " to " + endIsland
                + " by boat...");
    }
}
