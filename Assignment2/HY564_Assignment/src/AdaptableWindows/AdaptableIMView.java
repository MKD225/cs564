/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AdaptableIMView.java
 *
 * Created on 23 Νοε 2011, 2:29:16 μμ
 */
package AdaptableWindows;

import assignment2.NoDisability.ChatMainView;
import demo.ViewB;
import java.awt.CardLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
import utilities.Adaptation;
import utilities.DMSLConnector;

/**
 *
 * @author koutsop
 */
public class AdaptableIMView extends javax.swing.JPanel {
    final static String viewB = "ViewB";
    JPanel p = new JPanel(new CardLayout());
    
    /** Creates new form AdaptableIMView */
    public AdaptableIMView(Dimension menuSize, JPanel parent) {
        initComponents();
        
        p.add(new ChatMainView(menuSize, parent), "ChatMainView");
        p.add(new ViewB(), viewB);
        this.add(p);

        CardLayout cl = (CardLayout)(p.getLayout());
        String pid = DMSLConnector.getInstance().getClient(false).Evaluate("MainIMPage");
        System.out.println("- View:" + pid);
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

        adaptationLogger1 = new utilities.AdaptationLogger();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private utilities.AdaptationLogger adaptationLogger1;
    // End of variables declaration//GEN-END:variables
}
