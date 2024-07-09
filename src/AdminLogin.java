import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminLogin extends JFrame implements ActionListener {
    JLabel label1, label2, label3, label4;
    JTextField textField1;
    JPasswordField passwordField1;
    JButton buttonSubmit, buttonReset;
    AdminLogin(){
        ImageIcon i1 = new ImageIcon("Images/Vote.jpg");
        Image i2 = i1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        label1 = new JLabel(i3);
        label1.setBounds(0, 0, 850, 480);
        add(label1);

        label2 = new JLabel("Admin Panel");
        label2.setBounds(300, 50, 250, 40);
        label2.setFont(new Font("Arial", Font.BOLD, 36));
        label2.setForeground(Color.WHITE);
        label1.add(label2);

        label3 = new JLabel("Username :- ");
        label3.setBounds(100, 150, 170, 40);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Arial", Font.BOLD, 28));
        label1.add(label3);

        textField1 = new JTextField();
        textField1.setBounds(350, 150, 300, 40);
        textField1.setBackground(Color.WHITE);
        textField1.setForeground(Color.BLACK);
        textField1.setFont(new Font("Arial", Font.BOLD, 20));
        label1.add(textField1);

        label4 = new JLabel("Password :- ");
        label4.setBounds(100, 230, 170, 40);
        label4.setFont(new Font("Arial", Font.BOLD, 28));
        label4.setForeground(Color.WHITE);
        label1.add(label4);

        passwordField1 = new JPasswordField();
        passwordField1.setBounds(350, 230, 300, 40);
        passwordField1.setBackground(Color.WHITE);
        passwordField1.setForeground(Color.BLACK);
        passwordField1.setFont(new Font("Arial", Font.BOLD, 20));
        label1.add(passwordField1);

        buttonSubmit = new JButton("Submit");
        buttonSubmit.setBounds(250, 320, 100, 40);
        buttonSubmit.setBackground(Color.GREEN);
        buttonSubmit.setForeground(Color.BLACK);
        buttonSubmit.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSubmit.addActionListener(this);
        label1.add(buttonSubmit);

        buttonReset = new JButton("Reset");
        buttonReset.setBounds(420, 320, 100, 40);
        buttonReset.setBackground(Color.RED);
        buttonReset.setForeground(Color.BLACK);
        buttonReset.setFont(new Font("Arial", Font.BOLD, 20));
        buttonReset.addActionListener(this);
        label1.add(buttonReset);

        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Arial", Font.BOLD, 16)));
        setLayout(null);
        setSize(850, 480);
        setUndecorated(true);
        setLocation(450, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = textField1.getText();
        String password = String.valueOf(passwordField1.getPassword());
        try{
            if(e.getSource() == buttonSubmit){
                if(username.equals("Jainam Rupani") && password.equals("Rupani@0410")){
                    JOptionPane.showMessageDialog(this, "You logged in successfully!!", "Message", JOptionPane.INFORMATION_MESSAGE);
                    new VoterLogin();
                    setVisible(false);
                }
                else if(username.equals("") || password.equals("")){
                    JOptionPane.showMessageDialog(this, "Please fill all the fields!!", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(this, "Incorrect username or password!!", "Error", JOptionPane.ERROR_MESSAGE);
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
        new AdminLogin();
    }
}
