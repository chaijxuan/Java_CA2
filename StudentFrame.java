/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JPRG_CA2;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JTable;

/**
 *
 * @author chaij
 */
public class StudentFrame extends javax.swing.JFrame {

    private StudentManagement studentManagement;
    private AdminManagement adminManagement;
    private int currentStudentIndex = 0;
    private int currentModuleIndex = 0;

    public StudentFrame(StudentManagement studentManagement, AdminManagement adminManagement) {
        this.studentManagement = studentManagement;
        this.adminManagement = adminManagement;
        initComponents();
        updateStudentInfo();
        updateModuleInfo();

    }

    private StudentFrame() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        StudentPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        adminLabel = new javax.swing.JLabel();
        classLabel = new javax.swing.JLabel();
        gpaLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        adminTextField = new javax.swing.JTextField();
        classTextField = new javax.swing.JTextField();
        gpaTextField = new javax.swing.JTextField();
        studentNextButton = new javax.swing.JButton();
        studentPrevButton = new javax.swing.JButton();
        modulePanel = new javax.swing.JPanel();
        modCodeLabel = new javax.swing.JLabel();
        modCodeTextField = new javax.swing.JTextField();
        modNameLabel = new javax.swing.JLabel();
        modNameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        marksTextField = new javax.swing.JTextField();
        creditLabel = new javax.swing.JLabel();
        creditTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        gradeTextField = new javax.swing.JTextField();
        modNextButton = new javax.swing.JButton();
        modPrevButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        byClassRadioButton = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        searchTxtField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTextArea = new javax.swing.JTextArea();
        exitButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        StudentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Student 1 of 3"));

        nameLabel.setText("Name:");

        adminLabel.setText("Admin:");

        classLabel.setText("Class:");

        gpaLabel.setText("GPA:");

