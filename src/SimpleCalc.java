import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleCalc {
	
	public JFrame frame;
    public JTextField textField;
    public JTextField textField_1;
    public JLabel resultLabel;
    public JLabel lblNewLabel_2;
    public JLabel lblNewLabel_3;

    public  double num1, num2, result;

    public char op;
    private JTextField textField_2;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SimpleCalc window = new SimpleCalc();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public SimpleCalc() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 401, 208);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        textField = new JTextField();
        textField.setBounds(216, 10, 133, 19);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(216, 50, 133, 19);
        frame.getContentPane().add(textField_1);
        textField_1.setColumns(10);

        JLabel lblNewLabel = new JLabel("Enter value: ");
        lblNewLabel.setBounds(32, 13, 100, 13);
        frame.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Enter value: ");
        lblNewLabel_1.setBounds(32, 53, 100, 13);
        frame.getContentPane().add(lblNewLabel_1);

         lblNewLabel_2 = new JLabel("Result: ");
        lblNewLabel_2.setBounds(37, 130, 95, 13);
        frame.getContentPane().add(lblNewLabel_2);

        resultLabel = new JLabel("");
        resultLabel.setBounds(154, 130, 133, 13);
        frame.getContentPane().add(resultLabel);

        JButton btnNewButton = new JButton("Action");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performAction();
            }
        });
        btnNewButton.setBounds(154, 126, 85, 21);
        frame.getContentPane().add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Reset");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reset();
            }
        });
        btnNewButton_1.setBounds(292, 126, 85, 21);
        frame.getContentPane().add(btnNewButton_1);
        
         lblNewLabel_3 = new JLabel("Enter operator\n"+"+,-,*,/");
        lblNewLabel_3.setBounds(32, 86, 150, 13);
        frame.getContentPane().add(lblNewLabel_3);
        
        textField_2 = new JTextField();
        textField_2.setBounds(216, 79, 133, 19);
        frame.getContentPane().add(textField_2);
        textField_2.setColumns(10);
    }

    private void performAction() {
    	String a= textField_2.getText();
    	 op=a.charAt(0);
    	
    	try {
        	
        	
            num1 = Double.parseDouble(textField.getText());
            num2 = Double.parseDouble(textField_1.getText());

            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                    	lblNewLabel_2.setText("Error");
                        return;
                    }
                    break;
            }
            
            lblNewLabel_2.setText("Result:"+result );
           
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input");
        }
    }

    private void reset() {
        textField.setText("");
        textField_1.setText("");
        lblNewLabel_2.setText("Result: ");
        textField_2.setText("");
        num1 = 0;
        num2 = 0;
        result = 0;
        op = '\0';
    }
}
