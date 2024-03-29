/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SearchForNewContact.java
 *
 * Created on Nov 26, 2011, 8:47:56 PM
 */
package assignment2.NoDisability;

import assignment2.AdaptableViews.AdaptableAddContactResults;
import assignment2.AdaptableViews.AdaptableGeneralSettingsView;
import javax.swing.JPanel;
import utilities.Adaptation;

/**
 *
 * @author Marigianna
 */
public class SearchForNewContact extends javax.swing.JPanel {
    /** Creates new form SearchForNewContact */
    public SearchForNewContact() {
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

        contentPanel = new widgets.panel.AdaptivePanel();
        adaptivePanel1 = new widgets.panel.AdaptivePanel();
        adaptivePanel5 = new widgets.panel.AdaptivePanel();
        adaptiveLabel1 = new widgets.label.AdaptiveLabel();
        adaptivePanel4 = new widgets.panel.AdaptivePanel();
        adaptiveLabel2 = new widgets.label.AdaptiveLabel();
        adaptivePanel2 = new widgets.panel.AdaptivePanel();
        adaptiveLabel5 = new widgets.label.AdaptiveLabel();
        adaptiveTextField2 = new widgets.textfield.AdaptiveTextField();
        adaptiveLabel4 = new widgets.label.AdaptiveLabel();
        adaptiveTextField3 = new widgets.textfield.AdaptiveTextField();
        adaptiveLabel3 = new widgets.label.AdaptiveLabel();
        adaptiveTextField1 = new widgets.textfield.AdaptiveTextField();
        adaptivePanel3 = new widgets.panel.AdaptivePanel();
        adaptiveButton1 = new widgets.button.AdaptiveButton();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        contentPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        adaptivePanel1.setLayout(new javax.swing.BoxLayout(adaptivePanel1, javax.swing.BoxLayout.PAGE_AXIS));

        adaptivePanel5.setLayout(new javax.swing.BoxLayout(adaptivePanel5, javax.swing.BoxLayout.LINE_AXIS));

        adaptiveLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 1, 10, 1));
        adaptiveLabel1.setText("Προσθήκη Επαφής");
        adaptivePanel5.add(adaptiveLabel1);

        adaptivePanel1.add(adaptivePanel5);

        adaptiveLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 10, 1));
        adaptiveLabel2.setText("Εισάγετε όλα τα πεδία που γνωρίζετε:");
        adaptivePanel4.add(adaptiveLabel2);

        adaptivePanel1.add(adaptivePanel4);

        adaptivePanel2.setLayout(new java.awt.GridLayout(3, 2, 10, 10));

        adaptiveLabel5.setText("E-mail ");
        adaptivePanel2.add(adaptiveLabel5);
        adaptivePanel2.add(adaptiveTextField2);

        adaptiveLabel4.setText("Ονοματεπώνυμο");
        adaptivePanel2.add(adaptiveLabel4);
        adaptivePanel2.add(adaptiveTextField3);

        adaptiveLabel3.setText("Όνομα ΙΜ");
        adaptivePanel2.add(adaptiveLabel3);
        adaptivePanel2.add(adaptiveTextField1);

        adaptivePanel1.add(adaptivePanel2);

        adaptivePanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 20));

        adaptiveButton1.setText("Αναζήτηση επαφής");
        adaptiveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton1ActionPerformed(evt);
            }
        });
        adaptivePanel3.add(adaptiveButton1);

        adaptivePanel1.add(adaptivePanel3);

        contentPanel.add(adaptivePanel1);

        add(contentPanel);
    }// </editor-fold>//GEN-END:initComponents

private void adaptiveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton1ActionPerformed
	// Instantiate the new screen
	JPanel myParent = (JPanel)this.getParent();
	AdaptableAddContactResults r = new AdaptableAddContactResults();
	r.setVisible(true);
	myParent.removeAll();
	myParent.add(r);
	myParent.repaint();
	myParent.validate();
}//GEN-LAST:event_adaptiveButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.button.AdaptiveButton adaptiveButton1;
    private widgets.label.AdaptiveLabel adaptiveLabel1;
    private widgets.label.AdaptiveLabel adaptiveLabel2;
    private widgets.label.AdaptiveLabel adaptiveLabel3;
    private widgets.label.AdaptiveLabel adaptiveLabel4;
    private widgets.label.AdaptiveLabel adaptiveLabel5;
    private widgets.panel.AdaptivePanel adaptivePanel1;
    private widgets.panel.AdaptivePanel adaptivePanel2;
    private widgets.panel.AdaptivePanel adaptivePanel3;
    private widgets.panel.AdaptivePanel adaptivePanel4;
    private widgets.panel.AdaptivePanel adaptivePanel5;
    private widgets.textfield.AdaptiveTextField adaptiveTextField1;
    private widgets.textfield.AdaptiveTextField adaptiveTextField2;
    private widgets.textfield.AdaptiveTextField adaptiveTextField3;
    private widgets.panel.AdaptivePanel contentPanel;
    // End of variables declaration//GEN-END:variables
}
