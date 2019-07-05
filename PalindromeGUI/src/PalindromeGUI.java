import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class PalindromeGUI implements ActionListener {

		JTextField tf1,tf2;  
	    JButton b;
	    
	    
	    PalindromeGUI(){
	    	JFrame f=new JFrame("Palindrome Checker");
	    	f.setSize(400, 400);
	    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	tf1= new JTextField("Enter String",30);
	    	
	    	tf2= new JTextField("Is it Palindrome or not ? ",30);
	    	tf2.setEditable(false);
	    	b=new JButton("OK");
	    	b.addActionListener(this);
	    	f.add(tf1);
	    	f.add(b);
	    	
	    	
	    	f.add(tf2);
	    	f.setLayout(new FlowLayout());
	    	
	    	f.setVisible(true);
	    }
	public void actionPerformed(ActionEvent e) {
		 StringBuilder s1= new StringBuilder(tf1.getText());
		s1.reverse();
		 
		if(tf1.getText().equals(s1.toString()))
		 	{tf2.setText("True");}
		else
		 	{tf2.setText("False");}
		 		

	}

	public static void main(String[] args) {
		
		new PalindromeGUI();
	}

}
