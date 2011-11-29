/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AccessibleIM.java
 *
 * Created on 25 Νοε 2011, 12:23:30 μμ
 */
package assignment2.Instability;

//import assignment2.NoDisability.AddContact;
import AdaptableWindows.AdaptableIMView;
import assignment2.AdaptableSettingsView;
import assignment2.Exit;
import javax.swing.JPanel;
import utilities.Adaptation;

/**
 *
 * @author koutsop
 */
public class AccessibleIM1 extends javax.swing.JPanel {

    /** Creates new form AccessibleIM */
    public AccessibleIM1() {
        initComponents();
        Adaptation.automaticallySetRuntime(this);
        Adaptation.automaticallyAdapt(this);
        imButton.setVisible(false);
       // showPanel(new AdaptableIMView((menuPanel.getPreferredSize())));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanel = new widgets.panel.AdaptivePanel();
        imButton = new widgets.button.MainMenuButton();
        settingsButton = new widgets.button.MainMenuButton();
        exitButton = new widgets.button.MainMenuButton();
        adaptiveButton1 = new widgets.button.AdaptiveButton();
        contentsPanel = new widgets.panel.AdaptivePanel();
        virtualKeyboard = new widgets.panel.AdaptivePanel();
        adaptiveButton2 = new widgets.button.AdaptiveButton();
        adaptiveButton3 = new widgets.button.AdaptiveButton();
        adaptiveButton4 = new widgets.button.AdaptiveButton();
        adaptiveButton5 = new widgets.button.AdaptiveButton();
        adaptiveButton6 = new widgets.button.AdaptiveButton();
        adaptiveButton7 = new widgets.button.AdaptiveButton();
        adaptiveButton8 = new widgets.button.AdaptiveButton();
        adaptiveButton9 = new widgets.button.AdaptiveButton();
        adaptiveButton10 = new widgets.button.AdaptiveButton();
        adaptiveButton11 = new widgets.button.AdaptiveButton();
        adaptiveButton12 = new widgets.button.AdaptiveButton();
        adaptiveButton13 = new widgets.button.AdaptiveButton();
        adaptiveButton14 = new widgets.button.AdaptiveButton();
        adaptiveButton15 = new widgets.button.AdaptiveButton();
        adaptiveButton16 = new widgets.button.AdaptiveButton();
        adaptiveButton17 = new widgets.button.AdaptiveButton();
        adaptiveButton18 = new widgets.button.AdaptiveButton();
        adaptiveButton19 = new widgets.button.AdaptiveButton();
        adaptiveButton20 = new widgets.button.AdaptiveButton();
        adaptiveButton21 = new widgets.button.AdaptiveButton();
        adaptiveButton22 = new widgets.button.AdaptiveButton();
        adaptiveButton23 = new widgets.button.AdaptiveButton();
        adaptiveButton24 = new widgets.button.AdaptiveButton();
        adaptiveButton25 = new widgets.button.AdaptiveButton();
        adaptiveButton26 = new widgets.button.AdaptiveButton();
        adaptiveButton27 = new widgets.button.AdaptiveButton();
        adaptiveButton28 = new widgets.button.AdaptiveButton();
        adaptiveButton29 = new widgets.button.AdaptiveButton();
        adaptiveButton30 = new widgets.button.AdaptiveButton();
        adaptiveButton31 = new widgets.button.AdaptiveButton();
        adaptiveButton32 = new widgets.button.AdaptiveButton();
        adaptiveButton33 = new widgets.button.AdaptiveButton();
        adaptiveButton34 = new widgets.button.AdaptiveButton();
        adaptiveButton35 = new widgets.button.AdaptiveButton();
        adaptiveButton36 = new widgets.button.AdaptiveButton();
        adaptiveButton37 = new widgets.button.AdaptiveButton();
        adaptiveButton38 = new widgets.button.AdaptiveButton();
        adaptiveButton39 = new widgets.button.AdaptiveButton();
        adaptiveButton40 = new widgets.button.AdaptiveButton();
        adaptiveButton41 = new widgets.button.AdaptiveButton();

        setMaximumSize(new java.awt.Dimension(1000, 688));
        setMinimumSize(new java.awt.Dimension(1000, 688));
        setPreferredSize(new java.awt.Dimension(1000, 688));
        setLayout(new java.awt.BorderLayout());

        menuPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        imButton.setText("Πίσω σε ...");
        imButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imButtonActionPerformed(evt);
            }
        });
        menuPanel.add(imButton);

        settingsButton.setText("Ρυθμίσεις");
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });
        menuPanel.add(settingsButton);

        exitButton.setText("Έξοδος");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        menuPanel.add(exitButton);

        adaptiveButton1.setText("Αναζήτηση επαφής");
        adaptiveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaptiveButton1ActionPerformed(evt);
            }
        });
        menuPanel.add(adaptiveButton1);

        add(menuPanel, java.awt.BorderLayout.NORTH);

        contentsPanel.setLayout(new javax.swing.BoxLayout(contentsPanel, javax.swing.BoxLayout.LINE_AXIS));
        add(contentsPanel, java.awt.BorderLayout.CENTER);

        virtualKeyboard.setLayout(new java.awt.GridLayout(4, 10));

        adaptiveButton2.setFunction("VirtualKeyboardButton");
        adaptiveButton2.setText("1");
        virtualKeyboard.add(adaptiveButton2);

        adaptiveButton3.setFunction("VirtualKeyboardButton");
        adaptiveButton3.setText("2");
        virtualKeyboard.add(adaptiveButton3);

        adaptiveButton4.setFunction("VirtualKeyboardButton");
        adaptiveButton4.setText("3");
        virtualKeyboard.add(adaptiveButton4);

        adaptiveButton5.setFunction("VirtualKeyboardButton");
        adaptiveButton5.setText("4");
        virtualKeyboard.add(adaptiveButton5);

        adaptiveButton6.setFunction("VirtualKeyboardButton");
        adaptiveButton6.setText("5");
        virtualKeyboard.add(adaptiveButton6);

        adaptiveButton7.setFunction("VirtualKeyboardButton");
        adaptiveButton7.setText("6");
        virtualKeyboard.add(adaptiveButton7);

        adaptiveButton8.setFunction("VirtualKeyboardButton");
        adaptiveButton8.setText("7");
        virtualKeyboard.add(adaptiveButton8);

        adaptiveButton9.setFunction("VirtualKeyboardButton");
        adaptiveButton9.setText("8");
        virtualKeyboard.add(adaptiveButton9);

        adaptiveButton10.setFunction("VirtualKeyboardButton");
        adaptiveButton10.setText("9");
        virtualKeyboard.add(adaptiveButton10);

        adaptiveButton11.setFunction("VirtualKeyboardButton");
        adaptiveButton11.setText("0");
        virtualKeyboard.add(adaptiveButton11);

        adaptiveButton12.setFunction("VirtualKeyboardButton");
        adaptiveButton12.setText("Q");
        virtualKeyboard.add(adaptiveButton12);

        adaptiveButton13.setFunction("VirtualKeyboardButton");
        adaptiveButton13.setText("W");
        virtualKeyboard.add(adaptiveButton13);

        adaptiveButton14.setFunction("VirtualKeyboardButton");
        adaptiveButton14.setText("E");
        virtualKeyboard.add(adaptiveButton14);

        adaptiveButton15.setFunction("VirtualKeyboardButton");
        adaptiveButton15.setText("R");
        virtualKeyboard.add(adaptiveButton15);

        adaptiveButton16.setFunction("VirtualKeyboardButton");
        adaptiveButton16.setText("T");
        virtualKeyboard.add(adaptiveButton16);

        adaptiveButton17.setFunction("VirtualKeyboardButton");
        adaptiveButton17.setText("Y");
        virtualKeyboard.add(adaptiveButton17);

        adaptiveButton18.setFunction("VirtualKeyboardButton");
        adaptiveButton18.setText("U");
        virtualKeyboard.add(adaptiveButton18);

        adaptiveButton19.setFunction("VirtualKeyboardButton");
        adaptiveButton19.setText("I");
        virtualKeyboard.add(adaptiveButton19);

        adaptiveButton20.setFunction("VirtualKeyboardButton");
        adaptiveButton20.setText("O");
        virtualKeyboard.add(adaptiveButton20);

        adaptiveButton21.setFunction("VirtualKeyboardButtonull");
        adaptiveButton21.setText("P");
        virtualKeyboard.add(adaptiveButton21);

        adaptiveButton22.setFunction("VirtualKeyboardButton");
        adaptiveButton22.setText("A");
        virtualKeyboard.add(adaptiveButton22);

        adaptiveButton23.setFunction("VirtualKeyboardButton");
        adaptiveButton23.setText("S");
        virtualKeyboard.add(adaptiveButton23);

        adaptiveButton24.setFunction("VirtualKeyboardButton");
        adaptiveButton24.setText("D");
        virtualKeyboard.add(adaptiveButton24);

        adaptiveButton25.setFunction("VirtualKeyboardButton");
        adaptiveButton25.setText("F");
        virtualKeyboard.add(adaptiveButton25);

        adaptiveButton26.setFunction("VirtualKeyboardButton");
        adaptiveButton26.setText("G");
        virtualKeyboard.add(adaptiveButton26);

        adaptiveButton27.setFunction("VirtualKeyboardButton");
        adaptiveButton27.setText("H");
        virtualKeyboard.add(adaptiveButton27);

        adaptiveButton28.setFunction("VirtualKeyboardButton");
        adaptiveButton28.setText("J");
        virtualKeyboard.add(adaptiveButton28);

        adaptiveButton29.setFunction("VirtualKeyboardButton");
        adaptiveButton29.setText("K");
        virtualKeyboard.add(adaptiveButton29);

        adaptiveButton30.setFunction("VirtualKeyboardButton");
        adaptiveButton30.setText("L");
        virtualKeyboard.add(adaptiveButton30);

        adaptiveButton31.setFunction("VirtualKeyboardButton");
        adaptiveButton31.setText("ENTER");
        virtualKeyboard.add(adaptiveButton31);

        adaptiveButton32.setFunction("VirtualKeyboardButton");
        adaptiveButton32.setText("Z");
        virtualKeyboard.add(adaptiveButton32);

        adaptiveButton33.setFunction("VirtualKeyboardButton");
        adaptiveButton33.setText("X");
        virtualKeyboard.add(adaptiveButton33);

        adaptiveButton34.setFunction("VirtualKeyboardButton");
        adaptiveButton34.setText("C");
        virtualKeyboard.add(adaptiveButton34);

        adaptiveButton35.setFunction("VirtualKeyboardButton");
        adaptiveButton35.setText("V");
        virtualKeyboard.add(adaptiveButton35);

        adaptiveButton36.setFunction("VirtualKeyboardButton");
        adaptiveButton36.setText("B");
        virtualKeyboard.add(adaptiveButton36);

        adaptiveButton37.setFunction("VirtualKeyboardButton");
        adaptiveButton37.setText("N");
        virtualKeyboard.add(adaptiveButton37);

        adaptiveButton38.setFunction("VirtualKeyboardButton");
        adaptiveButton38.setText("M");
        virtualKeyboard.add(adaptiveButton38);

        adaptiveButton39.setFunction("VirtualKeyboardButton");
        adaptiveButton39.setText("Left");
        virtualKeyboard.add(adaptiveButton39);

        adaptiveButton40.setFunction("VirtualKeyboardButton");
        adaptiveButton40.setText("Right");
        virtualKeyboard.add(adaptiveButton40);

        adaptiveButton41.setFunction("VirtualKeyboardButton");
        adaptiveButton41.setText("space");
        virtualKeyboard.add(adaptiveButton41);

        add(virtualKeyboard, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents

    private void showPanel(JPanel p) {
        contentsPanel.removeAll();
        p.setVisible(true);
        contentsPanel.add(p);
        contentsPanel.repaint();
        contentsPanel.validate();  
    }
    
    private void imButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imButtonActionPerformed
        imButton.setVisible(false);
//        showPanel(new AdaptableIMView(menuPanel.getPreferredSize()));
    }//GEN-LAST:event_imButtonActionPerformed

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        imButton.setVisible(true);
        showPanel(new AdaptableSettingsView());
    }//GEN-LAST:event_settingsButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        imButton.setVisible(true);
        showPanel(new Exit());        
    }//GEN-LAST:event_exitButtonActionPerformed

