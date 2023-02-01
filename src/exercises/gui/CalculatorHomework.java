package exercises.gui;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

// Dopĺniť tlačidlá s jednotlivými číslami a matematickými operátormi + - * / a =
// TODO Kalkulačka bude počítať 2 čísla po stlačení = Samozrejme medzi číslami zadáme správny operátor
public class CalculatorHomework {
    public static void main(String[] args) {
        /*
        try {
            UIManager.setLook.AndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
           } catch(Exception ignored) {
         */

        JFrame frame = new JFrame("Hello World JString"); // vytvoríme okno
        frame.setMinimumSize(new Dimension(400, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ked kliknem na X na okne (čiže vo frame) tak sa zatvorí štandardne

        // JFrame by mal obsahovať panel, teda container JPanel
        JPanel panel = new JPanel();
        panel.setLayout(null); // layout pre panel bude null, čiže prázdny

        frame.setContentPane(panel); // my daný panel pridáme do frame


        // JText
        JTextField textField = new JTextField();
        textField.setBounds(100, 20, 200, 30); // x, y, sirka, vyska
        // Right-justify the text
        textField.setHorizontalAlignment(JTextField.LEFT);
        panel.add(textField);



        // labelText
        JLabel labelText = new JLabel("Calculator"); // popisok
        labelText.setBounds(100,50,100,20); // x, y, sirka, vyska
        panel.add(labelText);



        // calculator all buttons
        // "C" button
        JButton btnC = new JButton("C"); // tlačidlo
        btnC.setBounds(100, 100, 48, 20); // x, y, sirka, vyska

        // "+/-" button
        JButton btnPlusMinus = new JButton("+/-"); // tlačidlo
        btnPlusMinus.setBounds(150, 100, 48, 20); // x, y, sirka, vyska

        // "%" button
        JButton btnPercent = new JButton("%"); // tlačidlo
        btnPercent.setBounds(200, 100, 48, 20); // x, y, sirka, vyska

        // "÷" button
        JButton btnDivide = new JButton("%"); // tlačidlo
        btnDivide.setBounds(250, 100, 48, 20); // x, y, sirka, vyska

        // "7" button
        JButton btnSeven = new JButton("7"); // tlačidlo
        btnSeven.setBounds(100, 122, 48, 20); // x, y, sirka, vyska

        // "8" button
        JButton btnEight = new JButton("8"); // tlačidlo
        btnEight.setBounds(150, 122, 48, 20); // x, y, sirka, vyska

        // "9" button
        JButton btnNine = new JButton("9"); // tlačidlo
        btnNine.setBounds(200, 122, 48, 20); // x, y, sirka, vyska

        // "X" button
        JButton btnMultiplication = new JButton("x"); // tlačidlo
        btnMultiplication.setBounds(250, 122, 48, 20); // x, y, sirka, vyska

        // "4" button
        JButton btnFour = new JButton("4"); // tlačidlo
        btnFour.setBounds(100, 144, 48, 20); // x, y, sirka, vyska

        // "5" button
        JButton btnFive = new JButton("5"); // tlačidlo
        btnFive.setBounds(150, 144, 48, 20); // x, y, sirka, vyska

        // "6" button
        JButton btnSix = new JButton("6"); // tlačidlo
        btnSix.setBounds(200, 144, 48, 20); // x, y, sirka, vyska

        // "-" button
        JButton btnMinus = new JButton("-"); // tlačidlo
        btnMinus.setBounds(250, 144, 48, 20); // x, y, sirka, vyska

        // "1" button
        JButton btnOne = new JButton("1"); // tlačidlo
        btnOne.setBounds(100, 166, 48, 20); // x, y, sirka, vyska

        // "2" button
        JButton btnTwo = new JButton("2"); // tlačidlo
        btnTwo.setBounds(150, 166, 48, 20); // x, y, sirka, vyska

        // "3" button
        JButton btnThree = new JButton("3"); // tlačidlo
        btnThree.setBounds(200, 166, 48, 20); // x, y, sirka, vyska

        // "+" button
        JButton btnPlus = new JButton("+"); // tlačidlo
        btnPlus.setBounds(250, 166, 48, 20); // x, y, sirka, vyska

        // "0" button
        JButton btnZero = new JButton("0"); // tlačidlo
        btnZero.setBounds(100, 188, 98, 20); // x, y, sirka, vyska

        // "," button
        JButton btnComa = new JButton(","); // tlačidlo
        btnComa.setBounds(200, 188, 48, 20); // x, y, sirka, vyska

        // "=" button
        JButton btnEquals = new JButton("="); // tlačidlo
        btnEquals.setBounds(250, 188, 48, 20); // x, y, sirka, vyska


        // calculator buttons onClick actions
        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // textField.setText(""); // "" reprezentuju prazdny retazec
                textField.setText("0");
            }
        });
        // show all buttons function
        panel.add(btnC);
        panel.add(btnPlusMinus);
        panel.add(btnPercent);
        panel.add(btnDivide);
        panel.add(btnSeven);
        panel.add(btnEight);
        panel.add(btnNine);
        panel.add(btnMultiplication);
        panel.add(btnFour);
        panel.add(btnFive);
        panel.add(btnSix);
        panel.add(btnMinus);
        panel.add(btnOne);
        panel.add(btnTwo);
        panel.add(btnThree);
        panel.add(btnPlus);
        panel.add(btnZero);
        panel.add(btnComa);
        panel.add(btnEquals);

        // button cancel
        JButton btnCancel = new JButton("Cancel");
        btnCancel.setBounds(195, 250, 100, 20); // x, y, sirka, vyska

        // button cancel onClick action
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
        });
        panel.add(btnCancel);




        // display it
        frame.pack();
        frame.setVisible(true);

    }
}
