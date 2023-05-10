package NUM7.Adapter;


import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class USBTethering implements Network {

    String address;
    USB usb_port;

    public USBTethering(USB usb_port){
        this.address = "192.168.0.1";
        this.usb_port = usb_port;
    }

    @Override
    public void sendMessage(String message) {
        usb_port.write(message.getBytes(StandardCharsets.UTF_8));
    }

    @Override
    public String receiveMessage() {
        return Arrays.toString(usb_port.read());
    }
}
