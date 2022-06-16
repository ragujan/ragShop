/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UtilRag;

import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import model.MySql;

/**
 *
 * @author acer
 */
public class InsertTable {

    public InsertTable(String tableName, ArrayList<String> columnValueStringArray) {
        this.tableName = tableName;
        this.columnValueStringArray = columnValueStringArray;
        setColumnQuery(tableName);
        this.getColumnNames();
        this.setInsertQueryTable();
        this.setValuesforColumns();
        this.insertExecuteQuery();
    }

    String query;
    private String tableName;
    private String columnQuery;
    private String columnName;
    private ArrayList<String> columnNameStringArray = new ArrayList<String>();
    private ArrayList<String> columnValueStringArray = new ArrayList<String>();

    private void setColumnQuery(String tableName) {
        this.columnQuery = "SELECT *\n"
                + "FROM INFORMATION_SCHEMA.COLUMNS\n"
                + "WHERE TABLE_SCHEMA = 'ragmodelshopapp' AND TABLE_NAME = '" + tableName + "' AND EXTRA !='auto_increment'";
    }

    private void setTableName(String tableName) {
        this.tableName = tableName;
    }

    private ResultSet getColumnNames() {

        ResultSet columnNameRs = null;

        try {
            ResultSet columnNameRsResult = MySql.sq(columnQuery);
            columnNameRs = columnNameRsResult;
            while (columnNameRsResult.next()) {
                columnNameStringArray.add(columnNameRsResult.getString("COLUMN_NAME"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return columnNameRs;
    }

    private void setInsertQueryTable() {
        String query;
        this.query = "INSERT INTO " + this.tableName + " (";

        for (int i = 0; i < this.columnNameStringArray.size(); i++) {
            this.query += this.columnNameStringArray.get(i);

            if (i != this.columnNameStringArray.size() - 1) {
                this.query += ",";
            }
        }
        this.query += ") VALUES (";

    }

    private void setValuesforColumns() {
        for (int i = 0; i < columnValueStringArray.size(); i++) {
            this.query += " '" + this.columnValueStringArray.get(i) + "' ";

            if (i != this.columnValueStringArray.size() - 1) {
                this.query += ",";
            }
        }
        this.query += ");";

    }

    private void insertExecuteQuery() {
        try {
            MySql.iud(this.query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//class Test {
//
//    public static void main(String[] args) {
//        ArrayList<String> columnValueStringArray = new ArrayList<String>();
//        columnValueStringArray.add("rag");
//        columnValueStringArray.add("rag");
//        columnValueStringArray.add("1");
//        InsertTable itc = new InsertTable("customer", columnValueStringArray);
//        System.out.println(itc.query);
//
//    }
//}
