import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class HospitalAppointmentSystem extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4;
    JTextField tfId, tfName, tfDoctor, tfDate;
    JButton bookBtn, updateBtn, cancelBtn;

    JTable table;
    DefaultTableModel model;

    public HospitalAppointmentSystem() {

        setTitle("Hospital Appointment Management System");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Top Panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 10, 10));

        l1 = new JLabel("Patient ID");
        l2 = new JLabel("Patient Name");
        l3 = new JLabel("Doctor Name");
        l4 = new JLabel("Appointment Date");

        tfId = new JTextField();
        tfName = new JTextField();
        tfDoctor = new JTextField();
        tfDate = new JTextField();

        bookBtn = new JButton("Book Appointment");
        updateBtn = new JButton("Update Appointment");
        cancelBtn = new JButton("Cancel Appointment");

        bookBtn.addActionListener(this);
        updateBtn.addActionListener(this);
        cancelBtn.addActionListener(this);

        panel.add(l1);
        panel.add(tfId);

        panel.add(l2);
        panel.add(tfName);

        panel.add(l3);
        panel.add(tfDoctor);

        panel.add(l4);
        panel.add(tfDate);

        panel.add(bookBtn);
        panel.add(updateBtn);

        add(panel, BorderLayout.NORTH);

        // Table
        model = new DefaultTableModel();
        model.addColumn("Patient ID");
        model.addColumn("Patient Name");
        model.addColumn("Doctor Name");
        model.addColumn("Date");

        table = new JTable(model);

        JScrollPane sp = new JScrollPane(table);
        add(sp, BorderLayout.CENTER);

        // Bottom Panel
        JPanel bottomPanel = new JPanel();
        bottomPanel.add(cancelBtn);

        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String id = tfId.getText();
        String name = tfName.getText();
        String doctor = tfDoctor.getText();
        String date = tfDate.getText();

        // Book Appointment
        if (e.getSource() == bookBtn) {

            if (id.isEmpty() || name.isEmpty() || doctor.isEmpty() || date.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Please fill all fields");
            }
            else {
                model.addRow(new Object[]{id, name, doctor, date});

                JOptionPane.showMessageDialog(this,
                        "Appointment Booked Successfully");

                clearFields();
            }
        }

        // Update Appointment
        else if (e.getSource() == updateBtn) {

            int row = table.getSelectedRow();

            if (row == -1) {
                JOptionPane.showMessageDialog(this,
                        "Select a row to update");
            }
            else {
                model.setValueAt(id, row, 0);
                model.setValueAt(name, row, 1);
                model.setValueAt(doctor, row, 2);
                model.setValueAt(date, row, 3);

                JOptionPane.showMessageDialog(this,
                        "Appointment Updated Successfully");

                clearFields();
            }
        }

        // Cancel Appointment
        else if (e.getSource() == cancelBtn) {

            int row = table.getSelectedRow();

            if (row == -1) {
                JOptionPane.showMessageDialog(this,
                        "Select a row to delete");
            }
            else {
                model.removeRow(row);

                JOptionPane.showMessageDialog(this,
                        "Appointment Cancelled Successfully");

                clearFields();
            }
        }
    }

    public void clearFields() {

        tfId.setText("");
        tfName.setText("");
        tfDoctor.setText("");
        tfDate.setText("");
    }

    public static void main(String[] args) {

        new HospitalAppointmentSystem();
    }
}