package islandgame.game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectionMap {

    private final Map<Integer, List<Connection>> connections;

    public ConnectionMap() {
        this.connections = new HashMap<>();
    }

    public void add(Connection c) {
        int startIsland = c.getStartIsland();
        if (!connections.containsKey(startIsland))
            connections.put(startIsland, new ArrayList<>());
        connections.get(startIsland).add(c);
    }

    public List<Connection> getConnections(Integer id) {
        return connections.get(id);
    }
}

