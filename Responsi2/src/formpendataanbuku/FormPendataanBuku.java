/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formpendataanbuku;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import servis.KoneksiDB;
import java.util.logging.Logger;
import java.util.logging.Level;


/**
 *
 * @author garry
 */
public class FormPendataanBuku extends javax.swing.JFrame {

    /**
     * Creates new form FormMahasiswa
     */
    public DefaultTableModel model;
  
    
    public FormPendataanBuku() {
        initComponents();
        this.setLocationRelativeTo(null);
        init();
        tampilData();
    }
 private void init(){
        edbuku.setText("");
        edjudulbuku.setText("");
        eddeskripsi.setText("");
        edpengarang.setText("");
        edterbit.setText("");
      
        cbjenis.removeAllItems();
        cbjenis.addItem("Novel");
        cbjenis.addItem("Biografi");
        cbjenis.addItem("Ensiklopedi");
        cbjenis.addItem("Komik");
        cbjenis.addItem("Cergam");
        
        model= new DefaultTableModel();
        model.addColumn("ID Buku");
        model.addColumn("Judul Buku ");
        model.addColumn("Deskripsi");
        model.addColumn("Jenis Buku");
        model.addColumn("Nama Pengarang");
        model.addColumn("Tahun Terbit");
        jtbRakBuku.setModel(model);     
    }

  private void setTabelModel(){
        model= new DefaultTableModel();
        model.addColumn("ID Buku");
        model.addColumn("Judul Buku");
        model.addColumn("Deskripsi");
        model.addColumn("Jenis Buku");
        model.addColumn("Nama Pengarang");
        model.addColumn("Tahun Terbit");
        jtbRakBuku.setModel(model);
 }
  
private void tampilData(){
        setTabelModel();
        
        Connection obj = new KoneksiDB().getConnection();
        
        try {
            Statement s;
            s = obj.createStatement();
            ResultSet res = s.executeQuery("Select * from daftarBuku");
            
            while (res.next()){
                Object [] ob = new Object[6];
                ob[0] = res.getString("id_buku");
                ob[1] = res.getString("judul_buku");
                ob[2] = res.getString("deskripsi");
                ob[3] = res.getString("jenis_buku");
                ob[4] = res.getString("nama_pengarang");
                ob[5] = res.getString("tahun_terbit");
                model.addRow(ob);
            }
            jtbRakBuku.setModel(model);
            s.close();
        } catch (SQLException e) {
            Logger.getLogger(FormPendataanBuku.class.getName()).log(Level.SEVERE, null, e);
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

        cbjenis = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        eddeskripsi = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbRakBuku = new javax.swing.JTable();
        btnKoneksi = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        edbuku = new javax.swing.JTextField();
        edjudulbuku = new javax.swing.JTextField();
        edpengarang = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        edterbit = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));

        cbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbjenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbjenisActionPerformed(evt);
            }
        });

        eddeskripsi.setColumns(20);
        eddeskripsi.setRows(5);
        jScrollPane1.setViewportView(eddeskripsi);

        jtbRakBuku.setModel(new javax.swing.table.DefaultTableModel(
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
        jtbRakBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbRakBukuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtbRakBuku);

        btnKoneksi.setText("Test Koneksi ");
        btnKoneksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKoneksiActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete ");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 18)); // NOI18N
        jLabel1.setText("Form Pendataan Buku ");

        jLabel2.setText("ID Buku ");

        jLabel3.setText("Judul Buku");

        jLabel4.setText("Deskripsi");

        jLabel5.setText("Jenis Buku");

        jLabel6.setText("Nama Pengarang");

        edbuku.setText("jTextField1");

        edjudulbuku.setText("jTextField2");

        edpengarang.setText("jTextField3");

        jLabel7.setText("Tahun terbit");

        edterbit.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(edjudulbuku, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(edbuku, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(177, 177, 177))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(edpengarang, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(jLabel1)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edterbit, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(106, 106, 106)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKoneksi)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnSimpan)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelete)
                            .addComponent(btnupdate))))
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnKoneksi)
                        .addGap(18, 18, 18)
                        .addComponent(btnSimpan)
                        .addGap(18, 18, 18)
                        .addComponent(btnupdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(edbuku))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edjudulbuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbjenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(edpengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(edterbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addComponent(jLabel4))))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbjenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbjenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbjenisActionPerformed

    private void btnKoneksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKoneksiActionPerformed
        try (Connection objConnection = new KoneksiDB().getConnection()){
            JOptionPane.showMessageDialog(null, "koneksi berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal");
        }
    }//GEN-LAST:event_btnKoneksiActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        String valId = edbuku.getText();
        String valJudul = edjudulbuku.getText();
        String valdeskripsi = eddeskripsi.getText();
        String valjenis = cbjenis.getSelectedItem().toString();
        String valpengarang = edpengarang.getText();
        String valterbit = edterbit.getText();
        
        Connection objCon = new KoneksiDB().getConnection();
        try {
            String query_insert = "insert into daftarBuku values (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement statement = objCon.prepareStatement(query_insert)) {
                statement.setString(1, valId);
                statement.setString(2, valJudul);
                statement.setString(3, valdeskripsi);
                statement.setString(4, valjenis);
                statement.setString(5, valpengarang);
                statement.setString(6, valterbit);
                
                statement.executeUpdate();
                JOptionPane.showMessageDialog(null, "Berhasil Memasukkan data");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Gagal Memasukkan data");
            Logger.getLogger(FormPendataanBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
        init();
        tampilData();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        String valId = edbuku.getText();
        String valJudul = edjudulbuku.getText();
        String valdeskripsi = eddeskripsi.getText();
        String valjenis = cbjenis.getSelectedItem().toString();
        String valpengarang = edpengarang.getText();
        String valterbit = edterbit.getText();
        
        try {
            Connection objCon = new KoneksiDB().getConnection();
            String query_update = "update daftarBuku set judul_buku='" + valJudul
                    +"', deskripsi='" + valdeskripsi
                    +"', jenis_buku='" + valjenis
                    +"', nama_pengarang='" + valpengarang
                    +"', tahun_terbit='" + valterbit
                    +"' where id_buku='" + valId + "'";
        
            try (Statement statement = objCon.createStatement()) {
                statement.executeUpdate(query_update);
            JOptionPane.showMessageDialog(null, "Data berhasil diubah");
            }
                   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal diubah");
            Logger.getLogger(FormPendataanBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
        init();
        tampilData();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void jtbRakBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbRakBukuMouseClicked
        // TODO add your handling code here:
        edbuku.setText(jtbRakBuku.getValueAt(jtbRakBuku.getSelectedRow(), 0).toString());
         edjudulbuku.setText(jtbRakBuku.getValueAt(jtbRakBuku.getSelectedRow(), 1).toString());
          eddeskripsi.setText(jtbRakBuku.getValueAt(jtbRakBuku.getSelectedRow(), 2).toString());
           cbjenis.setSelectedItem(jtbRakBuku.getValueAt(jtbRakBuku.getSelectedRow(), 3).toString());
            edpengarang.setText(jtbRakBuku.getValueAt(jtbRakBuku.getSelectedRow(), 4).toString());
            edterbit.setText(jtbRakBuku.getValueAt(jtbRakBuku.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_jtbRakBukuMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String valID = edbuku.getText();
        
        try {
            Connection objCon = new KoneksiDB().getConnection();
            String query_delete = "delete from daftarBuku where id_buku='"+valID+"'";
        
            try (Statement s = objCon.createStatement()) {
                s.executeUpdate(query_delete);
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
            }
        } catch (SQLException ex) {           
            Logger.getLogger(FormPendataanBuku.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data gagal dihapus");
        }
        init();
        tampilData();
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(FormPendataanBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPendataanBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPendataanBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPendataanBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPendataanBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnKoneksi;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cbjenis;
    private javax.swing.JTextField edbuku;
    private javax.swing.JTextArea eddeskripsi;
    private javax.swing.JTextField edjudulbuku;
    private javax.swing.JTextField edpengarang;
    private javax.swing.JTextField edterbit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtbRakBuku;
    // End of variables declaration//GEN-END:variables
}
