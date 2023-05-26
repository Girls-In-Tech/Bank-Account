package UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AccountUI {

    JFrame Frame = new JFrame("window");
    JTextField pinField = new JTextField();
    JLabel Pin = new JLabel("Enter Pin");
    JButton loginButton = new JButton("Login");

    public void Account() {
        Frame.setSize(300, 300);
        Frame.setLayout(new GridLayout(3, 1));
        Frame.setVisible(true);

        Frame.add(Pin);
        Frame.add(pinField);
        Frame.add(loginButton);


        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float userPin = Float.parseFloat(pinField.getText());
                if (userPin == 5555) {
                    AccountTypeUI();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Pin,Try Again");
                }
            }
        });
    }

    JFrame Frame2 = new JFrame("window");


   JButton savingType = new JButton("savings ");
    JButton currentType = new JButton("current  ");

    public void AccountTypeUI() {
        Frame2.setSize(300, 300);
        Frame2.setLayout(new GridLayout(2, 1));
        Frame2.setVisible(true);


        Frame2.add(currentType);
        Frame2.add(savingType);


        currentType.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
CurrentUI();       }
        });

        savingType.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                savingUI();
            }
        });
    }

    JFrame Frame3 = new JFrame("window");

    JLabel Balance = new JLabel("Balance: 100000");
    JButton depositCurrent =new JButton("Deposit");
    JButton withdrawalCurrent = new JButton("withdraw");

    public void CurrentUI(){
        Frame3.setSize(300, 300);
        Frame3.setLayout(new GridLayout(3, 1));
        Frame3.setVisible(true);

        Frame3.add(Balance);
        Frame3.add(depositCurrent);
        Frame3.add(withdrawalCurrent);


        depositCurrent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depositCUI();
            }
        });

        withdrawalCurrent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                withdrawalCUI();
            }
        });
    }

    
    JFrame Frame4= new JFrame("window");

    JLabel BalanceC = new JLabel("Balance: 100000");
    JTextField depCurrent = new JTextField();
    JButton depositButton = new JButton("Deposit");

    public void depositCUI() {
        Frame4.setSize(300, 300);
        Frame4.setLayout(new GridLayout(3, 1));
        Frame4.setVisible(true);

        Frame4.add(BalanceC);
        Frame4.add(depCurrent);
        Frame4.add(depositButton);
        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           JOptionPane.showMessageDialog(null,"you deposited " +  depCurrent.getText());
            }
        });
    }

    JFrame Frame5= new JFrame("window");

    JLabel BalanceCW = new JLabel("Balance: 100000");
    JTextField withCurrent = new JTextField();
    JButton withdrawalButton = new JButton("Withdrawal");

    public void withdrawalCUI() {
        Frame5.setSize(300, 300);
        Frame5.setLayout(new GridLayout(3, 1));
        Frame5.setVisible(true);

        Frame5.add(BalanceCW);
        Frame5.add(withCurrent);
        Frame5.add(withdrawalButton);
        withdrawalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"you withdrew " +  withCurrent.getText());
            }
        });
    }
}
