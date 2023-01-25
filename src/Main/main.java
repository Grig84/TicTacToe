package Main;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;


public class main {
    static JFrame frame;

    static int turn = 1;

    static ButtonTickTackToe button11;
    static ButtonTickTackToe button12;
    static ButtonTickTackToe button13;

    static ButtonTickTackToe button21;
    static ButtonTickTackToe button22;
    static ButtonTickTackToe button23;

    static ButtonTickTackToe button31;
    static ButtonTickTackToe button32;
    static ButtonTickTackToe button33;

    static ArrayList<ButtonTickTackToe> buttonList;

    static ModeSelector modeSelect;

    static AlgorhythmicSolver algoSolver;

    public static void main(String[] args) {
        buttonList = new ArrayList<ButtonTickTackToe>();

        startFrame();

        frame.add(modeSelect =  new ModeSelector(frame, "Game Mode Select"));
        frame.repaint();
        modeSelect.show(frame, 450/2-50, 600/2-50);
    }

    public static void startFrame() {
        frame = new JFrame();//creating instance of JFrame
        frame.setSize(450,600);//400 width and 500 height
        frame.setLayout(null);//using no layout managers
        frame.setVisible(true);//making the frame visible
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void startGame() {
        frame.add(button11 = new ButtonTickTackToe(frame, "click", 50, 100, 100, 100));
        frame.add(button12 = new ButtonTickTackToe(frame, "click", 175, 100, 100, 100));
        frame.add(button13 = new ButtonTickTackToe(frame, "click", 300, 100, 100, 100));

        frame.add(button21 = new ButtonTickTackToe(frame, "click", 50, 225, 100, 100));
        frame.add(button22 = new ButtonTickTackToe(frame, "click", 175, 225, 100, 100));
        frame.add(button23 = new ButtonTickTackToe(frame, "click", 300, 225, 100, 100));

        frame.add(button31 = new ButtonTickTackToe(frame, "click", 50, 350, 100, 100));
        frame.add(button32 = new ButtonTickTackToe(frame, "click", 175, 350, 100, 100));
        frame.add(button33 = new ButtonTickTackToe(frame, "click", 300, 350, 100, 100));

        buttonList.clear();
        buttonList.add(button11);
        buttonList.add(button12);
        buttonList.add(button13);
        buttonList.add(button21);
        buttonList.add(button22);
        buttonList.add(button23);
        buttonList.add(button31);
        buttonList.add(button32);
        buttonList.add(button33);

        frame.repaint();
    }

    public static void startAlgo() {
        algoSolver = new AlgorhythmicSolver(buttonList);
    }

    public static int getTurn() {
        return turn;
    }

    public static void nextTurn() {
        turn++;
    }

    public static void endTest() {
        if(button11.getTeam() == button22.getTeam() && button33.getTeam() == button22.getTeam() && button11.getTeam() != 2) {
            win(button11.getTeam());
        } else if (button13.getTeam() == button22.getTeam() && button22.getTeam() == button31.getTeam() && button13.getTeam() != 2) {
            win(button13.getTeam());

        } else if (button11.getTeam() == button21.getTeam() && button21.getTeam() == button31.getTeam() && button11.getTeam() != 2) {
            win(button11.getTeam());
        } else if (button12.getTeam() == button22.getTeam() && button22.getTeam() == button22.getTeam() && button12.getTeam() != 2) {
            win(button12.getTeam());
        } else if (button13.getTeam() == button23.getTeam() && button23.getTeam() == button33.getTeam() && button13.getTeam() != 2) {
            win(button13.getTeam());

        } else if (button11.getTeam() == button12.getTeam() && button12.getTeam() == button13.getTeam() && button11.getTeam() != 2) {
            win(button11.getTeam());
        } else if (button21.getTeam() == button22.getTeam() && button22.getTeam() == button23.getTeam() && button21.getTeam() != 2) {
            win(button21.getTeam());
        } else if (button31.getTeam() == button32.getTeam() && button32.getTeam() == button33.getTeam() && button31.getTeam() != 2) {
            win(button31.getTeam());
        }

    }

    public static void win(int team) {
        JLabel label;

        frame.remove(button11);
        frame.remove(button12);
        frame.remove(button13);
        frame.remove(button21);
        frame.remove(button22);
        frame.remove(button23);
        frame.remove(button31);
        frame.remove(button32);
        frame.remove(button33);


        if (team == 1) {
            label = new JLabel("Player O won!", SwingConstants.CENTER);
        } else {
            label = new JLabel("Player X won!", SwingConstants.CENTER);
        }
        label.setBounds(50, 250, 300, 100);
        frame.add(label);
        frame.repaint();

        frame.add(new ButtonReset(frame, "Reset", 60, 400, 300, 100));
        frame.repaint();
    }
}


