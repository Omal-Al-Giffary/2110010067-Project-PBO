/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;
import dataset.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Horizz
 */
public class frametransaksi extends javax.swing.JFrame {

    /**
     * Creates new form frametransaksi
     */
    private dsTransaksi transaksi;
    public frametransaksi() {
        initComponents();
        this.setLocationRelativeTo(null);
        transaksi = new dsTransaksi();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtindex = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtidtran = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtbarang = new javax.swing.JTextField();
        txttgl = new javax.swing.JTextField();
        txtkasir = new javax.swing.JTextField();
        txtpelang = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btntambah2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnbaca = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtjumlhbarang = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txttotalharga = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Kasir");

        txtindex.setText("0");

        jLabel4.setText("Pelanggan");

        jLabel5.setText("Tanggal Transaksi");

        jLabel1.setText("Id Transaksi");

        btntambah2.setText("TAMBAH DATA");
        btntambah2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambah2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Barang");

        btnbaca.setText("BACA DATA");
        btnbaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbacaActionPerformed(evt);
            }
        });

        jLabel6.setText("Jumlah Barang");

        jLabel7.setText("Total Harga");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtbarang)
                                    .addComponent(txtidtran)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtkasir)
                                    .addComponent(txtpelang)
                                    .addComponent(txttgl)
                                    .addComponent(txttotalharga)
                                    .addComponent(txtjumlhbarang))))
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btntambah2)
                                .addGap(47, 47, 47)
                                .addComponent(btnbaca, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtindex, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 48, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtidtran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtkasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtpelang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txttgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtjumlhbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txttotalharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntambah2)
                    .addComponent(btnbaca)
                    .addComponent(txtindex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntambah2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambah2ActionPerformed
        // TODO add your handling code here:
        transaksi.tambahIdTransaksi(Integer.parseInt(txtidtran.getText()));
        transaksi.tambahBarang(txtbarang.getText());
        transaksi.tambahKasir(txtkasir.getText());
        transaksi.tambahPelanggan(txtpelang.getText());
        transaksi.tambahJumlahBarang(Integer.parseInt(txtjumlhbarang.getText()));
        transaksi.tambahTotalHarga(txttotalharga.getText());
        JOptionPane.showMessageDialog(this, "Berhasil Disimpan");
    }//GEN-LAST:event_btntambah2ActionPerformed

    private void btnbacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbacaActionPerformed
        // TODO add your handling code here:
         int i = Integer.valueOf(txtindex.getText());

        String isiarray = "Id Transaksi : " + transaksi.getDataSetIdTransaksi().get(i)+
                          "\nBarang : " + transaksi.getDataSetBarang().get(i)+
                          "\nKasir : " + transaksi.getDataSetKasir().get(i)+
                          "\nPelanggan : " + transaksi.getDataSetPelanggan().get(i)+
                          "\nJumlah Barang : " + transaksi.getDataSetJumlahBarang().get(i)+
                          "\nTotal Harga : " + transaksi.getDataSetTotalHarga().get(i);
        JOptionPane.showMessageDialog(this, isiarray);
    }//GEN-LAST:event_btnbacaActionPerformed

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
            java.util.logging.Logger.getLogger(frametransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frametransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frametransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frametransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frametransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbaca;
    private javax.swing.JButton btntambah2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtbarang;
    private javax.swing.JTextField txtidtran;
    private javax.swing.JTextField txtindex;
    private javax.swing.JTextField txtjumlhbarang;
    private javax.swing.JTextField txtkasir;
    private javax.swing.JTextField txtpelang;
    private javax.swing.JTextField txttgl;
    private javax.swing.JTextField txttotalharga;
    // End of variables declaration//GEN-END:variables
}
