package Project3;
import javax.swing.*;
public class Main {
    public static void main(String[] args){
        JFrame window = new JFrame("ticktacktoe");
        window.setBounds(100, 100, 300, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().add(new Game());
        window.setVisible(true);

    }

}
