/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class FastCashs extends java.awt.Frame {

    /**
     * Creates new form FastCashs
     */
    public FastCashs() {
        initComponents();
    }

    int MyAccNum;

    public FastCashs(int AccNum) {
        initComponents();
        MyAccNum = AccNum;
        GetBalance();
    }
    Connection Con = null;
    PreparedStatement pst1 = null;
    ResultSet Rs1 = null;
    Statement St1 = null;
    int OldBalance;

    private void GetBalance() {
        String Query = "select * from accounttlb where AccNum='" + MyAccNum + "' ";
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb", "root", "vasu@1991");
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery(Query);
            if (Rs1.next()) {
                OldBalance = Rs1.getInt(9);
                jLabel7.setText("Rs" + OldBalance);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Hund = new javax.swing.JButton();
        FiveHund = new javax.swing.JButton();
        OneThou = new javax.swing.JButton();
        FiveThou = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(252, 255, 220));

        jPanel2.setBackground(new java.awt.Color(189, 224, 240));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setText("ATM SYSTEM PROJECT");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Please Select Your Transaction");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("X");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(108, 108, 108)
                        .addComponent(jLabel5)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(186, 186, 186))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("FAST CASH");
        jLabel3.setToolTipText("");

        Hund.setBackground(new java.awt.Color(205, 205, 205));
        Hund.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Hund.setText("Rs 100");
        Hund.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HundMouseClicked(evt);
            }
        });

        FiveHund.setBackground(new java.awt.Color(205, 205, 205));
        FiveHund.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        FiveHund.setText("Rs 500");
        FiveHund.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FiveHundMouseClicked(evt);
            }
        });

        OneThou.setBackground(new java.awt.Color(205, 205, 205));
        OneThou.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        OneThou.setText("Rs 1000");
        OneThou.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OneThouMouseClicked(evt);
            }
        });

        FiveThou.setBackground(new java.awt.Color(205, 205, 205));
        FiveThou.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        FiveThou.setText("Rs 5000");
        FiveThou.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FiveThouMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel4.setText("BACK");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("BALANCE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(289, 289, 289))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(OneThou, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Hund, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(205, 205, 205)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FiveHund, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FiveThou, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(144, 144, 144))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addGap(19, 19, 19)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FiveHund, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hund, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(OneThou, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiveThou, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void HundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HundMouseClicked
        if (OldBalance < 100) {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        } else {
            try {
                String Query = "Update accounttlb set Balance=? where AccNum=?";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb", "root", "vasu@1991");
                PreparedStatement ps = Con.prepareStatement(Query);
                int NewBal = OldBalance - 100;
                ps.setInt(1, NewBal);
                ps.setInt(2, MyAccNum);
                ps.executeUpdate();
                if (ps.executeUpdate() == 1) {
                    JOptionPane.showMessageDialog(this, "Balance Deducted");
                    new MainMenu(MyAccNum).setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Missing Information");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_HundMouseClicked

    private void FiveHundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FiveHundMouseClicked
        if (OldBalance < 500) {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        } else {
            try {
                String Query = "Update accounttlb set Balance=? where AccNum=?";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb", "root", "vasu@1991");
                PreparedStatement ps = Con.prepareStatement(Query);
                int NewBal = OldBalance - 500;
                ps.setInt(1, NewBal);
                ps.setInt(2, MyAccNum);
                ps.executeUpdate();
                if (ps.executeUpdate() == 1) {
                    JOptionPane.showMessageDialog(this, "Balance Deducted");
                    new MainMenu(MyAccNum).setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Missing Information");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_FiveHundMouseClicked

    private void OneThouMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OneThouMouseClicked
        if (OldBalance < 1000) {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        } else {
            try {
                String Query = "Update accounttlb set Balance=? where AccNum=?";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb", "root", "vasu@1991");
                PreparedStatement ps = Con.prepareStatement(Query);
                int NewBal = OldBalance - 1000;
                ps.setInt(1, NewBal);
                ps.setInt(2, MyAccNum);
                ps.executeUpdate();
                if (ps.executeUpdate() == 1) {
                    JOptionPane.showMessageDialog(this, "Balance Deducted");
                    new MainMenu(MyAccNum).setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Missing Information");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_OneThouMouseClicked

    private void FiveThouMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FiveThouMouseClicked
        if (OldBalance < 5000) {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        } else {
            try {
                String Query = "Update accounttlb set Balance=? where AccNum=?";
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb", "root", "vasu@1991");
                PreparedStatement ps = Con.prepareStatement(Query);
                int NewBal = OldBalance - 5000;
                ps.setInt(1, NewBal);
                ps.setInt(2, MyAccNum);
                ps.executeUpdate();
                if (ps.executeUpdate() == 1) {
                    JOptionPane.showMessageDialog(this, "Balance Deducted");
                    new MainMenu(MyAccNum).setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Missing Information");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_FiveThouMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new MainMenu(MyAccNum).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(1);
    }//GEN-LAST:event_jLabel5MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FastCashs().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FiveHund;
    private javax.swing.JButton FiveThou;
    private javax.swing.JButton Hund;
    private javax.swing.JButton OneThou;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
