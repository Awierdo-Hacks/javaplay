package oefz2;

import javax.swing.*;

public class Calculator {
    private JTextField number1=new JTextField();
    private JTextField number2=new JTextField();
    private JTextField result=new JTextField();
    private JButton sum=new JButton("+");
    private JButton difference=new JButton("-");
    private JButton product=new JButton("*");
    private JButton division=new JButton("/");
    private JButton swap1=new JButton("sw1");
    private JButton swap2=new JButton("sw2");
    private JButton swap12=new JButton("sw12");
    private JFrame frame=new JFrame();

    @FunctionalInterface
    interface EvaluateInterface {
        double evaluate(double n1, double n2);
    }

    void calculate(EvaluateInterface evaluator) {
        double op1 = Double.parseDouble(number1.getText());
        double op2 = Double.parseDouble(number2.getText());
        double res = evaluator.evaluate( op1, op2);
        result.setText(String.valueOf(res));
    }

    public Calculator() {
        number1.setHorizontalAlignment(SwingConstants.RIGHT);
        number2.setHorizontalAlignment(SwingConstants.RIGHT);
        result.setHorizontalAlignment(SwingConstants.RIGHT);
        result.setEditable(false);
        // lambda expression implementing here
        sum.addActionListener(e -> {
            result.setText(String.valueOf(Double.parseDouble(number1.getText()) +
                                          Double.parseDouble(number2.getText())));
            System.out.println(e);
        });
        difference.addActionListener(e -> { calculate( (n1, n2) -> n1 - n2 ); });
        product.addActionListener(e -> { calculate( (n1, n2) -> n1 * n2 ); });
        division.addActionListener(e -> {calculate((n1,n2)-> n1/n2  );});
        swap1.addActionListener(e -> number1.setText(result.getText()));
        swap2.addActionListener(e -> number2.setText(result.getText()));
        swap12.addActionListener(e -> {String temp = number1.getText();number1.setText(number2.getText());number2.setText(temp);
        });

        frame.add(number1).setBounds(90, 20,130,20);
        frame.add(new JLabel("number 1")).setBounds(20,20,70,20);
        frame.add(number2).setBounds(90, 50,130,20);
        frame.add(new JLabel("number 2")).setBounds(20,50,70,20);
        frame.add(result).setBounds(90, 80,130,20);
        frame.add(new JLabel("result")).setBounds(20,80,70,20);
        frame.add(sum).setBounds(20,125,50,20);
        frame.add(difference).setBounds(90,125,50,20);
        frame.add(product).setBounds(160,125,50,20);
        frame.add(division).setBounds(230,125,50,20);
        frame.add(swap1).setBounds(230,20,70,20);
        frame.add(swap2).setBounds(230,50,70,20);
        frame.add(swap12).setBounds(230,80,70,20);
        frame.setTitle("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(370, 200);
        frame.setLocation(100, 100);
        frame.setVisible(true);
    }
}

