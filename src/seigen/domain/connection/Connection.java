package seigen.domain.connection;

public class Connection {

    private final Object requester;

    private final Object receiver;

    public Connection(final Object requester, final Object receiver) {
        this.requester = requester;
        this.receiver = receiver;
    }

    public Object getRequester() {
        return requester;
    }

    public Object getReceiver() {
        return receiver;
    }
}
