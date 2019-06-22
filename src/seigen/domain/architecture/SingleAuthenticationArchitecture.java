package seigen.domain.architecture;

import seigen.domain.server.AuthenticationServer;
import seigen.domain.server.ApplicationServer;

import java.util.ArrayList;
import java.util.List;

/**
 * Distributed system with multiple application servers and a single authentication server.
 */
public class SingleAuthenticationArchitecture {

    private final AuthenticationServer authentication;

    private final List<ApplicationServer> serverList;

    public SingleAuthenticationArchitecture(final int serverCount) {
        authentication = new AuthenticationServer();
        serverList = new ArrayList<ApplicationServer>(serverCount);
        for (int i = 0; i < serverList.size(); i++) {
            serverList.add(new ApplicationServer());
        }
    }

    public AuthenticationServer getAuthentication() {
        return authentication;
    }

    public List<ApplicationServer> getServerList() {
        return serverList;
    }
}
