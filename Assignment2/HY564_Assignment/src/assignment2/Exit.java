/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Exit.java
 *
 * Created on 25 Νοε 2011, 6:34:29 μμ
 */
package assignment2;

import assignment2.AdaptableViews.AdaptableIMMainView;
import javax.swing.ImageIcon;
import pc.MainWindowPC;
import utilities.Adaptation;
import utilities.DMSLConnector;

/**
 *
 * @author koutsop
 */
public class Exit extends javax.swing.JPanel {

    /** Creates new form Exit */
    public Exit() {
        initComponents();
        Adaptation.automaticallySetRuntime(this);
        Adaptation.automaticallyAdapt(this);
        
        String path = DMSLConnector.getInstance().getClient(false).Evaluate("CancelButton");
        cancelButton.setIcon(new ImageIcon(getClass().getResource(path)));

        path = DMSLConnector.getInstance().getClient(false).Evaluate("AcceptanceButton");
        acceptanceButton.setIcon(new ImageIcon(getClass().getResource(path)));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adaptivePanel1 = new widgets.panel.AdaptivePanel();
        acceptanceButton = new widgets.button.MainMenuButton();
        cancelButton = new widgets.button.MainMenuButton();

        setMaximumSize(new java.awt.Dimension(1000, 620));
        setMinimumSize(new java.awt.Dimension(1000, 620));
        setPreferredSize(new java.awt.Dimension(1000, 620));
        setLayout(new java.awt.BorderLayout());

        adaptivePanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 100, 5));

        acceptanceButton.setText("Αποδοχή");
        acceptanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptanceButtonActionPerformed(evt);
            }
        });
        adaptivePanel1.add(acceptanceButton);

        cancelButton.setText("Άκυρο");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        adaptivePanel1.add(cancelButton);

        add(adaptivePanel1, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        MainWindowPC.showPanel(new AdaptableIMMainView());
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void acceptanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptanceButtonActionPerformed
        MainWindowPC.showPanel(new Login1());
    }//GEN-LAST:event_acceptanceButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.button.MainMenuButton acceptanceButton;
    private widgets.panel.AdaptivePanel adaptivePanel1;
    private widgets.button.MainMenuButton cancelButton;
    // End of variables declaration//GEN-END:variables
}
