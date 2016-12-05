/*
 * Copyright (C) 2016 acer
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package sk.upjs.doctororganizer.Form;

import sk.upjs.doctororganizer.Entities.Doctor;
import sk.upjs.doctororganizer.Entities.DoctorOffice;
import sk.upjs.doctororganizer.Models.OfficeListModel;

/**
 *
 * @author acer
 */
public class DoctorMainForm extends javax.swing.JFrame {

    private Doctor loggedInDoctor;
    private OfficeListModel officeListModel;

    /**
     * Creates new form DoctorMainForm
     */
    public DoctorMainForm(Doctor loggedInDoctor) {
        this.loggedInDoctor = loggedInDoctor;
        officeListModel = new OfficeListModel(loggedInDoctor.getId());
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

        titlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        personalDetailsPanel = new javax.swing.JPanel();
        personalTitleLabel = new javax.swing.JLabel();
        personalTitleTextField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        changeDetailsButton = new javax.swing.JButton();
        addOfficeButton = new javax.swing.JButton();
        changePasswordButton = new javax.swing.JButton();
        officesListPanel = new javax.swing.JPanel();
        officesScrollPane = new javax.swing.JScrollPane();
        officesList = new javax.swing.JList<>();
        listTermsButton = new javax.swing.JButton();
        changeOfficeDetailsButton = new javax.swing.JButton();
        deleteOfficeButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DoctorOrganizer 1.0");

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Okno lekára");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        personalDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Výpis údajov"));

        personalTitleLabel.setText("Titul:");

        personalTitleTextField.setEditable(false);

        nameLabel.setText("Meno:");

        nameTextField.setEditable(false);

        lastNameLabel.setText("Priezvisko:");

        lastNameTextField.setEditable(false);

        emailLabel.setText("E-mail:");

        emailTextField.setEditable(false);

        changeDetailsButton.setText("Zmeniť údaje");
        changeDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeDetailsButtonActionPerformed(evt);
            }
        });

        addOfficeButton.setText("Pridať ordináciu");
        addOfficeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOfficeButtonActionPerformed(evt);
            }
        });

        changePasswordButton.setText("Zmeniť heslo");
        changePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout personalDetailsPanelLayout = new javax.swing.GroupLayout(personalDetailsPanel);
        personalDetailsPanel.setLayout(personalDetailsPanelLayout);
        personalDetailsPanelLayout.setHorizontalGroup(
            personalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(personalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personalDetailsPanelLayout.createSequentialGroup()
                        .addComponent(personalTitleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(personalTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameTextField))
                    .addGroup(personalDetailsPanelLayout.createSequentialGroup()
                        .addGroup(personalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameLabel)
                            .addComponent(emailLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(personalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameTextField)
                            .addComponent(emailTextField)))
                    .addGroup(personalDetailsPanelLayout.createSequentialGroup()
                        .addComponent(changeDetailsButton)
                        .addGap(18, 18, 18)
                        .addComponent(addOfficeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(changePasswordButton)))
                .addContainerGap())
        );
        personalDetailsPanelLayout.setVerticalGroup(
            personalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalDetailsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(personalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personalTitleLabel)
                    .addComponent(personalTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(personalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(personalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(personalDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeDetailsButton)
                    .addComponent(changePasswordButton)
                    .addComponent(addOfficeButton)))
        );

        officesListPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Výpis ordinácií"));

        officesList.setModel(officeListModel);
        officesScrollPane.setViewportView(officesList);

        listTermsButton.setText("Vypísať termíny");
        listTermsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listTermsButtonActionPerformed(evt);
            }
        });

        changeOfficeDetailsButton.setText("Zmeniť detaily ordinácie");
        changeOfficeDetailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeOfficeDetailsButtonActionPerformed(evt);
            }
        });

        deleteOfficeButton.setText("Odstrániť ordináciu");
        deleteOfficeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOfficeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout officesListPanelLayout = new javax.swing.GroupLayout(officesListPanel);
        officesListPanel.setLayout(officesListPanelLayout);
        officesListPanelLayout.setHorizontalGroup(
            officesListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(officesListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(officesListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(officesScrollPane)
                    .addComponent(listTermsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(officesListPanelLayout.createSequentialGroup()
                        .addComponent(changeOfficeDetailsButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteOfficeButton)))
                .addContainerGap())
        );
        officesListPanelLayout.setVerticalGroup(
            officesListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(officesListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(officesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listTermsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(officesListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeOfficeDetailsButton)
                    .addComponent(deleteOfficeButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        logoutButton.setText("Odhlásiť sa");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personalDetailsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titlePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(officesListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(personalDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(officesListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changeDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeDetailsButtonActionPerformed

        if (!this.personalTitleTextField.isEditable()) {
            //editMode
            this.personalTitleTextField.setEditable(true);
            this.nameTextField.setEditable(true);
            this.lastNameTextField.setEditable(true);
            this.emailTextField.setEditable(true);
            this.changeDetailsButton.setText("Uložiť údaje");
        } else {
            //displayMode
            this.personalTitleTextField.setEditable(false);
            this.nameTextField.setEditable(false);
            this.lastNameTextField.setEditable(false);
            this.emailTextField.setEditable(false);
            //TODO update changes to DB            
            this.changeDetailsButton.setText("Zmeniť údaje");
        }

    }//GEN-LAST:event_changeDetailsButtonActionPerformed

    private void changePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordButtonActionPerformed
        ChangePasswordDialog chpd = new ChangePasswordDialog(this, true);
        chpd.setLoggedInDoctor(loggedInDoctor);
        chpd.setVisible(true);
    }//GEN-LAST:event_changePasswordButtonActionPerformed

    private void listTermsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listTermsButtonActionPerformed
        DoctorTermDialog dtd = new DoctorTermDialog(this, true, officesList.getSelectedValue().getId());
        dtd.setVisible(true);
    }//GEN-LAST:event_listTermsButtonActionPerformed

    private void changeOfficeDetailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeOfficeDetailsButtonActionPerformed
        OfficeEditForm oef = new OfficeEditForm(this, true, officesList.getSelectedValue());
        oef.setVisible(true);
        officeListModel.refreshList();
    }//GEN-LAST:event_changeOfficeDetailsButtonActionPerformed

    private void deleteOfficeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOfficeButtonActionPerformed

    }//GEN-LAST:event_deleteOfficeButtonActionPerformed

    private void addOfficeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOfficeButtonActionPerformed
        OfficeRegistrationDialog ord = new OfficeRegistrationDialog(this, true);
        ord.setDoctorId(loggedInDoctor.getId());
        ord.setVisible(true);
        officeListModel.refreshList();
    }//GEN-LAST:event_addOfficeButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        this.dispose();
        LoginForm lf = new LoginForm();
        lf.setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed
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
            java.util.logging.Logger.getLogger(DoctorMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOfficeButton;
    private javax.swing.JButton changeDetailsButton;
    private javax.swing.JButton changeOfficeDetailsButton;
    private javax.swing.JButton changePasswordButton;
    private javax.swing.JButton deleteOfficeButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JButton listTermsButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JList<DoctorOffice> officesList;
    private javax.swing.JPanel officesListPanel;
    private javax.swing.JScrollPane officesScrollPane;
    private javax.swing.JPanel personalDetailsPanel;
    private javax.swing.JLabel personalTitleLabel;
    private javax.swing.JTextField personalTitleTextField;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables

}
