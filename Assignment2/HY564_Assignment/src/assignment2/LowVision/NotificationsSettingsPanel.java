/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NotificationsSettingsPanel.java
 *
 * Created on Nov 25, 2011, 1:25:47 PM
 */
package assignment2.LowVision;

import assignment2.NoDisability.*;

/**
 *
 * @author Marigianna
 */
public class NotificationsSettingsPanel extends javax.swing.JPanel {

    /** Creates new form NotificationsSettingsPanel */
    public NotificationsSettingsPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adaptivePanel5 = new widgets.panel.AdaptivePanel();
        adaptiveCheckBox8 = new widgets.checkbox.AdaptiveCheckBox();
        adaptivePanel1 = new widgets.panel.AdaptivePanel();
        adaptivePanel3 = new widgets.panel.AdaptivePanel();
        centerPanel = new widgets.panel.AdaptivePanel();
        ap1 = new widgets.panel.AdaptivePanel();
        adaptivePanel7 = new widgets.panel.AdaptivePanel();
        adaptiveLabel1 = new widgets.label.AdaptiveLabel();
        adaptivePanel8 = new widgets.panel.AdaptivePanel();
        adaptiveCheckBox1 = new widgets.checkbox.AdaptiveCheckBox();
        adaptivePanel9 = new widgets.panel.AdaptivePanel();
        adaptiveCheckBox2 = new widgets.checkbox.AdaptiveCheckBox();
        ap2 = new widgets.panel.AdaptivePanel();
        adaptivePanel10 = new widgets.panel.AdaptivePanel();
        adaptiveLabel2 = new widgets.label.AdaptiveLabel();
        adaptivePanel12 = new widgets.panel.AdaptivePanel();
        adaptiveCheckBox3 = new widgets.checkbox.AdaptiveCheckBox();
        adaptivePanel13 = new widgets.panel.AdaptivePanel();
        adaptiveCheckBox4 = new widgets.checkbox.AdaptiveCheckBox();
        ap3 = new widgets.panel.AdaptivePanel();
        adaptiveLabel3 = new widgets.label.AdaptiveLabel();
        adaptiveCheckBox5 = new widgets.checkbox.AdaptiveCheckBox();
        adaptiveCheckBox7 = new widgets.checkbox.AdaptiveCheckBox();
        ap4 = new widgets.panel.AdaptivePanel();
        adaptiveLabel4 = new widgets.label.AdaptiveLabel();
        adaptiveCheckBox6 = new widgets.checkbox.AdaptiveCheckBox();
        adaptivePanel4 = new widgets.panel.AdaptivePanel();
        adaptivePanel2 = new widgets.panel.AdaptivePanel();
        adaptiveCheckBox9 = new widgets.checkbox.AdaptiveCheckBox();

        adaptiveCheckBox8.setText("Προβολή ειδοποιήσεων");

