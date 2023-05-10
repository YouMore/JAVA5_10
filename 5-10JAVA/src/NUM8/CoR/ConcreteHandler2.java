package NUM8.CoR;

public class ConcreteHandler2 extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getPayload() >= 10 && request.getPayload() < 20) {
            System.out.println("Request handled by ConcreteHandler2");
        } else {
            super.handleRequest(request);
        }
    }
}
