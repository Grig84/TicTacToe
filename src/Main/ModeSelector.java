package Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModeSelector extends JPopupMenu {
    JMenuItem twoPlayer = new JMenuItem("Two Player");
    JMenuItem algo = new JMenuItem("Algo");

    public ModeSelector(JFrame frame, String header) {
        setLabel(header);
        add(twoPlayer);
        add(algo);
        repaint();


        twoPlayer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                main.startGame();
            }
        });

        algo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                main.startGame();
                main.startAlgo();
            }
        });


    }
}

