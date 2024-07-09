import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class VoterLogin extends JFrame implements ActionListener {
    JLabel label1, label2, label3, label4;
    JTextField textField1;
    JPasswordField passwordField1;
    JButton buttonSubmit, buttonReset, buttonRegister;
    VoterLogin(){
        ImageIcon i1 = new ImageIcon("Images/Vote.jpg");
        Image i2 = i1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        label1 = new JLabel(i3);
        label1.setBounds(0, 0, 850, 480);
        add(label1);

        label2 = new JLabel("Login for Voters");
        label2.setBounds(300, 40, 400, 40);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Arial", Font.BOLD, 30));
        label1.add(label2);

        label3 = new JLabel("Voter ID :- ");
        label3.setBounds(150, 120, 150, 40);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Arial", Font.BOLD, 26));
        label1.add(label3);

        textField1 = new JTextField();
        textField1.setBounds(400, 120, 300, 40);
        textField1.setBackground(Color.WHITE);
        textField1.setForeground(Color.BLACK);
        textField1.setFont(new Font("Arial", Font.BOLD, 20));
        label1.add(textField1);

        label4 = new JLabel("Password :- ");
        label4.setBounds(150, 200, 170, 40);
        label4.setFont(new Font("Arial", Font.BOLD, 26));
        label4.setForeground(Color.WHITE);
        label1.add(label4);

        passwordField1 = new JPasswordField();
        passwordField1.setBounds(400, 200, 300, 40);
        passwordField1.setBackground(Color.WHITE);
        passwordField1.setForeground(Color.BLACK);
        passwordField1.setFont(new Font("Arial", Font.BOLD, 20));
        label1.add(passwordField1);

        buttonRegister = new JButton("Register");
        buttonRegister.setBounds(100, 300, 150, 40);
        buttonRegister.setBackground(Color.CYAN);
        buttonRegister.setForeground(Color.BLACK);
        buttonRegister.setFont(new Font("Arial", Font.BOLD, 20));
        buttonRegister.addActionListener(this);
        label1.add(buttonRegister);

        buttonSubmit = new JButton("Login");
        buttonSubmit.setBounds(300, 300, 150, 40);
        buttonSubmit.setBackground(Color.GREEN);
        buttonSubmit.setForeground(Color.BLACK);
        buttonSubmit.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSubmit.addActionListener(this);
        label1.add(buttonSubmit);

        buttonReset = new JButton("Reset");
        buttonReset.setBounds(500, 300, 150, 40);
        buttonReset.setBackground(Color.RED);
        buttonReset.setForeground(Color.WHITE);
        buttonReset.setFont(new Font("Arial", Font.BOLD, 20));
        buttonReset.addActionListener(this);
        label1.add(buttonReset);

        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Arial", Font.BOLD, 20)));
        setLayout(null);
        setSize(850, 480);
        setUndecorated(true);
        setLocation(450, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String voterID = textField1.getText();
        String password = String.valueOf(passwordField1.getPassword());
        try{
            if(e.getSource() == buttonRegister){
                new VoterRegister1();
                setVisible(false);
            }
            else if(e.getSource() == buttonSubmit){
                try{
                    if(voterID.equals("") || password.equals("")){
                        JOptionPane.showMessageDialog(this, "Please fill all the fields!!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        JDBCConnection connection = new JDBCConnection();
                        String query = "select * from voter_login where voter_id = '" + voterID + "' and password = '" + password + "'";
                        ResultSet resultSet = connection.statement.executeQuery(query);
                        if(resultSet.next()){
                            JOptionPane.showMessageDialog(this, "You logged in successfully!!", "Message", JOptionPane.INFORMATION_MESSAGE);
                            new VotingPanel(voterID);
                            setVisible(false);
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "Incorrect voter ID or password", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                catch(Exception E){
                    E.printStackTrace();
                }
            }
            else if(e.getSource() == buttonReset){
                textField1.setText("");
                passwordField1.setText("");
            }
        }
        catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new VoterLogin();
    }
}
