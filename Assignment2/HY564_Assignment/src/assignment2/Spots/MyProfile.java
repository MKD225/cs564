/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MyProfile.java
 *
 * Created on 29 Νοε 2011, 8:46:28 πμ
 */
package assignment2.Spots;

import assignment2.Utility.Utility;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import utilities.Adaptation;
import utilities.DMSLConnector;

/**
 *
 * @author koutsop
 */
public class MyProfile extends javax.swing.JPanel {

	/** Creates new form MyProfile */
	public MyProfile() {
		initComponents();
        Adaptation.automaticallySetRuntime(this);
        Adaptation.automaticallyAdapt(this);
        
        String path = DMSLConnector.getInstance().getClient(false).Evaluate("OnlineButton");
        onlineButton.setIcon(new ImageIcon(getClass().getResource(path)));  
        
        path = DMSLConnector.getInstance().getClient(false).Evaluate("AwayButton");
        awayButton.setIcon(new ImageIcon(getClass().getResource(path)));  
        
        path = DMSLConnector.getInstance().getClient(false).Evaluate("BusyButton");
        busyButton.setIcon(new ImageIcon(getClass().getResource(path))); 
        
        path = DMSLConnector.getInstance().getClient(false).Evaluate("OfflineButton");
        offlineButton.setIcon(new ImageIcon(getClass().getResource(path))); 
        
        path = DMSLConnector.getInstance().getClient(false).Evaluate("CancelButton");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        contentPanel = new widgets.panel.AdaptivePanel();
        profileImagePanel = new widgets.panel.AdaptivePanel();
        adaptivePanel38 = new widgets.panel.AdaptivePanel();
        adaptivePanel29 = new widgets.panel.AdaptivePanel();
        adaptivePanel30 = new widgets.panel.AdaptivePanel();
        adaptivePanel31 = new widgets.panel.AdaptivePanel();
        adaptiveButton3 = new widgets.button.AdaptiveButton();
        adaptivePanel32 = new widgets.panel.AdaptivePanel();
        onlineButton = new widgets.button.AdaptiveButton();
        awayButton = new widgets.button.AdaptiveButton();
        busyButton = new widgets.button.AdaptiveButton();
        offlineButton = new widgets.button.AdaptiveButton();
        adaptivePanel37 = new widgets.panel.AdaptivePanel();
        profileDataPanel = new widgets.panel.AdaptivePanel();
        adaptivePanel18 = new widgets.panel.AdaptivePanel();
        adaptiveLabel13 = new widgets.label.AdaptiveLabel();
        adaptivePanel13 = new widgets.panel.AdaptivePanel();
        adaptiveTextField13 = new widgets.textfield.AdaptiveTextField();
        adaptivePanel14 = new widgets.panel.AdaptivePanel();
        adaptiveLabel1 = new widgets.label.AdaptiveLabel();
        adaptivePanel1 = new widgets.panel.AdaptivePanel();
        adaptiveTextField1 = new widgets.textfield.AdaptiveTextField();
        adaptivePanel15 = new widgets.panel.AdaptivePanel();
        adaptiveLabel2 = new widgets.label.AdaptiveLabel();
        adaptivePanel2 = new widgets.panel.AdaptivePanel();
        adaptiveTextField2 = new widgets.textfield.AdaptiveTextField();
        adaptivePanel16 = new widgets.panel.AdaptivePanel();
        adaptiveLabel3 = new widgets.label.AdaptiveLabel();
        adaptivePanel3 = new widgets.panel.AdaptivePanel();
        adaptiveTextField3 = new widgets.textfield.AdaptiveTextField();
        adaptivePanel17 = new widgets.panel.AdaptivePanel();
        adaptiveLabel4 = new widgets.label.AdaptiveLabel();
        adaptivePanel4 = new widgets.panel.AdaptivePanel();
        adaptiveComboBox2 = new widgets.combobox.AdaptiveComboBox();
        adaptiveComboBox3 = new widgets.combobox.AdaptiveComboBox();
        adaptiveComboBox4 = new widgets.combobox.AdaptiveComboBox();
        adaptivePanel21 = new widgets.panel.AdaptivePanel();
        adaptiveLabel5 = new widgets.label.AdaptiveLabel();
        adaptivePanel5 = new widgets.panel.AdaptivePanel();
        adaptiveLabel15 = new widgets.label.AdaptiveLabel();
        adaptivePanel22 = new widgets.panel.AdaptivePanel();
        adaptiveLabel6 = new widgets.label.AdaptiveLabel();
        adaptivePanel6 = new widgets.panel.AdaptivePanel();
        adaptiveComboBox5 = new widgets.combobox.AdaptiveComboBox();
        adaptivePanel23 = new widgets.panel.AdaptivePanel();
        adaptiveLabel7 = new widgets.label.AdaptiveLabel();
        adaptivePanel7 = new widgets.panel.AdaptivePanel();
        adaptiveTextField7 = new widgets.textfield.AdaptiveTextField();
        adaptivePanel24 = new widgets.panel.AdaptivePanel();
        adaptiveLabel8 = new widgets.label.AdaptiveLabel();
        adaptivePanel8 = new widgets.panel.AdaptivePanel();
        adaptiveComboBox1 = new widgets.combobox.AdaptiveComboBox();
        adaptivePanel25 = new widgets.panel.AdaptivePanel();
        adaptiveLabel9 = new widgets.label.AdaptiveLabel();
        adaptivePanel9 = new widgets.panel.AdaptivePanel();
        adaptiveTextField9 = new widgets.textfield.AdaptiveTextField();
        adaptivePanel27 = new widgets.panel.AdaptivePanel();
        adaptiveLabel19 = new widgets.label.AdaptiveLabel();
        adaptivePanel28 = new widgets.panel.AdaptivePanel();
        adaptiveComboBox8 = new widgets.combobox.AdaptiveComboBox();
        adaptivePanel26 = new widgets.panel.AdaptivePanel();
        adaptiveLabel10 = new widgets.label.AdaptiveLabel();
        adaptivePanel10 = new widgets.panel.AdaptivePanel();
        adaptiveLabel14 = new widgets.label.AdaptiveLabel();
        adaptivePanel20 = new widgets.panel.AdaptivePanel();
        adaptiveLabel11 = new widgets.label.AdaptiveLabel();
        adaptivePanel11 = new widgets.panel.AdaptivePanel();
        adaptiveTextField11 = new widgets.textfield.AdaptiveTextField();
        adaptivePanel19 = new widgets.panel.AdaptivePanel();
        adaptiveLabel12 = new widgets.label.AdaptiveLabel();
        adaptivePanel12 = new widgets.panel.AdaptivePanel();
        adaptiveTextField12 = new widgets.textfield.AdaptiveTextField();
        buttonData = new widgets.panel.AdaptivePanel();
        adaptivePanel34 = new widgets.panel.AdaptivePanel();
        acceptanceButton = new widgets.button.AdaptiveButton();
        adaptivePanel35 = new widgets.panel.AdaptivePanel();
        cancelButton = new widgets.button.AdaptiveButton();
        adaptivePanel36 = new widgets.panel.AdaptivePanel();

        setLayout(new java.awt.BorderLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        contentPanel.setLayout(new java.awt.BorderLayout());

        profileImagePanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 0, 5));

