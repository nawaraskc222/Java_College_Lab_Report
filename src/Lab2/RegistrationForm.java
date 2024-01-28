package Lab2;


///question 6
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Registration Form");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel for the form
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(8, 2, 10, 10));

        // Add components to the form
        formPanel.add(new JLabel("Username:"));
        JTextField usernameField = new JTextField();
        formPanel.add(usernameField);

        formPanel.add(new JLabel("Password:"));
        JPasswordField passwordField = new JPasswordField();
        formPanel.add(passwordField);

        formPanel.add(new JLabel("Gender:"));
        JRadioButton maleRadioButton = new JRadioButton("Male");
        JRadioButton femaleRadioButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
        formPanel.add(genderPanel);

        formPanel.add(new JLabel("Interests:"));
        JCheckBox javaCheckBox = new JCheckBox("Java");
        JCheckBox pythonCheckBox = new JCheckBox("Python");
        JPanel interestsPanel = new JPanel();
        interestsPanel.add(javaCheckBox);
        interestsPanel.add(pythonCheckBox);
        formPanel.add(interestsPanel);

        formPanel.add(new JLabel("Country:"));
        String[] countries = {"Select", "USA", "Canada", "UK", "Australia"};
        JComboBox<String> countryComboBox = new JComboBox<>(countries);
        formPanel.add(countryComboBox);

        formPanel.add(new JLabel("Profile Picture:"));
        ImageIcon defaultImage = new ImageIcon("default_profile.png"); // Provide a path to your image
        JLabel imageLabel = new JLabel(defaultImage);
        formPanel.add(imageLabel);

        formPanel.add(new JLabel("About Me:"));
        JTextArea aboutMeTextArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(aboutMeTextArea);
        formPanel.add(scrollPane);

        // Create a button to submit the form
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // You can handle form submission logic here
                JOptionPane.showMessageDialog(frame, "Form submitted successfully!");
            }
        });

        // Add the form panel and submit button to the main frame
        frame.setLayout(new BorderLayout());
        frame.add(formPanel, BorderLayout.CENTER);
        frame.add(submitButton, BorderLayout.SOUTH);

        // Set frame visibility
        frame.setVisible(true);
    }
}