private void adaptiveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaptiveButton1ActionPerformed
	imButton.setVisible(true);
	//showPanel(new AddContact());
}//GEN-LAST:event_adaptiveButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.button.AdaptiveButton adaptiveButton1;
    private widgets.button.AdaptiveButton adaptiveButton10;
    private widgets.button.AdaptiveButton adaptiveButton11;
    private widgets.button.AdaptiveButton adaptiveButton12;
    private widgets.button.AdaptiveButton adaptiveButton13;
    private widgets.button.AdaptiveButton adaptiveButton14;
    private widgets.button.AdaptiveButton adaptiveButton15;
    private widgets.button.AdaptiveButton adaptiveButton16;
    private widgets.button.AdaptiveButton adaptiveButton17;
    private widgets.button.AdaptiveButton adaptiveButton18;
    private widgets.button.AdaptiveButton adaptiveButton19;
    private widgets.button.AdaptiveButton adaptiveButton2;
    private widgets.button.AdaptiveButton adaptiveButton20;
    private widgets.button.AdaptiveButton adaptiveButton21;
    private widgets.button.AdaptiveButton adaptiveButton22;
    private widgets.button.AdaptiveButton adaptiveButton23;
    private widgets.button.AdaptiveButton adaptiveButton24;
    private widgets.button.AdaptiveButton adaptiveButton25;
    private widgets.button.AdaptiveButton adaptiveButton26;
    private widgets.button.AdaptiveButton adaptiveButton27;
    private widgets.button.AdaptiveButton adaptiveButton28;
    private widgets.button.AdaptiveButton adaptiveButton29;
    private widgets.button.AdaptiveButton adaptiveButton3;
    private widgets.button.AdaptiveButton adaptiveButton30;
    private widgets.button.AdaptiveButton adaptiveButton31;
    private widgets.button.AdaptiveButton adaptiveButton32;
    private widgets.button.AdaptiveButton adaptiveButton33;
    private widgets.button.AdaptiveButton adaptiveButton34;
    private widgets.button.AdaptiveButton adaptiveButton35;
    private widgets.button.AdaptiveButton adaptiveButton36;
    private widgets.button.AdaptiveButton adaptiveButton37;
    private widgets.button.AdaptiveButton adaptiveButton38;
    private widgets.button.AdaptiveButton adaptiveButton39;
    private widgets.button.AdaptiveButton adaptiveButton4;
    private widgets.button.AdaptiveButton adaptiveButton40;
    private widgets.button.AdaptiveButton adaptiveButton41;
    private widgets.button.AdaptiveButton adaptiveButton5;
    private widgets.button.AdaptiveButton adaptiveButton6;
    private widgets.button.AdaptiveButton adaptiveButton7;
    private widgets.button.AdaptiveButton adaptiveButton8;
    private widgets.button.AdaptiveButton adaptiveButton9;
    private widgets.panel.AdaptivePanel contentsPanel;
    private widgets.button.MainMenuButton exitButton;
    private widgets.button.MainMenuButton imButton;
    private widgets.panel.AdaptivePanel menuPanel;
    private widgets.button.MainMenuButton settingsButton;
    private widgets.panel.AdaptivePanel virtualKeyboard;
    // End of variables declaration//GEN-END:variables
}
