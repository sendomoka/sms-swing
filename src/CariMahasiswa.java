import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CariMahasiswa extends javax.swing.JFrame {

    Connect DB = new Connect();
    public CariMahasiswa() {
        initComponents();
        DB.main();
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
        tfLahir = new javax.swing.JTextField();
        rbL = new javax.swing.JRadioButton();
        rbP = new javax.swing.JRadioButton();
        rbSemua = new javax.swing.JRadioButton();
        cbJurusan = new javax.swing.JComboBox<>();
        lbStatus = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        tfAlamat = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        spTable = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        backgroundImage = new javax.swing.JLabel();

        lb.setFont(new java.awt.Font("Circular Std Book", 0, 20)); // NOI18N
        lb.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1280, 760));
        setMinimumSize(new java.awt.Dimension(1280, 760));
        setName("homeFrame"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);
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
        getContentPane().add(tfLahir);
        tfLahir.setBounds(420, 170, 250, 30);

        rbL.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(rbL);
        rbL.setBounds(420, 130, 30, 29);

        rbP.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(rbP);
        rbP.setBounds(470, 130, 30, 29);

        rbSemua.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(rbSemua);
        rbSemua.setBounds(520, 130, 30, 29);

        cbJurusan.setFont(new java.awt.Font("Circular Std Book", 0, 14)); // NOI18N
        cbJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua" }));
        getContentPane().add(cbJurusan);
        cbJurusan.setBounds(420, 220, 250, 30);

        lbStatus.setFont(new java.awt.Font("Circular Std Book", 0, 14)); // NOI18N
        lbStatus.setText("Isi kriteria yang ingin di cari");
        getContentPane().add(lbStatus);
        lbStatus.setBounds(420, 282, 250, 20);
        getContentPane().add(tfNama);
        tfNama.setBounds(970, 90, 250, 30);
        getContentPane().add(tfAlamat);
        tfAlamat.setBounds(970, 140, 250, 90);

        btnCari.setBackground(new java.awt.Color(37, 157, 212));
        btnCari.setFont(new java.awt.Font("Circular Std Book", 0, 14)); // NOI18N
        btnCari.setForeground(new java.awt.Color(255, 255, 255));
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        getContentPane().add(btnCari);
        btnCari.setBounds(1070, 250, 70, 30);

        btnReset.setBackground(new java.awt.Color(104, 104, 104));
        btnReset.setFont(new java.awt.Font("Circular Std Book", 0, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        getContentPane().add(btnReset);
        btnReset.setBounds(1150, 250, 70, 30);

        Table.setFont(new java.awt.Font("Circular Std Book", 0, 14)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Tanggal Lahir", "Jenis Kelamin", "Alamat", "Jurusan"
            }
        ));
        spTable.setViewportView(Table);

        getContentPane().add(spTable);
        spTable.setBounds(300, 320, 920, 330);

        backgroundImage.setForeground(new java.awt.Color(255, 255, 255));
        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Cari Mahasiswa.png"))); // NOI18N
        getContentPane().add(backgroundImage);
        backgroundImage.setBounds(0, 0, 1280, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbTambahMhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTambahMhsMouseClicked
        //TambahMahasiswa tambahmhs = new TambahMahasiswa();
        //tambahmhs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbTambahMhsMouseClicked

    private void lbEhMhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEhMhsMouseClicked
        //EditHapusMahasiswa ehmhs = new EditHapusMahasiswa();
        //ehmhs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbEhMhsMouseClicked

    private void lbTambahJurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTambahJurMouseClicked
        //TambahJurusan tambahjur = new TambahJurusan();
        //tambahjur.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbTambahJurMouseClicked

    private void lbLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoutMouseClicked
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbLogoutMouseClicked

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        DefaultTableModel modelmhs = (DefaultTableModel) Table.getModel();
        modelmhs.setRowCount(0);
        String jurusan;
        String jenis;
        if (cbJurusan.getSelectedIndex() == 0) {
            jurusan = "";
        } else {
            jurusan = String.valueOf(cbJurusan.getSelectedItem());
        }
        if (rbL.isSelected()) {
            jenis = "L";
        } else if (rbP.isSelected()) {
             jenis = "P";
        } else {
             jenis = "";
        }
        try {
            if (tfNama.getText().equals("") && tfNIM.getText().equals("") &&tfLahir.getText().equals("") && tfAlamat.getText().equals("") && rbSemua.isSelected() && cbJurusan.getSelectedIndex() == 0) {
                lbStatus.setText("Semua Mahasiswa");
                String query = "SELECT m.nim, m.nama, m.lahir, m.jenis, m.alamat, j.namajurusan FROM mahasiswa m LEFT JOIN jurusan j ON m.kdjurusan = j.kdjurusan";
                ResultSet hasil = DB.query(query);
                while (hasil.next()) {
                    modelmhs.addRow(new Object[] {hasil.getString(1),hasil.getString(2),hasil.getString(3),hasil.getString(4),hasil.getString(5),hasil.getString(6)});                
                }
                modelmhs.addRow(new Object[] {hasil.getString(1),hasil.getString(2)});
            } else {
                lbStatus.setText("Data di temukan");
                String query = String.format("SELECT m.nim, m.nama, m.lahir, m.jenis, m.alamat, j.namajurusan FROM mahasiswa m LEFT JOIN jurusan j ON m.kdjurusan = j.kdjurusan WHERE m.nim LIKE '%"+ tfNIM.getText()+"%' AND m.nama LIKE '%"+ tfNama.getText()+"%' AND m.lahir LIKE '%"+ tfLahir.getText()+"%' AND m.jenis LIKE '%"+ jenis +"%' AND m.alamat LIKE '%"+ tfAlamat.getText()+"%' AND j.namajurusan LIKE '%"+ jurusan +"%'");
                ResultSet hasil = DB.query(query);
                while (hasil.next()) {
                    modelmhs.addRow(new Object[] {hasil.getString(1),hasil.getString(2),hasil.getString(3),hasil.getString(4),hasil.getString(5),hasil.getString(6)});                
                }
            }
            if (modelmhs.getRowCount()== 0) {
                lbStatus.setText("Data tidak di temukan");
            }
        } catch (SQLException e) {
            
        }
    }//GEN-LAST:event_btnCariActionPerformed

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
    private javax.swing.JTable Table;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JButton btnCari;
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
    private javax.swing.JRadioButton rbSemua;
    private javax.swing.JScrollPane spTable;
    private javax.swing.JTextField tfAlamat;
    private javax.swing.JTextField tfLahir;
    private javax.swing.JTextField tfNIM;
    private javax.swing.JTextField tfNama;
    // End of variables declaration//GEN-END:variables
}
