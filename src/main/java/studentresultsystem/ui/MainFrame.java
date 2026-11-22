
package studentresultsystem.ui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import studentresultsystem.model.Student;
import studentresultsystem.model.Result;
import studentresultsystem.service.ResultService;
import studentresultsystem.exception.InvalidMarksException;
import studentresultsystem.exception.InvalidStudentDataException;

public class MainFrame extends JFrame {

    private JTextField nameField;
    private JTextField rollField;
    private JTextField subjectField;
    private JTextField marksField;

    private JButton addButton;
    private JButton calculateButton;

    private JLabel resultLabel;

    private ArrayList<String> subjects = new ArrayList<>();
    private ArrayList<Integer> marks = new ArrayList<>();

    private ResultService service = new ResultService();

    public MainFrame() {

        setTitle("Student Result Processing System");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Student details
        panel.add(new JLabel("Student Name:"));
        nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("Roll Number:"));
        rollField = new JTextField();
        panel.add(rollField);

        // Subject details
        panel.add(new JLabel("Subject Name:"));
        subjectField = new JTextField();
        panel.add(subjectField);

        panel.add(new JLabel("Marks (0-100):"));
        marksField = new JTextField();
        panel.add(marksField);

        // Add subject button
        addButton = new JButton("Add Subject");
        panel.add(addButton);

        JLabel emptyLabel = new JLabel();
        panel.add(emptyLabel);

        // Calculate result button
        calculateButton = new JButton("Calculate Result");
        panel.add(calculateButton);

        resultLabel = new JLabel("Add subjects and marks to begin.");
        panel.add(resultLabel);

        add(panel);

        // Add subject action
        addButton.addActionListener(e -> {

            try {
                String subject = subjectField.getText().trim();
                String marksText = marksField.getText().trim();

                if (subject.isEmpty() || marksText.isEmpty()) {
                    throw new IllegalArgumentException("Enter subject and marks");
                }

                int mark = Integer.parseInt(marksText);

                if (mark < 0 || mark > 100) {
                    throw new InvalidMarksException(
                        "Marks must be between 0 and 100"
                    );
                }

                subjects.add(subject);
                marks.add(mark);

                JOptionPane.showMessageDialog(
                    this,
                    subject + " added successfully!"
                );

                subjectField.setText("");
                marksField.setText("");

            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(
                    this,
                    "Marks must be a valid number"
                );

            } catch (InvalidMarksException | IllegalArgumentException ex) {

                JOptionPane.showMessageDialog(
                    this,
                    ex.getMessage()
                );
            }
        });

        // Calculate result action
        calculateButton.addActionListener(e -> {

            try {
                String name = nameField.getText().trim();
                String roll = rollField.getText().trim();

                if (name.isEmpty() || roll.isEmpty()) {
                    throw new IllegalArgumentException(
                        "Enter student name and roll number"
                    );
                }

                Student student = new Student(
                    name, roll, marks, subjects
                );

                Result result = service.calculateResult(student);

                resultLabel.setText(
                    "<html>Total: " + result.getTotalMarks()
                    + "<br>Percentage: " + result.getPercentage()
                    + "%<br>Grade: " + result.getGrade()
                    + "<br>Status: "
                    + (result.isPass() ? "PASS" : "FAIL")
                    + "</html>"
                );

            } catch (InvalidMarksException |
                     InvalidStudentDataException |
                     IllegalArgumentException ex) {

                JOptionPane.showMessageDialog(
                    this,
                    ex.getMessage(),
                    "Input Error",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        });
    }
}
