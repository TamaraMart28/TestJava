import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 extends JFrame{
    private JLabel HelloLabel;
    private JPanel Panel;
    private JButton CreateButton;
    private JLabel Bye;

    public Form1() {
        setContentPane(Panel);
        setVisible(true);
        setSize(900, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        CreateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HelloLabel.setText("Пока");
            }
        });
    }

    public static void main(String[] args) {
        new Form1();
    }
}
