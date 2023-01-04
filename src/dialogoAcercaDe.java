//--------------------------------MIS COLABORADORES-----------------------------
/*
 * AgendaTelefonica.java
 *
 * Creada el 16 de octubre de 2008, 04:35 PM
 *
 * @author  Ing. Julio César González Moreno
 * @Colaborated Msc. Valeria Medina
 * @Complicated by Ing. Otón Castillo Navas
 * @Complicated by Ing. Denis Leopoldo Espinoza Hernández
 */

public class dialogoAcercaDe extends javax.swing.JDialog {
    
    public dialogoAcercaDe(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        getRootPane().setDefaultButton(btnAceptar);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImagen = new javax.swing.JLabel();
        lblNombreAplicacion = new javax.swing.JLabel();
        lblDescripcionUno = new javax.swing.JLabel();
        lblDescripcionDos = new javax.swing.JLabel();
        lblDescripcionTres = new javax.swing.JLabel();
        pnlCreditos = new javax.swing.JPanel();
        lblEscritaPor = new javax.swing.JLabel();
        lblJulioUno = new javax.swing.JLabel();
        lblIdeaOriginal = new javax.swing.JLabel();
        lblValeria = new javax.swing.JLabel();
        lblMejorasModificaciones = new javax.swing.JLabel();
        lblOton = new javax.swing.JLabel();
        lblDenis = new javax.swing.JLabel();
        lblJulioDos = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acerca de Agenda telefonica");
        setIconImage(null);
        setResizable(false);

        lblImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AgendaTelefonica.png"))); // NOI18N

        lblNombreAplicacion.setFont(new java.awt.Font("DejaVu Sans", 1, 18));
        lblNombreAplicacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreAplicacion.setText("Agenda telefonica v 1.0");

        lblDescripcionUno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescripcionUno.setText("La «Agenda telefonica» permite administrar números de");

        lblDescripcionDos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescripcionDos.setText("telófonos de forma rápida y fácil, tal y como si estuviesemos");

        lblDescripcionTres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescripcionTres.setText("utilizando nuestra tan acostumbrada guía telefonica.");

        pnlCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Créditos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        lblEscritaPor.setFont(new java.awt.Font("DejaVu Sans", 3, 13));
        lblEscritaPor.setText("Escrita por:");

        lblJulioUno.setText("Ing. Julio César González Moreno");

        lblIdeaOriginal.setFont(new java.awt.Font("DejaVu Sans", 3, 13));
        lblIdeaOriginal.setText("Idea original de:");

        lblValeria.setText("Msc. Valeria Mercedes Medina Rodriguez");

        lblMejorasModificaciones.setFont(new java.awt.Font("DejaVu Sans", 3, 13));
        lblMejorasModificaciones.setText("Mejoras y modificaciones de la idea original por:");

        lblOton.setText("Ing. Otón Jossemar Castillo Navas");

        lblDenis.setText("Ing. Denis Leopoldo Espinoza Hernández");

        lblJulioDos.setText("Ing. Julio César González Moreno");

        javax.swing.GroupLayout pnlCreditosLayout = new javax.swing.GroupLayout(pnlCreditos);
        pnlCreditos.setLayout(pnlCreditosLayout);
        pnlCreditosLayout.setHorizontalGroup(
            pnlCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCreditosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCreditosLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblValeria))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCreditosLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblJulioUno))
                    .addComponent(lblEscritaPor, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIdeaOriginal, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMejorasModificaciones, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCreditosLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(pnlCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDenis)
                            .addComponent(lblOton)
                            .addComponent(lblJulioDos))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCreditosLayout.setVerticalGroup(
            pnlCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCreditosLayout.createSequentialGroup()
                .addComponent(lblEscritaPor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblJulioUno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIdeaOriginal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValeria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMejorasModificaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDenis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblJulioDos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                    .addComponent(pnlCreditos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblImagen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                    .addComponent(lblNombreAplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                    .addComponent(lblDescripcionUno, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                    .addComponent(lblDescripcionDos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                    .addComponent(lblDescripcionTres, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombreAplicacion)
                .addGap(18, 18, 18)
                .addComponent(lblDescripcionUno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescripcionDos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescripcionTres)
                .addGap(18, 18, 18)
                .addComponent(pnlCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-431)/2, (screenSize.height-574)/2, 431, 574);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed
    
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new dialogoAcercaDe(new javax.swing.JFrame(), true).setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel lblDenis;
    private javax.swing.JLabel lblDescripcionDos;
    private javax.swing.JLabel lblDescripcionTres;
    private javax.swing.JLabel lblDescripcionUno;
    private javax.swing.JLabel lblEscritaPor;
    private javax.swing.JLabel lblIdeaOriginal;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblJulioDos;
    private javax.swing.JLabel lblJulioUno;
    private javax.swing.JLabel lblMejorasModificaciones;
    private javax.swing.JLabel lblNombreAplicacion;
    private javax.swing.JLabel lblOton;
    private javax.swing.JLabel lblValeria;
    private javax.swing.JPanel pnlCreditos;
    // End of variables declaration//GEN-END:variables
}
