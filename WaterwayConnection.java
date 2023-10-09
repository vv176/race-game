package islandgame.game;

public class WaterwayConnection implements Connection {

    private final int startIsland, endIsland;

    public WaterwayConnection(int startIsland, int endIsland) {
        this.startIsland = startIsland;
        this.endIsland = endIsland;
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

        return false;
    }

    @Override
    public void traverse(Car car) {
        throw new RuntimeException("can't traverse water by a car...");
    }

    @Override
    public boolean canTraverse(Boat boat) {

        return true;
    }

    @Override
    public void traverse(Boat boat) {
        System.out.println("Traversing from " + startIsland + " to " + endIsland
                + " by boat...");
    }
}
