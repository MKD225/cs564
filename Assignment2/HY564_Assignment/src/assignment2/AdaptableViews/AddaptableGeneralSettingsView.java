/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AddaptableGeneralSettingsView.java
 *
 * Created on 3 Δεκ 2011, 10:30:13 πμ
 */
package assignment2.AdaptableViews;

import java.awt.CardLayout;
import javax.swing.JPanel;
import utilities.Adaptation;
import utilities.DMSLConnector;

/**
 *
 * @author koutsop
 */
public class AddaptableGeneralSettingsView extends javax.swing.JPanel {
	private final String commonSettings			= "CommonSettings";
	private final String lowVision				= "LowVisionSettings";
	private final String instabilitySettings	= "InstabilitySettings";
	JPanel p = new JPanel(new CardLayout());
	
	/** Creates new form AddaptableGeneralSettingsView */
	public AddaptableGeneralSettingsView() {
		initComponents();
		initComponents();

		p.add(new assignment2.NoDisability.GeneralSettingsPanel(), commonSettings);
        p.add(new assignment2.LowVision.GeneralSettingsPanel(), lowVision);
		p.add(new assignment2.Instability.GeneralSettingsPanel(), instabilitySettings);
        this.add(p);

        CardLayout cl = (CardLayout)(p.getLayout());
        String pid = DMSLConnector.getInstance().getClient(false).Evaluate("SettingsView");
        System.out.println("General Setings View:>" + pid + "<");
        cl.show(p, pid);
        p.revalidate();
 	
        Adaptation.automaticallySetRuntime(this);
        Adaptation.automaticallyAdapt(this);
        this.updateUI();		
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}