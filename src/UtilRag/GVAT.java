/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UtilRag;

import javax.swing.JTable;

/**
 *
 * @author acer
 */
public class GVAT {
    public  JTable jts;
    public GVAT(JTable ljt){
        this.jts = ljt;
    }
    public  void setJT(JTable ljt){
        this.jts = ljt;
    }
    public  String col(int row,int pos){
        String colname = this.jts.getValueAt(row, pos).toString();
        return colname;
    }
}
