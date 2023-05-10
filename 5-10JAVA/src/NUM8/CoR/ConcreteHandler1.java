package NUM8.CoR;

public class ConcreteHandler1 extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getPayload() < 10) {
            System.out.println("Request handled by ConcreteHandler1");
        } else {
            super.handleRequest(request);
        }
    }
}
