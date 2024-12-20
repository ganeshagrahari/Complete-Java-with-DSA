import java.awt.*;
import java.awt.event.*;

public class MyFrame extends Frame {
    public MyFrame() {
        setTitle("My AWT Frame");
        setSize(300, 200);
        setLayout(new FlowLayout());

        Label label = new Label("Welcome to AWT!");
        add(label);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
    }
}
