import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Calculator extends JFrame {
    JButton one, two, three, four, five, six, seven, eight, nine,
            zero, add, sub, mul, equals, div, mod, clear, back;
    JTextField text;
    String _text = "1051";
    String operation;
    SmallInteger num1;
    boolean IsFirst = true, IsClear = true;

    public Calculator() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 350);
        this.setLocationRelativeTo(null);
        //this.setResizable(false);
        this.setTitle("Calculator");
        ActionListener listener = new CalcListener();

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        GridBagConstraints gridConstraints = new GridBagConstraints();

        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        gridConstraints.gridwidth = 1;
        gridConstraints.gridheight = 1;
        gridConstraints.weightx = 50;
        gridConstraints.weighty = 100;
        gridConstraints.insets = new Insets(5, 5, 5, 5);
        gridConstraints.anchor = GridBagConstraints.CENTER;
        gridConstraints.fill = GridBagConstraints.BOTH;

        //ButtonsPanel.setLayout(null);
        panel.setBorder(new EmptyBorder(15, 15, 15, 15));
        one = new JButton("1");
        one.setActionCommand("1");
        one.addActionListener(listener);
        two = new JButton("2");
        two.setActionCommand("2");
        two.addActionListener(listener);
        three = new JButton("3");
        three.setActionCommand("3");
        three.addActionListener(listener);
        four = new JButton("4");
        four.setActionCommand("4");
        four.addActionListener(listener);
        five = new JButton("5");
        five.setActionCommand("5");
        five.addActionListener(listener);
        six = new JButton("6");
        six.setActionCommand("6");
        six.addActionListener(listener);
        seven = new JButton("7");
        seven.setActionCommand("7");
        seven.addActionListener(listener);
        eight = new JButton("8");
        eight.setActionCommand("8");
        eight.addActionListener(listener);
        nine = new JButton("9");
        nine.setActionCommand("9");
        nine.addActionListener(listener);
        zero = new JButton("0");
        zero.setActionCommand("0");
        zero.addActionListener(listener);

        equals = new JButton("=");
        equals.setActionCommand("=");
        equals.addActionListener(listener);
        add = new JButton("+");
        add.setActionCommand("+");
        add.addActionListener(listener);
        sub = new JButton("-");
        sub.setActionCommand("-");
        sub.addActionListener(listener);
        mul = new JButton("*");
        mul.setActionCommand("*");
        mul.addActionListener(listener);
        div = new JButton("/");
        div.setActionCommand("/");
        div.addActionListener(listener);
        mod = new JButton("%");
        mod.setActionCommand("%");
        mod.addActionListener(listener);
        clear = new JButton("C");
        clear.setActionCommand("C");
        clear.addActionListener(listener);
        back = new JButton("<-");
        back.setActionCommand("back");
        back.addActionListener(listener);




        text = new JTextField("0");
        text.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9'))) {
                    e.consume();  // игнорим введенные буквы и пробел
                }
            }
        });
        text.setActionCommand("write");
        text.addActionListener(listener);
        Font font = new Font("Helvetica", Font.PLAIN, 18);
        text.setFont(font);




        gridConstraints.gridx = 0;
        gridConstraints.gridwidth = 2;
        panel.add(text, gridConstraints);
        gridConstraints.gridwidth = 1;
        gridConstraints.gridx = 2;
        panel.add(back, gridConstraints);
        gridConstraints.gridy = 1;
        gridConstraints.gridx = 0;
        panel.add(one, gridConstraints);
        gridConstraints.gridx = 1;
        panel.add(two, gridConstraints);
        gridConstraints.gridx = 2;
        panel.add(three, gridConstraints);
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 2;
        panel.add(four, gridConstraints);
        gridConstraints.gridx = 1;
        panel.add(five, gridConstraints);
        gridConstraints.gridx = 2;
        panel.add(six, gridConstraints);
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 3;
        panel.add(seven, gridConstraints);
        gridConstraints.gridx = 1;
        panel.add(eight, gridConstraints);
        gridConstraints.gridx = 2;
        panel.add(nine, gridConstraints);
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 4;
        panel.add(zero, gridConstraints);
        gridConstraints.gridx = 1;

        panel.add(equals, gridConstraints);
        gridConstraints.gridx = 2;
        panel.add(add, gridConstraints);
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 5;
        panel.add(sub, gridConstraints);
        gridConstraints.gridx = 1;
        panel.add(mul, gridConstraints);
        gridConstraints.gridx = 2;
        panel.add(div, gridConstraints);
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 6;
        panel.add(mod, gridConstraints);
        gridConstraints.gridx = 1;
        panel.add(clear, gridConstraints);

        this.setVisible(true);
        this.getContentPane().add(panel);

    }

    private class CalcListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            int num; SmallInteger num2;
            switch (command) {
                case "1":
                    text.setText(num("1", text.getText()));
                    break;
                case "2":
                    text.setText(num("2", text.getText()));
                    break;
                case "3":
                    text.setText(num("3", text.getText()));
                    break;
                case "4":
                    text.setText(num("4", text.getText()));
                    break;
                case "5":
                    text.setText(num("5", text.getText()));
                    break;
                case "6":
                    text.setText(num("6", text.getText()));
                    break;
                case "7":
                    text.setText(num("7", text.getText()));
                    break;
                case "8":
                    text.setText(num("8", text.getText()));
                    break;
                case "9":
                    text.setText(num("9", text.getText()));
                    break;
                case "0":
                    text.setText(num("0", text.getText()));
                    break;
                case "C":
                    text.setText("0");
                    IsFirst = true;
                    break;
                case "+":
                    num = Integer.parseInt(text.getText());
                    if (IsFirst) {
                        try {
                            num1 = new SmallInteger(num);
                            //text.setText("0");
                            operation = "+";
                            IsFirst = false;
                            IsClear = false;
                        } catch (MyException err) {
                            JOptionPane.showMessageDialog(add, err.getMessage());
                        }
                    } else {
                        try {
                            num2 = new SmallInteger(num);
                            num1 = ChooseOperation(operation, num1, num2);
                            operation = "+";
                            text.setText(String.valueOf(num1.GetValue()));
                            IsClear = false;
                        } catch (MyException err) {
                            JOptionPane.showMessageDialog(add, err.getMessage());
                        }
                    }
                    break;
                case "-":
                    num = Integer.parseInt(text.getText());
                    if (IsFirst) {
                        try {
                            num1 = new SmallInteger(num);
                            //text.setText("0");
                            operation = "-";
                            IsFirst = false;
                            IsClear = false;
                        } catch (MyException err) {
                            JOptionPane.showMessageDialog(add, err.getMessage());
                        }
                    } else {
                        try {
                            num2 = new SmallInteger(num);
                            num1 = ChooseOperation(operation, num1, num2);
                            operation = "-";
                            text.setText(String.valueOf(num1.GetValue()));
                            IsClear = false;
                        } catch (MyException err) {
                            JOptionPane.showMessageDialog(add, err.getMessage());
                        }
                    }
                    break;
                case "*":
                    num = Integer.parseInt(text.getText());
                    if (IsFirst) {
                        try {
                            num1 = new SmallInteger(num);
                            //text.setText("0");
                            operation = "*";
                            IsFirst = false;
                            IsClear = false;
                        } catch (MyException err) {
                            JOptionPane.showMessageDialog(add, err.getMessage());
                        }
                    } else {
                        try {
                            num2 = new SmallInteger(num);
                            num1 = ChooseOperation(operation, num1, num2);
                            operation = "*";
                            text.setText(String.valueOf(num1.GetValue()));
                            IsClear = false;
                        } catch (MyException err) {
                            JOptionPane.showMessageDialog(add, err.getMessage());
                        }
                    }
                    break;
                case "/":
                    operation = DoOperation("/", operation);
                    break;
                case "%":
                    operation = DoOperation("%", operation);
                    break;
                case "=":
                    num = Integer.parseInt(text.getText());
                    try{
                        num2 = new SmallInteger(num);
                        num1 = ChooseOperation(operation, num1, num2);
                        operation = "=";
                        text.setText(String.valueOf(num1.GetValue()));
                        IsClear = false;
                        IsFirst = true;
                    } catch (MyException err){
                        JOptionPane.showMessageDialog(add, err.getMessage());
                    }
                    break;
                case "back":
                    if (!text.getText().isEmpty()) {
                        String s;
                        s = text.getText().substring(0, text.getText().length() - 1);
                        text.setText(s);
                    }
                    break;
                default:
                    //text.setText("sdfa");
                    break;
            }
        }
    }

    public String num(String s1, String s2) {
        String result;
        if (IsClear) {
            if (s2.equals("0")) {
                result = s1;
            } else {
                result = s2 + s1;
            }
        } else {
            result = s1;
            IsClear = true;
        }
        return result;
    }

    public SmallInteger ChooseOperation(String operation, SmallInteger n1, SmallInteger n2) {
        SmallInteger result;
        switch (operation) {
            case "+":
                try {
                    result = n1.add(n2);
                } catch (MyException err) {
                    result = n1;
                    JOptionPane.showMessageDialog(add, err.getMessage());
                }
                break;
            case "-":
                try {
                    result = n1.sub(n2);
                } catch (MyException err) {
                    result = n1;
                    JOptionPane.showMessageDialog(add, err.getMessage());
                }
                break;
            case "*":
                try {
                    result = n1.mul(n2);
                } catch (MyException err) {
                    result = n1;
                    JOptionPane.showMessageDialog(add, err.getMessage());
                }
                break;
            case "/":
                try {
                    result = n1.div(n2);
                } catch (MyException err) {
                    result = n1;
                    JOptionPane.showMessageDialog(add, err.getMessage());
                }
                break;
            case "%":
                try {
                    result = n1.mod(n2);
                } catch (MyException err) {
                    result = n1;
                    JOptionPane.showMessageDialog(add, err.getMessage());
                }
                break;
            default:
                result = n1;
                break;
        }
        return result;
    }

    public String DoOperation (String new_operation, String old_operation){

        int num = Integer.parseInt(text.getText());
        SmallInteger num2;
        String operat;
        if (IsFirst) {
            try {
                num1 = new SmallInteger(num);
                //text.setText("0");
                operat = new_operation;
                IsFirst = false;
                IsClear = false;
            } catch (MyException err) {
                JOptionPane.showMessageDialog(add, err.getMessage());
                operat = old_operation;
            }
        } else {
            try {
                num2 = new SmallInteger(num);
                num1 = ChooseOperation(old_operation, num1, num2);
                operat = new_operation;
                text.setText(String.valueOf(num1.GetValue()));
                IsClear = false;
            } catch (MyException err) {
                JOptionPane.showMessageDialog(add, err.getMessage());
                operat = old_operation;
            }
        }
        return operat;
    }



}


