import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class myframe1 extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6, l7;
    JComboBox<String> jc1, jc2;
    JTextField t1, t2, t3, t4;
    JButton b1;

    public myframe1() {

        setLayout(null);

        l1 = new JLabel("Name :");
        l1.setBounds(100, 100, 150, 25);
        add(l1);

        l2 = new JLabel("Father's Name:");
        l2.setBounds(100, 150, 150, 25);
        add(l2);

        l3 = new JLabel("Date of Birth:");
        l3.setBounds(100, 200, 150, 25);
        add(l3);

        l4 = new JLabel("Sex:");
        l4.setBounds(100, 250, 150, 25);
        add(l4);

        l5 = new JLabel("Address:");
        l5.setBounds(100, 300, 150, 25);
        add(l5);

        l6 = new JLabel("Qualification:");
        l6.setBounds(100, 350, 150, 25);
        add(l6);

        t1 = new JTextField();
        t1.setBounds(250, 100, 150, 25);
        add(t1);

        t2 = new JTextField();
        t2.setBounds(250, 150, 150, 25);
        add(t2);

        t3 = new JTextField();
        t3.setBounds(250, 200, 150, 25);
        add(t3);

        jc1 = new JComboBox<>();
        jc1.addItem("M");
        jc1.addItem("F");
        jc1.setBounds(250, 250, 150, 25);
        add(jc1);

        t4 = new JTextField();
        t4.setBounds(250, 300, 150, 25);
        add(t4);

        jc2 = new JComboBox<>();
        jc2.addItem("M.E.");
        jc2.addItem("Ph.D.");
        jc2.setBounds(250, 350, 150, 25);
        add(jc2);

        b1 = new JButton("Submit");
        b1.setBounds(250, 400, 100, 30);
        add(b1);

        l7 = new JLabel("");
        l7.setBounds(250, 450, 200, 25);
        add(l7);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {

        try {

            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mag?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC",
                    "root",
                    "Bunny@02");

            String sql = "INSERT INTO Biodata(name, fathername, dob, sex, address, qualification) VALUES (?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, t1.getText());
            ps.setString(2, t2.getText());
            ps.setString(3, t3.getText());
            ps.setString(4, String.valueOf(jc1.getSelectedItem()));
            ps.setString(5, t4.getText());
            ps.setString(6, String.valueOf(jc2.getSelectedItem()));

            ps.executeUpdate();

            l7.setText("Record Inserted");

            ps.close();
            conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
}

public class myapp1 {

    public static void main(String args[]) {

        myframe1 f = new myframe1();

        f.setTitle("Welcome to Enter Biodata");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}