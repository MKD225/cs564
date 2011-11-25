package assignment2;

import pc.MainWindowPC;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Login.java
 *
 * Created on Nov 23, 2011, 5:47:31 PM
 */
/**
 *
 * @author Marigianna
 */
public class Login extends javax.swing.JPanel {

    /** Creates new form Login */
    public Login() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adaptiveTextField2 = new widgets.textfield.AdaptiveTextField();
        adaptivePanel2 = new widgets.panel.AdaptivePanel();
        adaptivePanel24 = new widgets.panel.AdaptivePanel();
        adaptivePanel12 = new widgets.panel.AdaptivePanel();
        adaptivePanel13 = new widgets.panel.AdaptivePanel();
        adaptivePanel14 = new widgets.panel.AdaptivePanel();
        usernameLabel = new widgets.label.AdaptiveLabel();
        usernameTextField = new widgets.textfield.AdaptiveTextField();
        adaptivePanel1 = new widgets.panel.AdaptivePanel();
        passwordLabel = new widgets.label.AdaptiveLabel();
        passwordTextField = new widgets.textfield.AdaptiveTextField();
        adaptivePanel15 = new widgets.panel.AdaptivePanel();
        adaptivePanel16 = new widgets.panel.AdaptivePanel();
        adaptivePanel17 = new widgets.panel.AdaptivePanel();
        adaptivePanel18 = new widgets.panel.AdaptivePanel();
        adaptivePanel20 = new widgets.panel.AdaptivePanel();
        adaptivePanel4 = new widgets.panel.AdaptivePanel();
        adaptiveCheckBox1 = new widgets.checkbox.AdaptiveCheckBox();
        adaptivePanel19 = new widgets.panel.AdaptivePanel();
        adaptivePanel22 = new widgets.panel.AdaptivePanel();
        adaptivePanel3 = new widgets.panel.AdaptivePanel();
        adaptivePanel5 = new widgets.panel.AdaptivePanel();
        adaptivePanel6 = new widgets.panel.AdaptivePanel();
        signInButton = new widgets.button.AdaptiveButton();
        adaptivePanel7 = new widgets.panel.AdaptivePanel();
        adaptivePanel21 = new widgets.panel.AdaptivePanel();
        adaptivePanel8 = new widgets.panel.AdaptivePanel();
        adaptivePanel9 = new widgets.panel.AdaptivePanel();
        adaptivePanel10 = new widgets.panel.AdaptivePanel();
        forgotPasswordButton = new widgets.button.AdaptiveButton();
        signUpButton = new widgets.button.AdaptiveButton();
        adaptivePanel11 = new widgets.panel.AdaptivePanel();
        adaptivePanel23 = new widgets.panel.AdaptivePanel();
        adaptivePanel25 = new widgets.panel.AdaptivePanel();

        adaptiveTextField2.setText("adaptiveTextField2");

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        adaptivePanel2.setFunction("welcomeImg");
        adaptivePanel2.setName("Panel.Image.Welcome"); // NOI18N
        adaptivePanel2.setPreferredSize(new java.awt.Dimension(420, 60));

        javax.swing.GroupLayout adaptivePanel2Layout = new javax.swing.GroupLayout(adaptivePanel2);
        adaptivePanel2.setLayout(adaptivePanel2Layout);
        adaptivePanel2Layout.setHorizontalGroup(
            adaptivePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        adaptivePanel2Layout.setVerticalGroup(
            adaptivePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        add(adaptivePanel2);
        adaptivePanel2.getAccessibleContext().setAccessibleDescription("");

        adaptivePanel24.setPreferredSize(new java.awt.Dimension(420, 30));

        javax.swing.GroupLayout adaptivePanel24Layout = new javax.swing.GroupLayout(adaptivePanel24);
        adaptivePanel24.setLayout(adaptivePanel24Layout);
        adaptivePanel24Layout.setHorizontalGroup(
            adaptivePanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        adaptivePanel24Layout.setVerticalGroup(
            adaptivePanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        add(adaptivePanel24);

        adaptivePanel12.setLayout(new javax.swing.BoxLayout(adaptivePanel12, javax.swing.BoxLayout.LINE_AXIS));

        adaptivePanel13.setPreferredSize(new java.awt.Dimension(136, 116));

        javax.swing.GroupLayout adaptivePanel13Layout = new javax.swing.GroupLayout(adaptivePanel13);
        adaptivePanel13.setLayout(adaptivePanel13Layout);
        adaptivePanel13Layout.setHorizontalGroup(
            adaptivePanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
        );
        adaptivePanel13Layout.setVerticalGroup(
            adaptivePanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 93, Short.MAX_VALUE)
        );

        adaptivePanel12.add(adaptivePanel13);

        adaptivePanel14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                adaptivePanel14FocusLost(evt);
            }
        });
        adaptivePanel14.setLayout(new javax.swing.BoxLayout(adaptivePanel14, javax.swing.BoxLayout.PAGE_AXIS));

