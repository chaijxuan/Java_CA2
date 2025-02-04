/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JPRG_CA2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.image.WritableImage;
import javax.imageio.ImageIO;
import javafx.embed.swing.SwingFXUtils;
import javax.swing.JOptionPane;

/**
 *
 * @author chaij
 */
public class AdvancedFeatures extends javax.swing.JFrame {

    private StudentManagement studentManagement;
    private AdminManagement adminManagement;
    private JFXPanel fxPanel;
    private Scene currentScene;

    public AdvancedFeatures(StudentManagement studentManagement, AdminManagement adminManagement) {
        this.studentManagement = studentManagement;
        this.adminManagement = adminManagement;
        initComponents();
        initFXPanel(); // Initialize the JavaFX panel
    }

    private AdvancedFeatures() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void initFXPanel() {
        fxPanel = new JFXPanel(); // Create the JFXPanel
        fxPanel.setPreferredSize(new Dimension(500, 400)); // Set preferred size
        chartPanel.setLayout(new BorderLayout());
        chartPanel.add(fxPanel, BorderLayout.CENTER);

        // Initialize the JavaFX runtime
        Platform.runLater(() -> {
            fxPanel.setScene(new Scene(new javafx.scene.Group(), 500, 400)); // Set the initial scene dimensions
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        exportToCSVbttn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sortAndDisplayChartButton = new javax.swing.JButton();
        chartPanel = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        chartTypeComboBox = new javax.swing.JComboBox<>();
        graphExportButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        exportToCSVbttn.setText("Export To CSV");
        exportToCSVbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportToCSVbttnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Advanced Features!");

        sortAndDisplayChartButton.setText("Sort and Display Chart");
        sortAndDisplayChartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortAndDisplayChartButtonActionPerformed(evt);
            }
        });

        chartPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout chartPanelLayout = new javax.swing.GroupLayout(chartPanel);
        chartPanel.setLayout(chartPanelLayout);
        chartPanelLayout.setHorizontalGroup(
            chartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        chartPanelLayout.setVerticalGroup(
            chartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );

        chartTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bar Chart that shows ranking of Students", "Pie Chart that shows result of Modules" }));
        chartTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chartTypeComboBoxActionPerformed(evt);
            }
        });

        graphExportButton.setText("Export The Graph");
        graphExportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphExportButtonActionPerformed(evt);
            }
        });

        jMenu1.setText("Frames");

        jMenuItem2.setText("Advanced Features");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setText("Student Frame");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        exitMenu.setText("Exit");
        exitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Exit from this system");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        exitMenu.add(jMenuItem3);

        jMenuBar1.add(exitMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(exportToCSVbttn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sortAndDisplayChartButton)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 313, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(281, 281, 281))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(chartTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(graphExportButton)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addComponent(chartTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortAndDisplayChartButton)
                    .addComponent(exportToCSVbttn))
                .addGap(27, 27, 27)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(graphExportButton)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exportToCSVbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportToCSVbttnActionPerformed
        StudentFrame.SoundUtils.playSound("/JPRG_CA2/clicking.wav");
        JTable studentTable = studentManagement.createStudentTable();
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");
        fileChooser.setFileFilter(new FileNameExtensionFilter("CSV file", "csv"));

        int userSelection = fileChooser.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            java.io.File fileToSave = fileChooser.getSelectedFile();
            String filePath = fileToSave.getAbsolutePath();
            if (!filePath.endsWith(".csv")) {
                filePath += ".csv";
            }
            studentManagement.exportToCSV(studentTable, filePath);
        }
    }//GEN-LAST:event_exportToCSVbttnActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new AdvancedFeatures(studentManagement, adminManagement).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new StudentFrame(studentManagement, adminManagement).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void exitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuActionPerformed

    }//GEN-LAST:event_exitMenuActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void chartTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chartTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chartTypeComboBoxActionPerformed

    private void sortAndDisplayChartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortAndDisplayChartButtonActionPerformed
        StudentFrame.SoundUtils.playSound("/JPRG_CA2/clicking.wav");
        sortStudentsByGPAThenName();
    }//GEN-LAST:event_sortAndDisplayChartButtonActionPerformed

    private void graphExportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphExportButtonActionPerformed
        StudentFrame.SoundUtils.playSound("/JPRG_CA2/clicking.wav");
        exportCurrentChart();
    }//GEN-LAST:event_graphExportButtonActionPerformed

    private JTable createStudentTable() {
        return studentManagement.createStudentTable();
    }

    public void sortStudentsByGPAThenName() {
        studentManagement.getStudents().sort(Comparator
                .comparingDouble(Student::getGpa)
                .reversed()
                .thenComparing(Student::getStudName));

        String selectedChartType = (String) chartTypeComboBox.getSelectedItem();
        if ("Pie Chart that shows result of Modules".equals(selectedChartType)) {
            displayModuleGradeDistributionWithPieChart();
        } else {
            displayStudentRankingWithBarChart();
        }
    }

    private void displayStudentRankingWithBarChart() {
        Platform.runLater(() -> {
            CategoryAxis xAxis = new CategoryAxis();
            NumberAxis yAxis = new NumberAxis();
            BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);

            xAxis.setLabel("Student Name");
            yAxis.setLabel("GPA");

            XYChart.Series<String, Number> series = new XYChart.Series<>();
            series.setName("GPA");

            for (Student student : studentManagement.getStudents()) {
                series.getData().add(new XYChart.Data<>(student.getStudName(), student.getGpa()));
            }

            barChart.getData().add(series);
            fxPanel.setScene(new Scene(barChart, 500, 400));
        });
    }

    private void displayModuleGradeDistributionWithPieChart() {
        Platform.runLater(() -> {
            Map<String, Map<String, Integer>> moduleGradeDistribution = new HashMap<>();
            for (Student student : studentManagement.getStudents()) {
                for (Module module : student.getModules()) {
                    moduleGradeDistribution
                            .computeIfAbsent(module.getModuleName(), k -> new HashMap<>())
                            .merge(module.getGrade(), 1, Integer::sum);
                }
            }

            PieChart pieChart = new PieChart();
            for (Map.Entry<String, Map<String, Integer>> entry : moduleGradeDistribution.entrySet()) {
                String moduleName = entry.getKey();
                int count = entry.getValue().getOrDefault("A", 0);
                pieChart.getData().add(new PieChart.Data(moduleName, count));
            }

            pieChart.setTitle("Module Grade Distribution (Number of A's)");
            fxPanel.setScene(new Scene(pieChart, 500, 400));

        });
    }

    private void exportCurrentChart() {
        if (fxPanel.getScene() == null) {
            JOptionPane.showMessageDialog(this, "No chart to export. Please generate a chart first.");
            return;
        }

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save Chart As");
        fileChooser.setFileFilter(new FileNameExtensionFilter("PNG Images", "png"));

        int userSelection = fileChooser.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String filePath = fileToSave.getAbsolutePath();
            if (!filePath.toLowerCase().endsWith(".png")) {
                filePath += ".png";
            }

            final String finalFilePath = filePath; // Create a final copy of filePath

            Platform.runLater(() -> {
                try {
                    WritableImage writableImage = fxPanel.getScene().snapshot(null);
                    BufferedImage bufferedImage = SwingFXUtils.fromFXImage(writableImage, null);
                    ImageIO.write(bufferedImage, "png", new File(finalFilePath)); // Use finalFilePath here
                    JOptionPane.showMessageDialog(this, "Chart exported successfully!");
                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Failed to export chart: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            });
        }
    }

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdvancedFeatures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdvancedFeatures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdvancedFeatures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdvancedFeatures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdvancedFeatures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdvancedFeatures().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel chartPanel;
    private javax.swing.JComboBox<String> chartTypeComboBox;
    private javax.swing.JMenu exitMenu;
    private javax.swing.JButton exportToCSVbttn;
    private javax.swing.JButton graphExportButton;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton sortAndDisplayChartButton;
    // End of variables declaration//GEN-END:variables

}
