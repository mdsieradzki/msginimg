package gui;

import javax.swing.JFrame;

/**
 *
 * @author marcin
 */
public class MainWindow extends JFrame {
    
    public MainWindow() {
        super("Message In Image");
        setSize(800, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
