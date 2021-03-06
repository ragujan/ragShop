/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.sql.ResultSet;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import model.MySql;

/**
 *
 * @author acer
 */
public class ManageUsers extends javax.swing.JFrame {

    /**
     * Creates new form ManageUsers
     */
    public ManageUsers() {
        initComponents();
        loadUserTypes();
        loadUsers();
        checkContactInputField();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jcomboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setText("Full_Name");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setText("User_Name");
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });

        jTextField3.setText("Password");
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setText("User_Contact");
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jButton1.setText("Enter User");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Edit Status");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(jcomboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcomboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User_ID", "User_Full_Name", "User_Name", "User_Password", "User_Contact_No", "user_status_id", "user_type_id"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  public void getTableModel() {
        jTable1.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                int row = jTable1.getSelectedRow();
                System.out.println(row);
            }
        });
    }
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
        if (jTextField1.getText().equals("Full_Name")) {
            jTextField1.setText("");
        }


    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
        if (jTextField1.getText().equals("")) {
            jTextField1.setText("Full_Name");
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        // TODO add your handling code here:
        if (jTextField2.getText().equals("User_Name")) {
            jTextField2.setText("");
        }
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        // TODO add your handling code here:
        if (jTextField2.getText().equals("")) {
            jTextField2.setText("User_Name");
        }
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        // TODO add your handling code here:
        if (jTextField3.getText().equals("Password")) {
            jTextField3.setText("");
        }
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        // TODO add your handling code here:
        if (jTextField3.getText().equals("")) {
            jTextField3.setText("Password");
        }
    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
        // TODO add your handling code here:
        if (jTextField4.getText().equals("User_Contact")) {
            jTextField4.setText("");
        }
    }//GEN-LAST:event_jTextField4FocusGained

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        // TODO add your handling code here:
        if (jTextField4.getText().equals("")) {
            jTextField4.setText("User_Contact");
        }
    }//GEN-LAST:event_jTextField4FocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String fn = jTextField1.getText();
        String un = jTextField2.getText();
        String p = jTextField3.getText();
        String c = jTextField4.getText();
        String t = jcomboBox1.getSelectedItem().toString();

        if (fn.isEmpty()) {
            JOptionPane.showMessageDialog(this, "user full name cannot be empty", "warning", JOptionPane.WARNING_MESSAGE);
        } else if (fn.equals("Full_Name")) {
            JOptionPane.showMessageDialog(this, "full name cannot have this value", "warning", JOptionPane.WARNING_MESSAGE);
        } else if (un.isEmpty()) {
            JOptionPane.showMessageDialog(this, "user name cannot be empty", "warning", JOptionPane.WARNING_MESSAGE);
        } else if (un.equals("User_Name")) {
            JOptionPane.showMessageDialog(this, "User name cannot have this value", "warning", JOptionPane.WARNING_MESSAGE);
        } else if (p.isEmpty()) {
            JOptionPane.showMessageDialog(this, "password cannot be empty", "warning", JOptionPane.WARNING_MESSAGE);
        } else if (p.equals("Password")) {
            JOptionPane.showMessageDialog(this, "password cannot have this value", "warning", JOptionPane.WARNING_MESSAGE);
        } else if (c.isEmpty()) {
            JOptionPane.showMessageDialog(this, "contact number cannot be empty", "warning", JOptionPane.WARNING_MESSAGE);
        } else if (c.equals("User_Contact")) {
            JOptionPane.showMessageDialog(this, "contact number cannot have this value", "warning", JOptionPane.WARNING_MESSAGE);

        } else if (jcomboBox1.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "not a valid", "warning", JOptionPane.WARNING_MESSAGE);
        } else {

            MySql.iud("INSERT INTO `user` (`user_full_name`,`user_name`,`contact_name`,`user_password`,`user_status_id`,`user_type_id`) \n"
                    + "SELECT '" + fn + "','" + un + "','" + p + "','" + c + "','1',`user_type_id` FROM `user_type` WHERE `user_type_name`='" + t + "';");
            loadUsers();
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jcomboBox1.setSelectedIndex(0);
        }

    }//GEN-LAST:event_jButton1ActionPerformed
    private void loadUsers() {
        DefaultTableModel dftm = (DefaultTableModel) jTable1.getModel();
        dftm.setRowCount(0);
        try {
            ResultSet rs = MySql.sq("SELECT * FROM `user`\n"
                    + "INNER JOIN `user_status`\n"
                    + "ON `user_status`.`status_id`=`user`.`user_status_id`\n"
                    + "INNER JOIN `user_type`\n"
                    + "ON `user_type`.`user_type_id`=`user`.`user_type_id`");
            while (rs.next()) {
                Vector<String> v = new Vector<String>();
                v.add(rs.getString("user_id"));
                v.add(rs.getString("user_full_name"));
                v.add(rs.getString("user_name"));
                v.add(rs.getString("contact_name"));
                v.add(rs.getString("user_password"));
                v.add(rs.getString("status_name"));
                v.add(rs.getString("user_type_name"));
                dftm.addRow(v);

            }
            jTable1.setModel(dftm);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void checkContactInputField() {
        jTextField4.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                //System.out.println(warnCheck());
                //System.out.println("Insert Update");
                String text = jTextField4.getText();
                Pattern p = Pattern.compile("([0-9]){10}");
                Matcher m = p.matcher(text);
                Boolean b = m.matches();
                System.out.println(text.length());
                if (jTextField4.getText().length() == 3) {
                    if (!Pattern.compile("^07([1-24-55-8])").matcher(jTextField4.getText()).matches()) {
                        System.out.println();
                        String rep = text.substring(0,2);
                        System.out.println(rep+" No");
                        
                        jTextField4.setText("077");

                    } else {

                    }
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                System.out.println(warnCheck());
                System.out.println("REMOVED");
                if (jTextField4.getText().length() == 3) {
                    if (!Pattern.compile("^07([1-24-55-8])").matcher(jTextField4.getText()).matches()) {

                        // jTextField4.setText(jTextField4.getText().substring(0, (jTextField4.getText()).length() - 1));
                    } else {

                    }
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                System.out.println(warnCheck());
                System.out.println("Changed Update");
            }

            public String warnCheck() {
                String text = jTextField4.getText();
                return text;
            }
        });
    }
    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        // TODO add your handling code here:
        //String ch = String.p;
//        String text = jTextField4.getText() + evt.getKeyChar();
//        Pattern p = Pattern.compile("([0-9]){11}");
//        Matcher m = p.matcher(text);
//        Boolean b = m.matches();
//       
//        if (jTextField4.getText().length() == 3) {
//            if (!Pattern.compile("^07([1-24-55-8])").matcher(jTextField4.getText()).matches()) {
//                evt.consume();
//            }
//        }
//        if (jTextField4.getText().length() == 10) {
//
//            if (m.matches()) {
//                evt.consume();
//            }
//        }


    }//GEN-LAST:event_jTextField4KeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int row = jTable1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row in the table", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            String rowValue = jTable1.getValueAt(row, 6).toString();
            int id = Integer.parseInt(jTable1.getValueAt(row, 0).toString());
            System.out.println(rowValue);
            if (!rowValue.equals("Admin")) {
                if (jTable1.getValueAt(row, 5).toString().equals("Active")) {
                    MySql.iud("UPDATE `user` SET `user_status_id`='2' WHERE `user_id`='" + id + "' ");
                    loadUsers();
                }
                if (jTable1.getValueAt(row, 5).toString().equals("In-Active")) {
                    MySql.iud("UPDATE `user` SET `user_status_id`='1' WHERE `user_id`='" + id + "' ");
                    loadUsers();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Cannot change the admin status", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
// TODO add your handling code here:
//        jTable1.getModel().addTableModelListener(new TableModelListener() {
//            @Override
//            public void tableChanged(TableModelEvent e) {
//                int row = jTable1.getSelectedRow();
//                String rowValue = jTable1.getValueAt(row, 6).toString();
//                int id = Integer.parseInt(jTable1.getValueAt(row, 1).toString());
//                System.out.println(id);
//                System.out.println(rowValue);
//                if (!rowValue.equals("Admin")) {
//                    if (jTable1.getValueAt(row, 7).toString().equals("Active")) {
//
//                        loadUsers();
//                    }
//                    if (jTable1.getValueAt(row, 7).toString().equals("In-Active")) {
//
//                    }
//                }
//            }
//        });
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField4ActionPerformed
    private void loadUserTypes() {

        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) jcomboBox1.getModel();
        jcomboBox1.setSelectedIndex(-1);
        try {
            ResultSet rs = MySql.sq("SELECT * FROM `user_type`");
            while (rs.next()) {

                String utn = rs.getString("user_type_name");

                jcomboBox1.addItem(utn);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JComboBox<String> jcomboBox1;
    // End of variables declaration//GEN-END:variables
}
