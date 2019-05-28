/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import UserClasses.*;
import java.awt.event.ActionListener;

/**
 *
 * @author wangj1701
 */
public class Runner extends javax.swing.JFrame {
    private SurvivorList survivors;
    private ProviderList providers;
    /**
     * Creates new form Runner
     */
    public Runner() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        survivorPanel = new javax.swing.JPanel();
        survivorTitle = new javax.swing.JLabel();
        nameInputSurv = new javax.swing.JTextField();
        survNameTitle = new javax.swing.JLabel();
        ageTitle = new javax.swing.JLabel();
        SURVSUBMIT = new javax.swing.JButton();
        ageSlider = new javax.swing.JSlider();
        survZipTitle = new javax.swing.JLabel();
        zipFieldSurv = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        needServiceList = new javax.swing.JList();
        needTitle = new javax.swing.JLabel();
        needDescrip = new javax.swing.JLabel();
        survNotesDescrip = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        survNotes = new javax.swing.JTextArea();
        providerPanel = new javax.swing.JPanel();
        providerTitle = new javax.swing.JLabel();
        nameInputProv = new javax.swing.JTextField();
        provNameTitle = new javax.swing.JLabel();
        PROVSUBMIT = new javax.swing.JButton();
        provZipTitle = new javax.swing.JLabel();
        zipFieldProv = new javax.swing.JTextField();
        jScrollPane11 = new javax.swing.JScrollPane();
        provServiceList = new javax.swing.JList();
        serviceTitle = new javax.swing.JLabel();
        serviceDescrip = new javax.swing.JLabel();
        provNotesDescrip = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        provNotes = new javax.swing.JTextArea();
        outputPanel = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        outputTitle = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        listDescrip = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        survivorListPrint = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        providerListPrint = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setText("Welcome To DisasterPlanner");

        survivorPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        survivorTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        survivorTitle.setText("SURVIVOR INFORMATION INPUT");

        nameInputSurv.setText("Enter Name Here");

        survNameTitle.setText("NAME");

        ageTitle.setText("AGE");

