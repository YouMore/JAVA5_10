package NUM8.CoR;

public class ConcreteHandler3 extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getPayload() >= 20) {
            System.out.println("Request handled by ConcreteHandler3");
        } else {
            super.handleRequest(request);
        }
    }
}
