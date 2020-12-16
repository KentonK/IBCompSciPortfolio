package Project3;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//system.exit(0);
//name of jpannel
public class Game extends JPanel {
    private JButton[] buttons = new JButton[9];
    public Boolean turn = true;
    public int rounds = 0;
    public int scoreX = 0;
    public int scoreO = 0;

    public Game() {
        this.setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttons[i].setText("");
            buttons[i].addActionListener(new ButtonListener());
            this.add(buttons[i]);
        }
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton buttonClicked = (JButton) e.getSource();
            buttonClicked.setText(turn ? "X" : "O");
            turn = turn ? false : true;
            rounds += 1;
            if (rounds == 9) {
                buttons[5].setText("cats game");
                //end();
            }
            if (checkForWin()) {
                if (!turn) {
                    scoreX += 1;
                } else if (turn) {
                    scoreO += 1;
                }
                buttons[5].setText(!turn ? "X Wins" : "O Wins");
            }
        }


        public boolean checkForWin() {
            boolean win = false;
            for (int i = 0; i < 3; i++) {
                if (buttons[i].getText() == buttons[i + 3].getText() && buttons[i + 3].getText() == buttons[i + 6].getText() && buttons[i].getText() == "X" || buttons[i].getText() == "O") {
                    win = true;
                }
            }
            for (int i = 0; i < 9; i += 3) {
                if (buttons[i].getText() == buttons[i + 1].getText() && buttons[i + 1].getText() == buttons[i + 2].getText() && buttons[i].getText() == "X" || buttons[i].getText() == "O") {
                    win = true;
                }
            }
            if ((buttons[0].getText() == buttons[4].getText() && buttons[4].getText() == buttons[8].getText()) || (buttons[2].getText() == buttons[4].getText() && buttons[4].getText() == buttons[6].getText() && buttons[4].getText() == "X" || buttons[4].getText() == "O")) {
                win = true;
            }
            return win;
        }
/*
        private void end(ActionEvent f) {
            buttons[7].setText("Play Again");
            buttons[8].setText("Quit");
            buttons[6].setText("Score");
            JButton buttonClicked = (JButton) f.getSource();
            if (buttonClicked.getText() == "Play Again") {
                playAgain();
            } else if (buttonClicked.getText() == "Score") {
                buttons[6].setText("Back");
                buttons[0].setText("Score X");
                buttons[3].setText(Integer.toString(scoreX));
                buttons[2].setText("Score O");
                buttons[5].setText(Integer.toString(scoreO));
            }
        }

        public void playAgain() {
            buttons[3].setText("Player O Starts.");
            buttons[5].setText("Player X Starts.");
            JButton buttonClicked = (JButton) .getSource();
            if (buttonClicked.getText() == "Player X Starts.") {
                turn = true;
            } else if (buttonClicked.getText() == "Player O Starts.") {
                turn = false;
            }
            for (int i = 0; i < 9; i++) {
                buttons[i].setText("");
            }
        }
        */
    }
}