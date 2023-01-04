package Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TTTButtonClick implements ActionListener {
    JFrame frame;
    JButton button;
    Icon iconO;
    Icon iconX;
    int icon = 2;
    int turn = 1;


    public TTTButtonClick(JFrame frame, JButton button) {
        this.turn = turn;
        this.frame = frame;
        this.button = button;

        iconO = new ImageIcon("src/lib/smallO.png");
        iconX = new ImageIcon("src/lib/smallX.png");
    }


    public void actionPerformed(ActionEvent e) {
        main.endTest();
        turn = main.getTurn();
        main.nextTurn();
        if ((icon == 2) && (turn % 2) == 1) {
            button.setIcon(iconO);
            button.updateUI();
            icon = 1;
        } else if (icon == 2 ) {
            button.setIcon(iconX);
            button.updateUI();
            icon = 3;
        }
        main.endTest();
    }
}
