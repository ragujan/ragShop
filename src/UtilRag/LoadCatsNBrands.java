/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UtilRag;

import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import model.MySql;

/**
 *
 * @author acer
 */
public class LoadCatsNBrands {

    public void loadCats(JComboBox jcombobox) {

        DefaultComboBoxModel dcmb = (DefaultComboBoxModel) jcombobox.getModel();
        jcombobox.removeAllItems();
        dcmb.setSelectedItem("Select Category");
        try {
            ResultSet rs = MySql.sq("SELECT * FROM `category`");
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("category_id"));
                v.add(rs.getString("category_name"));
                String utn = rs.getString("category_name");

                jcombobox.addItem(utn);
             
            }
        } catch (Exception e) {
        }
    }

    public void loadBrands(JComboBox jcombobox) {

        DefaultComboBoxModel dcmb = (DefaultComboBoxModel) jcombobox.getModel();
        jcombobox.removeAllItems();
        dcmb.setSelectedItem("Select Brand");
        try {
            ResultSet rs = MySql.sq("SELECT * FROM `brand`");
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("brand_id"));
                v.add(rs.getString("brand_name"));
                String utn = rs.getString("brand_name");

                jcombobox.addItem(utn);
              
            }
        } catch (Exception e) {
        }
    }
}
