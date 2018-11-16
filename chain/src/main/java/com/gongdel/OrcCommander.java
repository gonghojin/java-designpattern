package com.gongdel;

public class OrcCommander extends RequestHandler {

    public OrcCommander(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handleRequest(Request req) {
        if (req.getRequestType().equals(RequestType.DEFEND_CASTLE)) {
            printHandling(req);
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "Orc commander";
    }
}
