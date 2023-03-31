package view;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dialogMagnitude extends JDialog {
    public dialogMagnitude(java.awt.Frame parent,boolean modal){
        super(parent,modal);
        setBounds(730,400,250,350);
        setTitle("Magnitudes");
        JLabel titulo=new JLabel("Quiero convertir...");
        JTextField input=new JTextField("cantidad",JTextField.CENTER);
        String lmags[]={"Kilómetros","Millas","Centrígrados","Fahrenheit","Horas"};
        JComboBox combo1=new JComboBox(lmags);
        JLabel conector=new JLabel("a");
        JComboBox combo2=new JComboBox(lmags);
        JButton convertir=new JButton("Convertir");
        JLabel salida=new JLabel("",SwingConstants.CENTER);
        convertir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salida.setText("Funcionando");
            }
        });
        input.setBounds(80,50,80,20);
        titulo.setBounds(70,20,130,20);
        combo1.setBounds(60,90,120,20);
        conector.setBounds(115,125,20,20);
        combo2.setBounds(60,155,120,20);
        convertir.setBounds(70,200,100,20);
        salida.setBounds(70,250,100,20);
        add(combo1);
        add(conector);
        add(combo2);
        add(convertir);
        add(salida);
        add(input);
        add(titulo);
        setLayout(null);
        setResizable(false);
    }
    //private void runActionPerformed(java.awt.event.ActionEvent run){
    //    String s=run.getActionCommand();;
    //}

}
