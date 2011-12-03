/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SettingsMainView.java
 *
 * Created on Nov 24, 2011, 8:03:00 PM
 */
package assignment2.NoDisability;

import AdaptableWindows.AdaptableIMMainView;
import AdaptableWindows.AddaptableAppearanceSettingsView;
import AdaptableWindows.AddaptableGeneralSettingsView;
import AdaptableWindows.AddaptableHistorySettingsView;
import AdaptableWindows.AddaptableNotificationsSettingsView;
import javax.swing.JButton;
import javax.swing.JPanel;
import pc.MainWindowPC;
import utilities.Adaptation;

/**
 *
 * @author Marigianna
 */
public class SettingsMainView extends javax.swing.JPanel {

    /** Creates new form SettingsMainView */
    public SettingsMainView() {
		initComponents();
        Adaptation.automaticallySetRuntime(this);
		Adaptation.automaticallyAdapt(this);
        
		selecteButton(generalButton);
		showPanel(new AddaptableGeneralSettingsView());
    }
	
	private  void selecteButton(JButton button) {
        generalButton.setSelected(false);
		historyButton.setSelected(false);
		appearanceButton.setSelected(false);
		blockedButton.setSelected(false);
		notificationsButton.setSelected(false);
		button.setSelected(true);
		
	}
	
	private void showPanel (JPanel p) {
		contentPanel.removeAll();
		p.setVisible(true);
		contentPanel.add(p);
		contentPanel.repaint();
		contentPanel.validate();		
	}
	
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        secMenuButton1 = new widgets.button.SecMenuButton();
        menuPanel = new widgets.panel.AdaptivePanel();
        tabbedPanel = new widgets.panel.AdaptivePanel();
        generalButton = new widgets.button.SecMenuButton();
        historyButton = new widgets.button.SecMenuButton();
        blockedButton = new widgets.button.SecMenuButton();
        notificationsButton = new widgets.button.SecMenuButton();
        appearanceButton = new widgets.button.SecMenuButton();
        contentPanel = new widgets.panel.AdaptivePanel();
        bottomPanel = new widgets.panel.AdaptivePanel();
        adaptivePanel5 = new widgets.panel.AdaptivePanel();
        adaptiveButton4 = new widgets.button.AdaptiveButton();
        adaptivePanel1 = new widgets.panel.AdaptivePanel();
        adaptivePanel3 = new widgets.panel.AdaptivePanel();
        adaptivePanel2 = new widgets.panel.AdaptivePanel();
        adaptivePanel4 = new widgets.panel.AdaptivePanel();
        adaptiveButton6 = new widgets.button.AdaptiveButton();
        adaptiveButton5 = new widgets.button.AdaptiveButton();

        secMenuButton1.setText("secMenuButton1");

        setLayout(new java.awt.BorderLayout());

        menuPanel.setLayout(new javax.swing.BoxLayout(menuPanel, javax.swing.BoxLayout.PAGE_AXIS));

        tabbedPanel.setLayout(new javax.swing.BoxLayout(tabbedPanel, javax.swing.BoxLayout.PAGE_AXIS));

