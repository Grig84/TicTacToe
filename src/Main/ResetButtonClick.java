package Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetButtonClick implements ActionListener {
    JFrame frame;
    JButton button;


    public ResetButtonClick(JFrame frame, JButton button) {
        this.frame = frame;
        this.button = button;
    }


    public void actionPerformed(ActionEvent e) {
        frame.dispose();
        main.main(new String[] {});
    }
}
