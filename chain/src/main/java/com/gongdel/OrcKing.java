package com.gongdel;

public class OrcKing {

    RequestHandler chain;

    public OrcKing() {
        buildChain();
    }

    private void buildChain() {
        this.chain = new OrcCommander(new OrcOfficer(new OrcSoldier(null)));
    }

    public void makeRequest(Request req) {
        chain.handleRequest(req);
    }

}
