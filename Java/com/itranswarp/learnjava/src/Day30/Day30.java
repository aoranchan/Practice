package Day30;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Day30 {
    private static void image(){
        EventQueue.invokeLater(()->{
            var frame = new ImageViewerFrame();
            frame.setTitle("ImageViewer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
    private static void hello(){
        String s = "hello world!";
        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            System.out.print("=");
        }
        System.out.println("");
    }

    public static void test(){
        image();
//        hello();
    }
}
class ImageViewerFrame extends JFrame{
    private static final int DEFAULT_WIDTH = 1920;
    private static final int DEFAULT_HEIGHT = 1080;
    public ImageViewerFrame(){
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
        var label = new JLabel();
        add(label);
        var chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));

        var menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        var menu = new JMenu("File");
        menuBar.add(menu);

        var openItem = new JMenuItem("Open");
        menu.add(openItem);
        openItem.addActionListener(even ->{
            int result = chooser.showOpenDialog(null);
            if(result == JFileChooser.APPROVE_OPTION){
                String name = chooser.getSelectedFile().getPath();
                label.setIcon(new ImageIcon(name));
            }
        });
        var exitItem = new JMenuItem("Exit");
        menu.add(exitItem);
        exitItem.addActionListener(event -> System.exit(0));
    }
}