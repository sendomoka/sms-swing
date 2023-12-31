import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

public class TambahMahasiswa extends javax.swing.JFrame {

    Connect DB = new Connect();
    public TambahMahasiswa() {
        initComponents();
        DB.main();
        tampilJurusanComboBox();
        
        // Listener untuk ComboBox cbJurusan
        cbJurusan.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    updateNIM(); // Panggil method untuk memperbarui NIM
                }
            }
        });

        // Listener untuk TextField tfAngkatan
        tfAngkatan.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateNIM(); // Panggil method untuk memperbarui NIM saat ada perubahan
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateNIM(); // Panggil method untuk memperbarui NIM saat ada perubahan
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Tidak digunakan untuk plain text components
            }
        });
        
    }
    
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
    
    // Method untuk memperbarui NIM
    private void updateNIM() {
        String jurusan = String.valueOf(cbJurusan.getSelectedItem());
        String angkatan = tfAngkatan.getText();

        // Pastikan tfNIM hanya mengandung 3 digit terakhir angka
        String nimDigits = tfNIM.getText();
        if (nimDigits.length() > 3) {
            nimDigits = nimDigits.substring(nimDigits.length() - 3);
        }

        // Dapatkan kdjurusan berdasarkan pilihan ComboBox
        String kdJurusan = ""; // Inisialisasi dengan nilai default jika tidak ada yang cocok
        try {
            String query = "SELECT kdjurusan FROM jurusan WHERE namajurusan = ?";
            PreparedStatement ps = DB.conn.prepareStatement(query);
            ps.setString(1, jurusan);
            ResultSet hasil = ps.executeQuery();
            if (hasil.next()) {
                kdJurusan = hasil.getString("kdjurusan");
            }
        } catch (SQLException e) {
            lbStatus.setText("Terjadi kesalahan: " + e.getMessage());
        }

        // Gabungkan semua informasi untuk membuat NIM
        String nim = "H1" + kdJurusan + angkatan + nimDigits;

        // Isi tfNIM dengan NIM yang telah dibuat
        tfNIM.setText(nim);
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
        tfNama = new javax.swing.JTextField();
        tfLahir = new javax.swing.JTextField();
        rbL = new javax.swing.JRadioButton();
        rbP = new javax.swing.JRadioButton();
        tfAlamat = new javax.swing.JTextField();
        cbJurusan = new javax.swing.JComboBox<>();
        tfAngkatan = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
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
        lbCariMhs.setBounds(21, 110, 200, 40);

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
        getContentPane().add(tfNama);
        tfNama.setBounds(420, 140, 250, 30);
        getContentPane().add(tfLahir);
        tfLahir.setBounds(420, 210, 250, 30);

        rbL.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(rbL);
        rbL.setBounds(420, 250, 30, 29);

        rbP.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(rbP);
        rbP.setBounds(470, 250, 30, 29);
        getContentPane().add(tfAlamat);
        tfAlamat.setBounds(420, 290, 250, 90);

        cbJurusan.setFont(new java.awt.Font("Circular Std Book", 0, 14)); // NOI18N
        cbJurusan.setToolTipText("");
        getContentPane().add(cbJurusan);
        cbJurusan.setBounds(420, 390, 250, 30);
        getContentPane().add(tfAngkatan);
        tfAngkatan.setBounds(420, 430, 250, 30);

        btnTambah.setBackground(new java.awt.Color(37, 157, 212));
        btnTambah.setFont(new java.awt.Font("Circular Std Book", 0, 14)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah);
        btnTambah.setBounds(500, 470, 90, 30);

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
        lbStatus.setText("Isi data, tidak boleh ada yang kosong");
        getContentPane().add(lbStatus);
        lbStatus.setBounds(420, 510, 470, 20);

        backgroundImage.setForeground(new java.awt.Color(255, 255, 255));
        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Tambah Mahasiswa.png"))); // NOI18N
        getContentPane().add(backgroundImage);
        backgroundImage.setBounds(0, 0, 1280, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbTambahMhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTambahMhsMouseClicked
        
    }//GEN-LAST:event_lbTambahMhsMouseClicked

    private void lbEhMhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEhMhsMouseClicked
        EditHapusMahasiswa ehmhs = new EditHapusMahasiswa();
        ehmhs.setVisible(true);
        this.dispose();
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

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // Ambil data dari semua field input
        String nim = tfNIM.getText();
        String nama = tfNama.getText();
        String lahir = tfLahir.getText();
        String jenisKelamin = rbL.isSelected() ? "L" : "P";
        String alamat = tfAlamat.getText();
        String jurusan = String.valueOf(cbJurusan.getSelectedItem());
        String angkatan = tfAngkatan.getText();

        // Lakukan validasi input, pastikan semua field telah terisi
        if (nim.isEmpty() || nama.isEmpty() || lahir.isEmpty() || alamat.isEmpty() || angkatan.isEmpty()) {
            lbStatus.setText("Semua field harus diisi!");
            return;
        }

        // Selanjutnya, tambahkan kode untuk meng-insert data ke tabel mahasiswa
        try {
            String query = "INSERT INTO mahasiswa (nim, nama, lahir, jenis, alamat, kdjurusan, angkatan) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = DB.conn.prepareStatement(query);
            ps.setString(1, nim);
            ps.setString(2, nama);
            ps.setString(3, lahir);
            ps.setString(4, jenisKelamin);
            ps.setString(5, alamat);

            // Dapatkan kdjurusan berdasarkan pilihan ComboBox
            String kdJurusan = ""; // Inisialisasi dengan nilai default jika tidak ada yang cocok
            try {
                String jurusanQuery = "SELECT kdjurusan FROM jurusan WHERE namajurusan = ?";
                PreparedStatement jurusanPs = DB.conn.prepareStatement(jurusanQuery);
                jurusanPs.setString(1, jurusan);
                ResultSet jurusanResult = jurusanPs.executeQuery();
                if (jurusanResult.next()) {
                    kdJurusan = jurusanResult.getString("kdjurusan");
                }
            } catch (SQLException e) {
                lbStatus.setText("Terjadi kesalahan: " + e.getMessage());
            }

            ps.setString(6, kdJurusan);
            ps.setString(7, angkatan);

            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                lbStatus.setText("Data mahasiswa berhasil ditambahkan!");
                // Reset semua field input setelah berhasil menambahkan data
                tfNIM.setText("");
                tfNama.setText("");
                tfLahir.setText("");
                tfAlamat.setText("");
                tfAngkatan.setText("");
            }
        } catch (SQLException e) {
            lbStatus.setText("Terjadi kesalahan: " + e.getMessage());
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        lbStatus.setText("Dibatalkan");
        tfNIM.setText("");
        tfLahir.setText("");
        tfAngkatan.setText("");
        tfNama.setText("");
        tfAlamat.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void lbCariMhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCariMhsMouseClicked
        CariMahasiswa carimhs = new CariMahasiswa();
        carimhs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbCariMhsMouseClicked

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
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTambah;
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
    private javax.swing.JTextField tfAngkatan;
    private javax.swing.JTextField tfLahir;
    private javax.swing.JTextField tfNIM;
    private javax.swing.JTextField tfNama;
    // End of variables declaration//GEN-END:variables
}
