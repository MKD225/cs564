/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AddContactResults.java
 *
 * Created on Nov 26, 2011, 9:40:23 PM
 */
package assignment2.Instability;

import assignment2.NoDisability.AddContactRequest;
import assignment2.NoDisability.Groups;
import assignment2.NoDisability.PagesNavigationButtons;
import assignment2.NoDisability.SearchForNewContact;
import javax.swing.JPanel;
import utilities.Adaptation;

/**
 *
 * @author Marigianna
 */
public class AddContactResults extends javax.swing.JPanel {

    /** Creates new form AddContactResults */
    public AddContactResults() {
        initComponents();
        Adaptation.automaticallySetRuntime(this);
        Adaptation.automaticallyAdapt(this);
		adaptivePanel5.add(new PagesNavigationButtons());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentPanel = new widgets.panel.AdaptivePanel();
        adaptivePanel1 = new widgets.panel.AdaptivePanel();
        adaptivePanel3 = new widgets.panel.AdaptivePanel();
        adaptiveLabel2 = new widgets.label.AdaptiveLabel();
        adaptiveLabel1 = new widgets.label.AdaptiveLabel();
        adaptivePanel4 = new widgets.panel.AdaptivePanel();
        adaptiveButton1 = new widgets.button.AdaptiveButton();
        adaptivePanel2 = new widgets.panel.AdaptivePanel();
        adaptivePanel8 = new widgets.panel.AdaptivePanel();
        picturePanel2 = new widgets.panel.AdaptivePanel();
        descrPanel2 = new widgets.panel.AdaptivePanel();
        adaptiveLabel11 = new widgets.label.AdaptiveLabel();
        adaptiveButton4 = new widgets.button.AdaptiveButton();
        adaptivePanel7 = new widgets.panel.AdaptivePanel();
        picturePanel1 = new widgets.panel.AdaptivePanel();
        descrPanel1 = new widgets.panel.AdaptivePanel();
        adaptiveLabel9 = new widgets.label.AdaptiveLabel();
        adaptiveButton3 = new widgets.button.AdaptiveButton();
        adaptivePanel9 = new widgets.panel.AdaptivePanel();
        picturePanel3 = new widgets.panel.AdaptivePanel();
        descrPanel3 = new widgets.panel.AdaptivePanel();
        adaptiveLabel13 = new widgets.label.AdaptiveLabel();
        adaptiveButton5 = new widgets.button.AdaptiveButton();
        adaptivePanel10 = new widgets.panel.AdaptivePanel();
        picturePanel4 = new widgets.panel.AdaptivePanel();
        descrPanel4 = new widgets.panel.AdaptivePanel();
        adaptiveLabel12 = new widgets.label.AdaptiveLabel();
        adaptiveButton6 = new widgets.button.AdaptiveButton();
        adaptivePanel5 = new widgets.panel.AdaptivePanel();

        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        contentPanel.setLayout(new java.awt.BorderLayout());

        adaptivePanel1.setLayout(new java.awt.GridLayout(2, 1, 20, 20));

        adaptivePanel3.setLayout(new javax.swing.BoxLayout(adaptivePanel3, javax.swing.BoxLayout.PAGE_AXIS));

        adaptiveLabel2.setText("Βρέθηκαν πάνω από 200 αποτελέσματα για Νικόλαος ,");
        adaptivePanel3.add(adaptiveLabel2);

        adaptiveLabel1.setText("εμφάνιση 1-4 από τα αποτελέσματα");
        adaptivePanel3.add(adaptiveLabel1);

        adaptivePanel1.add(adaptivePanel3);

        adaptivePanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        adaptiveButton1.setText("Νέα Αναζήτηση");
        adaptiveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton1ActionPerformed(evt);
            }
        });
        adaptivePanel4.add(adaptiveButton1);

        adaptivePanel1.add(adaptivePanel4);

        contentPanel.add(adaptivePanel1, java.awt.BorderLayout.NORTH);

        adaptivePanel2.setLayout(new java.awt.GridLayout(3, 3, 20, 20));

        adaptivePanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adaptivePanel8.setLayout(new java.awt.BorderLayout(10, 10));

        picturePanel2.setFunction("koutsopImg");
        picturePanel2.setMaximumSize(new java.awt.Dimension(50, 50));
        picturePanel2.setName("Panel.Content.KoutsopImage"); // NOI18N

        javax.swing.GroupLayout picturePanel2Layout = new javax.swing.GroupLayout(picturePanel2);
        picturePanel2.setLayout(picturePanel2Layout);
        picturePanel2Layout.setHorizontalGroup(
            picturePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        picturePanel2Layout.setVerticalGroup(
            picturePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );

        adaptivePanel8.add(picturePanel2, java.awt.BorderLayout.WEST);

        descrPanel2.setMaximumSize(new java.awt.Dimension(90, 68));
        descrPanel2.setMinimumSize(new java.awt.Dimension(90, 68));
        descrPanel2.setPreferredSize(new java.awt.Dimension(90, 68));
        descrPanel2.setLayout(new javax.swing.BoxLayout(descrPanel2, javax.swing.BoxLayout.PAGE_AXIS));

        adaptiveLabel11.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        adaptiveLabel11.setText("Νικόλαος Κουτσόπουλος");
        descrPanel2.add(adaptiveLabel11);

        adaptiveButton4.setText("Προσθήκη");
        adaptiveButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton4ActionPerformed(evt);
            }
        });
        descrPanel2.add(adaptiveButton4);

        adaptivePanel8.add(descrPanel2, java.awt.BorderLayout.CENTER);

        adaptivePanel2.add(adaptivePanel8);

        adaptivePanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adaptivePanel7.setLayout(new java.awt.BorderLayout(10, 10));

        picturePanel1.setFunction("koutsopImg");
        picturePanel1.setMaximumSize(new java.awt.Dimension(50, 50));
        picturePanel1.setName("Panel.Content.KoutsopImage"); // NOI18N

        javax.swing.GroupLayout picturePanel1Layout = new javax.swing.GroupLayout(picturePanel1);
        picturePanel1.setLayout(picturePanel1Layout);
        picturePanel1Layout.setHorizontalGroup(
            picturePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        picturePanel1Layout.setVerticalGroup(
            picturePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );

        adaptivePanel7.add(picturePanel1, java.awt.BorderLayout.WEST);

        descrPanel1.setMaximumSize(new java.awt.Dimension(90, 68));
        descrPanel1.setMinimumSize(new java.awt.Dimension(90, 68));
        descrPanel1.setPreferredSize(new java.awt.Dimension(90, 68));
        descrPanel1.setLayout(new javax.swing.BoxLayout(descrPanel1, javax.swing.BoxLayout.PAGE_AXIS));

        adaptiveLabel9.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        adaptiveLabel9.setText("Νικόλαος Κουτσόπουλος");
        descrPanel1.add(adaptiveLabel9);

        adaptiveButton3.setText("Προσθήκη");
        adaptiveButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton3ActionPerformed(evt);
            }
        });
        descrPanel1.add(adaptiveButton3);

        adaptivePanel7.add(descrPanel1, java.awt.BorderLayout.CENTER);

        adaptivePanel2.add(adaptivePanel7);

        adaptivePanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adaptivePanel9.setLayout(new java.awt.BorderLayout(10, 10));

        picturePanel3.setFunction("koutsopImg");
        picturePanel3.setMaximumSize(new java.awt.Dimension(50, 50));
        picturePanel3.setName("Panel.Content.KoutsopImage"); // NOI18N

        javax.swing.GroupLayout picturePanel3Layout = new javax.swing.GroupLayout(picturePanel3);
        picturePanel3.setLayout(picturePanel3Layout);
        picturePanel3Layout.setHorizontalGroup(
            picturePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        picturePanel3Layout.setVerticalGroup(
            picturePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );

        adaptivePanel9.add(picturePanel3, java.awt.BorderLayout.WEST);

        descrPanel3.setMaximumSize(new java.awt.Dimension(90, 68));
        descrPanel3.setMinimumSize(new java.awt.Dimension(90, 68));
        descrPanel3.setPreferredSize(new java.awt.Dimension(90, 68));
        descrPanel3.setLayout(new javax.swing.BoxLayout(descrPanel3, javax.swing.BoxLayout.PAGE_AXIS));

        adaptiveLabel13.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        adaptiveLabel13.setText("Νικόλαος Κουτσόπουλος");
        descrPanel3.add(adaptiveLabel13);

        adaptiveButton5.setText("Προσθήκη");
        adaptiveButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton5ActionPerformed(evt);
            }
        });
        descrPanel3.add(adaptiveButton5);

        adaptivePanel9.add(descrPanel3, java.awt.BorderLayout.CENTER);

        adaptivePanel2.add(adaptivePanel9);

        adaptivePanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adaptivePanel10.setLayout(new java.awt.BorderLayout(10, 10));

        picturePanel4.setFunction("koutsopImg");
        picturePanel4.setMaximumSize(new java.awt.Dimension(50, 50));
        picturePanel4.setName("Panel.Content.KoutsopImage"); // NOI18N

        javax.swing.GroupLayout picturePanel4Layout = new javax.swing.GroupLayout(picturePanel4);
        picturePanel4.setLayout(picturePanel4Layout);
        picturePanel4Layout.setHorizontalGroup(
            picturePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        picturePanel4Layout.setVerticalGroup(
            picturePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );

        adaptivePanel10.add(picturePanel4, java.awt.BorderLayout.WEST);

        descrPanel4.setMaximumSize(new java.awt.Dimension(90, 68));
        descrPanel4.setMinimumSize(new java.awt.Dimension(90, 68));
        descrPanel4.setPreferredSize(new java.awt.Dimension(90, 68));
        descrPanel4.setLayout(new javax.swing.BoxLayout(descrPanel4, javax.swing.BoxLayout.PAGE_AXIS));

        adaptiveLabel12.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        adaptiveLabel12.setText("Νικόλαος Κουτσόπουλος");
        descrPanel4.add(adaptiveLabel12);

        adaptiveButton6.setText("Προσθήκη");
        adaptiveButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton6ActionPerformed(evt);
            }
        });
        descrPanel4.add(adaptiveButton6);

        adaptivePanel10.add(descrPanel4, java.awt.BorderLayout.CENTER);

        adaptivePanel2.add(adaptivePanel10);

        contentPanel.add(adaptivePanel2, java.awt.BorderLayout.CENTER);
        contentPanel.add(adaptivePanel5, java.awt.BorderLayout.PAGE_END);

        add(contentPanel);
    }// </editor-fold>//GEN-END:initComponents