        adaptivePanel38.setLayout(new javax.swing.BoxLayout(adaptivePanel38, javax.swing.BoxLayout.PAGE_AXIS));

        adaptivePanel29.setFunction("koutsopImg");
        adaptivePanel29.setMaximumSize(new java.awt.Dimension(100, 100));
        adaptivePanel29.setMinimumSize(new java.awt.Dimension(100, 100));
        adaptivePanel29.setName("Panel.Content.KoutsopImage"); // NOI18N
        adaptivePanel29.setPreferredSize(new java.awt.Dimension(100, 100));
        adaptivePanel29.setLayout(new javax.swing.BoxLayout(adaptivePanel29, javax.swing.BoxLayout.LINE_AXIS));
        adaptivePanel38.add(adaptivePanel29);

        adaptivePanel30.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        adaptivePanel30.setLayout(new javax.swing.BoxLayout(adaptivePanel30, javax.swing.BoxLayout.PAGE_AXIS));

        adaptiveButton3.setText("Επιλογή Εικόνας");
        adaptiveButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton3ActionPerformed(evt);
            }
        });
        adaptivePanel31.add(adaptiveButton3);

        adaptivePanel30.add(adaptivePanel31);

        adaptivePanel32.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        onlineButton.setSelected(true);
        adaptivePanel32.add(onlineButton);
        adaptivePanel32.add(awayButton);
        adaptivePanel32.add(busyButton);

        offlineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offlineButtonActionPerformed(evt);
            }
        });
        adaptivePanel32.add(offlineButton);

        adaptivePanel30.add(adaptivePanel32);

        adaptivePanel38.add(adaptivePanel30);

        profileImagePanel.add(adaptivePanel38);

        contentPanel.add(profileImagePanel, java.awt.BorderLayout.NORTH);

        adaptivePanel37.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 20, 5));

        profileDataPanel.setLayout(new javax.swing.BoxLayout(profileDataPanel, javax.swing.BoxLayout.PAGE_AXIS));

        adaptivePanel18.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        adaptiveLabel13.setText("Status");
        adaptivePanel18.add(adaptiveLabel13);

        profileDataPanel.add(adaptivePanel18);

        adaptivePanel13.setLayout(new javax.swing.BoxLayout(adaptivePanel13, javax.swing.BoxLayout.LINE_AXIS));

        adaptiveTextField13.setText("ΗΥ-564 άσκηση 3");
        adaptivePanel13.add(adaptiveTextField13);

        profileDataPanel.add(adaptivePanel13);

        adaptivePanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        adaptiveLabel1.setText("Όνομα");
        adaptivePanel14.add(adaptiveLabel1);

        profileDataPanel.add(adaptivePanel14);

        adaptivePanel1.setLayout(new javax.swing.BoxLayout(adaptivePanel1, javax.swing.BoxLayout.LINE_AXIS));

        adaptiveTextField1.setText("Νικόλαος");
        adaptivePanel1.add(adaptiveTextField1);

        profileDataPanel.add(adaptivePanel1);

        adaptivePanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        adaptiveLabel2.setText("Επώνυμο");
        adaptivePanel15.add(adaptiveLabel2);

        profileDataPanel.add(adaptivePanel15);

        adaptivePanel2.setLayout(new javax.swing.BoxLayout(adaptivePanel2, javax.swing.BoxLayout.LINE_AXIS));

        adaptiveTextField2.setText("Κουτσόπουλος");
        adaptiveTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveTextField2ActionPerformed(evt);
            }
        });
        adaptivePanel2.add(adaptiveTextField2);

        profileDataPanel.add(adaptivePanel2);

        adaptivePanel16.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        adaptiveLabel3.setText("Ε-mail");
        adaptivePanel16.add(adaptiveLabel3);

        profileDataPanel.add(adaptivePanel16);

        adaptivePanel3.setLayout(new javax.swing.BoxLayout(adaptivePanel3, javax.swing.BoxLayout.LINE_AXIS));

        adaptiveTextField3.setText("koutsop@gmal.com");
        adaptiveTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveTextField3ActionPerformed(evt);
            }
        });
        adaptivePanel3.add(adaptiveTextField3);

        profileDataPanel.add(adaptivePanel3);

        adaptivePanel17.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        adaptiveLabel4.setText("Ημερομηνίας Γέννησης  ");
        adaptivePanel17.add(adaptiveLabel4);

        profileDataPanel.add(adaptivePanel17);

        adaptivePanel4.setLayout(new javax.swing.BoxLayout(adaptivePanel4, javax.swing.BoxLayout.LINE_AXIS));

        adaptiveComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        adaptiveComboBox2.setFont(new java.awt.Font("Tahoma", 0, 8));
        adaptivePanel4.add(adaptiveComboBox2);

        adaptiveComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "05", "06", "07", "08", "09", "10", "11", "12", " " }));
        adaptiveComboBox3.setFont(new java.awt.Font("Tahoma", 0, 8));
        adaptivePanel4.add(adaptiveComboBox3);

        adaptiveComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1984", "1990", "2000" }));
        adaptiveComboBox4.setFont(new java.awt.Font("Tahoma", 0, 8));
        adaptivePanel4.add(adaptiveComboBox4);

        profileDataPanel.add(adaptivePanel4);

        adaptivePanel21.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        adaptiveLabel5.setText("Φύλλο  ");
        adaptivePanel21.add(adaptiveLabel5);

        adaptivePanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 40, 0));

        adaptiveLabel15.setText("Άνδρας");
        adaptivePanel5.add(adaptiveLabel15);

        adaptivePanel21.add(adaptivePanel5);

        profileDataPanel.add(adaptivePanel21);

        adaptivePanel22.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        adaptiveLabel6.setText("Χώρα ");
        adaptivePanel22.add(adaptiveLabel6);

        profileDataPanel.add(adaptivePanel22);

        adaptivePanel6.setLayout(new javax.swing.BoxLayout(adaptivePanel6, javax.swing.BoxLayout.LINE_AXIS));

        adaptiveComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ελλάδα", "Γαλλία", "Γερμανία", "Ηνωμένο Βασίλειο", "Ιταλία", "Ισπανία" }));
        adaptivePanel6.add(adaptiveComboBox5);

        profileDataPanel.add(adaptivePanel6);

        adaptivePanel23.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        adaptiveLabel7.setText("Πόλη ");
        adaptivePanel23.add(adaptiveLabel7);

        profileDataPanel.add(adaptivePanel23);

        adaptivePanel7.setLayout(new javax.swing.BoxLayout(adaptivePanel7, javax.swing.BoxLayout.LINE_AXIS));
        adaptivePanel7.add(adaptiveTextField7);

        profileDataPanel.add(adaptivePanel7);

        adaptivePanel24.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        adaptiveLabel8.setText("Γλώσσα");
        adaptivePanel24.add(adaptiveLabel8);

        profileDataPanel.add(adaptivePanel24);

        adaptivePanel8.setLayout(new javax.swing.BoxLayout(adaptivePanel8, javax.swing.BoxLayout.LINE_AXIS));

        adaptiveComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ελληνικά", "Αγγλικά", "Γαλλικά", "Γερμανικά", "Ισπανικά", "Ιταλικά", " " }));
        adaptivePanel8.add(adaptiveComboBox1);

        profileDataPanel.add(adaptivePanel8);

        adaptivePanel25.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        adaptiveLabel9.setText("Τηλέφωνο");
        adaptivePanel25.add(adaptiveLabel9);

        profileDataPanel.add(adaptivePanel25);

        adaptivePanel9.setLayout(new javax.swing.BoxLayout(adaptivePanel9, javax.swing.BoxLayout.LINE_AXIS));
        adaptivePanel9.add(adaptiveTextField9);

        profileDataPanel.add(adaptivePanel9);

        adaptivePanel27.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        adaptiveLabel19.setText("Είδος Αναπηρίας (εαν υπάρχει)");
        adaptivePanel27.add(adaptiveLabel19);

        profileDataPanel.add(adaptivePanel27);

        adaptivePanel28.setLayout(new javax.swing.BoxLayout(adaptivePanel28, javax.swing.BoxLayout.LINE_AXIS));

        adaptiveComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Δεν υπάρχει", "Προβλήματα όρασης", "Αχρωματοψία", "Αστάθια άνω άκρων" }));
        adaptiveComboBox8.setMaximumSize(new java.awt.Dimension(200, 40));
        adaptiveComboBox8.setMinimumSize(new java.awt.Dimension(200, 40));
        adaptiveComboBox8.setPreferredSize(new java.awt.Dimension(200, 40));
        adaptiveComboBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveComboBox8ActionPerformed(evt);
            }
        });
        adaptivePanel28.add(adaptiveComboBox8);

        profileDataPanel.add(adaptivePanel28);

        adaptivePanel26.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        adaptiveLabel10.setText("Όνομα Χρήστη");
        adaptivePanel26.add(adaptiveLabel10);

        adaptivePanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 0));

        adaptiveLabel14.setText("koutsop");
        adaptivePanel10.add(adaptiveLabel14);

        adaptivePanel26.add(adaptivePanel10);

        profileDataPanel.add(adaptivePanel26);

        adaptivePanel20.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        adaptiveLabel11.setText("Κωδικός");
        adaptivePanel20.add(adaptiveLabel11);

        profileDataPanel.add(adaptivePanel20);

        adaptivePanel11.setLayout(new javax.swing.BoxLayout(adaptivePanel11, javax.swing.BoxLayout.LINE_AXIS));

        adaptiveTextField11.setText("**********");
        adaptiveTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveTextField11ActionPerformed(evt);
            }
        });
        adaptivePanel11.add(adaptiveTextField11);

        profileDataPanel.add(adaptivePanel11);

        adaptivePanel19.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        adaptiveLabel12.setText("Επαλήθευση Κωδικού ");
        adaptivePanel19.add(adaptiveLabel12);

        profileDataPanel.add(adaptivePanel19);

        adaptivePanel12.setLayout(new javax.swing.BoxLayout(adaptivePanel12, javax.swing.BoxLayout.LINE_AXIS));

        adaptiveTextField12.setText("**********");
        adaptivePanel12.add(adaptiveTextField12);

        profileDataPanel.add(adaptivePanel12);

        adaptivePanel37.add(profileDataPanel);

        contentPanel.add(adaptivePanel37, java.awt.BorderLayout.CENTER);

        buttonData.setLayout(new javax.swing.BoxLayout(buttonData, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout adaptivePanel34Layout = new javax.swing.GroupLayout(adaptivePanel34);
        adaptivePanel34.setLayout(adaptivePanel34Layout);
        adaptivePanel34Layout.setHorizontalGroup(
            adaptivePanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );
        adaptivePanel34Layout.setVerticalGroup(
            adaptivePanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        buttonData.add(adaptivePanel34);

        acceptanceButton.setText("Αποθήκευση");
        acceptanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptanceButtonActionPerformed(evt);
            }
        });
        buttonData.add(acceptanceButton);

        adaptivePanel35.setMaximumSize(new java.awt.Dimension(30, 30));
        adaptivePanel35.setMinimumSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout adaptivePanel35Layout = new javax.swing.GroupLayout(adaptivePanel35);
        adaptivePanel35.setLayout(adaptivePanel35Layout);
        adaptivePanel35Layout.setHorizontalGroup(
            adaptivePanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        adaptivePanel35Layout.setVerticalGroup(
            adaptivePanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        buttonData.add(adaptivePanel35);

        cancelButton.setText("Ακύρωση");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        buttonData.add(cancelButton);

        javax.swing.GroupLayout adaptivePanel36Layout = new javax.swing.GroupLayout(adaptivePanel36);
        adaptivePanel36.setLayout(adaptivePanel36Layout);
        adaptivePanel36Layout.setHorizontalGroup(
            adaptivePanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );
        adaptivePanel36Layout.setVerticalGroup(
            adaptivePanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        buttonData.add(adaptivePanel36);

        contentPanel.add(buttonData, java.awt.BorderLayout.SOUTH);

        jScrollPane1.setViewportView(contentPanel);

        add(jScrollPane1, java.awt.BorderLayout.EAST);
    }// </editor-fold>//GEN-END:initComponents

	private void adaptiveButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton3ActionPerformed

// TODO add your handling code here:}//GEN-LAST:event_adaptiveButton3ActionPerformed
	}
		private void adaptiveTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveTextField2ActionPerformed
		}
