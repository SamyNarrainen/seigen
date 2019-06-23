package seigen.model.bridge;

import seigen.domain.connection.Connectable;

import java.util.List;

/**
 * Given a pool of {@link Connectable}s, the iterative bridge will return the next instance in the pool for each bridge
 * request. The bridge will wrap around to the beginning when the final instance in the pool is reached and continue
 * iterating.
 */
public class IterativeBridge implements Bridge {

    /** The index of the {@link Connectable} instance to serve the next bridge request with. */
    private int header;

    /** Collection of {@link Connectable}s that this bridge is serving. */
    private final List<Connectable> connectablePool;

    /**
     * @param connectablePool - non empty collection of {@link Connectable}s to allow this bridge to serve.
     */
    public IterativeBridge(final List<Connectable> connectablePool) {
        this.connectablePool = connectablePool;
        if (connectablePool.isEmpty()) {
            throw new IllegalArgumentException("Pool cannot be empty.");
        }
    }

    @Override
    public Connectable bridge(final Connectable connectable) {
        final Connectable destination = connectablePool.get(header);
        header = (header + 1) % connectablePool.size();
        return destination;
    }
}