private void adaptiveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton1ActionPerformed
	JPanel myParent = (JPanel)getParent().getParent();
	SearchForNewContact r = new SearchForNewContact();
	r.setVisible(true);
	myParent.removeAll();
	myParent.add(r);
	myParent.repaint();
	myParent.validate();
}//GEN-LAST:event_adaptiveButton1ActionPerformed
	private void AddContact () {
		JPanel myParent = (JPanel)getParent().getParent();

		// Instantiate the new screen
		AddContactRequest r = new AddContactRequest();
		r.setVisible(true);

		// Remove the contents of the content panel & add the new screen
		myParent.removeAll();
		myParent.add(r);
		myParent.repaint();
		myParent.validate();		
	}
private void adaptiveButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton4ActionPerformed
	AddContact();
}//GEN-LAST:event_adaptiveButton4ActionPerformed

private void adaptiveButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton3ActionPerformed
// TODO add your handling code here:
	AddContact();
}//GEN-LAST:event_adaptiveButton3ActionPerformed

private void adaptiveButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton5ActionPerformed
// TODO add your handling code here:
	AddContact();
}//GEN-LAST:event_adaptiveButton5ActionPerformed

private void adaptiveButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton6ActionPerformed
// TODO add your handling code here:
	AddContact();
}//GEN-LAST:event_adaptiveButton6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.button.AdaptiveButton adaptiveButton1;
    private widgets.button.AdaptiveButton adaptiveButton3;
    private widgets.button.AdaptiveButton adaptiveButton4;
    private widgets.button.AdaptiveButton adaptiveButton5;
    private widgets.button.AdaptiveButton adaptiveButton6;
    private widgets.label.AdaptiveLabel adaptiveLabel1;
    private widgets.label.AdaptiveLabel adaptiveLabel11;
    private widgets.label.AdaptiveLabel adaptiveLabel12;
    private widgets.label.AdaptiveLabel adaptiveLabel13;
    private widgets.label.AdaptiveLabel adaptiveLabel2;
    private widgets.label.AdaptiveLabel adaptiveLabel9;
    private widgets.panel.AdaptivePanel adaptivePanel1;
    private widgets.panel.AdaptivePanel adaptivePanel10;
    private widgets.panel.AdaptivePanel adaptivePanel2;
    private widgets.panel.AdaptivePanel adaptivePanel3;
    private widgets.panel.AdaptivePanel adaptivePanel4;
    private widgets.panel.AdaptivePanel adaptivePanel5;
    private widgets.panel.AdaptivePanel adaptivePanel7;
    private widgets.panel.AdaptivePanel adaptivePanel8;
    private widgets.panel.AdaptivePanel adaptivePanel9;
    private widgets.panel.AdaptivePanel contentPanel;
    private widgets.panel.AdaptivePanel descrPanel1;
    private widgets.panel.AdaptivePanel descrPanel2;
    private widgets.panel.AdaptivePanel descrPanel3;
    private widgets.panel.AdaptivePanel descrPanel4;
    private widgets.panel.AdaptivePanel picturePanel1;
    private widgets.panel.AdaptivePanel picturePanel2;
    private widgets.panel.AdaptivePanel picturePanel3;
    private widgets.panel.AdaptivePanel picturePanel4;
    // End of variables declaration//GEN-END:variables
}
