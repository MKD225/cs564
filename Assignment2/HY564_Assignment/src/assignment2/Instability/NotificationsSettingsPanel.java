/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NotificationsSettingsPanel.java
 *
 * Created on 30 Νοε 2011, 6:33:35 μμ
 */
package assignment2.Instability;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import utilities.Adaptation;
import utilities.DMSLConnector;

/**
 *
 * @author koutsop
 */
public class NotificationsSettingsPanel extends javax.swing.JPanel {
	private boolean showIcon1 = true;
	private boolean showIcon2 = true;
	private boolean showIcon3 = true;
	private boolean showIcon4 = true;
	private boolean showIcon5 = true;
	private boolean showIcon6 = true;
	private boolean showIcon7 = true;
	private boolean showIcon8 = true;
	private String	iconPath;
	
	/** Creates new form NotificationsSettingsPanel */
	public NotificationsSettingsPanel() {
		initComponents();
		
		Adaptation.automaticallySetRuntime(this);
        Adaptation.automaticallyAdapt(this);
		
		iconPath = DMSLConnector.getInstance().getClient(false).Evaluate("AcceptanceButton");
        adaptiveButton1.setIcon(new ImageIcon(getClass().getResource(iconPath)));		
		adaptiveButton2.setIcon(new ImageIcon(getClass().getResource(iconPath)));
		adaptiveButton3.setIcon(new ImageIcon(getClass().getResource(iconPath)));
		adaptiveButton4.setIcon(new ImageIcon(getClass().getResource(iconPath)));
		adaptiveButton5.setIcon(new ImageIcon(getClass().getResource(iconPath)));
		adaptiveButton6.setIcon(new ImageIcon(getClass().getResource(iconPath)));
		adaptiveButton7.setIcon(new ImageIcon(getClass().getResource(iconPath)));
		adaptiveButton8.setIcon(new ImageIcon(getClass().getResource(iconPath)));
	}
	
