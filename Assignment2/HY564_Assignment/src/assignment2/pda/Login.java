package assignment2.pda;

import pda.MainWindowPDA;
import utilities.Adaptation;

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
        Adaptation.automaticallySetRuntime(this);
        Adaptation.automaticallyAdapt(this);		
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
        adaptivePanel5 = new widgets.panel.AdaptivePanel();
        adaptivePanel2 = new widgets.panel.AdaptivePanel();
        adaptivePanel4 = new widgets.panel.AdaptivePanel();
        adaptivePanel3 = new widgets.panel.AdaptivePanel();
        usernameLabel = new widgets.label.AdaptiveLabel();
        usernameTextField = new widgets.textfield.AdaptiveTextField();
        passwordLabel = new widgets.label.AdaptiveLabel();
        passwordTextField = new widgets.textfield.AdaptiveTextField();
        adaptivePanel1 = new widgets.panel.AdaptivePanel();
        adaptiveButton1 = new widgets.button.AdaptiveButton();

        adaptiveTextField2.setText("adaptiveTextField2");

        setLayout(new java.awt.BorderLayout(0, 50));

        adaptivePanel5.setFunction("welcomeImg");
        adaptivePanel5.setName("Panel.Image.Welcome"); // NOI18N
        adaptivePanel5.setPreferredSize(new java.awt.Dimension(300, 60));

        javax.swing.GroupLayout adaptivePanel5Layout = new javax.swing.GroupLayout(adaptivePanel5);
        adaptivePanel5.setLayout(adaptivePanel5Layout);
        adaptivePanel5Layout.setHorizontalGroup(
            adaptivePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        adaptivePanel5Layout.setVerticalGroup(
            adaptivePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        add(adaptivePanel5, java.awt.BorderLayout.PAGE_START);

        adaptivePanel2.setLayout(new javax.swing.BoxLayout(adaptivePanel2, javax.swing.BoxLayout.LINE_AXIS));

        adaptivePanel3.setLayout(new java.awt.GridLayout(4, 1, 0, 10));

        usernameLabel.setText("Όνομα χρήστη:");
        adaptivePanel3.add(usernameLabel);
        adaptivePanel3.add(usernameTextField);

        passwordLabel.setText("Κωδικός χρήστη:");
        adaptivePanel3.add(passwordLabel);
        adaptivePanel3.add(passwordTextField);

        adaptivePanel4.add(adaptivePanel3);

        adaptivePanel2.add(adaptivePanel4);

        add(adaptivePanel2, java.awt.BorderLayout.CENTER);

        adaptivePanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 30));

        adaptiveButton1.setText("Σύνδεση");
        adaptiveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton1ActionPerformed(evt);
            }
        });
        adaptivePanel1.add(adaptiveButton1);

        add(adaptivePanel1, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

	private void adaptiveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton1ActionPerformed
		MainWindowPDA.showPanel(new PDAMainView());
	}//GEN-LAST:event_adaptiveButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.button.AdaptiveButton adaptiveButton1;
    private widgets.panel.AdaptivePanel adaptivePanel1;
    private widgets.panel.AdaptivePanel adaptivePanel2;
    private widgets.panel.AdaptivePanel adaptivePanel3;
    private widgets.panel.AdaptivePanel adaptivePanel4;
    private widgets.panel.AdaptivePanel adaptivePanel5;
    private widgets.textfield.AdaptiveTextField adaptiveTextField2;
    private widgets.label.AdaptiveLabel passwordLabel;
    private widgets.textfield.AdaptiveTextField passwordTextField;
    private widgets.label.AdaptiveLabel usernameLabel;
    private widgets.textfield.AdaptiveTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
