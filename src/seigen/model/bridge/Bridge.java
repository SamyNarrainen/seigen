package seigen.model.bridge;

import seigen.domain.connection.Connectable;

/**
 * The purpose of a bridge is to describe how one {@link Connectable} instance can 'communicate' with another.
 * For example, it can describe which application server out of a pool of application servers a client can connect to.
 */
public interface Bridge {

    Connectable bridge(final Connectable connectable);

}
