package cloud1.neelix;

import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class NeelixApp {

    public static void main(String[] args) {
        System.out.println("Neelix 1.1, Java " + System.getProperty("java.version"));
        new NeelixApp().start();
    }

    public void start() {
        JFrame frame = new JFrame("Neelix 1.1 (Java Swing)");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(600, 170);
        frame.setLocation(1000, 200);
        frame.setLayout(new GridLayout(1, 3, 10, 10));
        
        JButton button = new JButton("Button");
        button.addActionListener(e -> System.out.println("Button pressed"));
        frame.getContentPane().add(button); // Adds Button to content pane of frame

        JButton button2 = new JButton("Open window");
        button2.addActionListener(e -> {
            System.out.println("Button 'Open window' pressed");
            newWindow();
        });
        frame.getContentPane().add(button2);

        JButton button3 = new JButton("File chooser");
        button3.addActionListener(e -> {
            System.out.println("Button 'File chooser' pressed");
            JFileChooser f = new JFileChooser();
            int returnVal = f.showOpenDialog(frame);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = f.getSelectedFile();
                System.out.println("File chooser: APPROVE. selected file: " + file.getAbsolutePath());
            } else {
                System.out.println("File chooser: no APPROVE: " + returnVal);
            }
        });
        frame.getContentPane().add(button3);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("bye bye");
            }
        });
        
        frame.setVisible(true);
    }
    
    private void newWindow() {
        JFrame sub = new JFrame("Neelix sub window");
        sub.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        sub.setSize(600, 200);
        sub.setLocation(800, 310);
        sub.setVisible(true);
    }
}
