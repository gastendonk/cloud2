package cloud1.neelix;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class NeelixApp {

    public static void main(String[] args) {
        System.out.println("Neelix, Java " + System.getProperty("java.version"));
        new NeelixApp().start();
    }

    public void start() {
        JFrame frame = new JFrame("Neelix (Java Swing)");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocation(100, 100);
        JButton button = new JButton("Button");
        button.addActionListener(e -> System.out.println("Button pressed"));
        frame.getContentPane().add(button); // Adds Button to content pane of frame
        frame.setVisible(true);
    }
}
