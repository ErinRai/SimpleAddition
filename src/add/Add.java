/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package add;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Erin
 */
public class Add extends JFrame implements ActionListener{
    JLabel num1, num2, result;
    JTextField f1, f2, f3;
    JButton add, clear;
    
    
    public Add(){
        Container c = getContentPane();
        num1 = new JLabel("num1");
        num2 = new JLabel("num2");
        result= new JLabel("result");
        f1 = new JTextField();
        f2 = new JTextField();
        f3 = new JTextField();
        add = new JButton("Add");
        clear = new JButton("Clear");
        c.add(num1);
        c.add(num2);
        c.add(result);
        
        num1.setBounds(20, 20, 100, 30);
        num2.setBounds(20, 70, 100, 30);
        result.setBounds(20, 120, 100, 30);
        c.add(f1);
        c.add(f2);
        c.add(f3);
        
        f1.setBounds(140, 20, 100, 30);
        f2.setBounds(140, 70, 100, 30);
        f3.setBounds(140, 120, 100, 30);
        f3.setEditable(false);
        c.add(add);
        c.add(clear);
        
        add.setBounds(60, 180, 70, 30);
        clear.setBounds(150, 180, 70, 30);
        add.addActionListener(this);
        clear.addActionListener(this);
        
        setLayout(null);
        setVisible(true);
        setSize(300, 300);
        setDefaultCloseOperation(3);
        
    }
      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        new Add();
         System.out.print(JFrame.EXIT_ON_CLOSE);
        
    }  

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == clear)
        {
            f1.setText("");
            f2.setText("");
            f3.setText("");
        }
        if(ae.getSource() == add)
        {
            String s = f1.getText();
            int i = Integer.parseInt(s);
            int j = Integer.parseInt(f2.getText());
            f3.setText((i+j)+"");
        }
            
    }
}
