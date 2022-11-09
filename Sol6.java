import javax.swing.*;
import javax.swing.text.DefaultCaret;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sol6 extends JFrame{
    Sol6(){
        JFrame fr = new JFrame("Units and buildings pl1");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        fr.setBounds(Sol.d,Sol.d,Sol.d*12,Sol.d*11-5);
        JPanel panel = new JPanel();

        JTextArea display = new JTextArea ( 25,55 );
        display.setEditable ( false ); // set textArea non-editable

        String s =  "";
        int arr[];
        for (int i = 0; i < Sol.unitlist.size(); i++){
            arr = (int[]) Sol.unitlist.get(i);
            if (arr[14]>2&&arr[14]<1000) {
                s = s+ Sol.getname(arr[14]) + " "+arr[1]+ " "+arr[2]+ " "+arr[3]+System.lineSeparator();
            }}
        s=s+"___"+System.lineSeparator();
        for (int i = 0; i < Sol.buildlist.size(); i++){
            arr = (int[]) Sol.buildlist.get(i);
            if (arr[14]>1000&&arr[14]<2000) {
       s = s+ Sol.getname(arr[14]) + " "+arr[1]+ " "+arr[2]+ " "+arr[3]+System.lineSeparator();
            }}

            JScrollPane scroll = new JScrollPane ( display );
        scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
        DefaultCaret caret = (DefaultCaret) display.getCaret();
        caret.setUpdatePolicy(DefaultCaret.NEVER_UPDATE);
        display.append(s);
        panel.add ( scroll );

        fr.add(panel);

        fr.setResizable(true);
        fr.setVisible(true);
    }
}