	private void changeButtonIcon (JButton button, boolean showIcon) {
		if (showIcon) 
			button.setIcon(null);
		else
			button.setIcon(new ImageIcon(getClass().getResource(iconPath)));
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adaptivePanel2 = new widgets.panel.AdaptivePanel();
        noAllPanel = new widgets.panel.AdaptivePanel();
        adaptiveButton1 = new widgets.button.AdaptiveButton();
        adaptivePanel1 = new widgets.panel.AdaptivePanel();
        adaptivePanel5 = new widgets.panel.AdaptivePanel();
        no1Panel = new widgets.panel.AdaptivePanel();
        adaptivePanel4 = new widgets.panel.AdaptivePanel();
        adaptiveLabel1 = new widgets.label.AdaptiveLabel();
        adaptiveButton7 = new widgets.button.AdaptiveButton();
        adaptiveButton8 = new widgets.button.AdaptiveButton();
        no2Panel = new widgets.panel.AdaptivePanel();
        adaptivePanel16 = new widgets.panel.AdaptivePanel();
        adaptiveLabel2 = new widgets.label.AdaptiveLabel();
        adaptiveButton5 = new widgets.button.AdaptiveButton();
        adaptiveButton6 = new widgets.button.AdaptiveButton();
        no3Panel = new widgets.panel.AdaptivePanel();
        adaptivePanel18 = new widgets.panel.AdaptivePanel();
        adaptiveLabel3 = new widgets.label.AdaptiveLabel();
        adaptiveButton3 = new widgets.button.AdaptiveButton();
        adaptiveButton4 = new widgets.button.AdaptiveButton();
        no4Panel = new widgets.panel.AdaptivePanel();
        adaptivePanel20 = new widgets.panel.AdaptivePanel();
        adaptiveLabel4 = new widgets.label.AdaptiveLabel();
        adaptiveButton2 = new widgets.button.AdaptiveButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 30, 0, 0));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        adaptivePanel2.setLayout(new javax.swing.BoxLayout(adaptivePanel2, javax.swing.BoxLayout.PAGE_AXIS));

        noAllPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 10));

        adaptiveButton1.setFunction("VirtualKeyboardButton");
        adaptiveButton1.setText("Προβολή ειδοποιήσεων");
        adaptiveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton1ActionPerformed(evt);
            }
        });
        noAllPanel.add(adaptiveButton1);

        adaptivePanel2.add(noAllPanel);

        adaptivePanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 0));

        adaptivePanel5.setLayout(new java.awt.GridLayout(2, 2));

        no1Panel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        adaptivePanel4.setLayout(new java.awt.GridLayout(3, 1, 0, 10));

        adaptiveLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        adaptiveLabel1.setText("Ειδοποιήσεις Chat");
        adaptivePanel4.add(adaptiveLabel1);

        adaptiveButton7.setFunction("VirtualKeyboardButton");
        adaptiveButton7.setText("Αναπαραγωγή ήχου");
        adaptiveButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton7ActionPerformed(evt);
            }
        });
        adaptivePanel4.add(adaptiveButton7);

        adaptiveButton8.setFunction("VirtualKeyboardButton");
        adaptiveButton8.setText("Προβολή ειδοποιήσεων");
        adaptiveButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton8ActionPerformed(evt);
            }
        });
        adaptivePanel4.add(adaptiveButton8);

        no1Panel.add(adaptivePanel4);

        adaptivePanel5.add(no1Panel);

        no2Panel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        adaptivePanel16.setLayout(new java.awt.GridLayout(3, 1, 0, 10));

        adaptiveLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        adaptiveLabel2.setText("Ειδοποιήσεις Κλήσης");
        adaptivePanel16.add(adaptiveLabel2);

        adaptiveButton5.setFunction("VirtualKeyboardButton");
        adaptiveButton5.setText("Αναπαραγωγή ήχου");
        adaptiveButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton5ActionPerformed(evt);
            }
        });
        adaptivePanel16.add(adaptiveButton5);

        adaptiveButton6.setFunction("VirtualKeyboardButton");
        adaptiveButton6.setText("Προβολή ειδοποιήσεων");
        adaptiveButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton6ActionPerformed(evt);
            }
        });
        adaptivePanel16.add(adaptiveButton6);

        no2Panel.add(adaptivePanel16);

        adaptivePanel5.add(no2Panel);

        no3Panel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        adaptivePanel18.setLayout(new java.awt.GridLayout(3, 1, 0, 10));

        adaptiveLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        adaptiveLabel3.setText("Ειδοποιήσεις Κλήσης");
        adaptivePanel18.add(adaptiveLabel3);

        adaptiveButton3.setFunction("VirtualKeyboardButton");
        adaptiveButton3.setText("Αναπαραγωγή ήχου");
        adaptiveButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton3ActionPerformed(evt);
            }
        });
        adaptivePanel18.add(adaptiveButton3);

        adaptiveButton4.setFunction("VirtualKeyboardButton");
        adaptiveButton4.setText("Προβολή ειδοποιήσεων");
        adaptiveButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton4ActionPerformed(evt);
            }
        });
        adaptivePanel18.add(adaptiveButton4);

        no3Panel.add(adaptivePanel18);

        adaptivePanel5.add(no3Panel);

        no4Panel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        adaptivePanel20.setLayout(new java.awt.GridLayout(3, 1, 0, 10));

        adaptiveLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        adaptiveLabel4.setText("Ειδοποιήσεις Εισόδου Επαφών");
        adaptivePanel20.add(adaptiveLabel4);

        adaptiveButton2.setFunction("VirtualKeyboardButton");
        adaptiveButton2.setText("Ενεργοποίηση όλων των ειδοποιήσεων");
        adaptiveButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton2ActionPerformed(evt);
            }
        });
        adaptivePanel20.add(adaptiveButton2);

        no4Panel.add(adaptivePanel20);

        adaptivePanel5.add(no4Panel);

        adaptivePanel1.add(adaptivePanel5);

        adaptivePanel2.add(adaptivePanel1);

        add(adaptivePanel2);
    }// </editor-fold>//GEN-END:initComponents

	private void adaptiveButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton7ActionPerformed
		changeButtonIcon(adaptiveButton7, showIcon7);
		showIcon7 = ! showIcon7;
	}//GEN-LAST:event_adaptiveButton7ActionPerformed

	private void adaptiveButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton8ActionPerformed
		changeButtonIcon(adaptiveButton8, showIcon8);
		showIcon8 = ! showIcon8;
	}//GEN-LAST:event_adaptiveButton8ActionPerformed

	private void adaptiveButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton5ActionPerformed
		changeButtonIcon(adaptiveButton5, showIcon5);
		showIcon5 = ! showIcon5;
	}//GEN-LAST:event_adaptiveButton5ActionPerformed

	private void adaptiveButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton6ActionPerformed
		changeButtonIcon(adaptiveButton6, showIcon6);
		showIcon6 = ! showIcon6;
	}//GEN-LAST:event_adaptiveButton6ActionPerformed

	private void adaptiveButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton3ActionPerformed
		changeButtonIcon(adaptiveButton3, showIcon3);
		showIcon3 = ! showIcon3;
	}//GEN-LAST:event_adaptiveButton3ActionPerformed

	private void adaptiveButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton4ActionPerformed
		changeButtonIcon(adaptiveButton4, showIcon4);
		showIcon4 = ! showIcon4;
	}//GEN-LAST:event_adaptiveButton4ActionPerformed

	private void adaptiveButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton2ActionPerformed
		changeButtonIcon(adaptiveButton2, showIcon2);
		showIcon2 = ! showIcon2;
	}//GEN-LAST:event_adaptiveButton2ActionPerformed

	private void adaptiveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton1ActionPerformed
		changeButtonIcon(adaptiveButton1, showIcon1);
		showIcon1 = ! showIcon1;
	}//GEN-LAST:event_adaptiveButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.button.AdaptiveButton adaptiveButton1;
    private widgets.button.AdaptiveButton adaptiveButton2;
    private widgets.button.AdaptiveButton adaptiveButton3;
    private widgets.button.AdaptiveButton adaptiveButton4;
    private widgets.button.AdaptiveButton adaptiveButton5;
    private widgets.button.AdaptiveButton adaptiveButton6;
    private widgets.button.AdaptiveButton adaptiveButton7;
    private widgets.button.AdaptiveButton adaptiveButton8;
    private widgets.label.AdaptiveLabel adaptiveLabel1;
    private widgets.label.AdaptiveLabel adaptiveLabel2;
    private widgets.label.AdaptiveLabel adaptiveLabel3;
    private widgets.label.AdaptiveLabel adaptiveLabel4;
    private widgets.panel.AdaptivePanel adaptivePanel1;
    private widgets.panel.AdaptivePanel adaptivePanel16;
    private widgets.panel.AdaptivePanel adaptivePanel18;
    private widgets.panel.AdaptivePanel adaptivePanel2;
    private widgets.panel.AdaptivePanel adaptivePanel20;
    private widgets.panel.AdaptivePanel adaptivePanel4;
    private widgets.panel.AdaptivePanel adaptivePanel5;
    private widgets.panel.AdaptivePanel no1Panel;
    private widgets.panel.AdaptivePanel no2Panel;
    private widgets.panel.AdaptivePanel no3Panel;
    private widgets.panel.AdaptivePanel no4Panel;
    private widgets.panel.AdaptivePanel noAllPanel;
    // End of variables declaration//GEN-END:variables
}