        generalButton.setActionCommand("Γενικά");
        generalButton.setMaximumSize(new java.awt.Dimension(110, 35));
        generalButton.setMinimumSize(new java.awt.Dimension(110, 35));
        generalButton.setPreferredSize(new java.awt.Dimension(110, 35));
        generalButton.setText("Γενικά");
        generalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generalButtonActionPerformed(evt);
            }
        });
        tabbedPanel.add(generalButton);

        historyButton.setText("Ιστορικό");
        historyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyButtonActionPerformed(evt);
            }
        });
        tabbedPanel.add(historyButton);

        blockedButton.setText("Αποκλεισμένοι");
        blockedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blockedButtonActionPerformed(evt);
            }
        });
        tabbedPanel.add(blockedButton);

        notificationsButton.setText("Ειδοποιήσεις");
        notificationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificationsButtonActionPerformed(evt);
            }
        });
        tabbedPanel.add(notificationsButton);

        appearanceButton.setText("Εμφάνιση");
        appearanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appearanceButtonActionPerformed(evt);
            }
        });
        tabbedPanel.add(appearanceButton);

        menuPanel.add(tabbedPanel);

        add(menuPanel, java.awt.BorderLayout.WEST);

        contentPanel.setLayout(new javax.swing.BoxLayout(contentPanel, javax.swing.BoxLayout.LINE_AXIS));
        add(contentPanel, java.awt.BorderLayout.CENTER);

        bottomPanel.setLayout(new javax.swing.BoxLayout(bottomPanel, javax.swing.BoxLayout.LINE_AXIS));

        adaptivePanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        adaptiveButton4.setText("Βοήθεια");
        adaptivePanel5.add(adaptiveButton4);

        bottomPanel.add(adaptivePanel5);

        javax.swing.GroupLayout adaptivePanel1Layout = new javax.swing.GroupLayout(adaptivePanel1);
        adaptivePanel1.setLayout(adaptivePanel1Layout);
        adaptivePanel1Layout.setHorizontalGroup(
            adaptivePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );
        adaptivePanel1Layout.setVerticalGroup(
            adaptivePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        bottomPanel.add(adaptivePanel1);

        javax.swing.GroupLayout adaptivePanel3Layout = new javax.swing.GroupLayout(adaptivePanel3);
        adaptivePanel3.setLayout(adaptivePanel3Layout);
        adaptivePanel3Layout.setHorizontalGroup(
            adaptivePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );
        adaptivePanel3Layout.setVerticalGroup(
            adaptivePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        bottomPanel.add(adaptivePanel3);

        adaptivePanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        adaptivePanel4.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        adaptiveButton6.setText("ΟΚ");
        adaptiveButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton6ActionPerformed(evt);
            }
        });
        adaptivePanel4.add(adaptiveButton6);

        adaptiveButton5.setText("Άκυρο");
        adaptiveButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton5ActionPerformed(evt);
            }
        });
        adaptivePanel4.add(adaptiveButton5);

        adaptivePanel2.add(adaptivePanel4);

        bottomPanel.add(adaptivePanel2);

        add(bottomPanel, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    
private void adaptiveButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton6ActionPerformed
	MainWindowPC.showPanel(new AdaptableIMMainView());
}//GEN-LAST:event_adaptiveButton6ActionPerformed

private void adaptiveButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton5ActionPerformed
	MainWindowPC.showPanel(new AdaptableIMMainView());
}//GEN-LAST:event_adaptiveButton5ActionPerformed

private void generalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generalButtonActionPerformed
	selecteButton(generalButton);
	showPanel(new AddaptableGeneralSettingsView());
}//GEN-LAST:event_generalButtonActionPerformed

private void historyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyButtonActionPerformed
	selecteButton(historyButton);
	showPanel(new AddaptableHistorySettingsView());		
}//GEN-LAST:event_historyButtonActionPerformed

private void blockedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blockedButtonActionPerformed
	selecteButton(blockedButton); 
	
	// Instantiate the new screen
	BlockedSettingsPanel blockedSettings = new BlockedSettingsPanel();

	// Remove the contents of the content panel & add the new screen
	showPanel(blockedSettings);
}//GEN-LAST:event_blockedButtonActionPerformed

private void notificationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificationsButtonActionPerformed
	selecteButton(notificationsButton);
	showPanel(new AddaptableNotificationsSettingsView());		
}//GEN-LAST:event_notificationsButtonActionPerformed

private void appearanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appearanceButtonActionPerformed
	selecteButton(appearanceButton);
	showPanel(new AddaptableAppearanceSettingsView());			
}//GEN-LAST:event_appearanceButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.button.AdaptiveButton adaptiveButton4;
    private widgets.button.AdaptiveButton adaptiveButton5;
    private widgets.button.AdaptiveButton adaptiveButton6;
    private widgets.panel.AdaptivePanel adaptivePanel1;
    private widgets.panel.AdaptivePanel adaptivePanel2;
    private widgets.panel.AdaptivePanel adaptivePanel3;
    private widgets.panel.AdaptivePanel adaptivePanel4;
    private widgets.panel.AdaptivePanel adaptivePanel5;
    private widgets.button.SecMenuButton appearanceButton;
    private widgets.button.SecMenuButton blockedButton;
    private widgets.panel.AdaptivePanel bottomPanel;
    private widgets.panel.AdaptivePanel contentPanel;
    private widgets.button.SecMenuButton generalButton;
    private widgets.button.SecMenuButton historyButton;
    private widgets.panel.AdaptivePanel menuPanel;
    private widgets.button.SecMenuButton notificationsButton;
    private widgets.button.SecMenuButton secMenuButton1;
    private widgets.panel.AdaptivePanel tabbedPanel;
    // End of variables declaration//GEN-END:variables
}
