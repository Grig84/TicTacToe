package Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class AlgorhythmicSolver {
    ArrayList<ButtonTickTackToe> buttonList;
    JButton desiredButton;

    public AlgorhythmicSolver(ArrayList<ButtonTickTackToe> buttonList) {
        this.buttonList = buttonList;
        doTurn();
    }

    public void doTurn() {
        if (main.getTurn() % 2 == 0) {
            desiredButton.doClick();
        }
    }

}
