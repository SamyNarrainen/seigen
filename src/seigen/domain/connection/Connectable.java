package seigen.domain.connection;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Connectable {

    /**
     * Used exclusively to provide an auto incremented unique ID for each connectable entity.
     */
    private static final AtomicInteger networkAddressCount = new AtomicInteger(0);

    /**
     * An auto incremented unique ID used to represent the 'network address' this connectable is connecting with.
     * This does not represent an actual IP address. If desired for visualisation, this ID can be mapped to one instead.
     */
    private final int networkAddress;

    /**
     * Collection of past connections made to/from this connectable entity.
     */
    private final List<Connection> connectionHistoryList;

    public Connectable() {
        networkAddress = networkAddressCount.incrementAndGet();
        connectionHistoryList = new LinkedList<Connection>();
    }

    public int getNetworkAddress() {
        return networkAddress;
    }

    public List<Connection> getConnectionHistoryList() {
        return connectionHistoryList;
    }

    public void addConnectionToHistory(final Connection connection) {
        connectionHistoryList.add(connection);
    }
}
