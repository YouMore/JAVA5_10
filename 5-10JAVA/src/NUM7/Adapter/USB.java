package NUM7.Adapter;

import java.nio.charset.Charset;

public class USB implements USBConnection {

    private byte[] buffer;
    private int port;

    public USB(int port)
    {
        this.port = port;
    }

    @Override
    public void write(byte[] message) {
        System.out.println("Send bytes...");
        System.out.println(new String(message, Charset.forName("UTF-8")));
    }

    @Override
    public byte[] read() {
        System.out.println("Read bytes...");
        return new byte[] {112, 114, 105, 118, 101, 116};
    }
}
