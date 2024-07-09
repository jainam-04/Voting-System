import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class VoterRegister2 extends JFrame implements ActionListener {
    Random random = new Random();
    String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
    String numbers = "0123456789";
    StringBuilder str1 = new StringBuilder();
    StringBuilder str2 = new StringBuilder();
    String formNo;
    JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11;
    JTextField textField1, textField2, textField3, textField4, textField5, textField6;
    JRadioButton radioButton1, radioButton2;
    ButtonGroup buttonGroup1;
    JButton buttonSubmit, buttonBack;
    VoterRegister2(String formNo){
        this.formNo = formNo;

        label1 = new JLabel("Registration Page 2");
        label1.setBounds(350, 20, 300, 40);
        label1.setFont(new Font("Arial", Font.BOLD, 30));
        label1.setForeground(Color.WHITE);
        add(label1);

        label2 = new JLabel("Additional Details :- ");
        label2.setBounds(400, 70, 200, 30);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Arial", Font.ITALIC, 18));
        add(label2);

        label3 = new JLabel("Address :- ");
        label3.setBounds(100, 150, 170,40);
        label3.setFont(new Font("Arial", Font.BOLD, 26));
        label3.setForeground(Color.WHITE);
        add(label3);

        textField1 = new JTextField();
        textField1.setBounds(400, 150, 350, 40);
        textField1.setBackground(Color.WHITE);
        textField1.setForeground(Color.BLACK);
        textField1.setFont(new Font("Arial", Font.BOLD, 20));
        add(textField1);

        label4 = new JLabel("City :- ");
        label4.setBounds(100, 220, 170, 40);
        label4.setForeground(Color.WHITE);
        label4.setFont(new Font("Arial", Font.BOLD, 26));
        add(label4);

        textField2 = new JTextField();
        textField2.setBounds(400, 220, 350, 40);
        textField2.setBackground(Color.WHITE);
        textField2.setForeground(Color.BLACK);
        textField2.setFont(new Font("Arial", Font.BOLD, 20));
        add(textField2);

        label5 = new JLabel("State :- ");
        label5.setBounds(100, 290, 170, 40);
        label5.setForeground(Color.WHITE);
        label5.setFont(new Font("Arial", Font.BOLD, 26));
        add(label5);

        textField3 = new JTextField();
        textField3.setBounds(400, 290, 350, 40);
        textField3.setBackground(Color.WHITE);
        textField3.setForeground(Color.BLACK);
        textField3.setFont(new Font("Arial", Font.BOLD, 20));
        add(textField3);

        label6 = new JLabel("Pin Code :- ");
        label6.setBounds(100, 360, 170, 40);
        label6.setFont(new Font("Arial", Font.BOLD, 26));
        label6.setForeground(Color.WHITE);
        add(label6);

        textField4 = new JTextField();
        textField4.setBounds(400, 360, 350, 40);
        textField4.setBackground(Color.WHITE);
        textField4.setForeground(Color.BLACK);
        textField4.setFont(new Font("Arial", Font.BOLD, 20));
        add(textField4);

        label7 = new JLabel("Education :- ");
        label7.setBounds(100, 430, 170, 40);
        label7.setForeground(Color.WHITE);
        label7.setFont(new Font("Arial", Font.BOLD, 26));
        add(label7);

        textField5 = new JTextField();
        textField5.setBounds(400, 430, 350, 40);
        textField5.setBackground(Color.WHITE);
        textField5.setForeground(Color.BLACK);
        textField5.setFont(new Font("Arial", Font.BOLD, 20));
        add(textField5);

        label8 = new JLabel("Married Status :- ");
        label8.setBounds(100, 500, 220, 40);
        label8.setForeground(Color.WHITE);
        label8.setFont(new Font("Arial", Font.BOLD, 26));
        add(label8);

        radioButton1 = new JRadioButton("Yes");
        radioButton1.setBounds(400, 500, 100, 40);
        radioButton1.setBackground(new Color(38, 75, 101));
        radioButton1.setForeground(Color.WHITE);
        radioButton1.setFont(new Font("Arial", Font.BOLD, 20));
        add(radioButton1);

        radioButton2 = new JRadioButton("No");
        radioButton2.setBounds(600, 500, 100, 40);
        radioButton2.setBackground(new Color(38, 75, 101));
        radioButton2.setForeground(Color.WHITE);
        radioButton2.setFont(new Font("Arial", Font.BOLD, 20));
        add(radioButton2);

        buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(radioButton1);
        buttonGroup1.add(radioButton2);

        label9 = new JLabel("Form No :- ");
        label9.setBounds(800, 20, 100, 20);
        label9.setForeground(Color.WHITE);
        label9.setFont(new Font("Arial", Font.BOLD, 16));
        add(label9);

        label10 = new JLabel(formNo);
        label10.setBounds(900, 20, 100, 20);
        label10.setForeground(Color.WHITE);
        label10.setFont(new Font("Arial", Font.BOLD, 16));
        add(label10);

        label11 = new JLabel("Religion :- ");
        label11.setBounds(100, 570, 170, 40);
        label11.setFont(new Font("Arial", Font.BOLD, 26));
        label11.setForeground(Color.WHITE);
        add(label11);

        textField6 = new JTextField();
        textField6.setBounds(400, 570, 350, 40);
        textField6.setBackground(Color.WHITE);
        textField6.setForeground(Color.BLACK);
        textField6.setFont(new Font("Arial", Font.BOLD, 20));
        add(textField6);

        buttonSubmit = new JButton("Submit");
        buttonSubmit.setBounds(700, 670, 100, 40);
        buttonSubmit.setBackground(Color.GREEN);
        buttonSubmit.setForeground(Color.BLACK);
        buttonSubmit.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSubmit.addActionListener(this);
        add(buttonSubmit);

        buttonBack = new JButton("Back");
        buttonBack.setBounds(100, 670, 100, 40);
        buttonBack.setBackground(Color.BLACK);
        buttonBack.setForeground(Color.WHITE);
        buttonBack.setFont(new Font("Arial", Font.BOLD, 20));
        buttonBack.addActionListener(this);
        add(buttonBack);

        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Arial", Font.BOLD, 20)));
        setLayout(null);
        getContentPane().setBackground(new Color(38, 75, 101));
        setSize(1000, 800);
        setUndecorated(true);
        setLocation(300, 30);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String address = textField1.getText();
        String city = textField2.getText();
        String state = textField3.getText();
        String pinCode = textField4.getText();
        String education = textField5.getText();
        String marriedStatus = null;
        if(radioButton1.isSelected()){
            marriedStatus = "Yes";
        }
        else if(radioButton2.isSelected()){
            marriedStatus = "No";
        }
        String religion = textField6.getText();
        try{
            if(e.getSource() == buttonSubmit){
                for(int i = 0; i < 6; i++){
                    int index = random.nextInt(uppercaseLetters.length());
                    str1.append(uppercaseLetters.charAt(index));
                }
                for(int i = 0; i < 4; i++){
                    int index = random.nextInt(numbers.length());
                    str1.append(numbers.charAt(index));
                }
                String voterId = str1.toString();
                for(int i = 0; i < 6; i++){
                    int index = random.nextInt(lowerCaseLetters.length());
                    str2.append(lowerCaseLetters.charAt(index));
                }
                str2.append("@");
                for(int i = 0; i < 6; i++){
                    int index = random.nextInt(numbers.length());
                    str2.append(numbers.charAt(index));
                }
                String password = str2.toString();
                if(address.equals("") || city.equals("") || state.equals("") || pinCode.equals("") || education.equals("") || religion.equals("")){
                    JOptionPane.showMessageDialog(this, "Please fill all the fields!!", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    try{
                        JDBCConnection connection = new JDBCConnection();
                        String query1 = "insert into voter_registration_2 values('" + formNo + "', '" + address + "', '" + city + "', '" + state + "', '" + pinCode + "', '" + education + "', '" + marriedStatus + "', '" + voterId + "', '" + password + "', '" + religion + "')";
                        connection.statement.executeUpdate(query1);
                        String query2 = "insert into voter_login values('" + voterId + "', '" + password + "')";
                        connection.statement.executeUpdate(query2);
                        JOptionPane.showMessageDialog(this, "You registered successfully!!", "Message", JOptionPane.INFORMATION_MESSAGE);
                        JOptionPane.showMessageDialog(this, "Voter ID :- " + voterId + "\nPassword :- " + password, "Message", JOptionPane.INFORMATION_MESSAGE);
                        new VoterLogin();
                        setVisible(false);
                    }
                    catch(Exception E){
                        E.printStackTrace();
                    }
                }
            }
            else if(e.getSource() == buttonBack){
                new VoterRegister1();
                setVisible(false);
            }
        }
        catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new VoterRegister2(null);
    }
}
