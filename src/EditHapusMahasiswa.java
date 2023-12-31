import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class EditHapusMahasiswa extends javax.swing.JFrame {

    Connect DB = new Connect();
    public EditHapusMahasiswa() {
        initComponents();
        DB.main();
        tampilJurusanComboBox();
        btnEdit.setBackground(new java.awt.Color(255, 0, 0));
    }
    
    private int deleteConfirmationCount = 0; // Variabel penanda konfirmasi
    
    private void tampilJurusanComboBox() {
        try {
            String query = "SELECT namajurusan FROM jurusan";
            ResultSet hasil = DB.query(query);
            
            // Tambahkan "Semua" sebagai item default
            cbJurusan.addItem("Semua");
            
            while (hasil.next()) {
                String namaJurusan = hasil.getString("namajurusan");
                // Tambahkan nama jurusan ke ComboBox
                cbJurusan.addItem(namaJurusan);
            }
        } catch (SQLException e) {
            lbStatus.setText("Terjadi kesalahan: " + e.getMessage());
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

        lb = new javax.swing.JLabel();
        lbCariMhs = new javax.swing.JLabel();
        lbTambahMhs = new javax.swing.JLabel();
        lbEhMhs = new javax.swing.JLabel();
        lbTambahJur = new javax.swing.JLabel();
        lbLogout = new javax.swing.JLabel();
        tfNIM = new javax.swing.JTextField();
        btnCariNIM = new javax.swing.JButton();
        tfNama = new javax.swing.JTextField();
        tfLahir = new javax.swing.JTextField();
        rbL = new javax.swing.JRadioButton();
        rbP = new javax.swing.JRadioButton();
        tfAlamat = new javax.swing.JTextField();
        cbJurusan = new javax.swing.JComboBox<>();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lbStatus = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        lb.setFont(new java.awt.Font("Circular Std Book", 0, 20)); // NOI18N
        lb.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1280, 760));
        setName("homeFrame"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        lbCariMhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCariMhsMouseClicked(evt);
            }
        });
        getContentPane().add(lbCariMhs);
        lbCariMhs.setBounds(20, 110, 200, 40);

        lbTambahMhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTambahMhsMouseClicked(evt);
            }
        });
        getContentPane().add(lbTambahMhs);
        lbTambahMhs.setBounds(20, 180, 200, 40);

        lbEhMhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEhMhsMouseClicked(evt);
            }
        });
        getContentPane().add(lbEhMhs);
        lbEhMhs.setBounds(20, 260, 200, 40);

        lbTambahJur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTambahJurMouseClicked(evt);
            }
        });
        getContentPane().add(lbTambahJur);
        lbTambahJur.setBounds(20, 330, 200, 40);

        lbLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLogoutMouseClicked(evt);
            }
        });
        getContentPane().add(lbLogout);
        lbLogout.setBounds(20, 660, 200, 40);
        getContentPane().add(tfNIM);
        tfNIM.setBounds(420, 90, 250, 30);

        btnCariNIM.setBackground(new java.awt.Color(37, 157, 212));
        btnCariNIM.setFont(new java.awt.Font("Circular Std Book", 0, 14)); // NOI18N
        btnCariNIM.setForeground(new java.awt.Color(255, 255, 255));
        btnCariNIM.setText("Cari");
        btnCariNIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariNIMActionPerformed(evt);
            }
        });
        getContentPane().add(btnCariNIM);
        btnCariNIM.setBounds(610, 130, 60, 30);
        getContentPane().add(tfNama);
        tfNama.setBounds(420, 170, 250, 30);
        getContentPane().add(tfLahir);
        tfLahir.setBounds(420, 250, 250, 30);

        rbL.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(rbL);
        rbL.setBounds(420, 290, 30, 29);

        rbP.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(rbP);
        rbP.setBounds(470, 290, 30, 29);
        getContentPane().add(tfAlamat);
        tfAlamat.setBounds(420, 330, 250, 90);

        cbJurusan.setFont(new java.awt.Font("Circular Std Book", 0, 14)); // NOI18N
        cbJurusan.setToolTipText("");
        getContentPane().add(cbJurusan);
        cbJurusan.setBounds(420, 430, 250, 30);

        btnEdit.setBackground(new java.awt.Color(0, 255, 0));
        btnEdit.setFont(new java.awt.Font("Circular Std Book", 0, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit);
        btnEdit.setBounds(440, 470, 60, 30);

        btnHapus.setBackground(new java.awt.Color(212, 37, 37));
        btnHapus.setFont(new java.awt.Font("Circular Std Book", 0, 14)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus);
        btnHapus.setBounds(510, 470, 80, 30);

        btnReset.setBackground(new java.awt.Color(104, 104, 104));
        btnReset.setFont(new java.awt.Font("Circular Std Book", 0, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset);
        btnReset.setBounds(600, 470, 70, 30);

        lbStatus.setFont(new java.awt.Font("Circular Std Book", 0, 14)); // NOI18N
        lbStatus.setText("Masukkan NIM, lalu klik Edit / Hapus");
        getContentPane().add(lbStatus);
        lbStatus.setBounds(420, 510, 520, 20);

        backgroundImage.setForeground(new java.awt.Color(255, 255, 255));
        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Edit Delete Mahasiswa.png"))); // NOI18N
        getContentPane().add(backgroundImage);
        backgroundImage.setBounds(0, 0, 1280, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbTambahMhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTambahMhsMouseClicked
        TambahMahasiswa tambahmhs = new TambahMahasiswa();
        tambahmhs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbTambahMhsMouseClicked

    private void lbEhMhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEhMhsMouseClicked
        
    }//GEN-LAST:event_lbEhMhsMouseClicked

    private void lbTambahJurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTambahJurMouseClicked
        TambahJurusan tambahjur = new TambahJurusan();
        tambahjur.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbTambahJurMouseClicked

    private void lbLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoutMouseClicked
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbLogoutMouseClicked

    private void btnCariNIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariNIMActionPerformed
        // Ambil NIM yang diinputkan oleh pengguna
        String nim = tfNIM.getText();

        // Lakukan validasi NIM
        if (nim.isEmpty()) {
            lbStatus.setText("Masukkan NIM yang ingin dicari.");
            return;
        }

        // Buat query SQL untuk mencari data mahasiswa berdasarkan NIM
        String query = "SELECT * FROM mahasiswa WHERE nim = ?";

        try {
            PreparedStatement ps = DB.conn.prepareStatement(query);
            ps.setString(1, nim);

            ResultSet hasil = ps.executeQuery();

            if (hasil.next()) {
                // Jika data ditemukan, isi field input dengan data mahasiswa
                tfNama.setText(hasil.getString("nama"));
                tfLahir.setText(hasil.getString("lahir"));
                String jenisKelamin = hasil.getString("jenis");
                if (jenisKelamin.equals("L")) {
                    rbL.setSelected(true);
                    rbP.setSelected(false);
                } else {
                    rbL.setSelected(false);
                    rbP.setSelected(true);
                }
                tfAlamat.setText(hasil.getString("alamat"));

                // Pilih jurusan yang sesuai di ComboBox cbJurusan
                String kdJurusan = hasil.getString("kdjurusan");
                String jurusanQuery = "SELECT namajurusan FROM jurusan WHERE kdjurusan = ?";
                PreparedStatement jurusanPs = DB.conn.prepareStatement(jurusanQuery);
                jurusanPs.setString(1, kdJurusan);
                ResultSet jurusanResult = jurusanPs.executeQuery();
                if (jurusanResult.next()) {
                    String jurusan = jurusanResult.getString("namajurusan");
                    cbJurusan.setSelectedItem(jurusan);
                }

                lbStatus.setText("Data mahasiswa ditemukan.");
            } else {
                lbStatus.setText("Data mahasiswa dengan NIM tersebut tidak ditemukan.");
                // Reset field input jika data tidak ditemukan
                tfNama.setText("");
                tfLahir.setText("");
                rbL.setSelected(false);
                rbP.setSelected(false);
                tfAlamat.setText("");
                cbJurusan.setSelectedItem("Semua");
            }
        } catch (SQLException e) {
            lbStatus.setText("Terjadi kesalahan: " + e.getMessage());
        }
    }//GEN-LAST:event_btnCariNIMActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        lbStatus.setText("Dibatalkan");
        tfNIM.setText("");
        tfLahir.setText("");
        tfNama.setText("");
        tfAlamat.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void lbCariMhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCariMhsMouseClicked
        CariMahasiswa carimhs = new CariMahasiswa();
        carimhs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbCariMhsMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // Ambil NIM yang diinputkan oleh pengguna
        String nim = tfNIM.getText();

        // Lakukan validasi NIM
        if (nim.isEmpty()) {
            lbStatus.setText("Masukkan NIM yang ingin dihapus.");
            return;
        }

        deleteConfirmationCount++;

        if (deleteConfirmationCount == 1) {
            lbStatus.setText("Yakin untuk menghapus? Klik hapus dua kali lagi");
        } else if (deleteConfirmationCount == 2) {
            lbStatus.setText("Yakin untuk menghapus? Klik hapus satu kali lagi");
        } else if (deleteConfirmationCount == 3) {
            // Lanjutkan dengan operasi DELETE hanya jika konfirmasi ketiga kali
            lbStatus.setText("Data berhasil dihapus.");
            // Reset field input setelah data dihapus
            tfNama.setText("");
            tfLahir.setText("");
            rbL.setSelected(false);
            rbP.setSelected(false);
            tfAlamat.setText("");
            cbJurusan.setSelectedItem("Semua");

            // Buat query SQL untuk melakukan DELETE
            String query = "DELETE FROM mahasiswa WHERE nim = ?";
            try {
                PreparedStatement ps = DB.conn.prepareStatement(query);
                ps.setString(1, nim);
                ps.executeUpdate();
            } catch (SQLException e) {
                lbStatus.setText("Terjadi kesalahan: " + e.getMessage());
            }
            deleteConfirmationCount = 0; // Reset konfirmasi setelah data dihapus
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // Ambil NIM yang diinputkan oleh pengguna
        String nim = tfNIM.getText();

        // Lakukan validasi NIM
        if (nim.isEmpty()) {
            lbStatus.setText("Masukkan NIM yang ingin diupdate.");
            return;
        }

        // Ambil nilai dari field input
        String nama = tfNama.getText();
        String lahir = tfLahir.getText();
        String jenisKelamin = rbL.isSelected() ? "L" : "P";
        String alamat = tfAlamat.getText();
        String jurusan = String.valueOf(cbJurusan.getSelectedItem());

        // Buat query SQL untuk melakukan UPDATE
        String query = "UPDATE mahasiswa SET nama = ?, lahir = ?, jenis = ?, alamat = ?, kdjurusan = ? WHERE nim = ?";

        try {
            PreparedStatement ps = DB.conn.prepareStatement(query);
            ps.setString(1, nama);
            ps.setString(2, lahir);
            ps.setString(3, jenisKelamin);
            ps.setString(4, alamat);

            // Dapatkan kdjurusan berdasarkan pilihan ComboBox
            String kdJurusan = ""; // Inisialisasi dengan nilai default jika tidak ada yang cocok
            String jurusanQuery = "SELECT kdjurusan FROM jurusan WHERE namajurusan = ?";
            PreparedStatement jurusanPs = DB.conn.prepareStatement(jurusanQuery);
            jurusanPs.setString(1, jurusan);
            ResultSet jurusanResult = jurusanPs.executeQuery();
            if (jurusanResult.next()) {
                kdJurusan = jurusanResult.getString("kdjurusan");
            }

            ps.setString(5, kdJurusan);
            ps.setString(6, nim);

            int rowsUpdated = ps.executeUpdate();

            if (rowsUpdated > 0) {
                lbStatus.setText("Data mahasiswa berhasil diupdate.");
            } else {
                lbStatus.setText("Tidak ada data yang diupdate.");
            }
        } catch (SQLException e) {
            lbStatus.setText("Terjadi kesalahan: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEditActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CariMahasiswa().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JButton btnCariNIM;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cbJurusan;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lbCariMhs;
    private javax.swing.JLabel lbEhMhs;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel lbTambahJur;
    private javax.swing.JLabel lbTambahMhs;
    private javax.swing.JRadioButton rbL;
    private javax.swing.JRadioButton rbP;
    private javax.swing.JTextField tfAlamat;
    private javax.swing.JTextField tfLahir;
    private javax.swing.JTextField tfNIM;
    private javax.swing.JTextField tfNama;
    // End of variables declaration//GEN-END:variables
}
