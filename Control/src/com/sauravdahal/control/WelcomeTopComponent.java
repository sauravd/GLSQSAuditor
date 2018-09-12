/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sauravdahal.control;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
        dtd = "-//com.sauravdahal.control//Welcome//EN",
        autostore = false
)
@TopComponent.Description(
        preferredID = "WelcomeTopComponent",
        //iconBase="SET/PATH/TO/ICON/HERE", 
        persistenceType = TopComponent.PERSISTENCE_ALWAYS
)
@TopComponent.Registration(roles={"control"},mode = "editor", openAtStartup = true)
@ActionID(category = "Window", id = "com.sauravdahal.control.WelcomeTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_WelcomeAction",
        preferredID = "WelcomeTopComponent"
)
@Messages({
    "CTL_WelcomeAction=Welcome",
    "CTL_WelcomeTopComponent=Welcome",
    "HINT_WelcomeTopComponent=This is a Welcome window"
})
public final class WelcomeTopComponent extends TopComponent {

    public WelcomeTopComponent() {
        initComponents();
        setName(Bundle.CTL_WelcomeTopComponent());
        setToolTipText(Bundle.HINT_WelcomeTopComponent());
//        setLayout(new FlowLayout(FlowLayout.LEFT,14,10));
//        for(FileObject fo: FileUtil.getConfigFile("Actions/Predict").getChildren()){
//            Action action = FileUtil.getConfigObject(fo.getPath(), Action.class);
//            JButton button = new JButton(action);
//            button.setPreferredSize(new Dimension(150,100));
//            add(button);
//        }
        jLabel2.setFont(new java.awt.Font("Verdana", Font.LAYOUT_LEFT_TO_RIGHT, 12));
        jLabel4.setFont(new java.awt.Font("Verdana", Font.LAYOUT_LEFT_TO_RIGHT, 12));
        jLabel5.setFont(new java.awt.Font("Verdana", Font.LAYOUT_LEFT_TO_RIGHT, 12));
        jLabel2.setBackground(Color.WHITE);       
        jLabel4.setBackground(Color.WHITE);       
        jLabel5.setBackground(Color.WHITE);       
        jLabel2.setText("<html><h3>"
                +"Green Freight and Logistics Development in Mekong countries </h3>"
                +"<p>"
                +"Freight transportation is critical to businesses, consumers and the world economy."
                + "The freight sector moves vast volumes of goods, commodities, materials and food domestically"
                + "and globally and is primary factor in economy and growth. But a goods movement comes with"
                + "an impact on the global environment. It contributes a significant portion of air pollution"
                + "and its contribution is expected to grow significantly in the coming years. Globally, carbon dioxide (CO)"
                + "emissions from freight transport are growing more quickly than those from passenger vehicles. In particular,"
                + "heavy duty vehicles are expected to be the largest emitter of CO2 from all transport modes by 2035."
                + "</p>");
        
        jLabel4.setText("<html><p>Transport accounts for at least one fourth of total energy consumption in Asian countries and"
                + "other parts of the world. Freight transport is also the major consumer of oil, of which most comes from freight"
                + "transport. The significant impact freight transport have on environment has led to several initiatives by "
                + "governments and private companies.</p>"
                + "<p> <br>"
                + "With this backdrop, the Mekong Institute (MI) is implementing a three-year project on “Green Freight and Logistics"
                + "Development in Mekong countries’ funded by the Republic of Korea through the Mekong-Korea Cooperation Fund(MKCF)."
                + "The long-term objective of the project is to reduce the cost of logistics and transport to improve economic performance"
                + "in the five countries in Cambodia, Lao PDR, Myanmar, Vietnam and Thailand (CLMVT). This will eventually aid the transport"
                + "sector to increase its contribution to economic development in the Mekong countries as well reduce its carbon footprint.</p>"
                + "</html>"        
        );
        jLabel5.setText("<html><p>"
                +"Green freight and logistics development programs in the Mekong countries can help address many of these issues,"
                + "helping LSPs to become more competitive, and in doing so aiding the transport sector to increase its contribution to"
                + "economic development in the subregion as well as reduce its carbon footprint.</p>"
                +"</html>"
        );     
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sauravdahal/pictures/GMSmapv2.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(WelcomeTopComponent.class, "WelcomeTopComponent.jLabel1.text")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sauravdahal/pictures/MI_LOGO.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(WelcomeTopComponent.class, "WelcomeTopComponent.jLabel3.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(WelcomeTopComponent.class, "WelcomeTopComponent.jLabel2.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(WelcomeTopComponent.class, "WelcomeTopComponent.jLabel4.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(WelcomeTopComponent.class, "WelcomeTopComponent.jLabel5.text")); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sauravdahal/pictures/roklogo.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(WelcomeTopComponent.class, "WelcomeTopComponent.jLabel6.text")); // NOI18N
        jLabel6.setToolTipText(org.openide.util.NbBundle.getMessage(WelcomeTopComponent.class, "WelcomeTopComponent.jLabel6.toolTipText")); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel7, org.openide.util.NbBundle.getMessage(WelcomeTopComponent.class, "WelcomeTopComponent.jLabel7.text")); // NOI18N

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel8, org.openide.util.NbBundle.getMessage(WelcomeTopComponent.class, "WelcomeTopComponent.jLabel8.text")); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sauravdahal/pictures/Ministry of PublicWork_cambodia_1.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel9, org.openide.util.NbBundle.getMessage(WelcomeTopComponent.class, "WelcomeTopComponent.jLabel9.text")); // NOI18N
        jLabel9.setToolTipText(org.openide.util.NbBundle.getMessage(WelcomeTopComponent.class, "WelcomeTopComponent.jLabel9.toolTipText")); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sauravdahal/pictures/LAO_1.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel10, org.openide.util.NbBundle.getMessage(WelcomeTopComponent.class, "WelcomeTopComponent.jLabel10.text")); // NOI18N
        jLabel10.setToolTipText(org.openide.util.NbBundle.getMessage(WelcomeTopComponent.class, "WelcomeTopComponent.jLabel10.toolTipText")); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sauravdahal/pictures/Myanmar_1.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel11, org.openide.util.NbBundle.getMessage(WelcomeTopComponent.class, "WelcomeTopComponent.jLabel11.text")); // NOI18N
        jLabel11.setToolTipText(org.openide.util.NbBundle.getMessage(WelcomeTopComponent.class, "WelcomeTopComponent.jLabel11.toolTipText")); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sauravdahal/pictures/Vietnam_1.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel12, org.openide.util.NbBundle.getMessage(WelcomeTopComponent.class, "WelcomeTopComponent.jLabel12.text")); // NOI18N
        jLabel12.setToolTipText(org.openide.util.NbBundle.getMessage(WelcomeTopComponent.class, "WelcomeTopComponent.jLabel12.toolTipText")); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sauravdahal/pictures/Thailand_1.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel13, org.openide.util.NbBundle.getMessage(WelcomeTopComponent.class, "WelcomeTopComponent.jLabel13.text")); // NOI18N
        jLabel13.setToolTipText(org.openide.util.NbBundle.getMessage(WelcomeTopComponent.class, "WelcomeTopComponent.jLabel13.toolTipText")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13))
                                    .addComponent(jLabel8))))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(435, 435, 435))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
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