        javax.swing.GroupLayout adaptivePanel5Layout = new javax.swing.GroupLayout(adaptivePanel5);
        adaptivePanel5.setLayout(adaptivePanel5Layout);
        adaptivePanel5Layout.setHorizontalGroup(
            adaptivePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adaptivePanel5Layout.createSequentialGroup()
                .addComponent(adaptiveCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(653, Short.MAX_VALUE))
        );
        adaptivePanel5Layout.setVerticalGroup(
            adaptivePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adaptivePanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adaptiveCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 15, 0, 0));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        adaptivePanel1.setLayout(new javax.swing.BoxLayout(adaptivePanel1, javax.swing.BoxLayout.PAGE_AXIS));

        adaptivePanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        centerPanel.setLayout(new java.awt.GridLayout(2, 2, 5, 20));

        ap1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        ap1.setLayout(new java.awt.GridLayout(3, 1, 10, 10));

        adaptivePanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        adaptiveLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        adaptiveLabel1.setText("Ειδοποιήσεις Chat");
        adaptivePanel7.add(adaptiveLabel1);

        ap1.add(adaptivePanel7);

        adaptivePanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        adaptiveCheckBox1.setText("Αναπαραγωγή ήχου");
        adaptivePanel8.add(adaptiveCheckBox1);

        ap1.add(adaptivePanel8);

        adaptivePanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        adaptiveCheckBox2.setText("Προβολή ειδοποποιήσεων");
        adaptivePanel9.add(adaptiveCheckBox2);

        ap1.add(adaptivePanel9);

        centerPanel.add(ap1);

        ap2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        ap2.setLayout(new java.awt.GridLayout(3, 1, 10, 10));

        adaptivePanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        adaptiveLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        adaptiveLabel2.setText("Ειδοποιήσεις Κλήσης");
        adaptivePanel10.add(adaptiveLabel2);

        ap2.add(adaptivePanel10);

        adaptivePanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        adaptiveCheckBox3.setText("Αναπαραγωγή ήχου");
        adaptivePanel12.add(adaptiveCheckBox3);

        ap2.add(adaptivePanel12);

        adaptivePanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        adaptiveCheckBox4.setText("Προβολή ειδοποιήσεων");
        adaptivePanel13.add(adaptiveCheckBox4);

        ap2.add(adaptivePanel13);

        centerPanel.add(ap2);

        ap3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        ap3.setLayout(new java.awt.GridLayout(3, 1, 10, 10));

        adaptiveLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        adaptiveLabel3.setText("Ειδοποιήσεις Κλήσης");
        ap3.add(adaptiveLabel3);

        adaptiveCheckBox5.setText("Αναπαραγωγή ήχου");
        ap3.add(adaptiveCheckBox5);

        adaptiveCheckBox7.setText("Προβολή ειδοποιήσεων");
        ap3.add(adaptiveCheckBox7);

        centerPanel.add(ap3);

        ap4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        ap4.setLayout(new java.awt.GridLayout(3, 1, 10, 10));

        adaptiveLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        adaptiveLabel4.setText("Ειδοποιήσεις Εισόδου Επαφών");
        ap4.add(adaptiveLabel4);

        adaptiveCheckBox6.setText("Ενεργοποίηση όλων");
        ap4.add(adaptiveCheckBox6);

        centerPanel.add(ap4);

        adaptivePanel3.add(centerPanel);

        adaptivePanel1.add(adaptivePanel3);

        adaptivePanel4.setMaximumSize(new java.awt.Dimension(1, 20));
        adaptivePanel4.setMinimumSize(new java.awt.Dimension(1, 20));
        adaptivePanel4.setPreferredSize(new java.awt.Dimension(1, 20));

        javax.swing.GroupLayout adaptivePanel4Layout = new javax.swing.GroupLayout(adaptivePanel4);
        adaptivePanel4.setLayout(adaptivePanel4Layout);
        adaptivePanel4Layout.setHorizontalGroup(
            adaptivePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        adaptivePanel4Layout.setVerticalGroup(
            adaptivePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        adaptivePanel1.add(adaptivePanel4);

        adaptivePanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        adaptiveCheckBox9.setText("Προβολή ειδοποιήσεων");
        adaptivePanel2.add(adaptiveCheckBox9);

        adaptivePanel1.add(adaptivePanel2);

        add(adaptivePanel1);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.checkbox.AdaptiveCheckBox adaptiveCheckBox1;
    private widgets.checkbox.AdaptiveCheckBox adaptiveCheckBox2;
    private widgets.checkbox.AdaptiveCheckBox adaptiveCheckBox3;
    private widgets.checkbox.AdaptiveCheckBox adaptiveCheckBox4;
    private widgets.checkbox.AdaptiveCheckBox adaptiveCheckBox5;
    private widgets.checkbox.AdaptiveCheckBox adaptiveCheckBox6;
    private widgets.checkbox.AdaptiveCheckBox adaptiveCheckBox7;
    private widgets.checkbox.AdaptiveCheckBox adaptiveCheckBox8;
    private widgets.checkbox.AdaptiveCheckBox adaptiveCheckBox9;
    private widgets.label.AdaptiveLabel adaptiveLabel1;
    private widgets.label.AdaptiveLabel adaptiveLabel2;
    private widgets.label.AdaptiveLabel adaptiveLabel3;
    private widgets.label.AdaptiveLabel adaptiveLabel4;
    private widgets.panel.AdaptivePanel adaptivePanel1;
    private widgets.panel.AdaptivePanel adaptivePanel10;
    private widgets.panel.AdaptivePanel adaptivePanel12;
    private widgets.panel.AdaptivePanel adaptivePanel13;
    private widgets.panel.AdaptivePanel adaptivePanel2;
    private widgets.panel.AdaptivePanel adaptivePanel3;
    private widgets.panel.AdaptivePanel adaptivePanel4;
    private widgets.panel.AdaptivePanel adaptivePanel5;
    private widgets.panel.AdaptivePanel adaptivePanel7;
    private widgets.panel.AdaptivePanel adaptivePanel8;
    private widgets.panel.AdaptivePanel adaptivePanel9;
    private widgets.panel.AdaptivePanel ap1;
    private widgets.panel.AdaptivePanel ap2;
    private widgets.panel.AdaptivePanel ap3;
    private widgets.panel.AdaptivePanel ap4;
    private widgets.panel.AdaptivePanel centerPanel;
    // End of variables declaration//GEN-END:variables
}
