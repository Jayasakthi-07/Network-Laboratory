import java.net.*;
import java.io.*;

class TCPServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);

        System.out.println("Server waiting...");

        Socket s = ss.accept();

        BufferedReader in = new BufferedReader(
            new InputStreamReader(s.getInputStream()));

        PrintWriter out = new PrintWriter(
            s.getOutputStream(), true);

        String msg = in.readLine();

        System.out.println("Client: " + msg);

        out.println(msg);

        s.close();
        ss.close();
    }
}
