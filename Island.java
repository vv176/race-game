package islandgame.game;

import java.util.List;

public class Island {

    private final int id;
    private final Vehicle vehicle;
    private final ConnectionMap connectionMap;

    public Island(int id, Vehicle vehicle, ConnectionMap connectionMap) {
        this.id = id;
        this.vehicle = vehicle;
        this.connectionMap = connectionMap;
    }

    public int getId() {
        return id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public List<Connection> getConnections() {

        return connectionMap.getConnections(id);
    }

}
