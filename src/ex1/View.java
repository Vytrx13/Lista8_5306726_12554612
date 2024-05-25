package ex1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class View {
    private JFrame frame;
    private JTextField inputField;
    private JLabel resultLabel;
    private JButton calculateButton;
    

    public View() {
        frame = new JFrame("Fatorial Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null);

        JLabel inputLabel = new JLabel("Enter a number:");
        inputLabel.setBounds(10, 20, 100, 25);
        frame.add(inputLabel);

        inputField = new JTextField();
        inputField.setBounds(120, 20, 150, 25);
        frame.add(inputField);

        calculateButton = new JButton("Calculate");
        calculateButton.setBounds(90, 60, 100, 25);
        frame.add(calculateButton);

        resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(10, 100, 260, 25);
        frame.add(resultLabel);

        frame.setVisible(true);

        // Adding action listener to the button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateFactorial();
            }
        });
    }

    private void calculateFactorial() {
        try {
            int input = Integer.parseInt(inputField.getText());
            BigDecimal n = BigDecimal.valueOf(input);
            BigDecimal result = Controller.factorial(n);

            if (result.equals(BigDecimal.valueOf(-1))) {
                resultLabel.setText("Enter a non-negative integer.");
            } else if (n.compareTo(BigDecimal.valueOf(20)) > 0 || result.compareTo(BigDecimal.ZERO) < 0) { 
                resultLabel.setText("Result: Overflow occurred.");
            } else {
                resultLabel.setText("Result: " + result);
            }
        } catch (NumberFormatException e) {
            resultLabel.setText("Please enter a valid integer.");
        }
    }
    
    public JTextField getNumberInput() {
    	return inputField;
    }
    
    public JButton getButton() {
    	return calculateButton;
    }
    
    public static void main(String[] args) {
        // Create the GUI on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new View();
            }
        });
    }
}
