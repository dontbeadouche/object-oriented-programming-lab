import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class CalculatorGUI implements ActionListener {
	JTextField tf1,tf2,tf3;  
    JButton b;

    CalculatorGUI(){
    	JFrame f=new JFrame("Calculator");
    	f.setSize(400, 400);
    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	tf1= new JTextField("Enter integer 1",15);
    	tf2= new JTextField("Enter integer 2",15);
    	tf3= new JTextField(30);
    	
    	b=new JButton("OK");
    	b.addActionListener(this);
    
    	f.add(tf1);
    	f.add(tf2);
    	f.add(b);
    	f.add(tf3);
    	f.setLayout(new FlowLayout(FlowLayout.CENTER));
    	
    	f.setVisible(true);
    	
    }
	
	public void actionPerformed(ActionEvent e) {
		String s1=tf1.getText();  
        String s2=tf2.getText();  
        int a=Integer.parseInt(s1);  
        int b=Integer.parseInt(s2);  
        tf3.setText(" sum = "+(a+b)+" diff = "+(a-b)+" prod = "+(a*b)+" div = "+(a/b));

	}
public static void main(String[] args) {
		
		new CalculatorGUI();
	}
}
