import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class VoterRegister1 extends JFrame implements ActionListener {
    JLabel label1,label2, label3, label4, label5, label6, label7, label8, label9, label10, label11;
    JTextField textField1, textField2, textField3, textField4, textField5;
    JRadioButton radioButton1, radioButton2;
    ButtonGroup buttonGroup1;
    JDateChooser dateChooser1;
    Random random = new Random();
    Long randomFormNo = (random.nextLong() % 9000L) + 1000L;
    String formNo = " " + Math.abs(randomFormNo);
    JButton buttonNext;
    VoterRegister1(){
        label1 = new JLabel("Registration Page 1");
        label1.setBounds(350, 20, 300, 40);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Arial", Font.BOLD, 30));
        add(label1);

        label2 = new JLabel("Personal Information :- ");
        label2.setBounds(400, 70, 200, 30);
        label2.setFont(new Font("Arial", Font.ITALIC, 18));
        label2.setForeground(Color.WHITE);
        add(label2);

        label3 = new JLabel("Full Name :- ");
        label3.setBounds(100, 150, 170, 40);
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Arial", Font.BOLD, 26));
        add(label3);

        textField1 = new JTextField();
        textField1.setBounds(400, 150, 350, 40);
        textField1.setBackground(Color.WHITE);
        textField1.setForeground(Color.BLACK);
        textField1.setFont(new Font("Arial", Font.BOLD, 20));
        add(textField1);

        label4 = new JLabel("E-mail ID :- ");
        label4.setBounds(100, 220, 170, 40);
        label4.setFont(new Font("Arial", Font.BOLD, 26));
        label4.setForeground(Color.WHITE);
        add(label4);

        textField2 = new JTextField();
        textField2.setBounds(400, 220, 350, 40);
        textField2.setBackground(Color.WHITE);
        textField2.setForeground(Color.BLACK);
        textField2.setFont(new Font("Arial", Font.BOLD, 20));
        add(textField2);

        label5 = new JLabel("Mobile No. :- ");
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

        label6 = new JLabel("DOB :- ");
        label6.setBounds(100, 360, 170, 40);
        label6.setFont(new Font("Arial", Font.BOLD, 26));
        label6.setForeground(Color.WHITE);
        add(label6);

        dateChooser1 = new JDateChooser();
        dateChooser1.setBounds(400, 360, 350, 40);
        dateChooser1.setForeground(Color.BLACK);
        dateChooser1.setBackground(Color.WHITE);
        dateChooser1.setFont(new Font("Arial", Font.BOLD, 20));
        add(dateChooser1);

        label7 = new JLabel("Gender :- ");
        label7.setBounds(100, 430, 170, 40);
        label7.setForeground(Color.WHITE);
        label7.setFont(new Font("Arial", Font.BOLD, 26));
        add(label7);

        radioButton1 = new JRadioButton("Male");
        radioButton1.setBounds(400, 430, 100, 40);
        radioButton1.setFont(new Font("Arial", Font.BOLD, 20));
        radioButton1.setForeground(Color.WHITE);
        radioButton1.setBackground(new Color(38, 75, 101));
        add(radioButton1);

        radioButton2 = new JRadioButton("Female");
        radioButton2.setBounds(600, 430, 100, 40);
        radioButton2.setForeground(Color.WHITE);
        radioButton2.setBackground(new Color(38, 75, 101));
        radioButton2.setFont(new Font("Arial", Font.BOLD, 20));
        add(radioButton2);

        buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(radioButton1);
        buttonGroup1.add(radioButton2);

        label8 = new JLabel("Age :- ");
        label8.setBounds(100, 500, 170, 40);
        label8.setFont(new Font("Arial", Font.BOLD, 26));
        label8.setForeground(Color.WHITE);
        add(label8);

        textField4 = new JTextField();
        textField4.setBounds(400, 500, 350, 40);
        textField4.setBackground(Color.WHITE);
        textField4.setForeground(Color.BLACK);
        textField4.setFont(new Font("Arial", Font.BOLD, 20));
        add(textField4);

        label9 = new JLabel("Form No. :- ");
        label9.setBounds(800, 20, 100, 20);
        label9.setForeground(Color.WHITE);
        label9.setFont(new Font("Arial", Font.BOLD, 16));
        add(label9);

        label10 = new JLabel(formNo);
        label10.setBounds(900, 20, 100, 20);
        label10.setFont(new Font("Arial", Font.BOLD, 16));
        label10.setForeground(Color.WHITE);
        add(label10);

        label11 = new JLabel("Aadhaar No. :- ");
        label11.setBounds(100, 570, 200, 40);
        label11.setForeground(Color.WHITE);
        label11.setFont(new Font("Arial", Font.BOLD, 26));
        add(label11);

        textField5 = new JTextField();
        textField5.setBounds(400, 570, 350, 40);
        textField5.setBackground(Color.WHITE);
        textField5.setForeground(Color.BLACK);
        textField5.setFont(new Font("Arial", Font.BOLD, 20));
        add(textField5);

        buttonNext = new JButton("Next");
        buttonNext.setBounds(700, 670, 150, 40);
        buttonNext.setBackground(Color.GREEN);
        buttonNext.setForeground(Color.BLACK);
        buttonNext.setFont(new Font("Arial", Font.BOLD, 20));
        buttonNext.addActionListener(this);
        add(buttonNext);

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
        try{
            String name = textField1.getText();
            String emailID = textField2.getText();
            String mobileNo = textField3.getText();
            String dateOfBirth = ((JTextField) dateChooser1.getDateEditor().getUiComponent()).getText();
            String gender = null;
            if(radioButton1.isSelected()){
                gender = "Male";
            }
            else if(radioButton2.isSelected()){
                gender = "Female";
            }
            String age = textField4.getText();
            String aadhaarNo = textField5.getText();
            if(e.getSource() == buttonNext){
                if(name.equals("") || emailID.equals("") || mobileNo.equals("") || dateOfBirth.equals("") || age.equals("") || aadhaarNo.equals("")){
                    JOptionPane.showMessageDialog(this, "Please fill all the fields!!", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else if(mobileNo.length() != 10){
                    JOptionPane.showMessageDialog(this, "Please enter your mobile number correctly!!", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else if(aadhaarNo.length() != 12){
                    JOptionPane.showMessageDialog(this, "Please enter your aadhaar number correctly!!", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    try{
                        JDBCConnection connection = new JDBCConnection();
                        String query = "insert into voter_registration_1 values('" + formNo + "', '" + name + "', '" + emailID + "', '" + mobileNo + "', '" + dateOfBirth + "', '" + gender + "', '" + age + "', '" + aadhaarNo + "')";
                        connection.statement.executeUpdate(query);
                        JOptionPane.showMessageDialog(this, "Data inserted successfully!!", "Message", JOptionPane.INFORMATION_MESSAGE);
                        new VoterRegister2(formNo);
                        setVisible(false);
                    }
                    catch(Exception E){
                        E.printStackTrace();
                    }
                }
            }
        }
        catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new VoterRegister1();
    }
}
