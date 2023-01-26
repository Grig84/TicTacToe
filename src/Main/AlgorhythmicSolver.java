package Main;

import javax.swing.*;
import java.util.ArrayList;

public class AlgorhythmicSolver {
    ArrayList<ButtonTickTackToe> buttonList;
    JButton desiredButton;

    public AlgorhythmicSolver(ArrayList<ButtonTickTackToe> buttonList) {
        this.buttonList = buttonList;
        doTurn();
    }

    public void doTurn() {
        if (main.getTurn() % 2 == 0) {
            // If it is our turn
            // TODO: Add state machine




            desiredButton.doClick();
        }
    }

    public enum stateMachineMayhem {
        empty {
            @Override
            public stateMachineMayhem nextState() {
                
                return 
            }
        }
    }

}