        nameTextField.setEditable(false);
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        adminTextField.setEditable(false);
        adminTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminTextFieldActionPerformed(evt);
            }
        });

        classTextField.setEditable(false);

        gpaTextField.setEditable(false);

        studentNextButton.setText("Next");
        studentNextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNextButtonActionPerformed(evt);
            }
        });

        studentPrevButton.setText("Prev");
        studentPrevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentPrevButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout StudentPanelLayout = new javax.swing.GroupLayout(StudentPanel);
        StudentPanel.setLayout(StudentPanelLayout);
        StudentPanelLayout.setHorizontalGroup(
            StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StudentPanelLayout.createSequentialGroup()
                        .addGroup(StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(StudentPanelLayout.createSequentialGroup()
                                .addComponent(classLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(classTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(StudentPanelLayout.createSequentialGroup()
                                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(StudentPanelLayout.createSequentialGroup()
                                    .addComponent(adminLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(adminTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 30, Short.MAX_VALUE)
                        .addGroup(StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentNextButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(studentPrevButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(StudentPanelLayout.createSequentialGroup()
                        .addComponent(gpaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gpaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        StudentPanelLayout.setVerticalGroup(
            StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudentPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(StudentPanelLayout.createSequentialGroup()
                        .addComponent(studentNextButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentPrevButton))
                    .addGroup(StudentPanelLayout.createSequentialGroup()
                        .addGroup(StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adminTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(adminLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(StudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gpaLabel)
                    .addComponent(gpaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        modulePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Module 1 of 3"));

        modCodeLabel.setText("Mod Code:");

        modCodeTextField.setEditable(false);

        modNameLabel.setText("Mod Name:");

        modNameTextField.setEditable(false);

        jLabel1.setText("Marks:");

        marksTextField.setEditable(false);

        creditLabel.setText("Credit:");

        creditTextField.setEditable(false);

        jLabel2.setText("Grade:");

        gradeTextField.setEditable(false);

        modNextButton.setText("Next");
        modNextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modNextButtonActionPerformed(evt);
            }
        });

        modPrevButton.setText("Prev");
        modPrevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modPrevButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout modulePanelLayout = new javax.swing.GroupLayout(modulePanel);
        modulePanel.setLayout(modulePanelLayout);
        modulePanelLayout.setHorizontalGroup(
            modulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modulePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(modulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(modNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(modCodeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(creditLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(modCodeTextField)
                    .addComponent(modNameTextField)
                    .addComponent(marksTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(creditTextField)
                    .addComponent(gradeTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modPrevButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modNextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        modulePanelLayout.setVerticalGroup(
            modulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modulePanelLayout.createSequentialGroup()
                .addGroup(modulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modulePanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(modulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modCodeLabel)
                            .addComponent(modCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(modulePanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(modNextButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modNameLabel)
                    .addComponent(modNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modPrevButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(modulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(marksTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(modulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creditTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(creditLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(modulePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gradeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(240, 152));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Search");

        buttonGroup1.add(byClassRadioButton);
        byClassRadioButton.setText("By Class");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("By Name");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchTxtField)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(byClassRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(byClassRadioButton)
                    .addComponent(jRadioButton1))
                .addGap(18, 18, 18)
                .addComponent(searchTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setText("Results");

        resultTextArea.setEditable(false);
        resultTextArea.setColumns(20);
        resultTextArea.setRows(5);
        jScrollPane1.setViewportView(resultTextArea);

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Student Enquiry System");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jMenu1.setText("Frames");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Advanced Frame");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Student Frame");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(modulePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(StudentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(exitButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(StudentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addComponent(modulePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(exitButton)
                .addGap(48, 48, 48))
        );

        StudentPanel.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void studentNextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentNextButtonActionPerformed
        // Move to the next student index and wrap around if it reaches the end of the list
        SoundUtils.playSound("/JPRG_CA2/next.wav"); 
        currentStudentIndex = (currentStudentIndex + 1) % studentManagement.getStudents().size();
        updateStudentInfo();
    }//GEN-LAST:event_studentNextButtonActionPerformed

    private void studentPrevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentPrevButtonActionPerformed
        SoundUtils.playSound("/JPRG_CA2/prev.wav"); 
        currentStudentIndex = (currentStudentIndex - 1 + studentManagement.getStudents().size()) % studentManagement.getStudents().size();
        updateStudentInfo();
    }//GEN-LAST:event_studentPrevButtonActionPerformed

    private void modNextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modNextButtonActionPerformed
        SoundUtils.playSound("/JPRG_CA2/next.wav"); 
        currentModuleIndex = (currentModuleIndex + 1) % studentManagement.getStudents().get(currentStudentIndex).getModules().size();
        updateModuleInfo();
    }//GEN-LAST:event_modNextButtonActionPerformed

    private void modPrevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modPrevButtonActionPerformed
        SoundUtils.playSound("/JPRG_CA2/prev.wav"); 
        currentModuleIndex = (currentModuleIndex - 1 + studentManagement.getStudents().get(currentStudentIndex).getModules().size()) % studentManagement.getStudents().get(currentStudentIndex).getModules().size();
        updateModuleInfo();
    }//GEN-LAST:event_modPrevButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        SoundUtils.playSound("/JPRG_CA2/exit.wav"); 
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        searchButtonActionPerformed(evt);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new AdvancedFeatures(studentManagement, adminManagement).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new StudentFrame(studentManagement, adminManagement).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void adminTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminTextFieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {
         SoundUtils.playSound("/JPRG_CA2/clicking.wav"); 

        String searchText = searchTxtField.getText().trim();
        if (byClassRadioButton.isSelected()) {
            searchByClass(searchText);
        } else if (jRadioButton1.isSelected()) {
            searchByName(searchText);
        } else {
            resultTextArea.setText("Please select a search criteria.");
        }
    }

    private void searchByClass(String classOfStud) {
        ArrayList<Student> studentsInClass = studentManagement.getStudentsByClass(classOfStud);
        if (studentsInClass.isEmpty()) {
            resultTextArea.setText("Class '" + classOfStud + "' cannot be found.");
        } else {
            StringBuilder resultMessage = new StringBuilder();
            resultMessage.append("Number of students in class '").append(classOfStud).append("': ").append(studentsInClass.size()).append("\n");

            double totalGPA = 0;
            for (Student student : studentsInClass) {
                totalGPA += student.getGpa();
            }
            double averageGPA = totalGPA / studentsInClass.size();
            DecimalFormat df = new DecimalFormat("#.##");
            resultMessage.append("Average GPA: ").append(df.format(averageGPA)).append("\n");

            resultTextArea.setText(resultMessage.toString());
        }
    }

    private void searchByName(String name) {
        Student student = studentManagement.getStudentByName(name);
        if (student == null) {
            resultTextArea.setText("No such student found.");
        } else {
            StringBuilder resultMessage = new StringBuilder();
            resultMessage.append("Student '").append(name).append("' found!!\n");
            resultMessage.append("Name: ").append(student.getStudName()).append("\n");
            resultMessage.append("Admin: ").append(student.getAdminNum()).append("\n");
            resultMessage.append("Class: ").append(student.getStudClass()).append("\n");
            resultMessage.append("GPA: ").append(new DecimalFormat("#.00").format(student.getGpa())).append("\n");

            resultTextArea.setText(resultMessage.toString());
        }
    }

    private void updateStudentInfo() {
        Student currentStudent = studentManagement.getStudents().get(currentStudentIndex);
        DecimalFormat df = new DecimalFormat("#.00");
        nameTextField.setText(currentStudent.getStudName());
        adminTextField.setText(currentStudent.getAdminNum());
        classTextField.setText(currentStudent.getStudClass());
        gpaTextField.setText(df.format(currentStudent.getGpa()));

        // Update the student panel title
        StudentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Student " + (currentStudentIndex + 1) + " of " + studentManagement.getStudents().size()));

        currentModuleIndex = 0; // Reset module index when student changes
        updateModuleInfo();
    }

    private void updateModuleInfo() {
        Student currentStudent = studentManagement.getStudents().get(currentStudentIndex);
        Module currentModule = currentStudent.getModules().get(currentModuleIndex);
        modCodeTextField.setText(currentModule.getModuleCode());
        modNameTextField.setText(currentModule.getModuleName());
        marksTextField.setText(String.valueOf(currentModule.getMarks()));
        creditTextField.setText(String.valueOf(currentModule.getCreditUnit()));
        gradeTextField.setText(currentModule.getGrade());

        // Update the module panel title
        modulePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Module " + (currentModuleIndex + 1) + " of " + currentStudent.getModules().size()));
    }

    private void clearStudentInfo() {
        nameTextField.setText("");
        adminTextField.setText("");
        classTextField.setText("");
        gpaTextField.setText("");
    }

    private void clearModuleInfo() {
        modCodeTextField.setText("");
        modNameTextField.setText("");
        marksTextField.setText("");
        creditTextField.setText("");
        gradeTextField.setText("");
    }

    private JTable createStudentTable() {
        return studentManagement.createStudentTable();
    }

    public class SoundUtils {

        public static void playSound(String soundFileName) {
            try {
                // Load the sound file using the class loader
                File soundFile = new File(SoundUtils.class.getResource(soundFileName).toURI());
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

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
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel StudentPanel;
    private javax.swing.JLabel adminLabel;
    private javax.swing.JTextField adminTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton byClassRadioButton;
    private javax.swing.JLabel classLabel;
    private javax.swing.JTextField classTextField;
    private javax.swing.JLabel creditLabel;
    private javax.swing.JTextField creditTextField;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel gpaLabel;
    private javax.swing.JTextField gpaTextField;
    private javax.swing.JTextField gradeTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField marksTextField;
    private javax.swing.JLabel modCodeLabel;
    private javax.swing.JTextField modCodeTextField;
    private javax.swing.JLabel modNameLabel;
    private javax.swing.JTextField modNameTextField;
    private javax.swing.JButton modNextButton;
    private javax.swing.JButton modPrevButton;
    private javax.swing.JPanel modulePanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextArea resultTextArea;
    private javax.swing.JTextField searchTxtField;
    private javax.swing.JButton studentNextButton;
    private javax.swing.JButton studentPrevButton;
    // End of variables declaration//GEN-END:variables
}
