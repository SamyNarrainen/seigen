package seigen.model.client;

import java.util.concurrent.atomic.AtomicInteger;

public class Client {

    /**
     * Used exclusively to provide an auto incremented unique ID for each client.
     */
    private static final AtomicInteger networkAddressCount = new AtomicInteger(0);

    /**
     * An auto incremented unique ID used to represent the 'network address' this client is connecting with.
     * This does not represent an actual IP address. If desired for visualisation, this ID can be mapped to one instead.
     */
    private final int networkAddress;

    public Client() {
        networkAddress = networkAddressCount.incrementAndGet();
    }

}
