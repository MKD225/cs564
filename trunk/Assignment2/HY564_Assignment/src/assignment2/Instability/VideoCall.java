/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VideoCall.java
 *
 * Created on 29 Νοε 2011, 12:49:20 πμ
 */
package assignment2.Instability;

import Utility.Utility;
import assignment2.VideoChat;
import java.awt.Dimension;
import utilities.Adaptation;
import utilities.DMSLConnector;

/**
 *
 * @author koutsop
 */
public class VideoCall extends javax.swing.JPanel {

    /** Creates new form VideoCall */
    public VideoCall(Dimension parentSize) {
        initComponents();
        Adaptation.automaticallySetRuntime(this);
        Adaptation.automaticallyAdapt(this);
        
        Utility.SetJComponentSize(this, parentSize); 

        int size = Integer.parseInt(DMSLConnector.getInstance().getClient(false).Evaluate("sendVideoImagePanel"));
        Utility.SetJComponentSize(sendVideoImagePanel, size, size);
        
        int width   = parentSize.width;
        int height  = (parentSize.height/2) - 10; //10 Vertical Gap
        VideoChat chat   = new VideoChat(new Dimension(width, height));
        chat.setVisible(true);
        //chat.ShowVideoCallButton(false);
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

        videoPanel = new widgets.panel.AdaptivePanel();
        receiveVideoPanel = new widgets.panel.AdaptivePanel();
        sendVideoPanel = new widgets.panel.AdaptivePanel();
        adaptivePanel2 = new widgets.panel.AdaptivePanel();
        adaptivePanel1 = new widgets.panel.AdaptivePanel();
        sendVideoImagePanel = new widgets.panel.AdaptivePanel();
        westPanel = new widgets.panel.AdaptivePanel();
        chatPanel = new widgets.panel.AdaptivePanel();

        setLayout(new java.awt.GridLayout(2, 1));

        videoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        videoPanel.setLayout(new java.awt.BorderLayout());

        receiveVideoPanel.setLayout(new javax.swing.BoxLayout(receiveVideoPanel, javax.swing.BoxLayout.LINE_AXIS));
        videoPanel.add(receiveVideoPanel, java.awt.BorderLayout.CENTER);

        sendVideoPanel.setAlignmentY(0.0F);
        sendVideoPanel.setLayout(new java.awt.BorderLayout());

        adaptivePanel2.setLayout(new java.awt.GridLayout(2, 1, 0, 5));

        adaptivePanel1.setFunction("marigiannaImg");
        adaptivePanel1.setName("Panel.Content.MarigiannaImage"); // NOI18N

        javax.swing.GroupLayout adaptivePanel1Layout = new javax.swing.GroupLayout(adaptivePanel1);
        adaptivePanel1.setLayout(adaptivePanel1Layout);
        adaptivePanel1Layout.setHorizontalGroup(
            adaptivePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
        );
        adaptivePanel1Layout.setVerticalGroup(
            adaptivePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        adaptivePanel2.add(adaptivePanel1);

        sendVideoImagePanel.setFunction("koutsopImg");
        sendVideoImagePanel.setName("Panel.Content.KoutsopImage"); // NOI18N
        sendVideoImagePanel.setLayout(new javax.swing.BoxLayout(sendVideoImagePanel, javax.swing.BoxLayout.LINE_AXIS));
        adaptivePanel2.add(sendVideoImagePanel);

        sendVideoPanel.add(adaptivePanel2, java.awt.BorderLayout.CENTER);

        westPanel.setMaximumSize(new java.awt.Dimension(5, 32767));
        westPanel.setMinimumSize(new java.awt.Dimension(5, 100));
        westPanel.setPreferredSize(new java.awt.Dimension(5, 305));

        javax.swing.GroupLayout westPanelLayout = new javax.swing.GroupLayout(westPanel);
        westPanel.setLayout(westPanelLayout);
        westPanelLayout.setHorizontalGroup(
            westPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        westPanelLayout.setVerticalGroup(
            westPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        sendVideoPanel.add(westPanel, java.awt.BorderLayout.WEST);

        videoPanel.add(sendVideoPanel, java.awt.BorderLayout.EAST);

        add(videoPanel);
        add(chatPanel);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.panel.AdaptivePanel adaptivePanel1;
    private widgets.panel.AdaptivePanel adaptivePanel2;
    private widgets.panel.AdaptivePanel chatPanel;
    private widgets.panel.AdaptivePanel receiveVideoPanel;
    private widgets.panel.AdaptivePanel sendVideoImagePanel;
    private widgets.panel.AdaptivePanel sendVideoPanel;
    private widgets.panel.AdaptivePanel videoPanel;
    private widgets.panel.AdaptivePanel westPanel;
    // End of variables declaration//GEN-END:variables
}
