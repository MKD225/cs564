/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewGroup.java
 *
 * Created on 3 Δεκ 2011, 12:33:34 πμ
 */
package assignment2.pda;

import pda.MainWindowPDA;
import utilities.Adaptation;

/**
 *
 * @author koutsop
 */
public class Group extends javax.swing.JPanel {

	/** Creates new form NewGroup */
	public Group() {
		initComponents();
        Adaptation.automaticallySetRuntime(this);
        Adaptation.automaticallyAdapt(this);
		
		adaptiveCheckBox1.setSelected(true);
		adaptiveCheckBox3.setSelected(true);
		adaptiveCheckBox4.setSelected(true);
		adaptiveCheckBox6.setSelected(true);
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
        adaptiveLabel1 = new widgets.label.AdaptiveLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        adaptivePanel2 = new widgets.panel.AdaptivePanel();
        adaptivePanel5 = new widgets.panel.AdaptivePanel();
        adaptivePanel6 = new widgets.panel.AdaptivePanel();
        contactPanel = new widgets.panel.AdaptivePanel();
        adaptivePanel7 = new widgets.panel.AdaptivePanel();
        adaptiveLabel2 = new widgets.label.AdaptiveLabel();
        adaptiveCheckBox1 = new widgets.checkbox.AdaptiveCheckBox();
        contactPanel1 = new widgets.panel.AdaptivePanel();
        adaptivePanel8 = new widgets.panel.AdaptivePanel();
        adaptiveLabel3 = new widgets.label.AdaptiveLabel();
        adaptiveCheckBox2 = new widgets.checkbox.AdaptiveCheckBox();
        contactPanel2 = new widgets.panel.AdaptivePanel();
        adaptivePanel9 = new widgets.panel.AdaptivePanel();
        adaptiveLabel4 = new widgets.label.AdaptiveLabel();
        adaptiveCheckBox3 = new widgets.checkbox.AdaptiveCheckBox();
        contactPanel3 = new widgets.panel.AdaptivePanel();
        adaptivePanel10 = new widgets.panel.AdaptivePanel();
        adaptiveLabel5 = new widgets.label.AdaptiveLabel();
        adaptiveCheckBox4 = new widgets.checkbox.AdaptiveCheckBox();
        contactPanel4 = new widgets.panel.AdaptivePanel();
        adaptivePanel11 = new widgets.panel.AdaptivePanel();
        adaptiveLabel6 = new widgets.label.AdaptiveLabel();
        adaptiveCheckBox5 = new widgets.checkbox.AdaptiveCheckBox();
        contactPanel5 = new widgets.panel.AdaptivePanel();
        adaptivePanel12 = new widgets.panel.AdaptivePanel();
        adaptiveLabel7 = new widgets.label.AdaptiveLabel();
        adaptiveCheckBox6 = new widgets.checkbox.AdaptiveCheckBox();
        contactPanel6 = new widgets.panel.AdaptivePanel();
        adaptivePanel13 = new widgets.panel.AdaptivePanel();
        adaptiveLabel8 = new widgets.label.AdaptiveLabel();
        adaptiveCheckBox7 = new widgets.checkbox.AdaptiveCheckBox();
        contactPanel7 = new widgets.panel.AdaptivePanel();
        adaptivePanel14 = new widgets.panel.AdaptivePanel();
        adaptiveLabel9 = new widgets.label.AdaptiveLabel();
        adaptiveCheckBox8 = new widgets.checkbox.AdaptiveCheckBox();
        buttonsPabel = new widgets.panel.AdaptivePanel();
        adaptivePanel15 = new widgets.panel.AdaptivePanel();
        continueButton = new widgets.button.AdaptiveButton();
        adaptivePanel3 = new widgets.panel.AdaptivePanel();
        cancelButton = new widgets.button.AdaptiveButton();
        adaptivePanel4 = new widgets.panel.AdaptivePanel();
        searchButton = new widgets.button.AdaptiveButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setLayout(new java.awt.BorderLayout(0, 20));

        adaptivePanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        adaptiveLabel1.setText("Επιλέξτε τις επαφές που θέλετε να έχετε");
        adaptivePanel1.add(adaptiveLabel1);

        add(adaptivePanel1, java.awt.BorderLayout.NORTH);

        adaptivePanel2.setLayout(new javax.swing.BoxLayout(adaptivePanel2, javax.swing.BoxLayout.LINE_AXIS));

        adaptivePanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        adaptivePanel6.setLayout(new java.awt.GridLayout(0, 1, 0, 5));

        contactPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        adaptivePanel7.setFunction("marigiannaImg");
        adaptivePanel7.setMaximumSize(new java.awt.Dimension(64, 64));
        adaptivePanel7.setMinimumSize(new java.awt.Dimension(64, 64));
        adaptivePanel7.setName("Panel.Content.MarigiannaImage"); // NOI18N
        adaptivePanel7.setPreferredSize(new java.awt.Dimension(64, 64));

        javax.swing.GroupLayout adaptivePanel7Layout = new javax.swing.GroupLayout(adaptivePanel7);
        adaptivePanel7.setLayout(adaptivePanel7Layout);
        adaptivePanel7Layout.setHorizontalGroup(
            adaptivePanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );
        adaptivePanel7Layout.setVerticalGroup(
            adaptivePanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        contactPanel.add(adaptivePanel7);

        adaptiveLabel2.setText("Μαριγιάννα Σκουραδάκη");
        contactPanel.add(adaptiveLabel2);
        contactPanel.add(adaptiveCheckBox1);

        adaptivePanel6.add(contactPanel);

        contactPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        adaptivePanel8.setFunction("marigiannaImg");
        adaptivePanel8.setMaximumSize(new java.awt.Dimension(64, 64));
        adaptivePanel8.setMinimumSize(new java.awt.Dimension(64, 64));
        adaptivePanel8.setName("Panel.Content.MarigiannaImage"); // NOI18N

        javax.swing.GroupLayout adaptivePanel8Layout = new javax.swing.GroupLayout(adaptivePanel8);
        adaptivePanel8.setLayout(adaptivePanel8Layout);
        adaptivePanel8Layout.setHorizontalGroup(
            adaptivePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );
        adaptivePanel8Layout.setVerticalGroup(
            adaptivePanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        contactPanel1.add(adaptivePanel8);

        adaptiveLabel3.setText("Μαριγιάννα Σκουραδάκη");
        contactPanel1.add(adaptiveLabel3);
        contactPanel1.add(adaptiveCheckBox2);

        adaptivePanel6.add(contactPanel1);

        contactPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        adaptivePanel9.setFunction("marigiannaImg");
        adaptivePanel9.setMaximumSize(new java.awt.Dimension(64, 64));
        adaptivePanel9.setMinimumSize(new java.awt.Dimension(64, 64));
        adaptivePanel9.setName("Panel.Content.MarigiannaImage"); // NOI18N

        javax.swing.GroupLayout adaptivePanel9Layout = new javax.swing.GroupLayout(adaptivePanel9);
        adaptivePanel9.setLayout(adaptivePanel9Layout);
        adaptivePanel9Layout.setHorizontalGroup(
            adaptivePanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );
        adaptivePanel9Layout.setVerticalGroup(
            adaptivePanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        contactPanel2.add(adaptivePanel9);

        adaptiveLabel4.setText("Μαριγιάννα Σκουραδάκη");
        contactPanel2.add(adaptiveLabel4);
        contactPanel2.add(adaptiveCheckBox3);

        adaptivePanel6.add(contactPanel2);

        contactPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        adaptivePanel10.setFunction("marigiannaImg");
        adaptivePanel10.setMaximumSize(new java.awt.Dimension(64, 64));
        adaptivePanel10.setMinimumSize(new java.awt.Dimension(64, 64));
        adaptivePanel10.setName("Panel.Content.MarigiannaImage"); // NOI18N

        javax.swing.GroupLayout adaptivePanel10Layout = new javax.swing.GroupLayout(adaptivePanel10);
        adaptivePanel10.setLayout(adaptivePanel10Layout);
        adaptivePanel10Layout.setHorizontalGroup(
            adaptivePanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );
        adaptivePanel10Layout.setVerticalGroup(
            adaptivePanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        contactPanel3.add(adaptivePanel10);

        adaptiveLabel5.setText("Μαριγιάννα Σκουραδάκη");
        contactPanel3.add(adaptiveLabel5);
        contactPanel3.add(adaptiveCheckBox4);

        adaptivePanel6.add(contactPanel3);

        contactPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        adaptivePanel11.setFunction("marigiannaImg");
        adaptivePanel11.setMaximumSize(new java.awt.Dimension(64, 64));
        adaptivePanel11.setMinimumSize(new java.awt.Dimension(64, 64));
        adaptivePanel11.setName("Panel.Content.MarigiannaImage"); // NOI18N

        javax.swing.GroupLayout adaptivePanel11Layout = new javax.swing.GroupLayout(adaptivePanel11);
        adaptivePanel11.setLayout(adaptivePanel11Layout);
        adaptivePanel11Layout.setHorizontalGroup(
            adaptivePanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );
        adaptivePanel11Layout.setVerticalGroup(
            adaptivePanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        contactPanel4.add(adaptivePanel11);

        adaptiveLabel6.setText("Μαριγιάννα Σκουραδάκη");
        contactPanel4.add(adaptiveLabel6);
        contactPanel4.add(adaptiveCheckBox5);

        adaptivePanel6.add(contactPanel4);

        contactPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        adaptivePanel12.setFunction("marigiannaImg");
        adaptivePanel12.setMaximumSize(new java.awt.Dimension(64, 64));
        adaptivePanel12.setMinimumSize(new java.awt.Dimension(64, 64));
        adaptivePanel12.setName("Panel.Content.MarigiannaImage"); // NOI18N

        javax.swing.GroupLayout adaptivePanel12Layout = new javax.swing.GroupLayout(adaptivePanel12);
        adaptivePanel12.setLayout(adaptivePanel12Layout);
        adaptivePanel12Layout.setHorizontalGroup(
            adaptivePanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );
        adaptivePanel12Layout.setVerticalGroup(
            adaptivePanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        contactPanel5.add(adaptivePanel12);

        adaptiveLabel7.setText("Μαριγιάννα Σκουραδάκη");
        contactPanel5.add(adaptiveLabel7);
        contactPanel5.add(adaptiveCheckBox6);

        adaptivePanel6.add(contactPanel5);

        contactPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        adaptivePanel13.setFunction("marigiannaImg");
        adaptivePanel13.setMaximumSize(new java.awt.Dimension(64, 64));
        adaptivePanel13.setMinimumSize(new java.awt.Dimension(64, 64));
        adaptivePanel13.setName("Panel.Content.MarigiannaImage"); // NOI18N

        javax.swing.GroupLayout adaptivePanel13Layout = new javax.swing.GroupLayout(adaptivePanel13);
        adaptivePanel13.setLayout(adaptivePanel13Layout);
        adaptivePanel13Layout.setHorizontalGroup(
            adaptivePanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );
        adaptivePanel13Layout.setVerticalGroup(
            adaptivePanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        contactPanel6.add(adaptivePanel13);

        adaptiveLabel8.setText("Μαριγιάννα Σκουραδάκη");
        contactPanel6.add(adaptiveLabel8);
        contactPanel6.add(adaptiveCheckBox7);

        adaptivePanel6.add(contactPanel6);

        contactPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        adaptivePanel14.setFunction("marigiannaImg");
        adaptivePanel14.setMaximumSize(new java.awt.Dimension(64, 64));
        adaptivePanel14.setMinimumSize(new java.awt.Dimension(64, 64));
        adaptivePanel14.setName("Panel.Content.MarigiannaImage"); // NOI18N

        javax.swing.GroupLayout adaptivePanel14Layout = new javax.swing.GroupLayout(adaptivePanel14);
        adaptivePanel14.setLayout(adaptivePanel14Layout);
        adaptivePanel14Layout.setHorizontalGroup(
            adaptivePanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );
        adaptivePanel14Layout.setVerticalGroup(
            adaptivePanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        contactPanel7.add(adaptivePanel14);

        adaptiveLabel9.setText("Μαριγιάννα Σκουραδάκη");
        contactPanel7.add(adaptiveLabel9);
        contactPanel7.add(adaptiveCheckBox8);

        adaptivePanel6.add(contactPanel7);

        adaptivePanel5.add(adaptivePanel6);

        adaptivePanel2.add(adaptivePanel5);

        jScrollPane1.setViewportView(adaptivePanel2);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);

        buttonsPabel.setLayout(new java.awt.GridLayout(1, 3));

        adaptivePanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        continueButton.setText("Συνέχεια");
        continueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });
        adaptivePanel15.add(continueButton);

        buttonsPabel.add(adaptivePanel15);

        adaptivePanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        cancelButton.setText("Ακύρωση");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        adaptivePanel3.add(cancelButton);

        buttonsPabel.add(adaptivePanel3);

        adaptivePanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 0, 0));

        searchButton.setText("Πίσω");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        adaptivePanel4.add(searchButton);

        buttonsPabel.add(adaptivePanel4);

        add(buttonsPabel, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

	private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
		MainWindowPDA.showPanel(new ManageGroups());
	}//GEN-LAST:event_searchButtonActionPerformed

	private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
		MainWindowPDA.showPanel(new PDAMainView());
	}//GEN-LAST:event_cancelButtonActionPerformed

	private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButtonActionPerformed
		MainWindowPDA.showPanel(new SuccessfulGroupModification());
	}//GEN-LAST:event_continueButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.checkbox.AdaptiveCheckBox adaptiveCheckBox1;
    private widgets.checkbox.AdaptiveCheckBox adaptiveCheckBox2;
    private widgets.checkbox.AdaptiveCheckBox adaptiveCheckBox3;
    private widgets.checkbox.AdaptiveCheckBox adaptiveCheckBox4;
    private widgets.checkbox.AdaptiveCheckBox adaptiveCheckBox5;
    private widgets.checkbox.AdaptiveCheckBox adaptiveCheckBox6;
    private widgets.checkbox.AdaptiveCheckBox adaptiveCheckBox7;
    private widgets.checkbox.AdaptiveCheckBox adaptiveCheckBox8;
    private widgets.label.AdaptiveLabel adaptiveLabel1;
    private widgets.label.AdaptiveLabel adaptiveLabel2;
    private widgets.label.AdaptiveLabel adaptiveLabel3;
    private widgets.label.AdaptiveLabel adaptiveLabel4;
    private widgets.label.AdaptiveLabel adaptiveLabel5;
    private widgets.label.AdaptiveLabel adaptiveLabel6;
    private widgets.label.AdaptiveLabel adaptiveLabel7;
    private widgets.label.AdaptiveLabel adaptiveLabel8;
    private widgets.label.AdaptiveLabel adaptiveLabel9;
    private widgets.panel.AdaptivePanel adaptivePanel1;
    private widgets.panel.AdaptivePanel adaptivePanel10;
    private widgets.panel.AdaptivePanel adaptivePanel11;
    private widgets.panel.AdaptivePanel adaptivePanel12;
    private widgets.panel.AdaptivePanel adaptivePanel13;
    private widgets.panel.AdaptivePanel adaptivePanel14;
    private widgets.panel.AdaptivePanel adaptivePanel15;
    private widgets.panel.AdaptivePanel adaptivePanel2;
    private widgets.panel.AdaptivePanel adaptivePanel3;
    private widgets.panel.AdaptivePanel adaptivePanel4;
    private widgets.panel.AdaptivePanel adaptivePanel5;
    private widgets.panel.AdaptivePanel adaptivePanel6;
    private widgets.panel.AdaptivePanel adaptivePanel7;
    private widgets.panel.AdaptivePanel adaptivePanel8;
    private widgets.panel.AdaptivePanel adaptivePanel9;
    private widgets.panel.AdaptivePanel buttonsPabel;
    private widgets.button.AdaptiveButton cancelButton;
    private widgets.panel.AdaptivePanel contactPanel;
    private widgets.panel.AdaptivePanel contactPanel1;
    private widgets.panel.AdaptivePanel contactPanel2;
    private widgets.panel.AdaptivePanel contactPanel3;
    private widgets.panel.AdaptivePanel contactPanel4;
    private widgets.panel.AdaptivePanel contactPanel5;
    private widgets.panel.AdaptivePanel contactPanel6;
    private widgets.panel.AdaptivePanel contactPanel7;
    private widgets.button.AdaptiveButton continueButton;
    private javax.swing.JScrollPane jScrollPane1;
    private widgets.button.AdaptiveButton searchButton;
    // End of variables declaration//GEN-END:variables
}
