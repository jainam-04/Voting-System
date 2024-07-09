import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class VotingResults extends JFrame implements ActionListener {
    String vote;
    JLabel label1, label2, label3;
    JButton buttonExit;
    VotingResults(String vote){
        this.vote = vote;

        label1 = new JLabel("Results of Voting");
        label1.setBounds(300, 20, 170, 30);
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("Arial", Font.BOLD, 20));
        add(label1);

        label2 = new JLabel();
        label2.setBounds(100, 100, 600, 300);
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("Arial", Font.BOLD, 18));
        add(label2);

        try{
            JDBCConnection connection = new JDBCConnection();
            String query = "select * from voting_results where show_results = 'true'";
            ResultSet resultSet = connection.statement.executeQuery(query);
            while(resultSet.next()){
                label2.setText(label2.getText() + "<html>" + resultSet.getString("vote") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultSet.getString("vote_count") + "<br><br><html>");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        label3 = new JLabel();
        label3.setBounds(100, 450, 450, 30);
        label3.setForeground(Color.BLACK);
        label3.setFont(new Font("Arial", Font.BOLD, 18));
        add(label3);

        try{
            JDBCConnection connection = new JDBCConnection();
            String query = "select vote from voting_results where vote_count = (select max(vote_count) from voting_results)";
            ResultSet resultSet = connection.statement.executeQuery(query);
            while(resultSet.next()){
                label3.setText(label3.getText() + "The winning party is " + resultSet.getString("vote"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        buttonExit = new JButton("Exit");
        buttonExit.setBounds(250, 550, 100, 40);
        buttonExit.setBackground(Color.BLACK);
        buttonExit.setForeground(Color.WHITE);
        buttonExit.setFont(new Font("Arial", Font.BOLD, 20));
        buttonExit.addActionListener(this);
        add(buttonExit);

        setLayout(null);
        setSize(700, 700);
        setUndecorated(true);
        setLocation(400, 100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == buttonExit){
                setVisible(false);
            }
        }
        catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new VotingResults(null);
    }
}
