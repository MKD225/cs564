/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VideoChat.java
 *
 * Created on 26 Νοε 2011, 4:12:05 μμ
 */
package assignment2;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import utilities.Adaptation;
import utilities.DMSLConnector;

/**
 *
 * @author koutsop
 */
public class VideoChat extends javax.swing.JPanel {

    /** Creates new form VideoChat */
    public VideoChat(Dimension parentSize) {
        initComponents();
        
        Adaptation.automaticallySetRuntime(this);
        Adaptation.automaticallyAdapt(this);
        Utility.SetJComponentSize(this, parentSize);
        
        String path = DMSLConnector.getInstance().getClient(false).Evaluate("SendFileButton");
        sendFileButton.setIcon(new ImageIcon(getClass().getResource(path)));
        
        path = DMSLConnector.getInstance().getClient(false).Evaluate("MuteButton");
        muteButton.setIcon(new ImageIcon(getClass().getResource(path)));
        
        path = DMSLConnector.getInstance().getClient(false).Evaluate("VolumeUpButton");
        volumeUpButton.setIcon(new ImageIcon(getClass().getResource(path)));
        
        path = DMSLConnector.getInstance().getClient(false).Evaluate("VolumeDownButton");
        volumeDownButton.setIcon(new ImageIcon(getClass().getResource(path)));
        
        path = DMSLConnector.getInstance().getClient(false).Evaluate("FullScreenButton");
        fullScreenButton.setIcon(new ImageIcon(getClass().getResource(path)));
        
        path = DMSLConnector.getInstance().getClient(false).Evaluate("SwapButton");
        swapButton.setIcon(new ImageIcon(getClass().getResource(path)));
        
        path = DMSLConnector.getInstance().getClient(false).Evaluate("AddButton");
        addButton.setIcon(new ImageIcon(getClass().getResource(path)));  
        
        path = DMSLConnector.getInstance().getClient(false).Evaluate("CloseButton");
        closeButton.setIcon(new ImageIcon(getClass().getResource(path)));        
    }
    
    public void ShowSwapButton (boolean show) {
        swapButton.setVisible(show);
    }
    
    public void ShowFullScreenButton (boolean show) {
        fullScreenButton.setVisible(show);
    }    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        receivePanel = new widgets.panel.AdaptivePanel();
        buttonsPanel = new widgets.panel.AdaptivePanel();
        sendFileButton = new widgets.button.AdaptiveButton();
        muteButton = new widgets.button.AdaptiveButton();
        volumeUpButton = new widgets.button.AdaptiveButton();
        volumeDownButton = new widgets.button.AdaptiveButton();
        fullScreenButton = new widgets.button.AdaptiveButton();
        swapButton = new widgets.button.AdaptiveButton();
        addButton = new widgets.button.AdaptiveButton();
        closeButton = new widgets.button.AdaptiveButton();
        adaptivePanel1 = new widgets.panel.AdaptivePanel();
        receiveScrolPane = new javax.swing.JScrollPane();
        adaptiveTextBox2 = new widgets.textbox.AdaptiveTextBox();
        sendPanel = new widgets.panel.AdaptivePanel();
        sendButonPanel = new widgets.panel.AdaptivePanel();
        sendButton = new widgets.button.AdaptiveButton();
        adaptivePanel2 = new widgets.panel.AdaptivePanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        adaptiveTextBox1 = new widgets.textbox.AdaptiveTextBox();

        setLayout(new java.awt.BorderLayout(0, 10));

        receivePanel.setLayout(new java.awt.BorderLayout(0, 10));

        sendFileButton.setFunction("ChatButton");
        buttonsPanel.add(sendFileButton);

        muteButton.setFunction("ChatButton");
        buttonsPanel.add(muteButton);

        volumeUpButton.setFunction("ChatButton");
        buttonsPanel.add(volumeUpButton);

        volumeDownButton.setFunction("ChatButton");
        buttonsPanel.add(volumeDownButton);

        fullScreenButton.setFunction("ChatButton");
        buttonsPanel.add(fullScreenButton);

        swapButton.setFunction("ChatButton");
        buttonsPanel.add(swapButton);

        addButton.setFunction("ChatButton");
        buttonsPanel.add(addButton);

        closeButton.setFunction("ChatButton");
        buttonsPanel.add(closeButton);

        receivePanel.add(buttonsPanel, java.awt.BorderLayout.NORTH);

        adaptivePanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adaptivePanel1.setLayout(new javax.swing.BoxLayout(adaptivePanel1, javax.swing.BoxLayout.LINE_AXIS));

        adaptiveTextBox2.setColumns(20);
        adaptiveTextBox2.setRows(5);
        receiveScrolPane.setViewportView(adaptiveTextBox2);

        adaptivePanel1.add(receiveScrolPane);

        receivePanel.add(adaptivePanel1, java.awt.BorderLayout.CENTER);

        add(receivePanel, java.awt.BorderLayout.CENTER);

        sendPanel.setLayout(new java.awt.BorderLayout(10, 0));

        sendButonPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        sendButton.setFunction("ChatButton");
        sendButton.setText("Send");
        sendButonPanel.add(sendButton);

        sendPanel.add(sendButonPanel, java.awt.BorderLayout.LINE_END);

        adaptivePanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adaptivePanel2.setLayout(new javax.swing.BoxLayout(adaptivePanel2, javax.swing.BoxLayout.LINE_AXIS));

        adaptiveTextBox1.setColumns(20);
        adaptiveTextBox1.setRows(5);
        jScrollPane1.setViewportView(adaptiveTextBox1);

        adaptivePanel2.add(jScrollPane1);

        sendPanel.add(adaptivePanel2, java.awt.BorderLayout.CENTER);

        add(sendPanel, java.awt.BorderLayout.SOUTH);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widgets.panel.AdaptivePanel adaptivePanel1;
    private widgets.panel.AdaptivePanel adaptivePanel2;
    private widgets.textbox.AdaptiveTextBox adaptiveTextBox1;
    private widgets.textbox.AdaptiveTextBox adaptiveTextBox2;
    private widgets.button.AdaptiveButton addButton;
    private widgets.panel.AdaptivePanel buttonsPanel;
    private widgets.button.AdaptiveButton closeButton;
    private widgets.button.AdaptiveButton fullScreenButton;
    private javax.swing.JScrollPane jScrollPane1;
    private widgets.button.AdaptiveButton muteButton;
    private widgets.panel.AdaptivePanel receivePanel;
    private javax.swing.JScrollPane receiveScrolPane;
    private widgets.panel.AdaptivePanel sendButonPanel;
    private widgets.button.AdaptiveButton sendButton;
    private widgets.button.AdaptiveButton sendFileButton;
    private widgets.panel.AdaptivePanel sendPanel;
    private widgets.button.AdaptiveButton swapButton;
    private widgets.button.AdaptiveButton volumeDownButton;
    private widgets.button.AdaptiveButton volumeUpButton;
    // End of variables declaration//GEN-END:variables
}