package fitnessclub.interfacelayer;

import fitnessclub.Util;
import fitnessclub.datalayer.DataGateway;
import fitnessclub.entity.Client;
import fitnessclub.entity.Coach;
import fitnessclub.servicelayer.ServiceLayer;

/**
 *
 * @author magni
 */
public class ClientFrame extends javax.swing.JFrame{

    ClientTextFrame ctf = new ClientTextFrame();
    ServiceLayer sl = new ServiceLayer();
    CoachListFrame clf;
    Client c;
    Coach co;

    /**
     * Creates new form ClientFrame
     *
     * @param c
     */
    public ClientFrame(Client c) {
        initComponents();

        this.c = c;
        this.co = sl.getClientsCoach(c.getClientId());
        this.jLabel5.setText(c.getForname());
        this.jLabel6.setText(c.getSurname());
        this.jLabel8.setText(co.getForname() + " " + co.getSurname());
        this.jButton1.setEnabled(false);
        this.changeCoachButton.setEnabled(false);
        this.ctf.setVisible(false);

        refreshData();
    }

    private void refreshData() {
        int state = sl.checkAppState(Util.currPersonOnline);
        
        if ((state > 0) && (state < 12)) {
            switch (state) {
                case 1:
                    jLabel10.setText("Waiting approval");
                    changeCoachButton.setEnabled(false);
                    jButton1.setEnabled(false);
                    break;
                case 2:
                    jLabel10.setText("Approved");
                    changeCoachButton.setEnabled(false);
                    jButton1.setEnabled(false);
                    break;
                case 3:
                    jLabel10.setText("Visit Doctor " + "doctor_name");
                    changeCoachButton.setEnabled(false);
                    jButton1.setEnabled(false);
                    break;
                case 4:
                    jLabel10.setText("Health ok");
                    changeCoachButton.setEnabled(false);
                    jButton1.setEnabled(false);
                    break;
                case 5:
                    jLabel10.setText("Sign up the contract");
                    jButton1.setText("Read");
                    jButton1.setEnabled(true);
                    break;
                case 6:
                    jLabel10.setText("Contract signed");
                    changeCoachButton.setEnabled(false);
                    jButton1.setEnabled(false);
                    break;
                case 7:
                    jLabel10.setText("Welcome to FitnessClub");
                    changeCoachButton.setEnabled(true);
                    jButton1.setEnabled(false);
                    break;
                case 8:
                    jLabel10.setText("Waiting coach approval");
                    jButton1.setEnabled(false);
                    break;
                case 9:
                    jLabel10.setText("Fill the form");
                    jButton1.setEnabled(true);
                    jButton1.setText("Fill");
                    break;
                case 10:
                    jLabel10.setText("Waiting for program");
                    jButton1.setEnabled(false);
                    break;
                case 11:
                    jLabel10.setText("Program assigned");
                    jButton1.setEnabled(true);
                    jButton1.setText("Read");
                    changeCoachButton.setEnabled(true);
                    break;
            }
        }
        
        if(clf != null){
            String[] tmpstr = sl.ccl.getClientsCoach(c.getClientId()).split("\n");
            jLabel8.setText(tmpstr[1] + " " + tmpstr[2]);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        changeCoachButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FitnessClub client interface");
        setName("clientframe"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Name:");

        jLabel2.setText("Surname:");

        jLabel4.setText("Coach:");

        jLabel5.setText("default");

        jLabel6.setText("default");

        jLabel8.setText("No Coach");

        jLabel9.setText("Application status:");

        jLabel10.setText("null");

        changeCoachButton.setText("Change");
        changeCoachButton.setEnabled(false);
        changeCoachButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeCoachButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Modify");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jButton2))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(changeCoachButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(changeCoachButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changeCoachButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeCoachButtonActionPerformed
        clf = new CoachListFrame(c.getClientId());
        clf.setVisible(true);
    }//GEN-LAST:event_changeCoachButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        sl.pl.logOff(Util.currPersonOnline);
        DataGateway.close();
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        switch (sl.checkAppState(Util.currPersonOnline)) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                ctf.setMode(1);
                ctf.setVisible(true);
                jButton1.setEnabled(false);
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                ctf.setMode(2);
                ctf.setVisible(true);
                jButton1.setEnabled(false);
                break;
            case 10:
                break;
            case 11:
                ctf.setMode(3);                
                ctf.setVisible(true);
                break;
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        refreshData();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changeCoachButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
