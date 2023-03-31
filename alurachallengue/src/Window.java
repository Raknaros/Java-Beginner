import view.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class Window extends JFrame implements ActionListener{
    static JFrame f;
    public static void main(String args[]) {
        f = new JFrame("Conversor");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Window s=new Window();
        JLabel titulo=new JLabel("¿Qué deseas convertir?");
        titulo.setBounds(new Rectangle(130,20,150,20));
        JButton button1=new JButton("Magnitudes");
        JButton button2=new JButton("Monedas");
        f.getContentPane().add(titulo);
        f.getContentPane().add(button1);
        button2.setBounds(80,60,100,40);
        f.getContentPane().add(button2);
        button1.setBounds(200,60,100,40);
        button1.addActionListener(s);
        button2.addActionListener(s);
        f.setResizable(false);
        f.setBounds(650,400,400,200);
        f.setLayout(null);
        f.show();
     }
    @Override
    public void actionPerformed(ActionEvent e) {
        String s=e.getActionCommand();
        if(s.equals("Magnitudes")){
            (new dialogMagnitude(this,true)).setVisible(true);

        } else if(s.equals("Monedas")){
            (new dialogCurrency(this,true)).setVisible(true);

        }
    }
}
