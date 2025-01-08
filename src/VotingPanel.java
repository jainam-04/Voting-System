import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class VotingPanel extends JFrame implements ActionListener {
    JLabel label1, label2, label3, label4, label5;
    JTextField textField1, textField2, textField3;
    JRadioButton radioButtonBJP, radioButtonINC, radioButtonAAP, radioButtonBSP, radioButtonCPI, radioButtonNPP;
    ButtonGroup buttonGroup1;
    JButton buttonSubmit, buttonCancel, buttonResult, buttonClose;
    String voterId;
    VotingPanel(String voterId){
        this.voterId = voterId;

        label1 = new JLabel("Welcome to the voting panel");
        label1.setBounds(300, 20, 500, 40);
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("Arial", Font.BOLD, 28));
        add(label1);

        label2 = new JLabel("Give your vote carefully");
        label2.setBounds(390, 60, 400, 30);
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("Arial", Font.ITALIC, 18));
        add(label2);

        label3 = new JLabel("Name :- ");
        label3.setBounds(150, 120, 120, 30);
        label3.setForeground(Color.BLACK);
        label3.setFont(new Font("Arial", Font.BOLD, 20));
        add(label3);

        textField1 = new JTextField();
        textField1.setBounds(400, 120, 300, 30);
        textField1.setForeground(Color.BLACK);
        textField1.setFont(new Font("Arial", Font.BOLD, 16));
        add(textField1);

        label4 = new JLabel("E-Mail :- ");
        label4.setBounds(150, 180, 120, 30);
        label4.setForeground(Color.BLACK);
        label4.setFont(new Font("Arial", Font.BOLD, 20));
        add(label4);

        textField2 = new JTextField();
        textField2.setBounds(400, 180, 300, 30);
        textField2.setForeground(Color.BLACK);
        textField2.setFont(new Font("Arial", Font.BOLD, 16));
        add(textField2);

        radioButtonAAP = new JRadioButton("Aam Aadmi Party (AAP)");
        radioButtonAAP.setBounds(150, 280, 250, 30);
        radioButtonAAP.setForeground(Color.BLACK);
        radioButtonAAP.setFont(new Font("Arial", Font.BOLD, 20));
        radioButtonAAP.addActionListener(this);
        add(radioButtonAAP);

        radioButtonBJP = new JRadioButton("Bhartiya Janta Party (BJP)");
        radioButtonBJP.setBounds(500, 280, 300, 30);
        radioButtonBJP.setForeground(Color.BLACK);
        radioButtonBJP.setFont(new Font("Arial", Font.BOLD, 20));
        radioButtonBJP.addActionListener(this);
        add(radioButtonBJP);

        radioButtonBSP = new JRadioButton("Bahujan Samaj Party (BSP)");
        radioButtonBSP.setBounds(150, 340, 300, 30);
        radioButtonBSP.setForeground(Color.BLACK);
        radioButtonBSP.setFont(new Font("Arial", Font.BOLD, 20));
        radioButtonBSP.addActionListener(this);
        add(radioButtonBSP);

        radioButtonCPI = new JRadioButton("Communist Party of India (CPI)");
        radioButtonCPI.setBounds(500, 340, 320, 30);
        radioButtonCPI.setFont(new Font("Arial", Font.BOLD, 20));
        radioButtonCPI.setForeground(Color.BLACK);
        radioButtonCPI.addActionListener(this);
        add(radioButtonCPI);

        radioButtonINC = new JRadioButton("Indian National Congress (INP)");
        radioButtonINC.setBounds(150, 400, 320, 30);
        radioButtonINC.setFont(new Font("Arial", Font.BOLD, 20));
        radioButtonINC.setForeground(Color.BLACK);
        radioButtonINC.addActionListener(this);
        add(radioButtonINC);

        radioButtonNPP = new JRadioButton("National People Party (NPP)");
        radioButtonNPP.setBounds(500, 400, 320, 30);
        radioButtonNPP.setForeground(Color.BLACK);
        radioButtonNPP.setFont(new Font("Arial", Font.BOLD, 20));
        radioButtonNPP.addActionListener(this);
        add(radioButtonNPP);

        buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(radioButtonAAP);
        buttonGroup1.add(radioButtonBJP);
        buttonGroup1.add(radioButtonCPI);
        buttonGroup1.add(radioButtonINC);
        buttonGroup1.add(radioButtonNPP);
        buttonGroup1.add(radioButtonBSP);

        label5 = new JLabel("Your vote goes to :- ");
        label5.setBounds(150, 500, 200, 30);
        label5.setFont(new Font("Arial", Font.BOLD, 20));
        label5.setForeground(Color.BLACK);
        add(label5);

        textField3 = new JTextField();
        textField3.setBounds(400, 500, 350, 30);
        textField3.setForeground(Color.BLACK);
        textField3.setFont(new Font("Arial", Font.BOLD, 20));
        add(textField3);

        buttonSubmit = new JButton("Submit");
        buttonSubmit.setBounds(250, 600, 100, 40);
        buttonSubmit.setBackground(Color.GREEN);
        buttonSubmit.setForeground(Color.BLACK);
        buttonSubmit.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSubmit.addActionListener(this);
        add(buttonSubmit);

        buttonCancel = new JButton("Cancel");
        buttonCancel.setBounds(450, 600, 100, 40);
        buttonCancel.setBackground(Color.RED);
        buttonCancel.setForeground(Color.WHITE);
        buttonCancel.setFont(new Font("Arial", Font.BOLD, 20));
        buttonCancel.addActionListener(this);
        add(buttonCancel);

        buttonResult = new JButton("See Results");
        buttonResult.setBounds(650, 600, 150, 40);
        buttonResult.setBackground(Color.CYAN);
        buttonResult.setForeground(Color.BLACK);
        buttonResult.setFont(new Font("Arial", Font.BOLD, 20));
        buttonResult.addActionListener(this);
        add(buttonResult);

        buttonClose = new JButton("Close");
        buttonClose.setBounds(450, 690, 100, 40);
        buttonClose.setBackground(Color.lightGray);
        buttonClose.setForeground(Color.BLACK);
        buttonClose.setFont(new Font("Arial", Font.BOLD, 20));
        buttonClose.addActionListener(this);
        add(buttonClose);

        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Arial", Font.BOLD, 20)));
        setLayout(null);
        setSize(1000, 800);
        setUndecorated(true);
        setLocation(300, 30);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = textField1.getText();
        String email = textField2.getText();
        String vote = textField3.getText();

        try {
            if (e.getSource() == radioButtonINC) {
                textField3.setText("Indian National Congress (INC)");
            } else if (e.getSource() == radioButtonAAP) {
                textField3.setText("Aam Aadmi Party (AAP)");
            } else if (e.getSource() == radioButtonBJP) {
                textField3.setText("Bhartiya Janta Party (BJP)");
            } else if (e.getSource() == radioButtonBSP) {
                textField3.setText("Bahujan Samaj Party (BSP)");
            } else if (e.getSource() == radioButtonCPI) {
                textField3.setText("Communist Party of India (CPI)");
            } else if (e.getSource() == radioButtonNPP) {
                textField3.setText("National People Party (NPP)");
            }
            else if(e.getSource() == buttonSubmit){
                if(name.equals("") || email.equals("")){
                    JOptionPane.showMessageDialog(this, "Please fill all the fields!!", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    try{
                        JDBCConnection connection = new JDBCConnection();
                        String query = "insert into voting_panel values('" + name + "', '" + email + "', '" + vote + "', '" + voterId + "')";
                        connection.statement.executeUpdate(query);

                        String countAAPQuery = "select vote_count from voting_results where vote = 'Aam Aadmi Party (AAP)'";
                        int countAAP = 0;
                        ResultSet rsAAP = connection.statement.executeQuery(countAAPQuery);
                        if(rsAAP.next()){
                            countAAP = rsAAP.getInt(1);
                        }

                        String countBJPQuery = "select vote_count from voting_results where vote = 'Bhartiya Janta Party (BJP)'";
                        int countBJP = 0;
                        ResultSet rsBJP = connection.statement.executeQuery(countBJPQuery);
                        if(rsBJP.next()){
                            countBJP = rsBJP.getInt(1);
                        }

                        String countBSPQuery = "select vote_count from voting_results where vote = 'Bahujan Samaj Party (BSP)'";
                        int countBSP = 0;
                        ResultSet rsBSP = connection.statement.executeQuery(countBSPQuery);
                        if(rsBSP.next()){
                            countBSP = rsBSP.getInt(1);
                        }

                        String countCPIQuery = "select vote_count from voting_results where vote = 'Communist Party of India (CPI)'";
                        int countCPI = 0;
                        ResultSet rsCPI = connection.statement.executeQuery(countCPIQuery);
                        if(rsCPI.next()){
                            countCPI = rsCPI.getInt(1);
                        }

                        String countINCQuery = "select vote_count from voting_results where vote = 'Indian National Congress (INC)'";
                        int countINC = 0;
                        ResultSet rsINC = connection.statement.executeQuery(countINCQuery);
                        if(rsINC.next()){
                            countINC = rsINC.getInt(1);
                        }

                        String countNPPQuery = "select vote_count from voting_results where vote = 'National People Party (NPP)'";
                        int countNPP = 0;
                        ResultSet rsNPP = connection.statement.executeQuery(countNPPQuery);
                        if(rsNPP.next()){
                            countNPP = rsNPP.getInt(1);
                        }

                        if(radioButtonAAP.isSelected()){
                            countAAP += 1;
                            String query1 = "update voting_results set vote_count = '" + countAAP + "' where (vote = '" + vote + "')";
                            connection.statement.executeUpdate(query1);
                        }
                        else if(radioButtonBJP.isSelected()){
                            countBJP += 1;
                            String query1 = "update voting_results set vote_count = '" + countBJP + "' where (vote = '" + vote + "')";
                            connection.statement.executeUpdate(query1);
                        }
                        else if(radioButtonBSP.isSelected()){
                            countBSP += 1;
                            String query1 = "update voting_results set vote_count = '" + countBSP + "' where ('vote = '" + vote + "')";
                            connection.statement.executeUpdate(query1);
                        }
                        else if(radioButtonCPI.isSelected()){
                            countCPI += 1;
                            String query1 = "update voting_results set vote_count = '" + countCPI + "' where ('vote = '" + vote + "')";
                            connection.statement.executeUpdate(query1);
                        }
                        else if(radioButtonINC.isSelected()){
                            countINC += 1;
                            String query1 = "update voting_results set vote_count = '" + countINC + "' where (vote = '" + vote + "')";
                            connection.statement.executeUpdate(query1);
                        }
                        else if(radioButtonNPP.isSelected()){
                            countNPP += 1;
                            String query1 = "update voting_results set vote_count = '" + countNPP + "' where (vote = '" + vote + "')";
                            connection.statement.executeUpdate(query1);
                        }
                        JOptionPane.showMessageDialog(this, "Your vote is successfully gone to " + vote + "!", "Message", JOptionPane.INFORMATION_MESSAGE);
                    }
                    catch(Exception E){
                        E.printStackTrace();
                    }
                }
            }
            else if(e.getSource() == buttonCancel){
                new VoterLogin();
            }
            else if(e.getSource() == buttonResult){
                new VotingResults(vote);
            }
            else if(e.getSource() == buttonClose){
                System.exit(0);
            }
        }
        catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new VotingPanel(null);
    }
}
