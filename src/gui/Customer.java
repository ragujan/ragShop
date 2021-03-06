/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui;

import UtilRag.BasicValidator;
import UtilRag.FilterDocRagRegex;
import UtilRag.InsertTable;
import UtilRag.JOP;
import UtilRag.LoadCatsNBrands;
import UtilRag.LoadTables;
import UtilRag.SetEmptyItems;
import com.formdev.flatlaf.IntelliJTheme;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.MySql;

/**
 *
 * @author acer
 */
public class Customer extends javax.swing.JDialog {

    /**
     * Creates new form Customer
     */
    JFrame jf;
    NewInvoice ni;

    public Customer(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();
        if (parent instanceof NewInvoice) {

            this.ni = (NewInvoice) parent;
            tableListernRag();
        }
        LoadCatsNBrands lcb = new LoadCatsNBrands();
        lcb.loadCities(jComboBox1);
        filterNameField();
        filterContactNumberField();
        loadCustomerTable();

    }

    public void tableListernRag() {
        jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int row = jTable1.getSelectedRow();
                if (row != -1) {

                    String cusid = jTable1.getValueAt(row, 0).toString();
                    String cusname = jTable1.getValueAt(row, 1).toString();
                    String cuscontact = jTable1.getValueAt(row, 2).toString();
                    String cuscity = jTable1.getValueAt(row, 3).toString();
                    ni.cusid.setText(cusid);
                    ni.cusname.setText(cusname);
                    ni.cuscontact.setText(cuscontact);
                }
            }

        });

    }

    public void filterNameField() {
        FilterDocRagRegex fdrr = new FilterDocRagRegex(jTextField1, "([a-z])+");
        fdrr.setDocFilter();
    }

    private void setComponentsEmpty() {
        JComponent[] jc = {jTextField1, jTextField2, jComboBox1};
        SetEmptyItems.emptyItems(jc);
    }

    public void filterContactNumberField() {
        String regex = "((([0][7][24-8][0-9]{7})|([0][7][24-8][0-9]*))|([0][7][24-8])|[0][7]|[0])";
        FilterDocRagRegex fdrr = new FilterDocRagRegex(jTextField2, regex);
        fdrr.setDocFilter();
    }

    public void loadCustomerTable() {
        String query = "SELECT * FROM customer INNER JOIN city ON city.city_id = customer.city_id";
        String[] colnames = {"customer_id", "customer_name", "contact_number", "city_name"};
        LoadTables lt = new LoadTables(jTable1, query, colnames);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer_Name");

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer_Contact");

        jComboBox1.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));

        jTextField1.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("City");

        jButton1.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Register Customer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jTable1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer_Id", "Customer_Name", "contact_number", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String cname = jTextField1.getText();
        String contact = jTextField2.getText();
        String city = jComboBox1.getSelectedItem().toString();
        boolean state = true;
        if (BasicValidator.emptyCheck(cname) || !BasicValidator.regexMatcher(cname, "([a-z])+")) {
            state = false;
            JOP.setJOPMessage(jf, "Not a valid input for customer", "Warning", 1);
        }
        if (BasicValidator.emptyCheck(contact) || BasicValidator.phoneNumber(contact)) {
            state = false;
            JOP.setJOPMessage(jf, "Not a valid input for contact", "Warning", 1);
        }
        System.out.println(BasicValidator.regexMatcher(city, "Select City"));
        System.out.println(BasicValidator.regexMatcher(city, "(([A-Za-z])+) (([A-Za-z])+)|(([A-Za-z])+)"));
        if (BasicValidator.emptyCheck(city) || !BasicValidator.regexMatcher(city, "(([A-Za-z])+) (([A-Za-z])+)|(([A-Za-z])+)") || BasicValidator.regexMatcher(city, "Select City")) {
            state = false;
            JOP.setJOPMessage(jf, "Not a valid input for city", "Warning", 1);
        }
        if (state) {

            try {
                ResultSet customerCheck = MySql.sq("SELECT * FROM `customer` WHERE `customer`.`contact_number`='" + contact + "'");
                if (customerCheck.next()) {
                    JOP.setJOPMessage(jf, "This contact number already exists", "Warning", 1);
                } else {
                    ResultSet getCity = MySql.sq("SELECT * FROM `city` WHERE `city`.`city_name`='" + city + "'");
                    getCity.next();
                    String cityId = getCity.getString("city_id");
                    ArrayList<String> al = new ArrayList<String>();
                    ArrayList<String> columnValueStringArray = new ArrayList<String>();
                    al.add(cname);
                    al.add(contact);
                    al.add(cityId);
                    InsertTable itc = new InsertTable("customer", al);
                    setComponentsEmpty();
                    loadCustomerTable();
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            IntelliJTheme.setup(SignIn.class.getResourceAsStream(
                    "../resources/Moonlight.theme.json"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Customer dialog = new Customer(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
