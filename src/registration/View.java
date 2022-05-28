package registration;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import net.proteanit.sql.DbUtils;

public class View extends javax.swing.JFrame {
    private byte[] image;

    /**
     * Creates new form View
     */
    public View() {
        initComponents();
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        display();
        //setBackground(new Color(0,0,0,0));
        jTable1.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,18));
        //jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(Color.cyan);
        //jTable1.getTableHeader().setForeground(new Color(255,255,255));
        jTable1.setRowHeight(50);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        TableColumn col1=jTable1.getColumnModel().getColumn(0);
        col1.setPreferredWidth(200);
        TableColumn col2=jTable1.getColumnModel().getColumn(1);
        col2.setPreferredWidth(200);
        TableColumn col3=jTable1.getColumnModel().getColumn(2);
        col3.setPreferredWidth(200);
        TableColumn col4=jTable1.getColumnModel().getColumn(3);
        col4.setPreferredWidth(200);
        TableColumn col5=jTable1.getColumnModel().getColumn(4);
        col5.setPreferredWidth(200);
        TableColumn col6=jTable1.getColumnModel().getColumn(5);
        col6.setPreferredWidth(200);
        TableColumn col7=jTable1.getColumnModel().getColumn(6);
        col7.setPreferredWidth(200);
        TableColumn col8=jTable1.getColumnModel().getColumn(7);
        col8.setPreferredWidth(200);
        TableColumn col9=jTable1.getColumnModel().getColumn(8);
        col9.setPreferredWidth(200);
        TableColumn col10=jTable1.getColumnModel().getColumn(9);
        col10.setPreferredWidth(200);
        TableColumn col11=jTable1.getColumnModel().getColumn(10);
        col11.setPreferredWidth(200);
        TableColumn col12=jTable1.getColumnModel().getColumn(11);
        col12.setPreferredWidth(200);
        TableColumn col13=jTable1.getColumnModel().getColumn(12);
        col13.setPreferredWidth(200);
        TableColumn col14=jTable1.getColumnModel().getColumn(13);
        col14.setPreferredWidth(200);
        TableColumn col15=jTable1.getColumnModel().getColumn(14);
        col15.setPreferredWidth(200);
        TableColumn col16=jTable1.getColumnModel().getColumn(15);
        col16.setPreferredWidth(200);
        TableColumn col17=jTable1.getColumnModel().getColumn(16);
        col17.setPreferredWidth(200);
        TableColumn col18=jTable1.getColumnModel().getColumn(17);
        col18.setPreferredWidth(200);
        TableColumn col19=jTable1.getColumnModel().getColumn(18);
        col19.setPreferredWidth(200);
        TableColumn col20=jTable1.getColumnModel().getColumn(19);
        col20.setPreferredWidth(200);
        TableColumn col21=jTable1.getColumnModel().getColumn(20);
        col21.setPreferredWidth(200);
        TableColumn col22=jTable1.getColumnModel().getColumn(21);
        col22.setPreferredWidth(200);
        TableColumn col23=jTable1.getColumnModel().getColumn(22);
        col23.setPreferredWidth(200);
        TableColumn col24=jTable1.getColumnModel().getColumn(23);
        col24.setPreferredWidth(200);
        TableColumn col25=jTable1.getColumnModel().getColumn(24);
        col25.setPreferredWidth(200);
        TableColumn col26=jTable1.getColumnModel().getColumn(25);
        col26.setPreferredWidth(200);
        TableColumn col27=jTable1.getColumnModel().getColumn(26);
        col27.setPreferredWidth(200);
        TableColumn col28=jTable1.getColumnModel().getColumn(27);
        col28.setPreferredWidth(200);
        TableColumn col29=jTable1.getColumnModel().getColumn(28);
        col29.setPreferredWidth(200);
        TableColumn col30=jTable1.getColumnModel().getColumn(29);
        col30.setPreferredWidth(200);
        TableColumn col31=jTable1.getColumnModel().getColumn(30);
        col31.setPreferredWidth(200);
        TableColumn col32=jTable1.getColumnModel().getColumn(31);
        col32.setPreferredWidth(200);
        TableColumn col33=jTable1.getColumnModel().getColumn(32);
        col33.setPreferredWidth(200);
        TableColumn col34=jTable1.getColumnModel().getColumn(33);
        col34.setPreferredWidth(200);
        TableColumn col35=jTable1.getColumnModel().getColumn(34);
        col35.setPreferredWidth(200);
        TableColumn col36=jTable1.getColumnModel().getColumn(35);
        col36.setPreferredWidth(200);
        TableColumn col37=jTable1.getColumnModel().getColumn(36);
        col37.setPreferredWidth(200);
        TableColumn col38=jTable1.getColumnModel().getColumn(37);
        col38.setPreferredWidth(200);
        TableColumn col39=jTable1.getColumnModel().getColumn(38);
        col39.setPreferredWidth(200);
        TableColumn col40=jTable1.getColumnModel().getColumn(39);
        col40.setPreferredWidth(200);
        TableColumn col41=jTable1.getColumnModel().getColumn(40);
        col41.setPreferredWidth(200);        
    }   
   
    private void display() {
        try {
            Connection c=new Connection();            
            ResultSet rs = c.s.executeQuery("select * from customer");
            while(rs.next())
            {
                String empid=String.valueOf(rs.getLong("emp_id"));
                String uanno=String.valueOf(rs.getLong("uan_no"));
                String esicno=String.valueOf(rs.getLong("esic_no"));
                String firstname=rs.getString("first_name");
                String middlename=rs.getString("middle_name");
                String lastname=rs.getString("last_name");
                String dob=String.valueOf(rs.getDate("dob"));
                String mobileno=String.valueOf(rs.getLong("mobile_no"));
                String marital=rs.getString("marital_status");
                String gender=rs.getString("gender");
                String currentAdd=rs.getString("current_add");
                String permanentAdd=rs.getString("permanent_add");
                String city=rs.getString("city");
                String pin=String.valueOf(rs.getLong("pin"));
                String district=rs.getString("district");
                String state=rs.getString("state");
                String prevemp=rs.getString("prev_emp");
                String zone=rs.getString("zone");
                String doj=String.valueOf(rs.getDate("doj"));
                String dol=String.valueOf(rs.getDate("dol"));
                String designation=rs.getString("designation");
                String qualification=rs.getString("qualification");
                String department=rs.getString("department");
                String empstatus=rs.getString("emp_status");
                String panno=rs.getString("pan_no");
                String electricity=String.valueOf(rs.getLong("electricity_no"));
                String aadhaar=String.valueOf(rs.getLong("aadhaar_no"));
                String bankname=rs.getString("bank_name");
                String serviceno=String.valueOf(rs.getLong("service_no"));
                String branch=rs.getString("branch");
                String bankAccNo=String.valueOf(rs.getLong("bank_acc_no"));
                String bocwno=String.valueOf(rs.getLong("bocw_no"));
                String ifsc=rs.getString("ifsc");
                String vaccinename=rs.getString("vaccine_name");
                String registration=String.valueOf(rs.getDate("registration_date"));
                String dose1=String.valueOf(rs.getDate("dose1"));
                String dose2=String.valueOf(rs.getDate("dose2"));
                String policyno=String.valueOf(rs.getLong("policy_no"));
                String policyissdate=String.valueOf(rs.getDate("policy_iss_date"));
                String policyenddate=String.valueOf(rs.getDate("policy_end_date"));              
                byte[] img =rs.getBytes("image");  
               
               
                Object tbData[]={empid,uanno,esicno,firstname,middlename,lastname,dob,mobileno,marital,gender,currentAdd,permanentAdd,city,pin,district,state,prevemp,zone,doj,dol,designation,qualification,department,empstatus,panno,electricity,aadhaar,bankname,
                serviceno,branch,bankAccNo,bocwno,ifsc,vaccinename,registration,dose1,dose2,policyno,policyissdate,policyenddate,img};
                DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();             
                
                tblModel.addRow(tbData);
                
            }
            //jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        photo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EMP ID", "UAN NO", "ESIC NO", "First Name", "Middle Name", "Last Name", "Date of Birth", "Mobile No", "Marital Status", "Gender", "Current Address", "Permanent Address", "City", "Pin", "Distric", "State", "Previous EMP", "Zone", "Date of Joining", "Date of Leaving", "Designation", "Qualification", "Department", "EMP Status", "PAN NO", "Electricity NO", "Aadhaar NO", "Bank Name", "Service NO", "Branch", "Bank Account Number", "BOCW NO", "IFSC CODE", "Vaccine Name", "Registration Date", "Dose 1", "Dose 2", "Policy NO", "Policy Issue Date", "Policy End Date", "Photo"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(232, 57, 95));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1055, 856));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row=jTable1.getSelectedRow();        
        String table_click=(jTable1.getModel().getValueAt(row,0).toString());
       
        try
        {
            Connection c=new Connection();            
            ResultSet rs = c.s.executeQuery("select * from customer where emp_id='"+table_click+"'");
        
            //Class.forName("com.mysql.jdbc.Driver");
            //java.sql.Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/registration","root","");
            
            
            while(rs.next())
            {  
                byte[] imagedata=rs.getBytes("image");
                ImageIcon image=new ImageIcon(imagedata);
               Image im = image.getImage();
               Image myimg = im.getScaledInstance(photo.getWidth(),photo.getHeight(),Image.SCALE_SMOOTH);
               ImageIcon newImage = new ImageIcon(myimg);
               photo.setIcon(newImage);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel photo;
    // End of variables declaration//GEN-END:variables
}
