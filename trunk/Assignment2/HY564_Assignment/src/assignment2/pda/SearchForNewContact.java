/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SearchForNewContact.java
 *
 * Created on 1 Δεκ 2011, 6:02:46 μμ
 */
package assignment2.pda;

import javax.swing.ImageIcon;
import pda.MainWindowPDA;
import utilities.Adaptation;
import utilities.DMSLConnector;

/**
 *
 * @author koutsop
 */
public class SearchForNewContact extends javax.swing.JPanel {

	/** Creates new form SearchForNewContact */
	public SearchForNewContact() {
        initComponents();
        Adaptation.automaticallySetRuntime(this);
        Adaptation.automaticallyAdapt(this);
		
        String path = DMSLConnector.getInstance().getClient(false).Evaluate("CancelButton");
        cancelButton.setIcon(new ImageIcon(getClass().getResource(path)));

        path = DMSLConnector.getInstance().getClient(false).Evaluate("AcceptanceButton");
        continueButton.setIcon(new ImageIcon(getClass().getResource(path)));		
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        messagePanel = new widgets.panel.AdaptivePanel();
        adaptiveLabel2 = new widgets.label.AdaptiveLabel();
        adaptivePanel1 = new widgets.panel.AdaptivePanel();
        adaptiveLabel1 = new widgets.label.AdaptiveLabel();
        adaptiveTextField1 = new widgets.textfield.AdaptiveTextField();
        buttonsPabel = new widgets.panel.AdaptivePanel();
        adaptivePanel2 = new widgets.panel.AdaptivePanel();
        continueButton = new widgets.button.AdaptiveButton();
        cancelButton = new widgets.button.AdaptiveButton();

        setLayout(new java.awt.BorderLayout());

        messagePanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 50));

        adaptiveLabel2.setText("Dwste e-mail gia na eisagentai nea epafh");
        messagePanel.add(adaptiveLabel2);

        add(messagePanel, java.awt.BorderLayout.NORTH);

        adaptiveLabel1.setText("e-mail:");
        adaptivePanel1.add(adaptiveLabel1);

        adaptiveTextField1.setText("adaptiveTextField1");
        adaptivePanel1.add(adaptiveTextField1);

        add(adaptivePanel1, java.awt.BorderLayout.CENTER);

        buttonsPabel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 50, 50));

        adaptivePanel2.setLayout(new java.awt.GridLayout(1, 2, 30, 0));

        continueButton.setText("Continue");
        continueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });
        adaptivePanel2.add(continueButton);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        adaptivePanel2.add(cancelButton);

        buttonsPabel.add(adaptivePanel2);

        add(buttonsPabel, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

	private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButtonActionPerformed
		MainWindowPDA.showPanel(new AddContactResultsPanel());
	}//GEN-LAST:event_continueButtonActionPerformed

	private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
		MainWindowPDA.showPanel(new PDAMainView());
	}//GEN-LAST:event_cancelButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.label.AdaptiveLabel adaptiveLabel1;
    private widgets.label.AdaptiveLabel adaptiveLabel2;
    private widgets.panel.AdaptivePanel adaptivePanel1;
    private widgets.panel.AdaptivePanel adaptivePanel2;
    private widgets.textfield.AdaptiveTextField adaptiveTextField1;
    private widgets.panel.AdaptivePanel buttonsPabel;
    private widgets.button.AdaptiveButton cancelButton;
    private widgets.button.AdaptiveButton continueButton;
    private widgets.panel.AdaptivePanel messagePanel;
    // End of variables declaration//GEN-END:variables
}
