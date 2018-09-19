/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sauravdahal.kpiassessor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.WindowManager;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
        dtd = "-//com.sauravdahal.kpiassessor//KPIAssessor//EN",
        autostore = false
)
@TopComponent.Description(
        preferredID = "KPIAssessorTopComponent",
        //iconBase="SET/PATH/TO/ICON/HERE", 
        persistenceType = TopComponent.PERSISTENCE_ALWAYS
)
@TopComponent.Registration(roles={"kpiassessor"},mode = "editor", openAtStartup = true)
@ActionID(category = "Predict", id = "com.sauravdahal.kpiassessor.KPIAssessorTopComponent")
@ActionRegistration(displayName = "#CTL_KPIAssessorWindow")
@ActionReference(path = "Menu/Window", 
        position = 250)
//@TopComponent.OpenActionRegistration(
//        displayName = "#CTL_KPIAssessorAction",
//        preferredID = "KPIAssessorTopComponent"
//)

@Messages({"CTL_KPIAssessorWindow=Switch to KPI Assessor Window",
    "CTL_KPIAssessorAction=KPIAssessor",
    "CTL_KPIAssessorTopComponent=KPIAssessor Window",
    "HINT_KPIAssessorTopComponent=This is a KPIAssessor window"
})
public final class KPIAssessorTopComponent extends TopComponent implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e){
        WindowManager.getDefault().setRole("kpiassessor");
    }
    public KPIAssessorTopComponent() {
        initComponents();
        setName(Bundle.CTL_KPIAssessorTopComponent());
        setToolTipText(Bundle.HINT_KPIAssessorTopComponent());

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