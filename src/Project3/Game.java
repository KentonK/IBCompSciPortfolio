package Project3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JPanel {
    private JButton[] buttons = new JButton[9];
    public Boolean turn = true;

    public Game() {
        this.setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttons[i].setText("_");
            buttons[i].addActionListener(new ButtonListener());
            this.add(buttons[i]);
        }
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton buttonClicked = (JButton) e.getSource();
            buttonClicked.setText(turn == true ? "X" : "O");
            turn = turn == true ? false : true;
            
        }
        public boolean win(Button[] JB){
            boolean win=false;
            for (int i = 0; i < 3; i++) {
                if(JB[i]==JB[i+3]&&JB[i+3]==JB[i+6]){win=true;}
            }
            for (int i = 0; i < 9; i+=3){
                if (JB[i] == JB[i + 1] && JB[i + 1] == JB[i+2]){win=true;}
            }
            if((JB[0]==JB[4]&&JB[4]==JB[8])||(JB[2]==JB[4]&&JB[4]==JB[6])){win=true;}
            return win;
        }
    }
}