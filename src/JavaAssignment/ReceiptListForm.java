/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JavaAssignment;

import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author homew
 */
public class ReceiptListForm extends javax.swing.JFrame {

    /**
     * Creates new form Receipt
     */
    public ReceiptListForm() {
        initComponents();
        setLocationRelativeTo(null);
        
        //Allow Row selection instead of individual selection on the table list.
        bookingtable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        bookingtable.setFocusable(false);
        
        //Load all the data to the table
        Booking.LoadBookingTable((DefaultTableModel) bookingtable.getModel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookingtable = new javax.swing.JTable();
        jbtnback = new javax.swing.JButton();
        jbtnreceipt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JavaAssignment/5.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        jLabel1.setText("Room Booking Receipt");

        bookingtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Citizenship", "IC/PASSPORT", "Contact Number", "Email", "Room Type", "RoomID", "CheckIn", "CheckOut", "Price"
            }
        ));
        jScrollPane1.setViewportView(bookingtable);

        jbtnback.setText("BACK");
        jbtnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnbackActionPerformed(evt);
            }
        });

        jbtnreceipt.setText("GENERATE RECEIPT");
        jbtnreceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnreceiptActionPerformed(evt);
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
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnback)
                        .addGap(37, 37, 37))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1069, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(467, 467, 467)
                        .addComponent(jbtnreceipt)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jbtnback))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jbtnreceipt)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnbackActionPerformed
        this.setVisible(false);
        RoomBookingMain Info = new RoomBookingMain();
        Info.setVisible(true);
    }//GEN-LAST:event_jbtnbackActionPerformed

    private void jbtnreceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnreceiptActionPerformed
        //Get row selection
        int row = bookingtable.getSelectedRow();
        if (row != -1) {
            //Get username in row Index 0 and convert to string. Open Receipt Form with the username as selectedid.
            String selectedid = bookingtable.getValueAt(row, 0).toString();
            ReceiptForm mbf = new ReceiptForm(selectedid);
            mbf.setLocationRelativeTo(null);
            mbf.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "No record is selected", "Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtnreceiptActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReceiptListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceiptListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceiptListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceiptListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceiptListForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookingtable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnback;
    private javax.swing.JButton jbtnreceipt;
    // End of variables declaration//GEN-END:variables
}