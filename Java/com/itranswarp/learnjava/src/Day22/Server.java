package Day22;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    String[] adviceList = {"Hello World!", "Go for the tight jeans. No they do Not make you look fat."};
    public void go(){
        try{
            ServerSocket s = new ServerSocket(4242);
            while (true){
                Socket sock = s.accept();
                PrintWriter writer = new PrintWriter(sock.getOutputStream(), true);
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private String getAdvice(){
        int random = (int)(Math.random() * adviceList.length);
        return adviceList[random];
    }
    public static void test(){
        Server server = new Server();
        server.go();
    }
}
