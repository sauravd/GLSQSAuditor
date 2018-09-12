/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sauravdahal.moderate;

import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.windows.WindowManager;
import org.openide.awt.ActionRegistration;
/**
 * Top component which displays something.
 */
@ConvertAsProperties(
        dtd = "-//com.sauravdahal.moderate//Moderate//EN",
        autostore = false
)
@TopComponent.Description(
        preferredID = "ModerateTopComponent",
        //iconBase="SET/PATH/TO/ICON/HERE", 
        persistenceType = TopComponent.PERSISTENCE_ALWAYS
)
@TopComponent.Registration(roles={"moderate"},mode = "editor", openAtStartup = true)
@ActionID(category = "Predict", id = "com.sauravdahal.moderate.ModerateTopComponent")
//@ActionReference(path = "Menu/Window" /*, position = 333 */)
//@TopComponent.OpenActionRegistration(
//        displayName = "#CTL_ModerateAction",
//        preferredID = "ModerateTopComponent"
//)
@ActionRegistration(displayName = "#CTL_ModerateTopComponent")
@ActionReference(path = "Menu/Window",position=250)
@Messages({
    "CTL_ModerateAction=Moderate",
    "CTL_ModerateTopComponent=Moderate",
    "HINT_ModerateTopComponent=This is a Moderate window"
})
public final class ModerateTopComponent extends TopComponent implements ActionListener{

    public ModerateTopComponent() {
        initComponents();
        setName(Bundle.CTL_ModerateTopComponent());
        setToolTipText(Bundle.HINT_ModerateTopComponent());

    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        WindowManager.getDefault().setRole("moderate");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }
}
