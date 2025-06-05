package softwareproject;

import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import static softwareproject.RegisterForm.hashPassword;

public class DeleteForm extends javax.swing.JFrame {

    public DeleteForm() {
        initComponents();
        setTitle("Update Info");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        updatePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        oPassLabel = new javax.swing.JLabel();
        nPassLabel = new javax.swing.JLabel();
        idfield = new javax.swing.JTextField();
        oldPassField = new javax.swing.JPasswordField();
        newPassField = new javax.swing.JPasswordField();
        updateBtn = new javax.swing.JButton();
        cPassLabel = new javax.swing.JLabel();
        confirmPassField = new javax.swing.JPasswordField();
        deletePanel = new javax.swing.JPanel();
        idLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(204, 153, 255));
        MainPanel.setToolTipText("");

        updatePanel.setBackground(new java.awt.Color(204, 153, 255));
        updatePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Updata Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setText("Student id");

        oPassLabel.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        oPassLabel.setText("Old Password");

        nPassLabel.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        nPassLabel.setText("New Password");

        newPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPassFieldActionPerformed(evt);
            }
        });

        updateBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        updateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recs/changes.png"))); // NOI18N
        updateBtn.setText("Update");
        updateBtn.setMaximumSize(new java.awt.Dimension(119, 37));
        updateBtn.setMinimumSize(new java.awt.Dimension(119, 37));
        updateBtn.setPreferredSize(new java.awt.Dimension(119, 37));
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        cPassLabel.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        cPassLabel.setText("Confirm password");

        confirmPassField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        confirmPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPassFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updatePanelLayout = new javax.swing.GroupLayout(updatePanel);
        updatePanel.setLayout(updatePanelLayout);
        updatePanelLayout.setHorizontalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nPassLabel)
                    .addComponent(cPassLabel)
                    .addComponent(oPassLabel)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(newPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oldPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idfield, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 221, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        updatePanelLayout.setVerticalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idfield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oPassLabel)
                    .addComponent(oldPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nPassLabel)
                    .addComponent(newPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cPassLabel)
                    .addComponent(confirmPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        deletePanel.setBackground(new java.awt.Color(204, 153, 255));
        deletePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Delete Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 1, 18))); // NOI18N

        idLabel.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        idLabel.setText("Student Id");

        idField.setPreferredSize(new java.awt.Dimension(64, 31));

        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recs/delete.png"))); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deletePanelLayout = new javax.swing.GroupLayout(deletePanel);
        deletePanel.setLayout(deletePanelLayout);
        deletePanelLayout.setHorizontalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(260, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteBtn)
                .addGap(42, 42, 42))
        );
        deletePanelLayout.setVerticalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(deleteBtn)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deletePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(deletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPassFieldActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed

        // Remove Extra Space
        String idText = idField.getText().trim();

        if (idText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a student ID.");
            return;
        }

        try {
            int id = Integer.parseInt(idText); // convert input to integer

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "");
            String sql = "DELETE FROM student WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Student deleted successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "No student found with that ID.");
            }

            conn.close();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID must be a number.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed

        // Take input from user
        String idText = idfield.getText().trim();
        String oldPass = oldPassField.getText().trim();
        String newPass = newPassField.getText().trim();
        String confirmPass = confirmPassField.getText().trim();

        if (idText.isEmpty() || oldPass.isEmpty() || newPass.isEmpty() || confirmPass.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.");
            return;
        }

        if (!newPass.equals(confirmPass)) {
            JOptionPane.showMessageDialog(this, "New Password and Confirm Password do not match.");
            return;
        }

        try {
            int id = Integer.parseInt(idText);

            // Hash the passwords using hash method
            String hashedOldPass = hashPassword(oldPass);
            String hashedNewPass = hashPassword(newPass);

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "");

            // Check if the student with the given ID and old hashed password exists
            String checkSql = "SELECT * FROM student WHERE id = ? AND password = ?";
            PreparedStatement checkStmt = conn.prepareStatement(checkSql);
            checkStmt.setInt(1, id);
            checkStmt.setString(2, hashedOldPass);
            ResultSet rs = checkStmt.executeQuery();

            if (rs.next()) {
                // Update the password with the new hashed one
                String updateSql = "UPDATE student SET password = ? WHERE id = ?";
                PreparedStatement updateStmt = conn.prepareStatement(updateSql);
                updateStmt.setString(1, hashedNewPass);
                updateStmt.setInt(2, id);
                updateStmt.executeUpdate();

                JOptionPane.showMessageDialog(this, "Password updated successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect ID or old password.");
            }

            conn.close();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID must be a number.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage());
        }


    }//GEN-LAST:event_updateBtnActionPerformed

    private void confirmPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPassFieldActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel cPassLabel;
    private javax.swing.JPasswordField confirmPassField;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JPanel deletePanel;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nPassLabel;
    private javax.swing.JPasswordField newPassField;
    private javax.swing.JLabel oPassLabel;
    private javax.swing.JPasswordField oldPassField;
    private javax.swing.JButton updateBtn;
    private javax.swing.JPanel updatePanel;
    // End of variables declaration//GEN-END:variables
}
