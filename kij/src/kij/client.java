/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kij;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
//import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author user
 */
public class client extends javax.swing.JFrame {

    /**
     * Creates new form client
     */
    // static ServerSocket ss;
    static Socket s;
    static DataInputStream din;
    static DataOutputStream dout;
    static DefaultTableModel model;
    
    public client() {
        initComponents();
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        buatbaru = new javax.swing.JLabel();
        catatan = new javax.swing.JLabel();
        bukacatatan = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        utama = new javax.swing.JPanel();
        tutup = new javax.swing.JPanel();
        panelct = new javax.swing.JPanel();
        msg_text = new javax.swing.JTextField();
        txtkey = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        msg_area = new javax.swing.JTextArea();
        msg_send = new javax.swing.JButton();
        buka = new javax.swing.JButton();
        bukac = new javax.swing.JTextField();
        tgl = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setPreferredSize(new java.awt.Dimension(750, 550));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        buatbaru.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buatbaru.setForeground(new java.awt.Color(255, 255, 255));
        buatbaru.setText("Buat baru");
        buatbaru.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buatbaru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buatbaruMouseClicked(evt);
            }
        });

        catatan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        catatan.setForeground(new java.awt.Color(255, 255, 255));
        catatan.setText("Catatan");
        catatan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        catatan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catatanMouseClicked(evt);
            }
        });

        bukacatatan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bukacatatan.setForeground(new java.awt.Color(255, 255, 255));
        bukacatatan.setText("Buka Catatan");
        bukacatatan.setToolTipText("");
        bukacatatan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bukacatatan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bukacatatanMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bukacatatan)
                    .addComponent(catatan)
                    .addComponent(buatbaru))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(buatbaru)
                .addGap(35, 35, 35)
                .addComponent(catatan)
                .addGap(38, 38, 38)
                .addComponent(bukacatatan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("AGENDA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        utama.setBackground(new java.awt.Color(255, 255, 255));
        utama.setPreferredSize(new java.awt.Dimension(700, 500));

        tutup.setBackground(new java.awt.Color(0, 0, 0));
        tutup.setPreferredSize(new java.awt.Dimension(700, 500));

        panelct.setBackground(new java.awt.Color(255, 255, 255));
        panelct.setPreferredSize(new java.awt.Dimension(700, 500));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(700, 500));

        msg_area.setColumns(20);
        msg_area.setRows(5);
        msg_area.setPreferredSize(new java.awt.Dimension(700, 500));
        jScrollPane3.setViewportView(msg_area);

        msg_send.setBackground(new java.awt.Color(0, 102, 102));
        msg_send.setForeground(new java.awt.Color(255, 255, 255));
        msg_send.setText("Simpan");
        msg_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msg_sendActionPerformed(evt);
            }
        });

        buka.setBackground(new java.awt.Color(0, 102, 102));
        buka.setForeground(new java.awt.Color(255, 255, 255));
        buka.setText("Buka Catatan");
        buka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bukaActionPerformed(evt);
            }
        });

        bukac.setPreferredSize(new java.awt.Dimension(87, 20));
        bukac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bukacActionPerformed(evt);
            }
        });

        jLabel1.setText("Tanggal");

        jLabel3.setText("Catatan");

        jLabel6.setText("Kunci");

        javax.swing.GroupLayout panelctLayout = new javax.swing.GroupLayout(panelct);
        panelct.setLayout(panelctLayout);
        panelctLayout.setHorizontalGroup(
            panelctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelctLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelctLayout.createSequentialGroup()
                        .addGroup(panelctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtkey, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(msg_text, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelctLayout.createSequentialGroup()
                                .addComponent(msg_send)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                                .addComponent(buka))
                            .addComponent(tgl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(3, 3, 3))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addComponent(bukac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        panelctLayout.setVerticalGroup(
            panelctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelctLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(panelctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(msg_text, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(panelctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtkey, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(panelctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msg_send)
                    .addComponent(buka))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bukac, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tutupLayout = new javax.swing.GroupLayout(tutup);
        tutup.setLayout(tutupLayout);
        tutupLayout.setHorizontalGroup(
            tutupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tutupLayout.setVerticalGroup(
            tutupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelct, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout utamaLayout = new javax.swing.GroupLayout(utama);
        utama.setLayout(utamaLayout);
        utamaLayout.setHorizontalGroup(
            utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(utamaLayout.createSequentialGroup()
                .addComponent(tutup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        utamaLayout.setVerticalGroup(
            utamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(utamaLayout.createSequentialGroup()
                .addComponent(tutup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(utama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(utama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void msg_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msg_sendActionPerformed
        try {
            String msgout;
            msgout = msg_text.getText().trim();
            dout.writeUTF(msgout);

            String msgoutkey;
            msgoutkey = txtkey.getText().trim();
            dout.writeUTF(msgoutkey);

            Date tgd;
            String tgs;
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            tgd = tgl.getDate();
            tgs = f.format(tgd);
            dout.writeUTF(tgs);
                 msg_area.setText("");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_msg_sendActionPerformed

    private void bukaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bukaActionPerformed
     //  bukac.setVisible(true);
        String isitext = msg_text.getText();
        String key = "",out = "";
        char k = (char) (isitext.charAt(0));
        int jumkey = Integer.parseInt(String.valueOf(k))-1;

        for (int i = 1; i <= jumkey; i++) {
            int index = isitext.charAt(i);
            char s = (char) (index-1);
            key = key + String.valueOf(s);
        }
        try {
            if (key.equals(txtkey.getText())) {
                for (int i = (jumkey+1); i <= isitext.length(); i++) {
                    int index = isitext.charAt(i);
                    char s = (char) (index-1);
                    out = out + String.valueOf(s);
                    bukac.setText(out);
                     
                }
                //bukac.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "kunci salah");
            }
           
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_bukaActionPerformed

    private void catatanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catatanMouseClicked
        jScrollPane3.setVisible(true);
        msg_area.setVisible(true);
                 jLabel1.setVisible(false);
                 jLabel3.setVisible(false);
                 jLabel6.setVisible(false);
        
        tgl.setVisible(false);
        msg_text.setVisible(false);
        txtkey.setVisible(false);
        msg_send.setVisible(false);
        bukac.setVisible(false);
        buka.setVisible(false);
      //  jPanel3.setVisible(false);
    }//GEN-LAST:event_catatanMouseClicked

    private void buatbaruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buatbaruMouseClicked
        // TODO add your handling code here:
        tgl.setVisible(true);
        msg_text.setVisible(true);
        txtkey.setVisible(true);
        msg_send.setVisible(true);
        bukac.setVisible(false);
        buka.setVisible(false);
                 jLabel1.setVisible(true);
                 jLabel3.setVisible(true);
                 jLabel6.setVisible(true);
        
        jScrollPane3.setVisible(false);
        msg_area.setVisible(false);
     //   jPanel3.setVisible(false);
        
    }//GEN-LAST:event_buatbaruMouseClicked

    private void bukacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bukacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bukacActionPerformed

    private void bukacatatanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bukacatatanMouseClicked
        // TODO add your handling code here:
        tgl.setVisible(false);
        msg_text.setVisible(true);
        txtkey.setVisible(true);
        msg_send.setVisible(false);
        bukac.setVisible(true);
        buka.setVisible(true);
                 jLabel1.setVisible(false);
                 jLabel3.setVisible(true);
                 jLabel6.setVisible(true);
        
        jScrollPane3.setVisible(false);
        msg_area.setVisible(false);
    }//GEN-LAST:event_bukacatatanMouseClicked

    /**
     * 
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
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new client().setVisible(true);
                tgl.setVisible(false);
                msg_text.setVisible(false);
                txtkey.setVisible(false);
                 msg_send.setVisible(false);
                   buka.setVisible(false);
                   jScrollPane3.setVisible(false);
                msg_area.setVisible(false);
                 bukac.setVisible(false);
                 jLabel1.setVisible(false);
                 jLabel3.setVisible(false);
                 jLabel6.setVisible(false);
                 
                // try {
             //       String msgou = "";
          //  dout.writeUTF(msgou);
           ///     } catch (Exception e) {
            //    }
                // System.out.println("m");
            }
        });
     
         try {
            s = new Socket("127.0.0.1",8080);
            din = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());
          
            String msgin = "";
           // String ms = "";
            while(!msgin.equals("exit")) {
                 msgin = din.readUTF();
             //    ms = din.readUTF();
               // msg_area.setText(msg_area.getText().trim()+msgin); 
                msg_area.setText(msg_area.getText().trim()+ "\n"+ msgin);
            }
        } catch (Exception e) {
        }
         
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buatbaru;
    private static javax.swing.JButton buka;
    private static javax.swing.JTextField bukac;
    private javax.swing.JLabel bukacatatan;
    private javax.swing.JLabel catatan;
    private static javax.swing.JLabel jLabel1;
    private static javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private static javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private static javax.swing.JTextArea msg_area;
    private static javax.swing.JButton msg_send;
    private static javax.swing.JTextField msg_text;
    private static javax.swing.JPanel panelct;
    private static com.toedter.calendar.JDateChooser tgl;
    private javax.swing.JPanel tutup;
    private static javax.swing.JTextField txtkey;
    private javax.swing.JPanel utama;
    // End of variables declaration//GEN-END:variables
}