        usernameLabel.setText("Όνομα χρήστη:");
        adaptivePanel14.add(usernameLabel);
        adaptivePanel14.add(usernameTextField);

        adaptivePanel1.setPreferredSize(new java.awt.Dimension(132, 10));

        javax.swing.GroupLayout adaptivePanel1Layout = new javax.swing.GroupLayout(adaptivePanel1);
        adaptivePanel1.setLayout(adaptivePanel1Layout);
        adaptivePanel1Layout.setHorizontalGroup(
            adaptivePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );
        adaptivePanel1Layout.setVerticalGroup(
            adaptivePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        adaptivePanel14.add(adaptivePanel1);

        passwordLabel.setText("Κωδικός χρήστη:");
        adaptivePanel14.add(passwordLabel);

        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });
        adaptivePanel14.add(passwordTextField);

        adaptivePanel12.add(adaptivePanel14);

        javax.swing.GroupLayout adaptivePanel15Layout = new javax.swing.GroupLayout(adaptivePanel15);
        adaptivePanel15.setLayout(adaptivePanel15Layout);
        adaptivePanel15Layout.setHorizontalGroup(
            adaptivePanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
        );
        adaptivePanel15Layout.setVerticalGroup(
            adaptivePanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 93, Short.MAX_VALUE)
        );

        adaptivePanel12.add(adaptivePanel15);

        add(adaptivePanel12);

        adaptivePanel16.setLayout(new javax.swing.BoxLayout(adaptivePanel16, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout adaptivePanel17Layout = new javax.swing.GroupLayout(adaptivePanel17);
        adaptivePanel17.setLayout(adaptivePanel17Layout);
        adaptivePanel17Layout.setHorizontalGroup(
            adaptivePanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        adaptivePanel17Layout.setVerticalGroup(
            adaptivePanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        adaptivePanel16.add(adaptivePanel17);

        adaptivePanel18.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                adaptivePanel18FocusLost(evt);
            }
        });
        adaptivePanel18.setLayout(new javax.swing.BoxLayout(adaptivePanel18, javax.swing.BoxLayout.PAGE_AXIS));

        adaptivePanel20.setPreferredSize(new java.awt.Dimension(132, 5));

        javax.swing.GroupLayout adaptivePanel20Layout = new javax.swing.GroupLayout(adaptivePanel20);
        adaptivePanel20.setLayout(adaptivePanel20Layout);
        adaptivePanel20Layout.setHorizontalGroup(
            adaptivePanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 132, Short.MAX_VALUE)
        );
        adaptivePanel20Layout.setVerticalGroup(
            adaptivePanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        adaptivePanel18.add(adaptivePanel20);

        adaptivePanel4.setPreferredSize(new java.awt.Dimension(132, 23));

        adaptiveCheckBox1.setText("Αποθήκευση κωδικού");

        javax.swing.GroupLayout adaptivePanel4Layout = new javax.swing.GroupLayout(adaptivePanel4);
        adaptivePanel4.setLayout(adaptivePanel4Layout);
        adaptivePanel4Layout.setHorizontalGroup(
            adaptivePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adaptivePanel4Layout.createSequentialGroup()
                .addComponent(adaptiveCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        adaptivePanel4Layout.setVerticalGroup(
            adaptivePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adaptivePanel4Layout.createSequentialGroup()
                .addComponent(adaptiveCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        adaptivePanel18.add(adaptivePanel4);

        adaptivePanel16.add(adaptivePanel18);

        javax.swing.GroupLayout adaptivePanel19Layout = new javax.swing.GroupLayout(adaptivePanel19);
        adaptivePanel19.setLayout(adaptivePanel19Layout);
        adaptivePanel19Layout.setHorizontalGroup(
            adaptivePanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        adaptivePanel19Layout.setVerticalGroup(
            adaptivePanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        adaptivePanel16.add(adaptivePanel19);

        add(adaptivePanel16);

        javax.swing.GroupLayout adaptivePanel22Layout = new javax.swing.GroupLayout(adaptivePanel22);
        adaptivePanel22.setLayout(adaptivePanel22Layout);
        adaptivePanel22Layout.setHorizontalGroup(
            adaptivePanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        adaptivePanel22Layout.setVerticalGroup(
            adaptivePanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        add(adaptivePanel22);

        adaptivePanel3.setLayout(new javax.swing.BoxLayout(adaptivePanel3, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout adaptivePanel5Layout = new javax.swing.GroupLayout(adaptivePanel5);
        adaptivePanel5.setLayout(adaptivePanel5Layout);
        adaptivePanel5Layout.setHorizontalGroup(
            adaptivePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
        );
        adaptivePanel5Layout.setVerticalGroup(
            adaptivePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        adaptivePanel3.add(adaptivePanel5);

        adaptivePanel6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                adaptivePanel6FocusLost(evt);
            }
        });
        adaptivePanel6.setLayout(new javax.swing.BoxLayout(adaptivePanel6, javax.swing.BoxLayout.PAGE_AXIS));

        signInButton.setText("Σύνδεση");
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });
        adaptivePanel6.add(signInButton);

        adaptivePanel3.add(adaptivePanel6);

        javax.swing.GroupLayout adaptivePanel7Layout = new javax.swing.GroupLayout(adaptivePanel7);
        adaptivePanel7.setLayout(adaptivePanel7Layout);
        adaptivePanel7Layout.setHorizontalGroup(
            adaptivePanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 164, Short.MAX_VALUE)
        );
        adaptivePanel7Layout.setVerticalGroup(
            adaptivePanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        adaptivePanel3.add(adaptivePanel7);

        add(adaptivePanel3);

        adaptivePanel21.setPreferredSize(new java.awt.Dimension(420, 20));

        javax.swing.GroupLayout adaptivePanel21Layout = new javax.swing.GroupLayout(adaptivePanel21);
        adaptivePanel21.setLayout(adaptivePanel21Layout);
        adaptivePanel21Layout.setHorizontalGroup(
            adaptivePanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        adaptivePanel21Layout.setVerticalGroup(
            adaptivePanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        add(adaptivePanel21);

        adaptivePanel8.setLayout(new javax.swing.BoxLayout(adaptivePanel8, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout adaptivePanel9Layout = new javax.swing.GroupLayout(adaptivePanel9);
        adaptivePanel9.setLayout(adaptivePanel9Layout);
        adaptivePanel9Layout.setHorizontalGroup(
            adaptivePanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        adaptivePanel9Layout.setVerticalGroup(
            adaptivePanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        adaptivePanel8.add(adaptivePanel9);

        adaptivePanel10.setMaximumSize(new java.awt.Dimension(222, 48));
        adaptivePanel10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                adaptivePanel10FocusLost(evt);
            }
        });
        adaptivePanel10.setLayout(new javax.swing.BoxLayout(adaptivePanel10, javax.swing.BoxLayout.PAGE_AXIS));

        forgotPasswordButton.setMaximumSize(new java.awt.Dimension(190, 24));
        forgotPasswordButton.setText("Ξεχάσατε τον κωδικό σας;");
        adaptivePanel10.add(forgotPasswordButton);

        signUpButton.setMaximumSize(new java.awt.Dimension(187, 24));
        signUpButton.setPreferredSize(new java.awt.Dimension(187, 24));
        signUpButton.setText("Δεν έχετε λογαριασμο;");
        adaptivePanel10.add(signUpButton);

        adaptivePanel8.add(adaptivePanel10);

        javax.swing.GroupLayout adaptivePanel11Layout = new javax.swing.GroupLayout(adaptivePanel11);
        adaptivePanel11.setLayout(adaptivePanel11Layout);
        adaptivePanel11Layout.setHorizontalGroup(
            adaptivePanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        adaptivePanel11Layout.setVerticalGroup(
            adaptivePanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        adaptivePanel8.add(adaptivePanel11);

        add(adaptivePanel8);

        adaptivePanel23.setPreferredSize(new java.awt.Dimension(420, 30));

        javax.swing.GroupLayout adaptivePanel23Layout = new javax.swing.GroupLayout(adaptivePanel23);
        adaptivePanel23.setLayout(adaptivePanel23Layout);
        adaptivePanel23Layout.setHorizontalGroup(
            adaptivePanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        adaptivePanel23Layout.setVerticalGroup(
            adaptivePanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        add(adaptivePanel23);

        adaptivePanel25.setPreferredSize(new java.awt.Dimension(420, 30));

        javax.swing.GroupLayout adaptivePanel25Layout = new javax.swing.GroupLayout(adaptivePanel25);
        adaptivePanel25.setLayout(adaptivePanel25Layout);
        adaptivePanel25Layout.setHorizontalGroup(
            adaptivePanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        adaptivePanel25Layout.setVerticalGroup(
            adaptivePanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        add(adaptivePanel25);
    }// </editor-fold>//GEN-END:initComponents

private void adaptivePanel6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adaptivePanel6FocusLost
// TODO add your handling code here:
}//GEN-LAST:event_adaptivePanel6FocusLost

private void adaptivePanel14FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adaptivePanel14FocusLost
// TODO add your handling code here:
}//GEN-LAST:event_adaptivePanel14FocusLost

private void adaptivePanel18FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adaptivePanel18FocusLost
// TODO add your handling code here:
}//GEN-LAST:event_adaptivePanel18FocusLost

private void adaptivePanel10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adaptivePanel10FocusLost
// TODO add your handling code here:
}//GEN-LAST:event_adaptivePanel10FocusLost

private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_passwordTextFieldActionPerformed

private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        AdaptableIMView im = new AdaptableIMView();       
        MainWindowPC.showPanel(im);
}//GEN-LAST:event_signInButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.checkbox.AdaptiveCheckBox adaptiveCheckBox1;
    private widgets.panel.AdaptivePanel adaptivePanel1;
    private widgets.panel.AdaptivePanel adaptivePanel10;
    private widgets.panel.AdaptivePanel adaptivePanel11;
    private widgets.panel.AdaptivePanel adaptivePanel12;
    private widgets.panel.AdaptivePanel adaptivePanel13;
    private widgets.panel.AdaptivePanel adaptivePanel14;
    private widgets.panel.AdaptivePanel adaptivePanel15;
    private widgets.panel.AdaptivePanel adaptivePanel16;
    private widgets.panel.AdaptivePanel adaptivePanel17;
    private widgets.panel.AdaptivePanel adaptivePanel18;
    private widgets.panel.AdaptivePanel adaptivePanel19;
    private widgets.panel.AdaptivePanel adaptivePanel2;
    private widgets.panel.AdaptivePanel adaptivePanel20;
    private widgets.panel.AdaptivePanel adaptivePanel21;
    private widgets.panel.AdaptivePanel adaptivePanel22;
    private widgets.panel.AdaptivePanel adaptivePanel23;
    private widgets.panel.AdaptivePanel adaptivePanel24;
    private widgets.panel.AdaptivePanel adaptivePanel25;
    private widgets.panel.AdaptivePanel adaptivePanel3;
    private widgets.panel.AdaptivePanel adaptivePanel4;
    private widgets.panel.AdaptivePanel adaptivePanel5;
    private widgets.panel.AdaptivePanel adaptivePanel6;
    private widgets.panel.AdaptivePanel adaptivePanel7;
    private widgets.panel.AdaptivePanel adaptivePanel8;
    private widgets.panel.AdaptivePanel adaptivePanel9;
    private widgets.textfield.AdaptiveTextField adaptiveTextField2;
    private widgets.button.AdaptiveButton forgotPasswordButton;
    private widgets.label.AdaptiveLabel passwordLabel;
    private widgets.textfield.AdaptiveTextField passwordTextField;
    private widgets.button.AdaptiveButton signInButton;
    private widgets.button.AdaptiveButton signUpButton;
    private widgets.label.AdaptiveLabel usernameLabel;
    private widgets.textfield.AdaptiveTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
