package fitnessclub.interfacelayer;

import fitnessclub.Util;
import fitnessclub.datalayer.DataGateway;
import fitnessclub.entity.Client;
import fitnessclub.servicelayer.ServiceLayer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author magni
 */
public class ClientFrame extends javax.swing.JFrame implements ActionListener{

    ServiceLayer sl = new ServiceLayer();
    CoachListFrame clf;
    protected Client c;
    /**
     * Creates new form ClientFrame
     * @param c
     */
    public ClientFrame(Client c) {
        initComponents();
        
        this.c = c;
        this.jLabel5.setText(c.getForname());
        this.jLabel6.setText(c.getSurname());
        this.jLabel7.setText(c.getBirthDate().toString());
        this.jButton1.setEnabled(false);
        this.changeCoachButton.setEnabled(false);
        
        switch(c.getAppstate()){
            case 1:
                this.jLabel10.setText("Waiting approval");
                break;
            case 2:
                this.jLabel10.setText("Approved");
                break;
            case 3:
                this.jLabel10.setText("Visit Doctor " + "doctor_name");
                break;
            case 4:
                this.jLabel10.setText("Health ok");
                break;
            case 5:
                this.jLabel10.setText("Sign up the contract");
                this.jButton1.setText("Read");
                this.jButton1.setEnabled(true);
                break;
            case 6:
                this.jLabel10.setText("Contract signed");
                break;
            case 7:
                this.jLabel10.setText("Welcome to FitnessClub");
                this.changeCoachButton.setEnabled(true);
                break;
            case 8:
                this.jLabel10.setText("Waiting coach approval");
                break;
            case 9:
                this.jLabel10.setText("Fill the form");
                break;
            case 10:
                this.jLabel10.setText("Waiting for program");
                break;
            case 11:
                this.jLabel10.setText("Program assigned");
                this.changeCoachButton.setEnabled(true);
                break;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        changeCoachButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

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

        jLabel3.setText("Birthdate:");

        jLabel4.setText("Coach:");

        jLabel5.setText("default");

        jLabel6.setText("default");

        jLabel7.setText("default");

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
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(27, 27, 27)
                                .addComponent(changeCoachButton))
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10))
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(changeCoachButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changeCoachButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeCoachButtonActionPerformed
        clf = new CoachListFrame(c.getClientId());
        clf.setVisible(true);
        
        clf.jButton1.addActionListener(this);
    }//GEN-LAST:event_changeCoachButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        sl.pl.logOff(Util.currPersonOnline);
        DataGateway.close();
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changeCoachButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = clf.selectedRow.substring(clf.selectedRow.indexOf(" "), clf.selectedRow.length());
        jLabel8.setText(s);
    }
}
