package student_management_system;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Resuts {

    private JFrame frame;
    private JTable table;
    private DefaultTableModel model;
    private JScrollPane scrollPane;
    private JButton btnLoadData;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Resuts window = new Resuts();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Resuts() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        // Add a label for the title
        JLabel lblResults = new JLabel("Results");
        lblResults.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblResults.setBounds(179, 11, 82, 22);
        frame.getContentPane().add(lblResults);

        scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 44, 414, 181);
        frame.getContentPane().add(scrollPane);

        table = new JTable();
        model = new DefaultTableModel();
        Object[] column = {"Reg No", "First Name", "Last Name", "Course", "Year", "Semester", "Marks"};
        final Object[] row = new Object[7];
        model.setColumnIdentifiers(column);
        table.setModel(model);
        scrollPane.setViewportView(table);

        btnLoadData = new JButton("Load Data");
        btnLoadData.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management_system", "root", "emarshKmax");

                    PreparedStatement statement = con.prepareStatement("SELECT * FROM results");
                    ResultSet resultSet = statement.executeQuery();

                    ResultSetMetaData rsmd = resultSet.getMetaData();
                    int cols = rsmd.getColumnCount();
                    while (resultSet.next()) {
                        for (int i = 1; i <= cols; i++) {
                            row[i - 1] = resultSet.getString(i);
                        }
                        model.addRow(row);
                    }
                    resultSet.close();
                    statement.close();
                    con.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error Occured: " + ex.getMessage());
                }
            }
        });
        btnLoadData.setBounds(175, 236, 89, 23);
        frame.getContentPane().add(btnLoadData);
    }

    void show() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
