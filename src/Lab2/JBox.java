package Lab2;

//question  8	
import javax.swing.JOptionPane;
public class JBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Welcome to my page");		
		String name=JOptionPane.showInputDialog(null, "What's your name!!");
		
		String age=JOptionPane.showInputDialog(null, "What's your age!!");
		int real_age= Integer.parseInt(age);		
		
		JOptionPane.showMessageDialog(null, "Hi,"+real_age+"years old "+name);		
		int choice=JOptionPane.showConfirmDialog(null, "Do you like cakes? "+name);
//		System.out.println(choice);		
		if(choice==JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Thank you !!");
		}else if(choice==JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Im sad!!");
		}
		else if(choice==JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "You can try again");
		}		
							
	}
}
