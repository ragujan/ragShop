package TestingShit;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author acer
 */
public class JasperReportTest {

    public static void main(String[] args) {
        try {
//            String fpath = "src//reports//Test.jasper";
//            HashMap hm = new HashMap();
//            hm.put("Parameter1","rag");
//            Date date = new Date();
//            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
//            
//            hm.put("Parameter2", sdf.format(date));
//            JREmptyDataSource jreds = new JREmptyDataSource();
//            JasperPrint jp = JasperFillManager.fillReport(fpath, hm,jreds);
//            JasperViewer.viewReport(jp);

            String jspath = "src//reports//Test.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(jspath);
            HashMap hm = new HashMap();
            hm.put("Parameter1", "rag");
            hm.put("Parameter2", "123");
            
            JREmptyDataSource jreds = new JREmptyDataSource();
            JasperPrint jp = JasperFillManager.fillReport(jr, hm,jreds);
            JasperViewer.viewReport(jp);
        } catch (Exception e) {
        }
    }
}
