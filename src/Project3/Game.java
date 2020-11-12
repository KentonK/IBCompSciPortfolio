package Project3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JPanel {
    private JButton[] buttons= new JButton[9];

    public Game(){
        this.setLayout(new GridLayout(3,3));
        for (int i = 0; i < 9; i++) {
            buttons[i]=new JButton();
            buttons[i].setText("");

            this.add(buttons[i]);
        }
    }
    private class ButtonListener implements ActionListener{
        private String turn="X";
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton buttonClicked = (JButton) e.getSource();
            buttonClicked.setText(turn);
            turn=(turn=="X")?"O":"X";
        }
    }
}
