package student_management_system;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddBook extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs;
    PreparedStatement pst;

    public AddBook() {
        initComponents();
        conn = javaConnect.ConnectDb();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        setResizable(false);
        setTitle("Add Book");
    }

    // Check input fields
    private boolean checkInputs() {
        if (txtBookID.getText().trim().isEmpty()
            || txtBookName.getText().trim().isEmpty()
            || txtPublisher.getText().trim().isEmpty()
            || txtAuthor.getText().trim().isEmpty()
            || txtPrice.getText().trim().isEmpty()
            || txtQuantity.getText().trim().isEmpty()) {
            return false;
        } else {
            try {
                Double.parseDouble(txtPrice.getText().trim());
                Integer.parseInt(txtQuantity.getText().trim());
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }

    // Clear the input fields
    private void clearFields() {
        txtBookID.setText("");
        txtBookName.setText("");
        txtPublisher.setText("");
        txtAuthor.setText("");
        txtPrice.setText("");
        txtQuantity.setText("");
    }

    // Handle the add book button click event
    private void addBookButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (checkInputs()) {
            try {
                String sql = "INSERT INTO Books(Book_ID, Name, Publisher, Author, Price, Quantity) "
                    + "VALUES(?, ?, ?, ?, ?, ?)";
                pst = conn.prepareStatement(sql);
                pst.setString(1, txtBookID.getText().trim());
                pst.setString(2, txtBookName.getText().trim());
                pst.setString(3, txtPublisher.getText().trim());
                pst.setString(4, txtAuthor.getText().trim());
                pst.setDouble(5, Double.parseDouble(txtPrice.getText().trim()));
                pst.setInt(6, Integer.parseInt(txtQuantity.getText().trim()));

                if (pst.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Book Added Successfully");
                } else {
                    JOptionPane.showMessageDialog(null, "Book Not Added");
                }
                clearFields();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty Or Invalid");
        }
    }

    // Handle the cancel button click event
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.hide();
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton addBookButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtBookID;
    private javax.swing.JTextField txtBookName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtPublisher;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration                   
}
