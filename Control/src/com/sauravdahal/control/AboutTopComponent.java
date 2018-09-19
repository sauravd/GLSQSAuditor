/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sauravdahal.control;

import java.awt.Font;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
        dtd = "-//com.sauravdahal.control//About//EN",
        autostore = false
)
@TopComponent.Description(
        preferredID = "AboutTopComponent",
        //iconBase="SET/PATH/TO/ICON/HERE", 
        persistenceType = TopComponent.PERSISTENCE_ALWAYS
)
@TopComponent.Registration(mode = "editor", openAtStartup = true)
@ActionID(category = "Window", id = "com.sauravdahal.control.AboutTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_AboutAction",
        preferredID = "AboutTopComponent"
)
@Messages({
    "CTL_AboutAction=About",
    "CTL_AboutTopComponent=About",
    "HINT_AboutTopComponent=This is a About window"
})
public final class AboutTopComponent extends TopComponent {

    public AboutTopComponent() {
        initComponents();
        setName(Bundle.CTL_AboutTopComponent());
        setToolTipText(Bundle.HINT_AboutTopComponent());
        
         jLabel1.setFont(new java.awt.Font("Verdana", Font.LAYOUT_NO_LIMIT_CONTEXT, 12));
         jLabel2.setFont(new java.awt.Font("Verdana", Font.LAYOUT_NO_LIMIT_CONTEXT, 12));
         jLabel1.setText("<html><p>"
                 + "This software allows you to measure the Green Logistics performance in the following five areas:"
                + "<ol type = I>"
                 + "<li><b>Maintenance</b></li>"
                 + "<li><b>Yard Operations</li>"
               + "<li><b>Transport Operation</li></b>"
                + "<li><b>Procurement</li></b>"
                 + "<li><b>Organization Management</li></b>"
                 + "</ol>"
                 + "</p></html>");
         
         jLabel2.setText("<html>"
                 + "The software consists of three levels:"
                 + "<ul>"
                 + "<li><b>Intermediate</li></b>"
                 +  "<ul>"
                    + "<li><p>This is the first level in the Green Mark, which consists of 14 Key Performance Indicators (KPIs),<br>"
                    + "once you have all the required KPIs as listed in this module, you are eligible to go to the next level,<br>"
                    + "which is the <b>Moderate level<b>.</p></li>"
                    +"</ul>"                 
                 + "<li><b>Moderate</li></b>"
                 + "<ul>"
                 + "<li><p>This is the second level in the Green Mark, which consists of several Key Performance Indicators (KPIs),<br>"
                    + "categorized under three modules,"
                    +"<ul>"
                        + "<li><b>Yard Waste Management</b></li>"
                        + "<li><b>Transport Operation</b></li>"
                        + "<li><b>Maintenance</b></li>"
                        + "<li><b>Organization</b></li>"
                    + "</ul>"
                    + "once you have all the required KPIs in each of the above categories under the MOderate level,<br>"
                    + "you are eligible to go to the next level,which is the <b>High level<b>.</p></li>"
                    +"</ul>" 
                 + "<li><b>High</li></b>"
                + "<ul>"
                 + "<li><p>This is the last level in the Green Mark, which consists of several Key Performance Indicators (KPIs),<br>"
                    + "categorized under three modules,"
                    +"<ul>"
                        + "<li><b>Yard Waste Management</b></li>"
                       + "<li><b>Transport Operation</b></li>"
                        + "<li><b>Procurement</b></li>"
                        + "<li><b>Organization</b></li>"
                        + "<li><b>Maintenance</b></li>"
                    + "</ul>"
                    + "In addition to the four modules in the Moderate Level, the High Level has one more module, the Procurement<br>"
                    + "at the highest level you are required to have a greener procurment strategy in addition to the other KPIs requirements.<br>"
                    + "With all of the KPIs for this level you are at the highest level of green efficiency.</p></li>"
                    +"</ul>" 
                 + "<li><b>Emission Calculator</li></b>"
                + "<ul>"
                 + "<li><p>Apart from the three levels, this module allows to calculate GHG emission of each vehicle based on its<br>"
                    + "fuel type, fuel consumption and distance travelled, the following GHG emissions are calculated for each vehicle:<br>"
                    +"<ul>"
                        + "<li><b>Carbon Dioxide (CO2)</b></li>"
                        + "<li><b>Carbon Monoxide (CO)</b></li>"
                        + "<li><b>Nitrogen Oxide (NO2)</b></li>"
                        + "<li><b>Sulphur Dioxide(SO2)</b></li>"
                        + "<li><b>Volatile Organice Compounds (VOC)</b></li>"
                        + "<li><b>Particulate Matters (PM10)</b></li>"
                    + "</ul>"
                    + "All the values are in tonne/year, the higher the value of CO2 the more the carbon footprint and lesser the better<br>"
                    + "</p></li>"
                    +"</ul>"   
                 + "<li><b>Disclaimer</li></b>"
                + "<ul>"
                 + "<li><p style='color:red;'>This software is not designed to be 100% accurate as there are too many variable required in order to give a<br>"
                    + "reliable emissions total. It is simply to give you an indication on how much<b> Green House Gas (GHG)</b> you generate.<br></p?"
                + "</ul>"                   
                 + "</ol>"
                 + "</html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(AboutTopComponent.class, "AboutTopComponent.jLabel1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(AboutTopComponent.class, "AboutTopComponent.jLabel2.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(353, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addContainerGap(214, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
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
