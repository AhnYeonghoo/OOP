import java.awt.*;
import java.awt.event.*;

public class InnerEx6 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("ActionEvent occurred!! ");
                }
            }
        );
    }
}

