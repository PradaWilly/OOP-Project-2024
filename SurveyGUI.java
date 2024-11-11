package surveyproject;

/**
 *
 * @author Ross P
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SurveyGUI {
    private Survey survey;
    private JFrame frame;
    private JTextField nameField;
    private JTextField ageField;
    private JTextField colorField;
    private JComboBox<String> programmingBox;

    public SurveyGUI() {
        survey = new Survey();
        frame = new JFrame("Survey Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(5, 2));

        // Create the GUI components
        nameField = new JTextField(15);
        ageField = new JTextField(15);
        colorField = new JTextField(15);
        programmingBox = new JComboBox<>(new String[]{"Yes", "No"});

        // Add components to the frame
        frame.add(new JLabel("What is your name?"));
        frame.add(nameField);
        
        frame.add(new JLabel("How long have you been recycling?"));
        frame.add(ageField);
        
        frame.add(new JLabel("What is your favorite color?"));
        frame.add(colorField);
        
        frame.add(new JLabel("Do you like programming?"));
        frame.add(programmingBox);
        
        JButton submitButton = new JButton("Submit");
        frame.add(new JLabel()); // Empty label to adjust layout
        frame.add(submitButton);

        // Action for submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitSurvey();
            }
        });
    }

    public void showGUI() {
        frame.setVisible(true);
    }

    private void submitSurvey() {
        // Gather input from the fields
        survey.getSurveyResult().setName(nameField.getText());
        survey.getSurveyResult().setAge(Integer.parseInt(ageField.getText()));
        survey.getSurveyResult().setFavoriteColor(colorField.getText());
        survey.getSurveyResult().setLikesProgramming((String) programmingBox.getSelectedItem());

        // Display results
        survey.getSurveyResult().displayResults();

        // Show a message dialog with survey results
        JOptionPane.showMessageDialog(frame,
                "Survey Results:\n" +
                        "Name: " + survey.getSurveyResult().getName() + "\n" +
                        "Age: " + survey.getSurveyResult().getAge() + "\n" +
                        "Favorite Color: " + survey.getSurveyResult().getFavoriteColor() + "\n" +
                        "Likes Programming: " + survey.getSurveyResult().getLikesProgramming(),
                "Survey Results",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
