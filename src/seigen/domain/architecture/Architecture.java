package seigen.domain.architecture;

import seigen.domain.server.ApplicationServer;

import java.util.List;

/**
 * Interface which provides an API to accessing the servers associated with a distributed server architecture.
 */
public interface Architecture {

    List<ApplicationServer> getApplicationServerList();

}
