package islandgame.game;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Simulation {

    private static final int start = 0, end = 3;
    private static boolean ans = false;
    private static final Map<Integer, Island> islands =
            new HashMap<>();
    // TODO : Add check for cycles
    public static void canTraverse(int current) {
        if (current == end) {
            ans = true;
            return;
        }
        Island i = islands.get(current);
        Vehicle v = i.getVehicle();
        List<Connection> connections = i.getConnections();
        if (connections != null) {
            for (Connection conn : connections) {
                if (v.traverse(conn)) {
                    canTraverse(conn.getEndIsland());
                }
            }
        }
    }

    public static void main(String[] args) {
        ConnectionMap m = new ConnectionMap();
        m.add(new RoadWayConnection(0, 1, 1000));
        m.add(new WaterwayConnection(0, 1));
        m.add(new WaterwayConnection(0, 2));
        m.add(new RoadWayConnection(2, 3, 101));

        Island island0 = new Island(0, new Boat(false, 150), m);
        Island island1 = new Island(1, new Car(300), m);
        Island island2 = new Island(2, new Car(200), m);
        Island island3 = new Island(3, new Boat(true, 250), m);
        islands.put(0, island0);
        islands.put(1, island1);
        islands.put(2, island2);
        islands.put(3, island3);

        canTraverse(start);
        System.out.println(ans);
    }

}
