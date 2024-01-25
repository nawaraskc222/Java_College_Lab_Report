package Lab3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Question2 {
	 JFrame frame;
	JTextField textField;
	JTextField textField_1;
	JButton btn1;
	JLabel lblNewLabel_2 ;	  	
	public Question2(){		
	frame = new JFrame();
	frame.setBounds(100, 100,500, 500);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	
	JLabel lblNewLabel = new JLabel("Enter number:");
	lblNewLabel.setBounds(36, 98, 110, 20);
	frame.getContentPane().add(lblNewLabel);
	
	JLabel lblNewLabel_1 = new JLabel("Enter number:");
	lblNewLabel_1.setBounds(36, 146, 110, 20);
	frame.getContentPane().add(lblNewLabel_1);
	
	textField = new JTextField();
	textField.setBounds(167, 99, 207, 19);
	frame.getContentPane().add(textField);
	textField.setColumns(10);
	
	textField_1 = new JTextField();
	textField_1.setBounds(167, 147, 207, 19);
	frame.getContentPane().add(textField_1);
	textField_1.setColumns(10);
	
	btn1 = new JButton("Add");
	btn1.setBounds(152, 210, 115, 21);
	frame.getContentPane().add(btn1);
	btn1.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			int a = Integer.parseInt(textField.getText());
			int b = Integer.parseInt(textField_1.getText());
			int c= a+b;
			System.out.println(c);
			lblNewLabel_2.setText("Result: "+c+" And Added to DB");			
			
			 String URL = "jdbc:mysql://localhost:3306/Adddb";
			     String USER = "root";
			     String PASSWORD = "rootpassword";

			  try {				  
				  Class.forName("com.mysql.cj.jdbc.Driver");
				  String insertQuery = "INSERT INTO Addtable (sum) VALUES (?)";
			      Connection con = DriverManager.getConnection(URL,USER,PASSWORD);      
			          
			            PreparedStatement preparedStatement= con.prepareStatement(insertQuery);			            
			            
			            preparedStatement.setInt(1, c);//			               
			                int rowsAffected1 = preparedStatement.executeUpdate();
			                System.out.println(rowsAffected1 + " record(s) inserted");
			            
			  }catch(Exception e1) {
				  System.out.println(e1.getMessage());
			  }    }
		
				
	});
	lblNewLabel_2= new JLabel("Result:");
	lblNewLabel_2.setBounds(36, 176, 200, 20);

	
	
	frame.getContentPane().add(lblNewLabel_2);
	frame.setVisible(true);
	}

	public static void main(String[] args) {
	
		new Question2();
	}


}
