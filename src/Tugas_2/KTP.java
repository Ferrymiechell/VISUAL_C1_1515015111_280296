/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_2;

/**
 *
 * @author Miechel
 */
public class KTP extends javax.swing.JFrame {

    /**
     * Creates new form KTP
     */
    public KTP() {
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

        KTP = new javax.swing.JPanel();
        Body = new javax.swing.JPanel();
        Merah = new javax.swing.JPanel();
        Putih = new javax.swing.JPanel();
        Formulir = new javax.swing.JPanel();
        Lnama = new javax.swing.JLabel();
        Lttl = new javax.swing.JLabel();
        Lalamat = new javax.swing.JLabel();
        Ldesa = new javax.swing.JLabel();
        Ljkel = new javax.swing.JLabel();
        Lrtrw = new javax.swing.JLabel();
        Hnama = new javax.swing.JTextField();
        Htempat = new javax.swing.JTextField();
        Halamat = new javax.swing.JTextField();
        Lcamat = new javax.swing.JLabel();
        Lagama = new javax.swing.JLabel();
        Lstatus = new javax.swing.JLabel();
        Lgoldar = new javax.swing.JLabel();
        Lkerja = new javax.swing.JLabel();
        Lwarga = new javax.swing.JLabel();
        Hkerja = new javax.swing.JTextField();
        Hrt = new javax.swing.JTextField();
        Hdesa = new javax.swing.JTextField();
        Hcamat = new javax.swing.JTextField();
        Hrw = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        PanelFoto = new javax.swing.JPanel();
        HFoto = new javax.swing.JLabel();
        Htanggal = new javax.swing.JTextField();
        Hjkel = new javax.swing.JTextField();
        Hagama = new javax.swing.JTextField();
        Hstatus = new javax.swing.JTextField();
        Hgoldar = new javax.swing.JTextField();
        Hwarga = new javax.swing.JTextField();
        BTNisiulang = new javax.swing.JButton();
        BTNexit = new javax.swing.JButton();
        Header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("KARTU TANDA PENDUDUK");
        setResizable(false);

        Body.setBackground(new java.awt.Color(115, 187, 255));

        Merah.setBackground(new java.awt.Color(255, 0, 0));
        Merah.setPreferredSize(new java.awt.Dimension(0, 5));

        javax.swing.GroupLayout MerahLayout = new javax.swing.GroupLayout(Merah);
        Merah.setLayout(MerahLayout);
        MerahLayout.setHorizontalGroup(
            MerahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        MerahLayout.setVerticalGroup(
            MerahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        Putih.setBackground(new java.awt.Color(255, 255, 255));
        Putih.setPreferredSize(new java.awt.Dimension(0, 5));

        javax.swing.GroupLayout PutihLayout = new javax.swing.GroupLayout(Putih);
        Putih.setLayout(PutihLayout);
        PutihLayout.setHorizontalGroup(
            PutihLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PutihLayout.setVerticalGroup(
            PutihLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        Formulir.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATA DIRI", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        Formulir.setOpaque(false);

        Lnama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lnama.setText("Nama");

        Lttl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lttl.setText("Tempat / TGL Lahir");

        Lalamat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lalamat.setText("Alamat");

        Ldesa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Ldesa.setText("Kel / Desa");

        Ljkel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Ljkel.setText("Jenis Kelamin");

        Lrtrw.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lrtrw.setText("RT / RW");

        Hnama.setEditable(false);
        Hnama.setBackground(new java.awt.Color(115, 187, 255));
        Hnama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Htempat.setEditable(false);
        Htempat.setBackground(new java.awt.Color(115, 187, 255));
        Htempat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Halamat.setEditable(false);
        Halamat.setBackground(new java.awt.Color(115, 187, 255));
        Halamat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Lcamat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lcamat.setText("Kecamatan");

        Lagama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lagama.setText("Agama");

        Lstatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lstatus.setText("Status Perkawinan");

        Lgoldar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lgoldar.setText("Gol. Darah");

        Lkerja.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lkerja.setText("Pekerjaan");

        Lwarga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lwarga.setText("Kewarganegaraan");

        Hkerja.setEditable(false);
        Hkerja.setBackground(new java.awt.Color(115, 187, 255));
        Hkerja.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Hrt.setEditable(false);
        Hrt.setBackground(new java.awt.Color(115, 187, 255));
        Hrt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Hdesa.setEditable(false);
        Hdesa.setBackground(new java.awt.Color(115, 187, 255));
        Hdesa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Hcamat.setEditable(false);
        Hcamat.setBackground(new java.awt.Color(115, 187, 255));
        Hcamat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Hrw.setEditable(false);
        Hrw.setBackground(new java.awt.Color(115, 187, 255));
        Hrw.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("/");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("/");

        PanelFoto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Foto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        PanelFoto.setOpaque(false);

        HFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(24, 114, 253), null));

        javax.swing.GroupLayout PanelFotoLayout = new javax.swing.GroupLayout(PanelFoto);
        PanelFoto.setLayout(PanelFotoLayout);
        PanelFotoLayout.setHorizontalGroup(
            PanelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFotoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelFotoLayout.setVerticalGroup(
            PanelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFotoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );

        Htanggal.setEditable(false);
        Htanggal.setBackground(new java.awt.Color(115, 187, 255));
        Htanggal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Hjkel.setEditable(false);
        Hjkel.setBackground(new java.awt.Color(115, 187, 255));
        Hjkel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Hagama.setEditable(false);
        Hagama.setBackground(new java.awt.Color(115, 187, 255));
        Hagama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Hstatus.setEditable(false);
        Hstatus.setBackground(new java.awt.Color(115, 187, 255));
        Hstatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Hgoldar.setEditable(false);
        Hgoldar.setBackground(new java.awt.Color(115, 187, 255));
        Hgoldar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Hwarga.setEditable(false);
        Hwarga.setBackground(new java.awt.Color(115, 187, 255));
        Hwarga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout FormulirLayout = new javax.swing.GroupLayout(Formulir);
        Formulir.setLayout(FormulirLayout);
        FormulirLayout.setHorizontalGroup(
            FormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormulirLayout.createSequentialGroup()
                .addGroup(FormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormulirLayout.createSequentialGroup()
                        .addGroup(FormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FormulirLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(FormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lnama)
                                    .addComponent(Lttl)
                                    .addComponent(Ljkel)
                                    .addComponent(Lalamat)))
                            .addGroup(FormulirLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(FormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Ldesa)
                                    .addComponent(Lrtrw)
                                    .addComponent(Lcamat)))
                            .addGroup(FormulirLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Lstatus))
                            .addGroup(FormulirLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Lagama)))
                        .addGap(24, 24, 24)
                        .addGroup(FormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(FormulirLayout.createSequentialGroup()
                                .addComponent(Hrt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Hrw, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FormulirLayout.createSequentialGroup()
                                .addComponent(Htempat, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Htanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Hnama, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Halamat, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Hcamat)
                            .addComponent(Hdesa)
                            .addComponent(Hjkel, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                            .addComponent(Hagama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                            .addComponent(Hstatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)))
                    .addGroup(FormulirLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(FormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lwarga)
                            .addComponent(Lkerja)
                            .addComponent(Lgoldar))
                        .addGap(32, 32, 32)
                        .addGroup(FormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Hgoldar, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                            .addComponent(Hwarga, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                            .addComponent(Hkerja, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(PanelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        FormulirLayout.setVerticalGroup(
            FormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormulirLayout.createSequentialGroup()
                .addGroup(FormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormulirLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Lnama))
                    .addGroup(FormulirLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Hnama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormulirLayout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(Lttl))
                    .addComponent(Htanggal)
                    .addGroup(FormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Htempat, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addGap(12, 12, 12)
                .addGroup(FormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ljkel)
                    .addComponent(Hjkel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Halamat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lalamat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lrtrw)
                    .addComponent(Hrt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hrw, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hdesa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ldesa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hcamat, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lcamat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lagama)
                    .addComponent(Hagama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(FormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lstatus)
                    .addComponent(Hstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lgoldar)
                    .addComponent(Hgoldar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lkerja)
                    .addComponent(Hkerja, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FormulirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lwarga)
                    .addComponent(Hwarga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
            .addGroup(FormulirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BTNisiulang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTNisiulang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/zoom.png"))); // NOI18N
        BTNisiulang.setText("Isi Ulang Data");
        BTNisiulang.setToolTipText("");
        BTNisiulang.setFocusPainted(false);
        BTNisiulang.setOpaque(false);
        BTNisiulang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNisiulangActionPerformed(evt);
            }
        });

        BTNexit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTNexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sign-out.png"))); // NOI18N
        BTNexit.setText("Keluar");
        BTNexit.setToolTipText("");
        BTNexit.setFocusPainted(false);
        BTNexit.setOpaque(false);
        BTNexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Merah, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
            .addComponent(Putih, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addComponent(BTNisiulang)
                .addGap(18, 18, 18)
                .addComponent(BTNexit)
                .addGap(231, 231, 231))
            .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BodyLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Formulir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        BodyLayout.setVerticalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Merah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Putih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 548, Short.MAX_VALUE)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNisiulang, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNexit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BodyLayout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(Formulir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(64, Short.MAX_VALUE)))
        );

        Header.setBackground(new java.awt.Color(39, 72, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("KARTU TANDA PENDUDUK");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REPUBLIK INDONESIA");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(177, 177, 177))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        javax.swing.GroupLayout KTPLayout = new javax.swing.GroupLayout(KTP);
        KTP.setLayout(KTPLayout);
        KTPLayout.setHorizontalGroup(
            KTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KTPLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(KTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        KTPLayout.setVerticalGroup(
            KTPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KTPLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(KTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(KTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNexitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BTNexitActionPerformed

    private void BTNisiulangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNisiulangActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new KTP().setVisible(false);
    }//GEN-LAST:event_BTNisiulangActionPerformed

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
            java.util.logging.Logger.getLogger(KTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KTP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNexit;
    private javax.swing.JButton BTNisiulang;
    private javax.swing.JPanel Body;
    private javax.swing.JPanel Formulir;
    public static javax.swing.JLabel HFoto;
    public static javax.swing.JTextField Hagama;
    public static javax.swing.JTextField Halamat;
    public static javax.swing.JTextField Hcamat;
    public static javax.swing.JTextField Hdesa;
    private javax.swing.JPanel Header;
    public static javax.swing.JTextField Hgoldar;
    public static javax.swing.JTextField Hjkel;
    public static javax.swing.JTextField Hkerja;
    public static javax.swing.JTextField Hnama;
    public static javax.swing.JTextField Hrt;
    public static javax.swing.JTextField Hrw;
    public static javax.swing.JTextField Hstatus;
    public static javax.swing.JTextField Htanggal;
    public static javax.swing.JTextField Htempat;
    public static javax.swing.JTextField Hwarga;
    private javax.swing.JPanel KTP;
    private javax.swing.JLabel Lagama;
    private javax.swing.JLabel Lalamat;
    private javax.swing.JLabel Lcamat;
    private javax.swing.JLabel Ldesa;
    private javax.swing.JLabel Lgoldar;
    private javax.swing.JLabel Ljkel;
    private javax.swing.JLabel Lkerja;
    private javax.swing.JLabel Lnama;
    private javax.swing.JLabel Lrtrw;
    private javax.swing.JLabel Lstatus;
    private javax.swing.JLabel Lttl;
    private javax.swing.JLabel Lwarga;
    private javax.swing.JPanel Merah;
    private javax.swing.JPanel PanelFoto;
    private javax.swing.JPanel Putih;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
