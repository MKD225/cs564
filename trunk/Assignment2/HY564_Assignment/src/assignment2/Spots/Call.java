/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Call.java
 *
 * Created on 29 Νοε 2011, 1:00:09 πμ
 */
package assignment2.Spots;

import Utility.Utility;
import assignment2.VideoChat;
import java.awt.Dimension;
import java.awt.FlowLayout;
import utilities.Adaptation;
import utilities.DMSLConnector;

/**
 *
 * @author koutsop
 */
public class Call extends javax.swing.JPanel {

	/** Creates new form Call */
	public Call() {
        initComponents();
        Adaptation.automaticallySetRuntime(this);
        Adaptation.automaticallyAdapt(this);
        
              
		int size = Integer.parseInt(DMSLConnector.getInstance().getClient(false).Evaluate("sendVideoImagePanel"));
        Utility.SetJComponentSize(marigiannaPanel, size, size);
        VideoChat chat   = new VideoChat();
		((FlowLayout)chat.getButtonsPanel().getLayout()).setAlignment(FlowLayout.RIGHT);
        chat.ShowSwapButton(false);
        chat.ShowFullScreenButton(false);
        chat.setVisible(true);
        chatPanel.add(chat);  
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        callPanel = new widgets.panel.AdaptivePanel();
        gapPanel = new widgets.panel.AdaptivePanel();
        marigiannaPanel = new widgets.panel.AdaptivePanel();
        adaptivePanel1 = new widgets.panel.AdaptivePanel();
        chatPanel = new widgets.panel.AdaptivePanel();

        setLayout(new java.awt.GridLayout(3, 1, 0, 10));

        callPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        callPanel.setLayout(new java.awt.BorderLayout());

        gapPanel.setLayout(new javax.swing.BoxLayout(gapPanel, javax.swing.BoxLayout.LINE_AXIS));
        callPanel.add(gapPanel, java.awt.BorderLayout.CENTER);

        marigiannaPanel.setFunction("marigiannaImg");
        marigiannaPanel.setName("Panel.Content.MarigiannaImage"); // NOI18N

        javax.swing.GroupLayout marigiannaPanelLayout = new javax.swing.GroupLayout(marigiannaPanel);
        marigiannaPanel.setLayout(marigiannaPanelLayout);
        marigiannaPanelLayout.setHorizontalGroup(
            marigiannaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        marigiannaPanelLayout.setVerticalGroup(
            marigiannaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 93, Short.MAX_VALUE)
        );

        callPanel.add(marigiannaPanel, java.awt.BorderLayout.EAST);

        add(callPanel);

        javax.swing.GroupLayout adaptivePanel1Layout = new javax.swing.GroupLayout(adaptivePanel1);
        adaptivePanel1.setLayout(adaptivePanel1Layout);
        adaptivePanel1Layout.setHorizontalGroup(
            adaptivePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        adaptivePanel1Layout.setVerticalGroup(
            adaptivePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 93, Short.MAX_VALUE)
        );

        add(adaptivePanel1);

        chatPanel.setLayout(new javax.swing.BoxLayout(chatPanel, javax.swing.BoxLayout.LINE_AXIS));
        add(chatPanel);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.panel.AdaptivePanel adaptivePanel1;
    private widgets.panel.AdaptivePanel callPanel;
    private widgets.panel.AdaptivePanel chatPanel;
    private widgets.panel.AdaptivePanel gapPanel;
    private widgets.panel.AdaptivePanel marigiannaPanel;
    // End of variables declaration//GEN-END:variables
}
