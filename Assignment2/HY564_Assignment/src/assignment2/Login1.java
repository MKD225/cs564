/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Login1.java
 *
 * Created on 25 Νοε 2011, 11:15:36 πμ
 */
package assignment2;

import pc.MainWindowPC;
import utilities.Adaptation;
import utilities.DMSLConnector;

/**
 *
 * @author koutsop
 */
public class Login1 extends javax.swing.JPanel {

    /** Creates new form Login1 */
    public Login1() {
        initAdaptation("nope");
        initComponents();
    }
    
    private void initAdaptation(String profile){
        DMSLConnector.getInstance().getClient(false).SetAttribute("user.profile", profile);
        DMSLConnector.getInstance().getClient(false).SetAttribute("Dummy.attr", "1");
        Adaptation.initLookAndFeel(this);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        upPanel = new widgets.panel.AdaptivePanel();
        adaptiveLabel1 = new widgets.label.AdaptiveLabel();
        modlePanel = new widgets.panel.AdaptivePanel();
        noDisabilityButton = new widgets.button.AdaptiveButton();
        colorBlindButton = new widgets.button.AdaptiveButton();
        instabilityButton = new widgets.button.AdaptiveButton();
        lowVisionButton = new widgets.button.AdaptiveButton();
        downPanel = new widgets.panel.AdaptivePanel();
        registerButton = new widgets.button.AdaptiveButton();

        setMaximumSize(new java.awt.Dimension(1000, 688));
        setMinimumSize(new java.awt.Dimension(1000, 688));
        setPreferredSize(new java.awt.Dimension(1000, 688));
        setLayout(new java.awt.BorderLayout());

        adaptiveLabel1.setText("καλώς ορίσατε");
        upPanel.add(adaptiveLabel1);

        add(upPanel, java.awt.BorderLayout.PAGE_START);

        modlePanel.setLayout(new java.awt.GridLayout(2, 2, 20, 20));

        noDisabilityButton.setText("profile_no_disability");
        noDisabilityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noDisabilityButtonActionPerformed(evt);
            }
        });
        modlePanel.add(noDisabilityButton);

        colorBlindButton.setText("profile_color_blind");
        colorBlindButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorBlindButtonActionPerformed(evt);
            }
        });
        modlePanel.add(colorBlindButton);

        instabilityButton.setText("profile_instability");
        instabilityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instabilityButtonActionPerformed(evt);
            }
        });
        modlePanel.add(instabilityButton);

        lowVisionButton.setText("profile_low_vision");
        lowVisionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowVisionButtonActionPerformed(evt);
            }
        });
        modlePanel.add(lowVisionButton);

        add(modlePanel, java.awt.BorderLayout.CENTER);

        registerButton.setText("Δεν έχετε λογαριασμο;");
        downPanel.add(registerButton);

        add(downPanel, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void noDisabilityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noDisabilityButtonActionPerformed
        initAdaptation("no_disability");
        MainWindowPC.showPanel(new AccessibleIM());
    }//GEN-LAST:event_noDisabilityButtonActionPerformed

    private void colorBlindButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorBlindButtonActionPerformed
        initAdaptation("no_disability");
        MainWindowPC.showPanel(new AccessibleIM());
    }//GEN-LAST:event_colorBlindButtonActionPerformed

    private void instabilityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instabilityButtonActionPerformed
        initAdaptation("no_disability");
        MainWindowPC.showPanel(new AccessibleIM());
    }//GEN-LAST:event_instabilityButtonActionPerformed

    private void lowVisionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowVisionButtonActionPerformed
        initAdaptation("no_disability");
        MainWindowPC.showPanel(new AccessibleIM());
    }//GEN-LAST:event_lowVisionButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.label.AdaptiveLabel adaptiveLabel1;
    private widgets.button.AdaptiveButton colorBlindButton;
    private widgets.panel.AdaptivePanel downPanel;
    private widgets.button.AdaptiveButton instabilityButton;
    private widgets.button.AdaptiveButton lowVisionButton;
    private widgets.panel.AdaptivePanel modlePanel;
    private widgets.button.AdaptiveButton noDisabilityButton;
    private widgets.button.AdaptiveButton registerButton;
    private widgets.panel.AdaptivePanel upPanel;
    // End of variables declaration//GEN-END:variables
}
