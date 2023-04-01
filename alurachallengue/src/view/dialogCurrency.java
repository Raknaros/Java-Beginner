package view;

import models.scrapCurrency;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dialogCurrency extends JDialog{
    public dialogCurrency(java.awt.Frame parent,boolean modal){
        super(parent,modal);
        setBounds(730,400,250,350);
        setTitle("Monedas");
        JLabel titulo=new JLabel("Quiero convertir...");
        JTextField input=new JTextField("cantidad",JTextField.CENTER);
        JComboBox combo1=new JComboBox();
        scrapCurrency lista=new scrapCurrency();
        combo1.setModel();
        JLabel conector=new JLabel("a");
        JComboBox combo2=new JComboBox();
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
        add(input);
        add(titulo);
        add(salida);
        setLayout(null);
        setResizable(false);
    }







}
