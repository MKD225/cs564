/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AddaptableSettingsView.java
 *
 * Created on 1 Δεκ 2011, 3:21:43 πμ
 */
package AdaptableWindows;

import java.awt.CardLayout;
import javax.swing.JPanel;
import utilities.Adaptation;
import utilities.DMSLConnector;

/**
 *
 * @author koutsop
 */
public class AddaptableSettingsView extends javax.swing.JPanel {
	private final String viewA = "CommonSettings";
	private final String viewB = "InstabilitySettings";
	JPanel p = new JPanel(new CardLayout());
	
	/** Creates new form AddaptableSettingsView */
	public AddaptableSettingsView(JPanel commonSettignsView, JPanel instabilitySettingsView) {
		initComponents();
        
		p.add(commonSettignsView, viewA);
        p.add(instabilitySettingsView, viewB);
        this.add(p);

        CardLayout cl = (CardLayout)(p.getLayout());
        String pid = DMSLConnector.getInstance().getClient(false).Evaluate("SettingsView");
        System.out.println("Setings View:" + pid);
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