        SURVSUBMIT.setText("Submit Information/Search");
        SURVSUBMIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SURVSUBMITActionPerformed(evt);
            }
        });

        ageSlider.setMajorTickSpacing(10);
        ageSlider.setPaintLabels(true);
        ageSlider.setPaintTicks(true);

        survZipTitle.setText("ZIP CODE");

        zipFieldSurv.setText("Enter Zip Code Here");

        needServiceList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Food", "Water", "Shelter", "Medical Assistance" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(needServiceList);

        needTitle.setText("NEED:");

        needDescrip.setText("Select your most pressing need below:");

        survNotesDescrip.setText("Any Other Notes for EMT/First Responders:");

        survNotes.setColumns(20);
        survNotes.setRows(5);
        jScrollPane2.setViewportView(survNotes);

        javax.swing.GroupLayout survivorPanelLayout = new javax.swing.GroupLayout(survivorPanel);
        survivorPanel.setLayout(survivorPanelLayout);
        survivorPanelLayout.setHorizontalGroup(
            survivorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(survivorPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(survivorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(survivorPanelLayout.createSequentialGroup()
                        .addGroup(survivorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(survivorPanelLayout.createSequentialGroup()
                                .addGroup(survivorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(survZipTitle)
                                    .addComponent(needTitle))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(survivorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(zipFieldSurv, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(needDescrip)))
                            .addGroup(survivorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(survNotesDescrip)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(survivorPanelLayout.createSequentialGroup()
                                    .addComponent(SURVSUBMIT)
                                    .addGap(8, 8, 8))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, survivorPanelLayout.createSequentialGroup()
                        .addGap(0, 26, Short.MAX_VALUE)
                        .addComponent(survivorTitle)
                        .addGap(58, 58, 58))
                    .addGroup(survivorPanelLayout.createSequentialGroup()
                        .addGroup(survivorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(survivorPanelLayout.createSequentialGroup()
                                .addComponent(ageTitle)
                                .addGap(18, 18, 18)
                                .addComponent(ageSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(survivorPanelLayout.createSequentialGroup()
                                .addComponent(survNameTitle)
                                .addGap(18, 18, 18)
                                .addComponent(nameInputSurv, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        survivorPanelLayout.setVerticalGroup(
            survivorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(survivorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(survivorTitle)
                .addGap(18, 18, 18)
                .addGroup(survivorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameInputSurv, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(survNameTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(survivorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ageTitle)
                    .addComponent(ageSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(survivorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(survZipTitle)
                    .addComponent(zipFieldSurv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(survivorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(needTitle)
                    .addComponent(needDescrip))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(survNotesDescrip)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SURVSUBMIT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        providerPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        providerTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        providerTitle.setText("PROVIDER INFORMATION INPUT");

        nameInputProv.setText("Enter Name Here");

        provNameTitle.setText("NAME");

        PROVSUBMIT.setText("Submit Information/Search");
        PROVSUBMIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PROVSUBMITActionPerformed(evt);
            }
        });

        provZipTitle.setText("ZIP CODE");

        zipFieldProv.setText("Enter Zip Code Here");

        provServiceList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Food", "Water", "Shelter", "Medical Assistance" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane11.setViewportView(provServiceList);

        serviceTitle.setText("SERVICE");

        serviceDescrip.setText("Select the need you are providing:");

        provNotesDescrip.setText("Any Other Notes for Survivors");

        provNotes.setColumns(20);
        provNotes.setRows(5);
        jScrollPane12.setViewportView(provNotes);

        javax.swing.GroupLayout providerPanelLayout = new javax.swing.GroupLayout(providerPanel);
        providerPanel.setLayout(providerPanelLayout);
        providerPanelLayout.setHorizontalGroup(
            providerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, providerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(providerTitle)
                .addGap(42, 42, 42))
            .addGroup(providerPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(providerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, providerPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(provNameTitle)
                        .addGap(27, 27, 27)
                        .addComponent(nameInputProv, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(providerPanelLayout.createSequentialGroup()
                        .addGroup(providerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(providerPanelLayout.createSequentialGroup()
                                .addComponent(provZipTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(zipFieldProv, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(providerPanelLayout.createSequentialGroup()
                                .addComponent(serviceTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(providerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(serviceDescrip)))
                            .addGroup(providerPanelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(providerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(provNotesDescrip)
                                    .addGroup(providerPanelLayout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(PROVSUBMIT)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        providerPanelLayout.setVerticalGroup(
            providerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(providerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(providerTitle)
                .addGap(18, 18, 18)
                .addGroup(providerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameInputProv, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(provNameTitle))
                .addGap(18, 18, 18)
                .addGroup(providerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(provZipTitle)
                    .addComponent(zipFieldProv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(providerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serviceTitle)
                    .addComponent(serviceDescrip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(provNotesDescrip)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PROVSUBMIT)
                .addContainerGap())
        );

        outputPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        output.setEditable(false);
        output.setColumns(20);
        output.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        output.setRows(5);
        jScrollPane13.setViewportView(output);

        outputTitle.setText("Below are the outputs of your search based on inputted info");

        resetButton.setText("Reset");

        listDescrip.setText("Below is the complete list of survivors/providers in the database");

        survivorListPrint.setEditable(false);
        survivorListPrint.setColumns(20);
        survivorListPrint.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        survivorListPrint.setRows(5);
        jScrollPane14.setViewportView(survivorListPrint);

        providerListPrint.setEditable(false);
        providerListPrint.setColumns(20);
        providerListPrint.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        providerListPrint.setRows(5);
        jScrollPane15.setViewportView(providerListPrint);

        javax.swing.GroupLayout outputPanelLayout = new javax.swing.GroupLayout(outputPanel);
        outputPanel.setLayout(outputPanelLayout);
        outputPanelLayout.setHorizontalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanelLayout.createSequentialGroup()
                .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(outputPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(outputTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(outputPanelLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(resetButton))
                    .addGroup(outputPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(outputPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(listDescrip))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        outputPanelLayout.setVerticalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(outputPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane14)
                            .addComponent(jScrollPane15)))
                    .addGroup(outputPanelLayout.createSequentialGroup()
                        .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(outputTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(outputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(survivorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(providerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(155, 155, 155))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(survivorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(providerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SURVSUBMITActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void PROVSUBMITActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add handling code here:
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
            java.util.logging.Logger.getLogger(Runner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Runner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Runner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Runner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Runner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PROVSUBMIT;
    private javax.swing.JButton SURVSUBMIT;
    private javax.swing.JSlider ageSlider;
    private javax.swing.JLabel ageTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel listDescrip;
    private javax.swing.JTextField nameInputProv;
    private javax.swing.JTextField nameInputSurv;
    private javax.swing.JLabel needDescrip;
    private javax.swing.JList needServiceList;
    private javax.swing.JLabel needTitle;
    private javax.swing.JTextArea output;
    private javax.swing.JPanel outputPanel;
    private javax.swing.JLabel outputTitle;
    private javax.swing.JLabel provNameTitle;
    private javax.swing.JTextArea provNotes;
    private javax.swing.JLabel provNotesDescrip;
    private javax.swing.JList provServiceList;
    private javax.swing.JLabel provZipTitle;
    private javax.swing.JTextArea providerListPrint;
    private javax.swing.JPanel providerPanel;
    private javax.swing.JLabel providerTitle;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel serviceDescrip;
    private javax.swing.JLabel serviceTitle;
    private javax.swing.JLabel survNameTitle;
    private javax.swing.JTextArea survNotes;
    private javax.swing.JLabel survNotesDescrip;
    private javax.swing.JLabel survZipTitle;
    private javax.swing.JTextArea survivorListPrint;
    private javax.swing.JPanel survivorPanel;
    private javax.swing.JLabel survivorTitle;
    private javax.swing.JTextField zipFieldProv;
    private javax.swing.JTextField zipFieldSurv;
    // End of variables declaration//GEN-END:variables
}