// TODO add your handling code here:}//GEN-LAST:event_adaptiveTextField2ActionPerformed

		private void adaptiveTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveTextField3ActionPerformed
		 }
// TODO add your handling code here:}//GEN-LAST:event_adaptiveTextField3ActionPerformed

		private void adaptiveComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveComboBox8ActionPerformed
		}
// TODO add your handling code here:}//GEN-LAST:event_adaptiveComboBox8ActionPerformed

		private void adaptiveTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveTextField11ActionPerformed
		}
		// TODO add your handling code here:}//GEN-LAST:event_adaptiveTextField11ActionPerformed

		private void acceptanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptanceButtonActionPerformed

	}//GEN-LAST:event_acceptanceButtonActionPerformed

	private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed

	}//GEN-LAST:event_cancelButtonActionPerformed

	private void offlineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offlineButtonActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_offlineButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.button.AdaptiveButton acceptanceButton;
    private widgets.button.AdaptiveButton adaptiveButton3;
    private widgets.combobox.AdaptiveComboBox adaptiveComboBox1;
    private widgets.combobox.AdaptiveComboBox adaptiveComboBox2;
    private widgets.combobox.AdaptiveComboBox adaptiveComboBox3;
    private widgets.combobox.AdaptiveComboBox adaptiveComboBox4;
    private widgets.combobox.AdaptiveComboBox adaptiveComboBox5;
    private widgets.combobox.AdaptiveComboBox adaptiveComboBox8;
    private widgets.label.AdaptiveLabel adaptiveLabel1;
    private widgets.label.AdaptiveLabel adaptiveLabel10;
    private widgets.label.AdaptiveLabel adaptiveLabel11;
    private widgets.label.AdaptiveLabel adaptiveLabel12;
    private widgets.label.AdaptiveLabel adaptiveLabel13;
    private widgets.label.AdaptiveLabel adaptiveLabel14;
    private widgets.label.AdaptiveLabel adaptiveLabel15;
    private widgets.label.AdaptiveLabel adaptiveLabel19;
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
    private widgets.panel.AdaptivePanel adaptivePanel16;
    private widgets.panel.AdaptivePanel adaptivePanel17;
    private widgets.panel.AdaptivePanel adaptivePanel18;
    private widgets.panel.AdaptivePanel adaptivePanel19;
    private widgets.panel.AdaptivePanel adaptivePanel2;
    private widgets.panel.AdaptivePanel adaptivePanel20;
    private widgets.panel.AdaptivePanel adaptivePanel21;
    private widgets.panel.AdaptivePanel adaptivePanel22;
    private widgets.panel.AdaptivePanel adaptivePanel23;
    private widgets.panel.AdaptivePanel adaptivePanel24;
    private widgets.panel.AdaptivePanel adaptivePanel25;
    private widgets.panel.AdaptivePanel adaptivePanel26;
    private widgets.panel.AdaptivePanel adaptivePanel27;
    private widgets.panel.AdaptivePanel adaptivePanel28;
    private widgets.panel.AdaptivePanel adaptivePanel29;
    private widgets.panel.AdaptivePanel adaptivePanel3;
    private widgets.panel.AdaptivePanel adaptivePanel30;
    private widgets.panel.AdaptivePanel adaptivePanel31;
    private widgets.panel.AdaptivePanel adaptivePanel32;
    private widgets.panel.AdaptivePanel adaptivePanel34;
    private widgets.panel.AdaptivePanel adaptivePanel35;
    private widgets.panel.AdaptivePanel adaptivePanel36;
    private widgets.panel.AdaptivePanel adaptivePanel37;
    private widgets.panel.AdaptivePanel adaptivePanel38;
    private widgets.panel.AdaptivePanel adaptivePanel4;
    private widgets.panel.AdaptivePanel adaptivePanel5;
    private widgets.panel.AdaptivePanel adaptivePanel6;
    private widgets.panel.AdaptivePanel adaptivePanel7;
    private widgets.panel.AdaptivePanel adaptivePanel8;
    private widgets.panel.AdaptivePanel adaptivePanel9;
    private widgets.textfield.AdaptiveTextField adaptiveTextField1;
    private widgets.textfield.AdaptiveTextField adaptiveTextField11;
    private widgets.textfield.AdaptiveTextField adaptiveTextField12;
    private widgets.textfield.AdaptiveTextField adaptiveTextField13;
    private widgets.textfield.AdaptiveTextField adaptiveTextField2;
    private widgets.textfield.AdaptiveTextField adaptiveTextField3;
    private widgets.textfield.AdaptiveTextField adaptiveTextField7;
    private widgets.textfield.AdaptiveTextField adaptiveTextField9;
    private widgets.button.AdaptiveButton awayButton;
    private widgets.button.AdaptiveButton busyButton;
    private widgets.panel.AdaptivePanel buttonData;
    private widgets.button.AdaptiveButton cancelButton;
    private widgets.panel.AdaptivePanel contentPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private widgets.button.AdaptiveButton offlineButton;
    private widgets.button.AdaptiveButton onlineButton;
    private widgets.panel.AdaptivePanel profileDataPanel;
    private widgets.panel.AdaptivePanel profileImagePanel;
    // End of variables declaration//GEN-END:variables
}
