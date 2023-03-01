package Day23;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Day23 {
    JTextField outgoing;
    PrintWriter writer;
    Socket sock;
    public void go(){
        JFrame frame = new JFrame("Chat Client");
        JPanel mainPanel = new JPanel();
        outgoing = new JTextField(40);
        JButton sendButton = new JButton("send");
        sendButton.addActionListener(new SendButtonListener());
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        frame.getContentPane().add(BorderLayout.CENTER,mainPanel);
        setUpNetworking();
        frame.setSize(400,500);
        frame.setVisible(true);
    }
    private void setUpNetworking(){
        try{
            sock = new Socket("127.0.0.1",4222);
            writer = new PrintWriter(sock.getOutputStream(), true);
            System.out.println("networking established");
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
    public class SendButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                writer.println(outgoing.getText());
                writer.flush();
            }catch (Exception ex){
                ex.printStackTrace();
            }
            outgoing.setText("");
            outgoing.requestFocus();
        }
    }
}
