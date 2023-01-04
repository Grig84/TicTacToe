package Main;

import javax.swing.*;


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

    static JPopupMenu modeSelect;

    public static void main(String[] args) {
        startFrame();
        startGame();
    }

    public static void startFrame() {
        frame = new JFrame();//creating instance of JFrame
        frame.setSize(450,600);//400 width and 500 height
        frame.setLayout(null);//using no layout managers
        frame.setVisible(true);//making the frame visible
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//
//        frame.add(modeSelect =  new JPopupMenu("Game Mode Select"));
//        modeSelect.add("Hi");
//        frame.repaint();
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

        frame.repaint();
    }

    public static int getTurn() {
        return turn;
    }

    public static void nextTurn() {
        turn++;
    }

    public static void endTest() {
        if(button11.checkWin() == button22.checkWin() && button33.checkWin() == button22.checkWin() && button11.checkWin() != 2) {
            win(button11.checkWin());
        } else if (button13.checkWin() == button22.checkWin() && button22.checkWin() == button31.checkWin() && button13.checkWin() != 2) {
            win(button13.checkWin());

        } else if (button11.checkWin() == button21.checkWin() && button21.checkWin() == button31.checkWin() && button11.checkWin() != 2) {
            win(button11.checkWin());
        } else if (button12.checkWin() == button22.checkWin() && button22.checkWin() == button22.checkWin() && button12.checkWin() != 2) {
            win(button12.checkWin());
        } else if (button13.checkWin() == button23.checkWin() && button23.checkWin() == button33.checkWin() && button13.checkWin() != 2) {
            win(button13.checkWin());

        } else if (button11.checkWin() == button12.checkWin() && button12.checkWin() == button13.checkWin() && button11.checkWin() != 2) {
            win(button11.checkWin());
        } else if (button21.checkWin() == button22.checkWin() && button22.checkWin() == button23.checkWin() && button21.checkWin() != 2) {
            win(button21.checkWin());
        } else if (button31.checkWin() == button32.checkWin() && button32.checkWin() == button33.checkWin() && button31.checkWin() != 2) {
            win(button31.checkWin());
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


