import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Sol5 extends JFrame{
    Sol5(){

        Sol.contents2 = new JFrame("set AI skill hard(2-50)easy and press Enter");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        Sol.smallField2 = new JTextField(50);

        Sol.smallField2.setText(Sol.aihard+"");

        Sol.smallField2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Sol.getai();
            }
        });
        Sol.contents2.add(Sol.smallField2);

        Sol.contents2.setBounds(250,250,250,250);
        Sol.contents2.setSize(500, 60);
        Sol.contents2.setResizable(false);
        Sol.contents2.setVisible(true);
    }
}
