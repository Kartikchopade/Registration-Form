package registration;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.math.BigInteger;
import java.util.Date;



public class Registration_Form extends javax.swing.JFrame {

    byte[] pimage=null;
    private ImageIcon format=null;
    String fname=null;   
    long increment_id;
    
    public Registration_Form() {
        initComponents();
        getincrementid(); 
        seticon();
    }  
    
    
    
    public void getincrementid()
    {
        try
        {
            Connection c=new Connection();
            ResultSet rs=c.s.executeQuery("select max(emp_id) from customer");
            if(rs.next())
            {
                increment_id=rs.getLong(1);
                increment_id++;
                empId.setText(Long.toString(increment_id));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }
    public ImageIcon resizeImage(String imagePath, byte[] pic){
          
        ImageIcon myImage=null;
        if(imagePath !=null)
        {
        myImage=new ImageIcon(imagePath);
        
        }else{
         myImage=new ImageIcon(pic);
        }
                
        Image img=myImage.getImage();
        Image img2=img.getScaledInstance(photo.getHeight(),photo.getWidth(),Image.SCALE_SMOOTH);
        ImageIcon image=new ImageIcon(img2);
        return image;
    } 

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rsUpdate = new rojeru_san.complementos.RSButtonHover();
        rsDelete = new rojeru_san.complementos.RSButtonHover();
        rsView = new rojeru_san.complementos.RSButtonHover();
        rsRecipt = new rojeru_san.complementos.RSButtonHover();
        rsReset = new rojeru_san.complementos.RSButtonHover();
        rsInsert = new rojeru_san.complementos.RSButtonHover();
        jLabel2 = new javax.swing.JLabel();
        empId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        uanNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        esicNo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        middleName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        dateofbirth = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        mobileNo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        single = new javax.swing.JRadioButton();
        married = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        currentAddress = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        permanentAddress = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        pinCode = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        district = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        state = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        previous_Emp = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        zone = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        date_of_joining = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        date_of_leaving = new com.toedter.calendar.JDateChooser();
        jLabel22 = new javax.swing.JLabel();
        designation = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        qualification = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        department = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        empStatus = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        panNo = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        electricity = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        aadhaarNo = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        bankName = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        serviceNo = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        branch = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        bankAccountNo = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        ifscCode = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        vaccineName = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel36 = new javax.swing.JLabel();
        registrationDate = new com.toedter.calendar.JDateChooser();
        jLabel37 = new javax.swing.JLabel();
        doseOne = new com.toedter.calendar.JDateChooser();
        jLabel38 = new javax.swing.JLabel();
        doseTwo = new com.toedter.calendar.JDateChooser();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        policyIssueDate = new com.toedter.calendar.JDateChooser();
        jLabel41 = new javax.swing.JLabel();
        policyEndDate = new com.toedter.calendar.JDateChooser();
        jLabel42 = new javax.swing.JLabel();
        uploadImage = new rojeru_san.complementos.RSButtonHover();
        photo = new javax.swing.JLabel();
        path = new javax.swing.JLabel();
        aadhaarSearch = new rojeru_san.complementos.RSButtonHover();
        bocwNo = new javax.swing.JTextField();
        policyNo = new javax.swing.JTextField();
        esicSearch = new rojeru_san.complementos.RSButtonHover();
        uanSearch = new rojeru_san.complementos.RSButtonHover();
        employeeSearch = new rojeru_san.complementos.RSButtonHover();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration Form");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 255, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 181, 204));
        jLabel1.setText("Customer Registartion Form");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        rsUpdate.setBackground(new java.awt.Color(255, 255, 255));
        rsUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 181, 204)));
        rsUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update.png"))); // NOI18N
        rsUpdate.setText("Update");
        rsUpdate.setColorText(new java.awt.Color(0, 181, 204));
        rsUpdate.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        rsUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsUpdateActionPerformed(evt);
            }
        });

        rsDelete.setBackground(new java.awt.Color(255, 255, 255));
        rsDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 181, 204)));
        rsDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        rsDelete.setText("Delete");
        rsDelete.setColorText(new java.awt.Color(0, 181, 204));
        rsDelete.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        rsDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsDeleteActionPerformed(evt);
            }
        });

        rsView.setBackground(new java.awt.Color(255, 255, 255));
        rsView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 181, 204)));
        rsView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/view.png"))); // NOI18N
        rsView.setText("View");
        rsView.setColorText(new java.awt.Color(0, 181, 204));
        rsView.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        rsView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rsViewMouseClicked(evt);
            }
        });
        rsView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsViewActionPerformed(evt);
            }
        });

        rsRecipt.setBackground(new java.awt.Color(255, 255, 255));
        rsRecipt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 181, 204)));
        rsRecipt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/invoice.png"))); // NOI18N
        rsRecipt.setText("Recipt");
        rsRecipt.setColorText(new java.awt.Color(0, 181, 204));
        rsRecipt.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N

        rsReset.setBackground(new java.awt.Color(255, 255, 255));
        rsReset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 181, 204)));
        rsReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/reset.png"))); // NOI18N
        rsReset.setText("Reset");
        rsReset.setColorText(new java.awt.Color(0, 181, 204));
        rsReset.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        rsReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsResetActionPerformed(evt);
            }
        });

        rsInsert.setBackground(new java.awt.Color(255, 255, 255));
        rsInsert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 181, 204)));
        rsInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/insert.png"))); // NOI18N
        rsInsert.setText("Insert");
        rsInsert.setColorText(new java.awt.Color(0, 181, 204));
        rsInsert.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        rsInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsInsertActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Employee ID:");

        empId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        empId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        empId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                empIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                empIdFocusLost(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("UAN No:");

        uanNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uanNo.setText("Enter UAN Number");
        uanNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        uanNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                uanNoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                uanNoFocusLost(evt);
            }
        });
        uanNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uanNoKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("ESIC No:");

        esicNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        esicNo.setText("Enter ESIC Number");
        esicNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        esicNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                esicNoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                esicNoFocusLost(evt);
            }
        });
        esicNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                esicNoKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("First Name:");

        firstName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        firstName.setText("Enter First Name");
        firstName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        firstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNameFocusLost(evt);
            }
        });
        firstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                firstNameKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Middle Name:");

        middleName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        middleName.setText("Enter Middle Name");
        middleName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        middleName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                middleNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                middleNameFocusLost(evt);
            }
        });
        middleName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middleNameActionPerformed(evt);
            }
        });
        middleName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                middleNameKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("Last Name:");

        lastName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lastName.setText("Enter Last Name");
        lastName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastNameFocusLost(evt);
            }
        });
        lastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lastNameKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("Date of Birth:");

        dateofbirth.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel9.setText("Mobile Number:");

        mobileNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mobileNo.setText("Enter Mobile Number");
        mobileNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mobileNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mobileNoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mobileNoFocusLost(evt);
            }
        });
        mobileNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mobileNoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mobileNoKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel10.setText("Marital Status:");

        single.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(single);
        single.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        single.setText("Single");

        married.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(married);
        married.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        married.setText("Married");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel11.setText("Gender:");

        male.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(male);
        male.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        male.setText("Male");

        female.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(female);
        female.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        female.setText("Female");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel12.setText("Current Address:");

        currentAddress.setColumns(20);
        currentAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        currentAddress.setRows(5);
        jScrollPane1.setViewportView(currentAddress);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel13.setText("Permanent Address:");

        permanentAddress.setColumns(20);
        permanentAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        permanentAddress.setRows(5);
        jScrollPane2.setViewportView(permanentAddress);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel14.setText("City:");

        city.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        city.setText("Enter City Name");
        city.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        city.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cityFocusLost(evt);
            }
        });
        city.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cityKeyTyped(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel15.setText("Pin Code:");

        pinCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pinCode.setText("Enter Pin Code");
        pinCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pinCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pinCodeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pinCodeFocusLost(evt);
            }
        });
        pinCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pinCodeKeyPressed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel16.setText("District:");

        district.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        district.setText("Enter District Name");
        district.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        district.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                districtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                districtFocusLost(evt);
            }
        });
        district.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                districtKeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel17.setText("State:");

        state.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        state.setText("Enter State Name");
        state.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        state.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                stateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                stateFocusLost(evt);
            }
        });
        state.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stateKeyTyped(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel18.setText("Previous Emp:");

        previous_Emp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        previous_Emp.setText("Previous Employee");
        previous_Emp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        previous_Emp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                previous_EmpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                previous_EmpFocusLost(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel19.setText("Zone:");

        zone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        zone.setText("Enter Zone");
        zone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        zone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                zoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                zoneFocusLost(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel20.setText("Date of Joining:");

        date_of_joining.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel21.setText("Date of Leaving:");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel22.setText("Designation:");

        designation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        designation.setText("Enter Designation");
        designation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        designation.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                designationFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                designationFocusLost(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel23.setText("Qualification:");

        qualification.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qualification.setText("Enter Qualification");
        qualification.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        qualification.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                qualificationFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                qualificationFocusLost(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel24.setText("Department:");

        department.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        department.setText("Enter Department");
        department.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        department.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                departmentFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                departmentFocusLost(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel25.setText("Employee Status:");

        empStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        empStatus.setText("Enter Employee Status");
        empStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        empStatus.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                empStatusFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                empStatusFocusLost(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel26.setText("PAN No:");

        panNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        panNo.setText("Enter Pan Card Number");
        panNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                panNoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                panNoFocusLost(evt);
            }
        });
        panNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panNoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                panNoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                panNoKeyTyped(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel27.setText("Electricity:");

        electricity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        electricity.setText("Enter Electricity Number");
        electricity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        electricity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                electricityFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                electricityFocusLost(evt);
            }
        });
        electricity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                electricityKeyTyped(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel28.setText("Aadhaar No:");

        aadhaarNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        aadhaarNo.setText("Enter Aadhaar Number");
        aadhaarNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        aadhaarNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                aadhaarNoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                aadhaarNoFocusLost(evt);
            }
        });
        aadhaarNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                aadhaarNoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                aadhaarNoKeyTyped(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel29.setText("Bank Name:");

        bankName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bankName.setText("Enter Bank Name");
        bankName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bankName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bankNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bankNameFocusLost(evt);
            }
        });
        bankName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bankNameKeyTyped(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel30.setText("Service Number:");

        serviceNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        serviceNo.setText("Enter Service Number");
        serviceNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        serviceNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                serviceNoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                serviceNoFocusLost(evt);
            }
        });
        serviceNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                serviceNoKeyTyped(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel31.setText("Branch:");

        branch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        branch.setText("Enter Branch Name");
        branch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        branch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                branchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                branchFocusLost(evt);
            }
        });
        branch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                branchKeyTyped(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel32.setText("Bank Account No:");

        bankAccountNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bankAccountNo.setText("Enter Account Number");
        bankAccountNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bankAccountNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bankAccountNoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bankAccountNoFocusLost(evt);
            }
        });
        bankAccountNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bankAccountNoKeyTyped(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel33.setText("Bocw No:");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel34.setText("IFSC Code:");

        ifscCode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ifscCode.setText("Enter IFSC Code");
        ifscCode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ifscCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ifscCodeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ifscCodeFocusLost(evt);
            }
        });
        ifscCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ifscCodeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ifscCodeKeyReleased(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel35.setText("Vaccine Name:");

        vaccineName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        vaccineName.setText("Enter Vaccine Name");
        vaccineName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vaccineName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                vaccineNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                vaccineNameFocusLost(evt);
            }
        });
        vaccineName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                vaccineNameKeyTyped(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel36.setText("Registration Date:");

        jLabel37.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel37.setText("Dose 1 Date:");

        jLabel38.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel38.setText("Dose 2 Date:");

        jLabel39.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel39.setText("Policy No:");

        jLabel40.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel40.setText("Policy Issue Date:");

        jLabel41.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel41.setText("Policy End Date:");

        jLabel42.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel42.setText("Upload Image:");

        uploadImage.setBackground(new java.awt.Color(255, 255, 255));
        uploadImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 181, 204)));
        uploadImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/upload.png"))); // NOI18N
        uploadImage.setText("Upload Image");
        uploadImage.setColorText(new java.awt.Color(0, 181, 204));
        uploadImage.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        uploadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadImageActionPerformed(evt);
            }
        });

        photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        path.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        path.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        aadhaarSearch.setBackground(new java.awt.Color(255, 255, 255));
        aadhaarSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 181, 204)));
        aadhaarSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        aadhaarSearch.setColorText(new java.awt.Color(0, 181, 204));
        aadhaarSearch.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        aadhaarSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aadhaarSearchActionPerformed(evt);
            }
        });

        bocwNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bocwNo.setText("Enter Bocw Number");
        bocwNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bocwNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bocwNoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bocwNoFocusLost(evt);
            }
        });
        bocwNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bocwNoKeyTyped(evt);
            }
        });

        policyNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        policyNo.setText("Enter Policy Number");
        policyNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                policyNoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                policyNoFocusLost(evt);
            }
        });
        policyNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                policyNoKeyTyped(evt);
            }
        });

        esicSearch.setBackground(new java.awt.Color(255, 255, 255));
        esicSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 181, 204)));
        esicSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        esicSearch.setColorText(new java.awt.Color(0, 181, 204));
        esicSearch.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        esicSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esicSearchActionPerformed(evt);
            }
        });

        uanSearch.setBackground(new java.awt.Color(255, 255, 255));
        uanSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 181, 204)));
        uanSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        uanSearch.setColorText(new java.awt.Color(0, 181, 204));
        uanSearch.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        uanSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uanSearchActionPerformed(evt);
            }
        });

        employeeSearch.setBackground(new java.awt.Color(255, 255, 255));
        employeeSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 181, 204)));
        employeeSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        employeeSearch.setColorText(new java.awt.Color(0, 181, 204));
        employeeSearch.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        employeeSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(mobileNo, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(state, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                    .addComponent(city, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(single, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                                        .addComponent(male, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(married, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(female, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                            .addComponent(district)
                                            .addComponent(pinCode, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(dateofbirth, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                            .addComponent(lastName)))
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(92, 92, 92))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(uanNo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(esicNo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(middleName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(esicSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(uanSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(empId, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(employeeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(previous_Emp, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(branch)
                                                    .addComponent(bankAccountNo, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                                    .addComponent(ifscCode)
                                                    .addComponent(vaccineName)
                                                    .addComponent(bocwNo)
                                                    .addComponent(serviceNo))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(bankName, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(aadhaarNo))
                                                .addGap(12, 12, 12)))
                                        .addComponent(aadhaarSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(electricity, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(panNo, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(empStatus, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(department, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(qualification, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(designation, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(date_of_leaving, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                            .addComponent(date_of_joining, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(zone))
                                        .addGap(75, 75, 75)))))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(registrationDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(doseOne, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                            .addComponent(doseTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(policyIssueDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(policyEndDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(uploadImage, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                            .addComponent(policyNo))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator2))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rsInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rsUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rsDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rsView, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rsRecipt, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rsReset, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(623, 623, 623))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(527, 527, 527)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rsUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rsDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rsRecipt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rsView, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rsReset, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rsInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(employeeSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(empId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(uanNo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(uanSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(esicSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(esicNo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(middleName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dateofbirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(single)
                            .addComponent(married, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(male)
                            .addComponent(female, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(108, 108, 108)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(255, 255, 255))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(city))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(pinCode, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(district, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(registrationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doseOne, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doseTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(policyNo))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(policyIssueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(policyEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uploadImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(previous_Emp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(date_of_joining, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(date_of_leaving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(designation, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qualification, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(department, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panNo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(electricity, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aadhaarSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(aadhaarNo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel28)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bankName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(serviceNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(branch))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(bankAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(bocwNo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ifscCode, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vaccineName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1483, 1025));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void uploadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadImageActionPerformed
       
       JFileChooser fchoser=new JFileChooser();       
       fchoser.setCurrentDirectory(new File("user.dir"));       
       FileNameExtensionFilter filter=new FileNameExtensionFilter("All Pic","png","jpg","jpeg","gif");
       fchoser.addChoosableFileFilter(filter);       
        fchoser.showOpenDialog(null);
        File f=fchoser.getSelectedFile();
        fname=f.getAbsolutePath();  
        path.setText(fname);
        ImageIcon micon=new ImageIcon(fname);        
        try {
            File image=new File(fname);
            FileInputStream fis=new FileInputStream(image);
            ByteArrayOutputStream baos=new ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            for(int readnum; (readnum=fis.read(buf)) !=-1;)
            {            
                baos.write(buf,0,readnum);                
            }
            pimage=baos.toByteArray();
            photo.setIcon(resizeImage(fname, buf));
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Something Went Wrong!");
        }       
    }//GEN-LAST:event_uploadImageActionPerformed

    private void uanNoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uanNoFocusGained
        // TODO add your handling code here:
        if(uanNo.getText().equals("Enter UAN Number"))
        {
            uanNo.setText("");            
        }
    }//GEN-LAST:event_uanNoFocusGained

    private void uanNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uanNoFocusLost
        // TODO add your handling code here:
        if(uanNo.getText().equals(""))
        {
            uanNo.setText("Enter UAN Number");            
        }
    }//GEN-LAST:event_uanNoFocusLost

    private void uanNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uanNoKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!Character.isDigit(c))
        {
            evt.consume();
            
        }
        
    }//GEN-LAST:event_uanNoKeyTyped

    private void esicNoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_esicNoFocusGained
        // TODO add your handling code here:
        if(esicNo.getText().equals("Enter ESIC Number"))
        {
            esicNo.setText("");            
        }
    }//GEN-LAST:event_esicNoFocusGained

    private void esicNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_esicNoFocusLost
        // TODO add your handling code here:
        if(esicNo.getText().equals(""))
        {
            esicNo.setText("Enter ESIC Number");            
        }
    }//GEN-LAST:event_esicNoFocusLost

    private void esicNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_esicNoKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!Character.isDigit(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_esicNoKeyTyped

    private void firstNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFocusGained
        // TODO add your handling code here:
        if(firstName.getText().equals("Enter First Name"))
        {
            firstName.setText("");            
        }
    }//GEN-LAST:event_firstNameFocusGained

    private void firstNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFocusLost
        // TODO add your handling code here:
        if(firstName.getText().equals(""))
        {
            firstName.setText("Enter First Name");            
        }
    }//GEN-LAST:event_firstNameFocusLost

    private void firstNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
        {
            firstName.setEditable(true);
        }
        else
        {
           firstName.setEditable(false); 
        }
    }//GEN-LAST:event_firstNameKeyTyped

    private void middleNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middleNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middleNameActionPerformed

    private void middleNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_middleNameFocusGained
        // TODO add your handling code here:
         if(middleName.getText().equals("Enter Middle Name"))
        {
            middleName.setText("");            
        }
    }//GEN-LAST:event_middleNameFocusGained

    private void middleNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_middleNameFocusLost
        // TODO add your handling code here:
        if(middleName.getText().equals(""))
        {
            middleName.setText("Enter Middle Name");            
        }
    }//GEN-LAST:event_middleNameFocusLost

    private void middleNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_middleNameKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
        {
            middleName.setEditable(true);
        }
        else
        {
           middleName.setEditable(false); 
        }
    }//GEN-LAST:event_middleNameKeyTyped

    private void lastNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameFocusGained
        // TODO add your handling code here:
         if(lastName.getText().equals("Enter Last Name"))
        {
            lastName.setText("");            
        }
    }//GEN-LAST:event_lastNameFocusGained

    private void lastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameFocusLost
        // TODO add your handling code here:
        if(lastName.getText().equals(""))
        {
            lastName.setText("Enter Last Name");            
        }
    }//GEN-LAST:event_lastNameFocusLost

    private void lastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
        {
            lastName.setEditable(true);
        }
        else
        {
           lastName.setEditable(false); 
        }
    }//GEN-LAST:event_lastNameKeyTyped

    private void mobileNoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobileNoFocusGained
        // TODO add your handling code here:
        if(mobileNo.getText().equals("Enter Mobile Number"))
        {
            mobileNo.setText("");            
        }
    }//GEN-LAST:event_mobileNoFocusGained

    private void mobileNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobileNoFocusLost
        // TODO add your handling code here:
        if(mobileNo.getText().equals(""))
        {
            mobileNo.setText("Enter Mobile Number");            
        }
    }//GEN-LAST:event_mobileNoFocusLost

    private void mobileNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileNoKeyTyped
        // TODO add your handling code here:       
    }//GEN-LAST:event_mobileNoKeyTyped

    private void mobileNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileNoKeyPressed
        // TODO add your handling code here:
         String phoneNumber=mobileNo.getText();
        int length=phoneNumber.length();
        char c=evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
        {
            if(length<10)
            {
                mobileNo.setEditable(true);
            }
            else
            {
                mobileNo.setEditable(false);
            }
        }
        else
        {
              if(evt.getExtendedKeyCode()==KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
              {
                  mobileNo.setEditable(true);
              }
              else
              {
                  mobileNo.setEditable(false);
              }
        }
    }//GEN-LAST:event_mobileNoKeyPressed

    private void cityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cityFocusGained
        // TODO add your handling code here:
        if(city.getText().equals("Enter City Name"))
        {
            city.setText("");            
        }
    }//GEN-LAST:event_cityFocusGained

    private void cityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cityFocusLost
        // TODO add your handling code here:
        if(city.getText().equals(""))
        {
            city.setText("Enter City Name");            
        }
    }//GEN-LAST:event_cityFocusLost

    private void cityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cityKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
        {
            city.setEditable(true);
        }
        else
        {
           city.setEditable(false); 
        }
        
    }//GEN-LAST:event_cityKeyTyped

    private void pinCodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pinCodeFocusGained
        // TODO add your handling code here:
        if(pinCode.getText().equals("Enter Pin Code"))
        {
            pinCode.setText("");            
        }
    }//GEN-LAST:event_pinCodeFocusGained

    private void pinCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pinCodeFocusLost
        // TODO add your handling code here:
        if(pinCode.getText().equals(""))
        {
            pinCode.setText("Enter Pin Code");            
        }
    }//GEN-LAST:event_pinCodeFocusLost

    private void pinCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pinCodeKeyPressed
        // TODO add your handling code here:
        String phoneNumber=pinCode.getText();
        int length=phoneNumber.length();
        char c=evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
        {
            if(length<6)
            {
                pinCode.setEditable(true);
            }
            else
            {
                pinCode.setEditable(false);
            }
        }
        else
        {
              if(evt.getExtendedKeyCode()==KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
              {
                  pinCode.setEditable(true);
              }
              else
              {
                  pinCode.setEditable(false);
              }
        }
    }//GEN-LAST:event_pinCodeKeyPressed

    private void districtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_districtFocusGained
        // TODO add your handling code here:
        if(district.getText().equals("Enter District Name"))
        {
                district.setText("");            
        }
    }//GEN-LAST:event_districtFocusGained

    private void districtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_districtFocusLost
        // TODO add your handling code here:
        if(district.getText().equals(""))
        {
            district.setText("Enter District Name");            
        }
    }//GEN-LAST:event_districtFocusLost

    private void districtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_districtKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
        {
            district.setEditable(true);
        }
        else
        {
           district.setEditable(false); 
        }
    }//GEN-LAST:event_districtKeyTyped

    private void stateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_stateFocusGained
        // TODO add your handling code here:
        if(state.getText().equals("Enter State Name"))
        {
                state.setText("");            
        }
    }//GEN-LAST:event_stateFocusGained

    private void stateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_stateFocusLost
        // TODO add your handling code here:
        if(state.getText().equals(""))
        {
            state.setText("Enter State Name");            
        }
    }//GEN-LAST:event_stateFocusLost

    private void stateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stateKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
        {
            state.setEditable(true);
        }
        else
        {
           state.setEditable(false); 
        }
    }//GEN-LAST:event_stateKeyTyped

    private void previous_EmpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_previous_EmpFocusGained
        // TODO add your handling code here:
        if(previous_Emp.getText().equals("Previous Employee"))
        {
                previous_Emp.setText("");            
        }
    }//GEN-LAST:event_previous_EmpFocusGained

    private void previous_EmpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_previous_EmpFocusLost
        // TODO add your handling code here:
        if(previous_Emp.getText().equals(""))
        {
            previous_Emp.setText("Previous Employee");            
        }
    }//GEN-LAST:event_previous_EmpFocusLost

    private void zoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_zoneFocusGained
        // TODO add your handling code here:
        if(zone.getText().equals("Enter Zone"))
        {
                zone.setText("");            
        }
    }//GEN-LAST:event_zoneFocusGained

    private void zoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_zoneFocusLost
        // TODO add your handling code here:
         if(zone.getText().equals(""))
        {
            zone.setText("Enter Zone");            
        }
    }//GEN-LAST:event_zoneFocusLost

    private void designationFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_designationFocusGained
        // TODO add your handling code here:
        if(designation.getText().equals("Enter Designation"))
        {
                designation.setText("");            
        }
    }//GEN-LAST:event_designationFocusGained

    private void designationFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_designationFocusLost
        // TODO add your handling code here:
         if(designation.getText().equals(""))
        {
            designation.setText("Enter Designation");            
        }
    }//GEN-LAST:event_designationFocusLost

    private void qualificationFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qualificationFocusGained
        // TODO add your handling code here:
         if(qualification.getText().equals("Enter Qualification"))
        {
                qualification.setText("");            
        }
    }//GEN-LAST:event_qualificationFocusGained

    private void qualificationFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qualificationFocusLost
        // TODO add your handling code here:
        if(qualification.getText().equals(""))
        {
            qualification.setText("Enter Qualification");            
        }
    }//GEN-LAST:event_qualificationFocusLost

    private void departmentFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_departmentFocusGained
        // TODO add your handling code here:
        if(department.getText().equals("Enter Department"))
        {
                department.setText("");            
        }
    }//GEN-LAST:event_departmentFocusGained

    private void departmentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_departmentFocusLost
        // TODO add your handling code here:
        if(department.getText().equals(""))
        {
            department.setText("Enter Department");            
        }
    }//GEN-LAST:event_departmentFocusLost

    private void empStatusFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_empStatusFocusGained
        // TODO add your handling code here:
        if(empStatus.getText().equals("Enter Employee Status"))
        {
                empStatus.setText("");            
        }
    }//GEN-LAST:event_empStatusFocusGained

    private void empStatusFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_empStatusFocusLost
        // TODO add your handling code here:
        if(empStatus.getText().equals(""))
        {
            empStatus.setText("Enter Employee Status");            
        }
    }//GEN-LAST:event_empStatusFocusLost

    private void panNoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panNoFocusGained
        // TODO add your handling code here:
        if(panNo.getText().equals("Enter Pan Card Number"))
        {
                panNo.setText("");            
        }
    }//GEN-LAST:event_panNoFocusGained

    private void panNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panNoFocusLost
        // TODO add your handling code here:
        if(panNo.getText().equals(""))
        {
            panNo.setText("Enter Pan Card Number");            
        }
    }//GEN-LAST:event_panNoFocusLost

    private void panNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panNoKeyTyped
       
    }//GEN-LAST:event_panNoKeyTyped

    private void panNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panNoKeyReleased
        // TODO add your handling code here: 
        panNo.setText(panNo.getText().toUpperCase());     
        
    }//GEN-LAST:event_panNoKeyReleased

    private void panNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panNoKeyPressed
      String pan1=panNo.getText();
        int pan2=pan1.length();
        //int c=evt.getKeyChar();
        if(pan2<10 || evt.getExtendedKeyCode()==KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
        {             
                panNo.setEditable(true);           
        }
        else
        {
            panNo.setEditable(false);
        }
    }//GEN-LAST:event_panNoKeyPressed

    private void electricityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_electricityFocusGained
        // TODO add your handling code here:
        if(electricity.getText().equals("Enter Electricity Number"))
        {
                electricity.setText("");            
        }
    }//GEN-LAST:event_electricityFocusGained

    private void electricityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_electricityFocusLost
        // TODO add your handling code here:
        if(electricity.getText().equals(""))
        {
            electricity.setText("Enter Electricity Number");            
        }
    }//GEN-LAST:event_electricityFocusLost

    private void electricityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_electricityKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!Character.isDigit(c))
        {
            evt.consume();
            
        }
    }//GEN-LAST:event_electricityKeyTyped

    private void aadhaarNoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aadhaarNoFocusGained
        // TODO add your handling code here:
        if(aadhaarNo.getText().equals("Enter Aadhaar Number"))
        {
                aadhaarNo.setText("");            
        }
    }//GEN-LAST:event_aadhaarNoFocusGained

    private void aadhaarNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aadhaarNoFocusLost
        // TODO add your handling code here:
        if(aadhaarNo.getText().equals(""))
        {
            aadhaarNo.setText("Enter Aadhaar Number");            
        }
    }//GEN-LAST:event_aadhaarNoFocusLost

    private void aadhaarNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aadhaarNoKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_aadhaarNoKeyTyped

    private void aadhaarNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aadhaarNoKeyPressed
        // TODO add your handling code here:
        String phoneNumber=aadhaarNo.getText();
        int length=phoneNumber.length();
        char c=evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
        {
            if(length<12)
            {
                aadhaarNo.setEditable(true);
            }
            else
            {
                aadhaarNo.setEditable(false);
            }
        }
        else
        {
              if(evt.getExtendedKeyCode()==KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
              {
                  aadhaarNo.setEditable(true);
              }
              else
              {
                  aadhaarNo.setEditable(false);
              }
        }
    }//GEN-LAST:event_aadhaarNoKeyPressed

    private void bankNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bankNameFocusGained
        // TODO add your handling code here:
        if(bankName.getText().equals("Enter Bank Name"))
        {
                bankName.setText("");            
        }
    }//GEN-LAST:event_bankNameFocusGained

    private void bankNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bankNameFocusLost
        // TODO add your handling code here:
        if(bankName.getText().equals(""))
        {
            bankName.setText("Enter Bank Name");            
        }
    }//GEN-LAST:event_bankNameFocusLost

    private void bankNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bankNameKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
        {
            bankName.setEditable(true);
        }
        else
        {
           bankName.setEditable(false); 
        }
    }//GEN-LAST:event_bankNameKeyTyped

    private void serviceNoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_serviceNoFocusGained
        // TODO add your handling code here:
         if(serviceNo.getText().equals("Enter Service Number"))
        {
                serviceNo.setText("");            
        }
    }//GEN-LAST:event_serviceNoFocusGained

    private void serviceNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_serviceNoFocusLost
        // TODO add your handling code here:
         if(serviceNo.getText().equals(""))
        {
            serviceNo.setText("Enter Service Number");            
        }
    }//GEN-LAST:event_serviceNoFocusLost

    private void serviceNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serviceNoKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!Character.isDigit(c))
        {
            evt.consume();
            
        }
    }//GEN-LAST:event_serviceNoKeyTyped

    private void branchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_branchFocusGained
        // TODO add your handling code here:
        if(branch.getText().equals("Enter Branch Name"))
        {
                branch.setText("");            
        }
    }//GEN-LAST:event_branchFocusGained

    private void branchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_branchFocusLost
        // TODO add your handling code here:
         if(branch.getText().equals(""))
        {
            branch.setText("Enter Branch Name");            
        }
    }//GEN-LAST:event_branchFocusLost

    private void branchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_branchKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
        {
            branch.setEditable(true);
        }
        else
        {
           branch.setEditable(false); 
        }
    }//GEN-LAST:event_branchKeyTyped

    private void bankAccountNoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bankAccountNoFocusGained
        // TODO add your handling code here:
        if(bankAccountNo.getText().equals("Enter Account Number"))
        {
                bankAccountNo.setText("");            
        }
    }//GEN-LAST:event_bankAccountNoFocusGained

    private void bankAccountNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bankAccountNoFocusLost
        // TODO add your handling code here:
        if(bankAccountNo.getText().equals(""))
        {
            bankAccountNo.setText("Enter Account Number");            
        }
    }//GEN-LAST:event_bankAccountNoFocusLost

    private void bankAccountNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bankAccountNoKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!Character.isDigit(c))
        {
            evt.consume();
            
        }
    }//GEN-LAST:event_bankAccountNoKeyTyped

    private void bocwNoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bocwNoFocusGained
        // TODO add your handling code here:
        if(bocwNo.getText().equals("Enter Bocw Number"))
        {
                bocwNo.setText("");            
        }
    }//GEN-LAST:event_bocwNoFocusGained

    private void bocwNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bocwNoFocusLost
        // TODO add your handling code here:
        if(bocwNo.getText().equals(""))
        {
            bocwNo.setText("Enter Bocw Number");            
        }
    }//GEN-LAST:event_bocwNoFocusLost

    private void bocwNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bocwNoKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!Character.isDigit(c))
        {
            evt.consume();
            
        }
    }//GEN-LAST:event_bocwNoKeyTyped

    private void ifscCodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ifscCodeFocusGained
        // TODO add your handling code here:
        if(ifscCode.getText().equals("Enter IFSC Code"))
        {
                ifscCode.setText("");            
        }
    }//GEN-LAST:event_ifscCodeFocusGained

    private void ifscCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ifscCodeFocusLost
        // TODO add your handling code here:
        if(ifscCode.getText().equals(""))
        {
            ifscCode.setText("Enter IFSC Code");            
        }
    }//GEN-LAST:event_ifscCodeFocusLost

    private void ifscCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ifscCodeKeyPressed
        // TODO add your handling code here:
        String pan1=ifscCode.getText();
        int pan2=pan1.length();
        //int c=evt.getKeyChar();
        if(pan2<11 || evt.getExtendedKeyCode()==KeyEvent.VK_BACKSPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
        {             
                ifscCode.setEditable(true);           
        }
        else
        {
            ifscCode.setEditable(false);
        }
    }//GEN-LAST:event_ifscCodeKeyPressed

    private void ifscCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ifscCodeKeyReleased
        // TODO add your handling code here:
        ifscCode.setText(ifscCode.getText().toUpperCase()); 
    }//GEN-LAST:event_ifscCodeKeyReleased

    private void vaccineNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vaccineNameFocusGained
        // TODO add your handling code here:
        if(vaccineName.getText().equals("Enter Vaccine Name"))
        {
                vaccineName.setText("");            
        }
    }//GEN-LAST:event_vaccineNameFocusGained

    private void vaccineNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vaccineNameFocusLost
        // TODO add your handling code here:
         if(vaccineName.getText().equals(""))
        {
            vaccineName.setText("Enter Vaccine Name");            
        }
    }//GEN-LAST:event_vaccineNameFocusLost

    private void vaccineNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vaccineNameKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
        {
            vaccineName.setEditable(true);
        }
        else
        {
           vaccineName.setEditable(false); 
        }
    }//GEN-LAST:event_vaccineNameKeyTyped

    private void policyNoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_policyNoFocusGained
        // TODO add your handling code here:
        if(policyNo.getText().equals("Enter Policy Number"))
        {
                policyNo.setText("");            
        }
    }//GEN-LAST:event_policyNoFocusGained

    private void policyNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_policyNoFocusLost
        // TODO add your handling code here:
         if(policyNo.getText().equals(""))
        {
            policyNo.setText("Enter Policy Number");            
        }
    }//GEN-LAST:event_policyNoFocusLost

    private void policyNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_policyNoKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!Character.isDigit(c))
        {
            evt.consume();
            
        }
    }//GEN-LAST:event_policyNoKeyTyped

    private void empIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_empIdFocusGained
        // TODO add your handling code here:
       
    }//GEN-LAST:event_empIdFocusGained

    private void empIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_empIdFocusLost
        // TODO add your handling code here:       
    }//GEN-LAST:event_empIdFocusLost

    private void rsInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsInsertActionPerformed
        // TODO add your handling code here:
        if (uanNo.getText().isEmpty() || esicNo.getText().isEmpty() || firstName.getText().isEmpty() || middleName.getText().isEmpty() || lastName.getText().isEmpty() || mobileNo.getText().isEmpty() || single.getText().isEmpty() || married.getText().isEmpty() || male.getText().isEmpty() || female.getText().isEmpty() || currentAddress.getText().isEmpty() || permanentAddress.getText().isEmpty() || city.getText().isEmpty() || pinCode.getText().isEmpty() || district.getText().isEmpty() || state.getText().isEmpty() ||
                previous_Emp.getText().isEmpty() || zone.getText().isEmpty() || designation.getText().isEmpty() || qualification.getText().isEmpty() || department.getText().isEmpty() || empStatus.getText().isEmpty() || panNo.getText().isEmpty() || electricity.getText().isEmpty() || aadhaarNo.getText().isEmpty() || bankName.getText().isEmpty() || serviceNo.getText().isEmpty() || branch.getText().isEmpty() || bankAccountNo.getText().isEmpty() || bocwNo.getText().isEmpty() || ifscCode.getText().isEmpty() || vaccineName.getText().isEmpty() ||
                policyNo.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Fill All Details");
        } 
        else
        {

            try 
            {
                SimpleDateFormat dob = new SimpleDateFormat("YYYY-MM-dd");
                String dob1 = dob.format(dateofbirth.getDate());
                
                SimpleDateFormat doj = new SimpleDateFormat("YYYY-MM-dd");
                String doj1 = doj.format(date_of_joining.getDate());
                
                SimpleDateFormat dol = new SimpleDateFormat("YYYY-MM-dd");
                String dol1 = dol.format(date_of_leaving.getDate());
                
                SimpleDateFormat registration_Date = new SimpleDateFormat("YYYY-MM-dd");
                String registration_Date1 = registration_Date.format(registrationDate.getDate());
                
                SimpleDateFormat doseone = new SimpleDateFormat("YYYY-MM-dd");
                String dose1 = doseone.format(doseOne.getDate());
                
                SimpleDateFormat dosetwo = new SimpleDateFormat("YYYY-MM-dd");
                String dose2 = dosetwo.format(doseTwo.getDate());
                
                SimpleDateFormat policy_issue_Date = new SimpleDateFormat("YYYY-MM-dd");
                String policy_iss_date1 = policy_issue_Date.format(policyIssueDate.getDate());
                
                SimpleDateFormat policy_end_Date = new SimpleDateFormat("YYYY-MM-dd");
                String policy_end_date1 = policy_end_Date.format(policyEndDate.getDate());
                
                String gender=null;                
                if(male.isSelected())
                {
                        gender="Male";
                }
                else if(female.isSelected())
                {
                        gender="Female";
                }
                
                String marital=null;
                if(single.isSelected())
                {
                        marital="Single";
                }
                else if(married.isSelected())
                {
                        marital="Married";
                }  
                
                     Class.forName("com.mysql.jdbc.Driver");
                     java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root", "");
                     PreparedStatement ps=con.prepareStatement("insert into customer values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"); 
                      
                     
                    ps.setLong(1,Long.parseLong(empId.getText()));
                    ps.setLong(2,Long.parseLong(uanNo.getText()));
                    ps.setLong(3,Long.parseLong(esicNo.getText()));
                    ps.setString(4,firstName.getText());
                    ps.setString(5,middleName.getText());
                    ps.setString(6,lastName.getText());
                    ps.setString(7,dob1);
                    ps.setLong(8,Long.parseLong(mobileNo.getText()));
                    ps.setString(9,marital);
                    ps.setString(10,gender);
                    ps.setString(11,currentAddress.getText());
                    ps.setString(12,permanentAddress.getText());
                    ps.setString(13,city.getText());
                    ps.setLong(14,Long.parseLong(pinCode.getText()));
                    ps.setString(15,district.getText());
                    ps.setString(16,state.getText());
                    ps.setString(17,previous_Emp.getText());
                    ps.setString(18,zone.getText());
                    ps.setString(19,doj1);
                    ps.setString(20,dol1);
                    ps.setString(21,designation.getText());
                    ps.setString(22,qualification.getText());
                    ps.setString(23,department.getText());
                    ps.setString(24,empStatus.getText());
                    ps.setString(25,panNo.getText());
                    ps.setLong(26,Long.parseLong(electricity.getText()));
                    ps.setLong(27,Long.parseLong(aadhaarNo.getText()));
                    ps.setString(28,bankName.getText());
                    ps.setLong(29,Long.parseLong(serviceNo.getText()));
                    ps.setString(30,branch.getText());
                    ps.setLong(31,Long.parseLong(bankAccountNo.getText()));
                    ps.setLong(32,Long.parseLong(bocwNo.getText()));
                    ps.setString(33,ifscCode.getText());
                    ps.setString(34,vaccineName.getText());
                    ps.setString(35,registration_Date1);
                    ps.setString(36,dose1);
                    ps.setString(37,dose2);
                    ps.setLong(38,Long.parseLong(policyNo.getText()));
                    ps.setString(39,policy_iss_date1);
                    ps.setString(40,policy_end_date1);
                    ps.setBytes(41,pimage);
                    ps.executeUpdate();
                    con.close();           
                    JOptionPane.showMessageDialog(null, "1 Record Sucessfully Inserted");
               }   
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Please Check Something Went Wrong!");
            }
        }   
        
    }//GEN-LAST:event_rsInsertActionPerformed

    private void rsUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsUpdateActionPerformed
        // TODO add your handling code here:
        if (empId.getText().isEmpty() || uanNo.getText().isEmpty() || esicNo.getText().isEmpty() || firstName.getText().isEmpty() || middleName.getText().isEmpty() || lastName.getText().isEmpty() || mobileNo.getText().isEmpty() || single.getText().isEmpty() || married.getText().isEmpty() || male.getText().isEmpty() || female.getText().isEmpty() || currentAddress.getText().isEmpty() || permanentAddress.getText().isEmpty() || city.getText().isEmpty() || pinCode.getText().isEmpty() || district.getText().isEmpty() || state.getText().isEmpty() ||
                previous_Emp.getText().isEmpty() || zone.getText().isEmpty() || designation.getText().isEmpty() || qualification.getText().isEmpty() || department.getText().isEmpty() || empStatus.getText().isEmpty() || panNo.getText().isEmpty() || electricity.getText().isEmpty() || aadhaarNo.getText().isEmpty() || bankName.getText().isEmpty() || serviceNo.getText().isEmpty() || branch.getText().isEmpty() || bankAccountNo.getText().isEmpty() || bocwNo.getText().isEmpty() || ifscCode.getText().isEmpty() || vaccineName.getText().isEmpty() ||
                policyNo.getText().isEmpty() || path.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Fill All Details");
        } 
        else
        {
           
                SimpleDateFormat dob = new SimpleDateFormat("YYYY-MM-dd");
                String dob1 = dob.format(dateofbirth.getDate());
                
                SimpleDateFormat doj = new SimpleDateFormat("YYYY-MM-dd");
                String doj1 = doj.format(date_of_joining.getDate());
                
                SimpleDateFormat dol = new SimpleDateFormat("YYYY-MM-dd");
                String dol1 = dol.format(date_of_leaving.getDate());
                
                SimpleDateFormat registration_Date = new SimpleDateFormat("YYYY-MM-dd");
                String registration_Date1 = registration_Date.format(registrationDate.getDate());
                
                SimpleDateFormat doseone = new SimpleDateFormat("YYYY-MM-dd");
                String dose1 = doseone.format(doseOne.getDate());
                
                SimpleDateFormat dosetwo = new SimpleDateFormat("YYYY-MM-dd");
                String dose2 = dosetwo.format(doseTwo.getDate());
                
                SimpleDateFormat policy_issue_Date = new SimpleDateFormat("YYYY-MM-dd");
                String policy_iss_date1 = policy_issue_Date.format(policyIssueDate.getDate());
                
                SimpleDateFormat policy_end_Date = new SimpleDateFormat("YYYY-MM-dd");
                String policy_end_date1 = policy_end_Date.format(policyEndDate.getDate());
                
                String gender=null;                
                if(male.isSelected())
                {
                        gender="Male";
                }
                else if(female.isSelected())
                {
                        gender="Female";
                }
                
                String marital=null;
                if(single.isSelected())
                {
                        marital="Single";
                }
                else if(married.isSelected())
                {
                        marital="Married";
                }  
                int p=JOptionPane.showConfirmDialog(null,"Are you sure you want to update?","Update Record",JOptionPane.YES_NO_OPTION);
                if(p==0)
                {
                    try 
                    {
                     Class.forName("com.mysql.jdbc.Driver");
                     java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root", "");
                     String sql="update customer set uan_no=?,esic_no=?,first_name=?,middle_name=?,last_name=?,dob=?,mobile_no=?,marital_status=?,gender=?,current_add=?,permanent_add=?,city=?,pin=?,district=?,state=?,prev_emp=?,zone=?,doj=?,dol=?,designation=?,qualification=?,department=?,emp_status=?,pan_no=?,electricity_no=?,aadhaar_no=?,bank_name=?,service_no=?,branch=?,bank_acc_no=?,bocw_no=?,ifsc=?,vaccine_name=?,registration_date=?,dose1=?,dose2=?,policy_no=?,policy_iss_date=?,policy_end_date=? where emp_id=?";
                     PreparedStatement ps=con.prepareStatement(sql);                    
                    
                        ps.setLong(1,Long.parseLong(uanNo.getText()));
                        ps.setLong(2,Long.parseLong(esicNo.getText()));
                        ps.setString(3,firstName.getText());
                        ps.setString(4,middleName.getText());
                        ps.setString(5,lastName.getText());
                        ps.setString(6,dob1);
                        ps.setLong(7,Long.parseLong(mobileNo.getText()));
                        ps.setString(8,marital);
                        ps.setString(9,gender);
                        ps.setString(10,currentAddress.getText());
                        ps.setString(11,permanentAddress.getText());
                        ps.setString(12,city.getText());
                        ps.setLong(13,Long.parseLong(pinCode.getText()));
                        ps.setString(14,district.getText());
                        ps.setString(15,state.getText());
                        ps.setString(16,previous_Emp.getText());
                        ps.setString(17,zone.getText());
                        ps.setString(18,doj1);
                        ps.setString(19,dol1);
                        ps.setString(20,designation.getText());
                        ps.setString(21,qualification.getText());
                        ps.setString(22,department.getText());
                        ps.setString(23,empStatus.getText());
                        ps.setString(24,panNo.getText());
                        ps.setLong(25,Long.parseLong(electricity.getText()));
                        ps.setLong(26,Long.parseLong(aadhaarNo.getText()));
                        ps.setString(27,bankName.getText());
                        ps.setLong(28,Long.parseLong(serviceNo.getText()));
                        ps.setString(29,branch.getText());
                        ps.setLong(30,Long.parseLong(bankAccountNo.getText()));
                        ps.setLong(31,Long.parseLong(bocwNo.getText()));
                        ps.setString(32,ifscCode.getText());
                        ps.setString(33,vaccineName.getText());
                        ps.setString(34,registration_Date1);
                        ps.setString(35,dose1);
                        ps.setString(36,dose2);
                        ps.setLong(37,Long.parseLong(policyNo.getText()));
                        ps.setString(38,policy_iss_date1);
                        ps.setString(39,policy_end_date1);                    
                        ps.setLong(40,Long.parseLong(empId.getText()));

                        ps.executeUpdate();
                        con.close();           
                        //JOptionPane.showMessageDialog(null, "1 Record Sucessfully Updated");
                    }   
                    catch(Exception e)
                    {
                        System.out.println(e);
                    }
                    try
                    {
                        File file=new File(fname);
                        FileInputStream fis=new FileInputStream(file);
                        byte[] image=new byte[(int)file.length()];
                        fis.read(image);

                        Class.forName("com.mysql.jdbc.Driver");
                        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root", "");
                        String sql1="update customer set image=? where emp_id=?";
                        PreparedStatement ps=con.prepareStatement(sql1);
                        ps.setBytes(1,image);
                        ps.setLong(2,Long.parseLong(empId.getText()));
                        ps.executeUpdate();
                        con.close();
                        //JOptionPane.showMessageDialog(null,"1 Record Sucessfully Updated");
                    }
                    catch(Exception ex)
                    {
                      System.out.println(ex);  
                    }
                }
        }                       
        
    }//GEN-LAST:event_rsUpdateActionPerformed

    private void employeeSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeSearchActionPerformed
        // TODO add your handling code here:
        try
        {
            Connection c=new Connection();
            ResultSet rs=c.s.executeQuery("select * from customer where (emp_id=" + empId.getText() + ")");
            if(rs.next())
            {
                long empid = rs.getLong(1);
                empId.setText(Long.toString(empid));
                
                long uanno = rs.getLong(2);
                uanNo.setText(Long.toString(uanno));
                
                long esicno = rs.getLong(3);
                esicNo.setText(Long.toString(esicno));
                
                String fname = rs.getString(4);
                firstName.setText(fname);
                
                String mname = rs.getString(5);
                middleName.setText(mname);
                
                String lname = rs.getString(6);
                lastName.setText(lname);
                
                java.util.Date dob = rs.getDate(7);
                dateofbirth.setDate(dob);
                
                long mobileno = rs.getLong(8);
                mobileNo.setText(Long.toString(mobileno));
                
                if("Single".equals(rs.getString("marital_status")))
                {
                    single.setSelected(true);
                }
                else if("Married".equals(rs.getString("marital_status")))
                {
                    married.setSelected(true);
                }
                else
                {
                    single.setSelected(false);
                    married.setSelected(false);
                }
                
                if("Male".equals(rs.getString("gender")))
                {
                    male.setSelected(true);
                }
                else if("Female".equals(rs.getString("gender")))
                {
                    female.setSelected(true);
                }
                else
                {
                    male.setSelected(false);
                    female.setSelected(false);
                }
                
                String currentadd = rs.getString(11);
                currentAddress.setText(currentadd);
                
                String permanentadd = rs.getString(12);
                permanentAddress.setText(permanentadd);
                
                String city1 = rs.getString(13);
                city.setText(city1);
                
                long pin = rs.getLong(14);
                pinCode.setText(Long.toString(pin));
                
                String district1 = rs.getString(15);
                district.setText(district1);
                
                String state1 = rs.getString(16);
                state.setText(state1);
                
                String prevemp = rs.getString(17);
                previous_Emp.setText(prevemp);
                
                String zone1 = rs.getString(18);
                zone.setText(zone1);
                
                java.util.Date doj = rs.getDate(19);
                date_of_joining.setDate(doj);
                
                java.util.Date dol = rs.getDate(20);
                date_of_leaving.setDate(dol);
                
                String designation1 = rs.getString(21);
                designation.setText(designation1);
                
                String qualification1 = rs.getString(22);
                qualification.setText(qualification1);
                
                String department1 = rs.getString(23);
                department.setText(department1);
                
                String empstatus = rs.getString(24);
                empStatus.setText(empstatus);
                
                String panno = rs.getString(25);
                panNo.setText(panno);
                
                long electricity1 = rs.getLong(26);
                electricity.setText(Long.toString(electricity1));
                
                long aadhaarno = rs.getLong(27);
                aadhaarNo.setText(Long.toString(aadhaarno));
                
                String bankname = rs.getString(28);
                bankName.setText(bankname);
                
                long serviceno = rs.getLong(29);
                serviceNo.setText(Long.toString(serviceno));
                
                String branch1 = rs.getString(30);
                branch.setText(branch1);
                
                long bankaccno = rs.getLong(31);
                bankAccountNo.setText(Long.toString(bankaccno));
                
                long bocwno = rs.getLong(32);
                bocwNo.setText(Long.toString(bocwno));
                
                String ifsc = rs.getString(33);
                ifscCode.setText(ifsc);
                
                String vaccine = rs.getString(34);
                vaccineName.setText(vaccine);
                
                java.util.Date registrationdate = rs.getDate(35);
                registrationDate.setDate(registrationdate);
                
                java.util.Date dose1 = rs.getDate(36);
                doseOne.setDate(dose1);
                
                java.util.Date dose2 = rs.getDate(37);
                doseTwo.setDate(dose2);
                
                long policyno = rs.getLong(38);
                policyNo.setText(Long.toString(policyno));
                
                java.util.Date policyissdate = rs.getDate(39);
                policyIssueDate.setDate(policyissdate);
                
                java.util.Date policyenddate = rs.getDate(40);
                policyEndDate.setDate(policyenddate);
                
                
                byte[] img = rs.getBytes("image");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myimg = im.getScaledInstance(photo.getWidth(), photo.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myimg);
                photo.setIcon(newImage);                  
                path.setText(fname+" "+mname+" "+lname);
                
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Id Does not exist");
            }
            c.s.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Please Check Something Went Wrong!");
        }
    }//GEN-LAST:event_employeeSearchActionPerformed

    private void uanSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uanSearchActionPerformed
        // TODO add your handling code here:
         try
        {
            Connection c=new Connection();
            ResultSet rs=c.s.executeQuery("select * from customer where (uan_no=" + uanNo.getText() + ")");
            if(rs.next())
            {
                long empid = rs.getLong(1);
                empId.setText(Long.toString(empid));
                
                long uanno = rs.getLong(2);
                uanNo.setText(Long.toString(uanno));
                
                long esicno = rs.getLong(3);
                esicNo.setText(Long.toString(esicno));
                
                String fname = rs.getString(4);
                firstName.setText(fname);
                
                String mname = rs.getString(5);
                middleName.setText(mname);
                
                String lname = rs.getString(6);
                lastName.setText(lname);
                
                java.util.Date dob = rs.getDate(7);
                dateofbirth.setDate(dob);
                
                long mobileno = rs.getLong(8);
                mobileNo.setText(Long.toString(mobileno));
                
                if("Single".equals(rs.getString("marital_status")))
                {
                    single.setSelected(true);
                }
                else if("Married".equals(rs.getString("marital_status")))
                {
                    married.setSelected(true);
                }
                else
                {
                    single.setSelected(false);
                    married.setSelected(false);
                }
                
                if("Male".equals(rs.getString("gender")))
                {
                    male.setSelected(true);
                }
                else if("Female".equals(rs.getString("gender")))
                {
                    female.setSelected(true);
                }
                else
                {
                    male.setSelected(false);
                    female.setSelected(false);
                }
                
                String currentadd = rs.getString(11);
                currentAddress.setText(currentadd);
                
                String permanentadd = rs.getString(12);
                permanentAddress.setText(permanentadd);
                
                String city1 = rs.getString(13);
                city.setText(city1);
                
                long pin = rs.getLong(14);
                pinCode.setText(Long.toString(pin));
                
                String district1 = rs.getString(15);
                district.setText(district1);
                
                String state1 = rs.getString(16);
                state.setText(state1);
                
                String prevemp = rs.getString(17);
                previous_Emp.setText(prevemp);
                
                String zone1 = rs.getString(18);
                zone.setText(zone1);
                
                java.util.Date doj = rs.getDate(19);
                date_of_joining.setDate(doj);
                
                java.util.Date dol = rs.getDate(20);
                date_of_leaving.setDate(dol);
                
                String designation1 = rs.getString(21);
                designation.setText(designation1);
                
                String qualification1 = rs.getString(22);
                qualification.setText(qualification1);
                
                String department1 = rs.getString(23);
                department.setText(department1);
                
                String empstatus = rs.getString(24);
                empStatus.setText(empstatus);
                
                String panno = rs.getString(25);
                panNo.setText(panno);
                
                long electricity1 = rs.getLong(26);
                electricity.setText(Long.toString(electricity1));
                
                long aadhaarno = rs.getLong(27);
                aadhaarNo.setText(Long.toString(aadhaarno));
                
                String bankname = rs.getString(28);
                bankName.setText(bankname);
                
                long serviceno = rs.getLong(29);
                serviceNo.setText(Long.toString(serviceno));
                
                String branch1 = rs.getString(30);
                branch.setText(branch1);
                
                long bankaccno = rs.getLong(31);
                bankAccountNo.setText(Long.toString(bankaccno));
                
                long bocwno = rs.getLong(32);
                bocwNo.setText(Long.toString(bocwno));
                
                String ifsc = rs.getString(33);
                ifscCode.setText(ifsc);
                
                String vaccine = rs.getString(34);
                vaccineName.setText(vaccine);
                
                java.util.Date registrationdate = rs.getDate(35);
                registrationDate.setDate(registrationdate);
                
                java.util.Date dose1 = rs.getDate(36);
                doseOne.setDate(dose1);
                
                java.util.Date dose2 = rs.getDate(37);
                doseTwo.setDate(dose2);
                
                long policyno = rs.getLong(38);
                policyNo.setText(Long.toString(policyno));
                
                java.util.Date policyissdate = rs.getDate(39);
                policyIssueDate.setDate(policyissdate);
                
                java.util.Date policyenddate = rs.getDate(40);
                policyEndDate.setDate(policyenddate);
                
                
                byte[] img = rs.getBytes("image");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myimg = im.getScaledInstance(photo.getWidth(), photo.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myimg);
                photo.setIcon(newImage);                  
                path.setText(fname+" "+mname+" "+lname);
                
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Id Does not exist");
            }
            c.s.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Please Check Somthing Went Wrong!");
        }
    }//GEN-LAST:event_uanSearchActionPerformed

    private void esicSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esicSearchActionPerformed
        // TODO add your handling code here:
         try
        {
            Connection c=new Connection();
            ResultSet rs=c.s.executeQuery("select * from customer where (esic_no=" + esicNo.getText() + ")");
            if(rs.next())
            {
                long empid = rs.getLong(1);
                empId.setText(Long.toString(empid));
                
                long uanno = rs.getLong(2);
                uanNo.setText(Long.toString(uanno));
                
                long esicno = rs.getLong(3);
                esicNo.setText(Long.toString(esicno));
                
                String fname = rs.getString(4);
                firstName.setText(fname);
                
                String mname = rs.getString(5);
                middleName.setText(mname);
                
                String lname = rs.getString(6);
                lastName.setText(lname);
                
                java.util.Date dob = rs.getDate(7);
                dateofbirth.setDate(dob);
                
                long mobileno = rs.getLong(8);
                mobileNo.setText(Long.toString(mobileno));
                
                if("Single".equals(rs.getString("marital_status")))
                {
                    single.setSelected(true);
                }
                else if("Married".equals(rs.getString("marital_status")))
                {
                    married.setSelected(true);
                }
                else
                {
                    single.setSelected(false);
                    married.setSelected(false);
                }
                
                if("Male".equals(rs.getString("gender")))
                {
                    male.setSelected(true);
                }
                else if("Female".equals(rs.getString("gender")))
                {
                    female.setSelected(true);
                }
                else
                {
                    male.setSelected(false);
                    female.setSelected(false);
                }
                
                String currentadd = rs.getString(11);
                currentAddress.setText(currentadd);
                
                String permanentadd = rs.getString(12);
                permanentAddress.setText(permanentadd);
                
                String city1 = rs.getString(13);
                city.setText(city1);
                
                long pin = rs.getLong(14);
                pinCode.setText(Long.toString(pin));
                
                String district1 = rs.getString(15);
                district.setText(district1);
                
                String state1 = rs.getString(16);
                state.setText(state1);
                
                String prevemp = rs.getString(17);
                previous_Emp.setText(prevemp);
                
                String zone1 = rs.getString(18);
                zone.setText(zone1);
                
                java.util.Date doj = rs.getDate(19);
                date_of_joining.setDate(doj);
                
                java.util.Date dol = rs.getDate(20);
                date_of_leaving.setDate(dol);
                
                String designation1 = rs.getString(21);
                designation.setText(designation1);
                
                String qualification1 = rs.getString(22);
                qualification.setText(qualification1);
                
                String department1 = rs.getString(23);
                department.setText(department1);
                
                String empstatus = rs.getString(24);
                empStatus.setText(empstatus);
                
                String panno = rs.getString(25);
                panNo.setText(panno);
                
                long electricity1 = rs.getLong(26);
                electricity.setText(Long.toString(electricity1));
                
                long aadhaarno = rs.getLong(27);
                aadhaarNo.setText(Long.toString(aadhaarno));
                
                String bankname = rs.getString(28);
                bankName.setText(bankname);
                
                long serviceno = rs.getLong(29);
                serviceNo.setText(Long.toString(serviceno));
                
                String branch1 = rs.getString(30);
                branch.setText(branch1);
                
                long bankaccno = rs.getLong(31);
                bankAccountNo.setText(Long.toString(bankaccno));
                
                long bocwno = rs.getLong(32);
                bocwNo.setText(Long.toString(bocwno));
                
                String ifsc = rs.getString(33);
                ifscCode.setText(ifsc);
                
                String vaccine = rs.getString(34);
                vaccineName.setText(vaccine);
                
                java.util.Date registrationdate = rs.getDate(35);
                registrationDate.setDate(registrationdate);
                
                java.util.Date dose1 = rs.getDate(36);
                doseOne.setDate(dose1);
                
                java.util.Date dose2 = rs.getDate(37);
                doseTwo.setDate(dose2);
                
                long policyno = rs.getLong(38);
                policyNo.setText(Long.toString(policyno));
                
                java.util.Date policyissdate = rs.getDate(39);
                policyIssueDate.setDate(policyissdate);
                
                java.util.Date policyenddate = rs.getDate(40);
                policyEndDate.setDate(policyenddate);
                
                
                byte[] img = rs.getBytes("image");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myimg = im.getScaledInstance(photo.getWidth(), photo.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myimg);
                photo.setIcon(newImage);                  
                path.setText(fname+" "+mname+" "+lname);
                
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Id Does not exist");
            }
            c.s.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Please Check Something Went Wrong!");
        }
    }//GEN-LAST:event_esicSearchActionPerformed

    private void rsDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsDeleteActionPerformed
        // TODO add your handling code here:
        if (empId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Student Id");
        }        
        try
        {
            Connection c= new Connection();
            c.s.executeUpdate("Delete from customer where emp_id=" + empId.getText() + "");
            c.s.close();
            JOptionPane.showMessageDialog(null, "1 Record Successfully Deleted");
            getincrementid();
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, "Please Check Something Went Wrong!"); 
        }
    }//GEN-LAST:event_rsDeleteActionPerformed

    private void rsResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsResetActionPerformed
        // TODO add your handling code here:
        uanNo.setText("Enter UAN Number");
        esicNo.setText("Enter ESIC Number");
        firstName.setText("Enter First Name");
        middleName.setText("Enter Middle Name");
        lastName.setText("Enter Last Name");
        dateofbirth.setDate(new Date());
        mobileNo.setText("Enter Mobile Number");   
        buttonGroup1.clearSelection();        
        single.setSelected(false);
        married.setSelected(false);
        buttonGroup2.clearSelection(); 
        male.setSelected(false);
        female.setSelected(false);
        currentAddress.setText(null);
        permanentAddress.setText(null);
        city.setText("Enter City Name");
        pinCode.setText("Enter Pin Code");
        district.setText("Enter District Name");
        state.setText("Enter State Name");
        previous_Emp.setText("Previous Employee");
        zone.setText("Enter Zone");
        date_of_joining.setDate(new Date());
        date_of_leaving.setDate(new Date());
        designation.setText("Enter Designation");
        qualification.setText("Enter Qualification");
        department.setText("Enter Department");
        empStatus.setText("Enter Employee Status");
        panNo.setText("Enter Pan Card Number");
        electricity.setText("Enter Electricity Number");
        aadhaarNo.setText("Enter Aadhaar Number");
        bankName.setText("Enter Bank Name");
        serviceNo.setText("Enter Service Number");
        branch.setText("Enter Branch Name");
        bankAccountNo.setText("Enter Account Number");
        bocwNo.setText("Enter Bocw Number");
        ifscCode.setText("Enter IFSC Code");
        vaccineName.setText("Enter Vaccine Name");
        registrationDate.setDate(new Date());
        doseOne.setDate(new Date());
        doseTwo.setDate(new Date());
        policyNo.setText("Enter Policy Number");
        policyIssueDate.setDate(new Date());
        policyEndDate.setDate(new Date());
        photo.setIcon(null);
        path.setText(null);
        
        getincrementid(); 
        
    }//GEN-LAST:event_rsResetActionPerformed

    private void aadhaarSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aadhaarSearchActionPerformed
        // TODO add your handling code here:
        try
        {
            Connection c=new Connection();
            ResultSet rs=c.s.executeQuery("select * from customer where (aadhaar_no=" + aadhaarNo.getText() + ")");
            if(rs.next())
            {
                long empid = rs.getLong(1);
                empId.setText(Long.toString(empid));
                
                long uanno = rs.getLong(2);
                uanNo.setText(Long.toString(uanno));
                
                long esicno = rs.getLong(3);
                esicNo.setText(Long.toString(esicno));
                
                String fname = rs.getString(4);
                firstName.setText(fname);
                
                String mname = rs.getString(5);
                middleName.setText(mname);
                
                String lname = rs.getString(6);
                lastName.setText(lname);
                
                java.util.Date dob = rs.getDate(7);
                dateofbirth.setDate(dob);
                
                long mobileno = rs.getLong(8);
                mobileNo.setText(Long.toString(mobileno));
                
                if("Single".equals(rs.getString("marital_status")))
                {
                    single.setSelected(true);
                }
                else if("Married".equals(rs.getString("marital_status")))
                {
                    married.setSelected(true);
                }
                else
                {
                    single.setSelected(false);
                    married.setSelected(false);
                }
                
                if("Male".equals(rs.getString("gender")))
                {
                    male.setSelected(true);
                }
                else if("Female".equals(rs.getString("gender")))
                {
                    female.setSelected(true);
                }
                else
                {
                    male.setSelected(false);
                    female.setSelected(false);
                }
                
                String currentadd = rs.getString(11);
                currentAddress.setText(currentadd);
                
                String permanentadd = rs.getString(12);
                permanentAddress.setText(permanentadd);
                
                String city1 = rs.getString(13);
                city.setText(city1);
                
                long pin = rs.getLong(14);
                pinCode.setText(Long.toString(pin));
                
                String district1 = rs.getString(15);
                district.setText(district1);
                
                String state1 = rs.getString(16);
                state.setText(state1);
                
                String prevemp = rs.getString(17);
                previous_Emp.setText(prevemp);
                
                String zone1 = rs.getString(18);
                zone.setText(zone1);
                
                java.util.Date doj = rs.getDate(19);
                date_of_joining.setDate(doj);
                
                java.util.Date dol = rs.getDate(20);
                date_of_leaving.setDate(dol);
                
                String designation1 = rs.getString(21);
                designation.setText(designation1);
                
                String qualification1 = rs.getString(22);
                qualification.setText(qualification1);
                
                String department1 = rs.getString(23);
                department.setText(department1);
                
                String empstatus = rs.getString(24);
                empStatus.setText(empstatus);
                
                String panno = rs.getString(25);
                panNo.setText(panno);
                
                long electricity1 = rs.getLong(26);
                electricity.setText(Long.toString(electricity1));
                
                long aadhaarno = rs.getLong(27);
                aadhaarNo.setText(Long.toString(aadhaarno));
                
                String bankname = rs.getString(28);
                bankName.setText(bankname);
                
                long serviceno = rs.getLong(29);
                serviceNo.setText(Long.toString(serviceno));
                
                String branch1 = rs.getString(30);
                branch.setText(branch1);
                
                long bankaccno = rs.getLong(31);
                bankAccountNo.setText(Long.toString(bankaccno));
                
                long bocwno = rs.getLong(32);
                bocwNo.setText(Long.toString(bocwno));
                
                String ifsc = rs.getString(33);
                ifscCode.setText(ifsc);
                
                String vaccine = rs.getString(34);
                vaccineName.setText(vaccine);
                
                java.util.Date registrationdate = rs.getDate(35);
                registrationDate.setDate(registrationdate);
                
                java.util.Date dose1 = rs.getDate(36);
                doseOne.setDate(dose1);
                
                java.util.Date dose2 = rs.getDate(37);
                doseTwo.setDate(dose2);
                
                long policyno = rs.getLong(38);
                policyNo.setText(Long.toString(policyno));
                
                java.util.Date policyissdate = rs.getDate(39);
                policyIssueDate.setDate(policyissdate);
                
                java.util.Date policyenddate = rs.getDate(40);
                policyEndDate.setDate(policyenddate);
                
                
                byte[] img = rs.getBytes("image");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myimg = im.getScaledInstance(photo.getWidth(), photo.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myimg);
                photo.setIcon(newImage);                  
                path.setText(fname+" "+mname+" "+lname);
                
            }
            else 
            {
                JOptionPane.showMessageDialog(null, "Id Does not exist");
            }
            c.s.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Please Check Something Went Wrong!");
        }
    }//GEN-LAST:event_aadhaarSearchActionPerformed

    private void rsViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsViewActionPerformed
        // TODO add your handling code here:
        View v1=new View();
        v1.setVisible(true);        
    }//GEN-LAST:event_rsViewActionPerformed

    private void rsViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rsViewMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_rsViewMouseClicked

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
               /* if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }*/
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registration_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration_Form().setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aadhaarNo;
    private rojeru_san.complementos.RSButtonHover aadhaarSearch;
    private javax.swing.JTextField bankAccountNo;
    private javax.swing.JTextField bankName;
    private javax.swing.JTextField bocwNo;
    private javax.swing.JTextField branch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField city;
    private javax.swing.JTextArea currentAddress;
    private com.toedter.calendar.JDateChooser date_of_joining;
    private com.toedter.calendar.JDateChooser date_of_leaving;
    private com.toedter.calendar.JDateChooser dateofbirth;
    private javax.swing.JTextField department;
    private javax.swing.JTextField designation;
    private javax.swing.JTextField district;
    private com.toedter.calendar.JDateChooser doseOne;
    private com.toedter.calendar.JDateChooser doseTwo;
    private javax.swing.JTextField electricity;
    private javax.swing.JTextField empId;
    private javax.swing.JTextField empStatus;
    private rojeru_san.complementos.RSButtonHover employeeSearch;
    private javax.swing.JTextField esicNo;
    private rojeru_san.complementos.RSButtonHover esicSearch;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField firstName;
    private javax.swing.JTextField ifscCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField lastName;
    private javax.swing.JRadioButton male;
    private javax.swing.JRadioButton married;
    private javax.swing.JTextField middleName;
    private javax.swing.JTextField mobileNo;
    private javax.swing.JTextField panNo;
    private javax.swing.JLabel path;
    private javax.swing.JTextArea permanentAddress;
    private javax.swing.JLabel photo;
    private javax.swing.JTextField pinCode;
    private com.toedter.calendar.JDateChooser policyEndDate;
    private com.toedter.calendar.JDateChooser policyIssueDate;
    private javax.swing.JTextField policyNo;
    private javax.swing.JTextField previous_Emp;
    private javax.swing.JTextField qualification;
    private com.toedter.calendar.JDateChooser registrationDate;
    private rojeru_san.complementos.RSButtonHover rsDelete;
    private rojeru_san.complementos.RSButtonHover rsInsert;
    private rojeru_san.complementos.RSButtonHover rsRecipt;
    private rojeru_san.complementos.RSButtonHover rsReset;
    private rojeru_san.complementos.RSButtonHover rsUpdate;
    private rojeru_san.complementos.RSButtonHover rsView;
    private javax.swing.JTextField serviceNo;
    private javax.swing.JRadioButton single;
    private javax.swing.JTextField state;
    private javax.swing.JTextField uanNo;
    private rojeru_san.complementos.RSButtonHover uanSearch;
    private rojeru_san.complementos.RSButtonHover uploadImage;
    private javax.swing.JTextField vaccineName;
    private javax.swing.JTextField zone;
    // End of variables declaration//GEN-END:variables
  private void seticon()
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/registration.png")));
    } 
}