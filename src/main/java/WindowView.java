import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by HP on 2017-10-18.
 */
public class WindowView extends JFrame {
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a0Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton minusButton;
    private JButton a8Button;
    private JButton a9Button;
    private JButton plusButton;
    private JButton a2Button;
    private JButton a3Button;
    private JButton multiplyButton;
    private JButton aDotButton;
    private JButton resultButton;
    private JButton divideButton;
    private JPanel textFieldPanel;
    private JPanel mainPanel;
    private JPanel inputValuesPanel;
    private JTextField textField;
    private JTextField resultTextField;
    private JButton deleteButton;


    public WindowView() {
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 1000);
        pack();
        setLocationRelativeTo(null);


        plusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = "+";
                textField.setText(textField.getText() + "" + text);
            }
        });
        minusButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = "-";
                textField.setText(textField.getText() + "" + text);
            }
        });
        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = "*";
                textField.setText(textField.getText() + "" + text);
            }
        });
        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = "/";
                textField.setText(textField.getText() + "" + text);
            }
        });


        resultButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(textField.getText());
                String textFieldInput = textField.getText();
                String[] result = textFieldInput.split("[" + Pattern.quote("+-*/") + "]");
                double firstNumber = Double.parseDouble(result[0]);
                double secondNumber = Double.parseDouble(result[1]);

                if (textField.getText().contains("+")) {
                    String resultPlus = new Double(firstNumber + secondNumber).toString();
                    resultTextField.setText(resultPlus);
                } else if (textField.getText().contains("-")) {
                    String resultMinus = new Double(firstNumber - secondNumber).toString();
                    resultTextField.setText(resultMinus);
                } else if (textField.getText().contains("*")) {
                    String resultMultiply = new Double(firstNumber * secondNumber).toString();
                    resultTextField.setText(resultMultiply);
                } else if (textField.getText().contains("/")) {
                    String divideResult = new Double(firstNumber / secondNumber).toString();
                    if (secondNumber == 0) {
                        textField.setText("Error! Don't divide by 0!");
                    } else {
                        resultTextField.setText(divideResult);
                    }
                }
            }
        });


        a1Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText() + a1Button.getText();
                textField.setText(text);
            }
        });
        a0Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText() + a0Button.getText();
                textField.setText(text);
            }
        });
        a5Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText() + a5Button.getText();
                textField.setText(text);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText() + a6Button.getText();
                textField.setText(text);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText() + a8Button.getText();
                textField.setText(text);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText() + a9Button.getText();
                textField.setText(text);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText() + a2Button.getText();
                textField.setText(text);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText() + a7Button.getText();
                textField.setText(text);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText() + a3Button.getText();
                textField.setText(text);
            }
        });

        a4Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText() + a4Button.getText();
                textField.setText(text);
            }
        });

        aDotButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText() + aDotButton.getText();
                textField.setText(text);
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = "";
                textField.setText(text);
                resultTextField.setText(text);
            }
        });
    }
}
