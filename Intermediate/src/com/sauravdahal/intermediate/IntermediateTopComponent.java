/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sauravdahal.intermediate;

import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.windows.WindowManager;


/**
 * Top component which displays something.
 */
@ConvertAsProperties(
        dtd = "-//com.sauravdahal.intermediate//Intermediate//EN",
        autostore = false
)
@TopComponent.Description(
        preferredID = "IntermediateTopComponent",
        //iconBase="SET/PATH/TO/ICON/HERE", 
        persistenceType = TopComponent.PERSISTENCE_ALWAYS
)
@TopComponent.Registration(roles={"intermediate"},mode = "editor", openAtStartup = true)
@ActionID(category = "Predict", id = "com.sauravdahal.intermediate.IntermediateTopComponent")
//@ActionReference(path = "Menu/Window" /*, position = 333 */)
//@TopComponent.OpenActionRegistration(
//        displayName = "#CTL_IntermediateAction",
//        preferredID = "IntermediateTopComponent"
//)
@ActionRegistration(displayName = "#CTL_IntermediateTopComponent")

@ActionReference(path = "Menu/Window", position = 250)

@Messages({
    "CTL_IntermediateAction=Intermediate",
    "CTL_IntermediateTopComponent=Intermediate",
    "HINT_IntermediateTopComponent=This is a Intermediate window"
})
public final class IntermediateTopComponent extends TopComponent implements ActionListener {

    public IntermediateTopComponent() {
        initComponents();
        setName(Bundle.CTL_IntermediateTopComponent());
        setToolTipText(Bundle.HINT_IntermediateTopComponent());

    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        WindowManager.getDefault().setRole("Intermediate");
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
