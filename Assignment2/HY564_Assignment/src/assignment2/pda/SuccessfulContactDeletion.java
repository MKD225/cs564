/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SuccessfulGroupCreation.java
 *
 * Created on 3 Δεκ 2011, 1:13:33 πμ
 */
package assignment2.pda;

import pda.MainWindowPDA;
import utilities.Adaptation;

/**
 *
 * @author koutsop
 */
public class SuccessfulContactDeletion extends javax.swing.JPanel {

	/** Creates new form SuccessfulGroupCreation */
	public SuccessfulContactDeletion() {
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

        adaptivePanel2 = new widgets.panel.AdaptivePanel();
        adaptiveLabel1 = new widgets.label.AdaptiveLabel();
        adaptivePanel1 = new widgets.panel.AdaptivePanel();
        buttonsPabel = new widgets.panel.AdaptivePanel();
        adaptivePanel3 = new widgets.panel.AdaptivePanel();
        startPagelButton = new widgets.button.AdaptiveButton();
        adaptivePanel4 = new widgets.panel.AdaptivePanel();
        groupsButton = new widgets.button.AdaptiveButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setLayout(new java.awt.BorderLayout());

        adaptiveLabel1.setText("Επιτυχής Διαγραφή Επαφής");
        adaptivePanel2.add(adaptiveLabel1);

        add(adaptivePanel2, java.awt.BorderLayout.NORTH);

        adaptivePanel1.setFunction("BigTickImg");
        adaptivePanel1.setName("Panel.Content.BigTick"); // NOI18N

        javax.swing.GroupLayout adaptivePanel1Layout = new javax.swing.GroupLayout(adaptivePanel1);
        adaptivePanel1.setLayout(adaptivePanel1Layout);
        adaptivePanel1Layout.setHorizontalGroup(
            adaptivePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        adaptivePanel1Layout.setVerticalGroup(
            adaptivePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 229, Short.MAX_VALUE)
        );

        add(adaptivePanel1, java.awt.BorderLayout.CENTER);

        buttonsPabel.setLayout(new java.awt.GridLayout(1, 2));

        adaptivePanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        startPagelButton.setText("Αρχική");
        startPagelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startPagelButtonActionPerformed(evt);
            }
        });
        adaptivePanel3.add(startPagelButton);

        buttonsPabel.add(adaptivePanel3);

        adaptivePanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 0, 0));

        groupsButton.setText("Ομάδες");
        groupsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupsButtonActionPerformed(evt);
            }
        });
        adaptivePanel4.add(groupsButton);

        buttonsPabel.add(adaptivePanel4);

        add(buttonsPabel, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

	private void startPagelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startPagelButtonActionPerformed
		MainWindowPDA.showPanel(new PDAMainView());
	}//GEN-LAST:event_startPagelButtonActionPerformed

	private void groupsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupsButtonActionPerformed
		MainWindowPDA.showPanel(new ManageGroups());
	}//GEN-LAST:event_groupsButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.label.AdaptiveLabel adaptiveLabel1;
    private widgets.panel.AdaptivePanel adaptivePanel1;
    private widgets.panel.AdaptivePanel adaptivePanel2;
    private widgets.panel.AdaptivePanel adaptivePanel3;
    private widgets.panel.AdaptivePanel adaptivePanel4;
    private widgets.panel.AdaptivePanel buttonsPabel;
    private widgets.button.AdaptiveButton groupsButton;
    private widgets.button.AdaptiveButton startPagelButton;
    // End of variables declaration//GEN-END:variables
}
