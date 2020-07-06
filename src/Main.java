import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private int count = 0;
    private String text1 = "Counter is : ";
    private JPanel p  = new JPanel( );
    private JButton counter = new JButton("Add int >D");
    private JLabel text = new JLabel(text1+ count);
    public static void main(String[] args) {
        new Main();
    }
    public Main(){
        JFrame w = new JFrame();
        p.add(text);
        p.add(counter);
        w.add(p);
        w.setSize(150,100);
        w.setResizable(false);
        w.setLocationRelativeTo(null);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setVisible(true);
        counter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                text.setText(text1+count);
            }
        });
    }
}
