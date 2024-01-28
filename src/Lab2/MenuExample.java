package Lab2;
////question 9
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuExample {
    public MenuExample() {
        JFrame frame = new JFrame("PopupMenu Example");

        // Create a popup menu
        JPopupMenu popupMenu = new JPopupMenu("Edit");

        // Create menu items
        JMenuItem cut = new JMenuItem("Cut");
        cut.setActionCommand("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        copy.setActionCommand("Copy");
        JMenuItem paste = new JMenuItem("Paste");
        paste.setActionCommand("Paste");

        // Add menu items to the popup menu
        popupMenu.add(cut);
        popupMenu.add(copy);
        popupMenu.add(paste);

        // Add action listeners to menu items
        cut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Cut action performed");
            }
        });

        copy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Copy action performed");
            }
        });

        paste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Paste action performed");
            }
        });

        // Add a dummy component to the frame to trigger the popup menu
        JButton dummyButton = new JButton("Right-click here");
        dummyButton.setComponentPopupMenu(popupMenu);

        // Use a layout manager (FlowLayout in this case)
        frame.setLayout(new FlowLayout());
        frame.add(dummyButton);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> new MenuExample());
    }
}
