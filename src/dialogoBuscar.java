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

//----------------------------MIS IMPORTS---------------------------------------
import java.sql.*;
import javax.swing.*;

public class dialogoBuscar extends javax.swing.JDialog
{
    public dialogoBuscar(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        objAt = (AgendaTelefonica)parent;
        getRootPane().setDefaultButton(btnBuscar);
        txtNombres.requestFocus();  //Lanzamos el foco sobre la caja de texto Nombres
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBuscar = new javax.swing.JPanel();
        lblNombres = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblDepartamento = new javax.swing.JLabel();
        cmbDepartamento = new javax.swing.JComboBox();
        lblMunicipio = new javax.swing.JLabel();
        txtMunicipio = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar...");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Buscar", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        lblNombres.setText("Nombres:");

        txtNombres.setToolTipText("Inserte aquí el nombre que desea incluir en su busqueda");
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });

        lblApellidos.setText("Apellidos:");

        txtApellidos.setToolTipText("Inserte aquí el apellido que desea incluir en su busqueda");
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });

        lblDireccion.setText("Dirección:");

        txtDireccion.setToolTipText("Inserte aquí la dirección que desea incluir en su busqueda");
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        lblDepartamento.setText("Departamento:");

        cmbDepartamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Departamento>", "Boaco", "Carazo", "Chinandega", "Chontales", "Estelí", "Granada", "Jinotega", "León", "Madriz", "Managua", "Masaya", "Matagalpa", "Nueva Segovia", "Rivas", "Río San Juan", "RAAN", "RAAS" }));
        cmbDepartamento.setToolTipText("Seleccione aquí el departamento que desea incluir dentro de su busqueda");

        lblMunicipio.setText("Municipio:");

        txtMunicipio.setToolTipText("Inserte aquí el municipio que desea incluir en su busqueda");
        txtMunicipio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMunicipioKeyTyped(evt);
            }
        });

        lblTelefono.setText("Teléfono:");

        txtTelefono.setToolTipText("Inserte aquí el teléfono que desea incluir en su busqueda");
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBuscarLayout = new javax.swing.GroupLayout(pnlBuscar);
        pnlBuscar.setLayout(pnlBuscarLayout);
        pnlBuscarLayout.setHorizontalGroup(
            pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlBuscarLayout.createSequentialGroup()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBuscarLayout.createSequentialGroup()
                        .addComponent(lblTelefono)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefono))
                    .addGroup(pnlBuscarLayout.createSequentialGroup()
                        .addComponent(lblMunicipio)
                        .addGap(18, 18, 18)
                        .addComponent(txtMunicipio))
                    .addGroup(pnlBuscarLayout.createSequentialGroup()
                        .addComponent(lblDepartamento)
                        .addGap(18, 18, 18)
                        .addComponent(cmbDepartamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlBuscarLayout.createSequentialGroup()
                        .addComponent(lblDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccion))
                    .addGroup(pnlBuscarLayout.createSequentialGroup()
                        .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombres)
                            .addComponent(lblApellidos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtApellidos)
                            .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlBuscarLayout.setVerticalGroup(
            pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombres)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidos)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDepartamento)
                    .addComponent(cmbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMunicipio)
                    .addComponent(txtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlBuscarLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnBuscar, btnCancelar});

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 10));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Para llevar a cabo una búsqueda como mínimo deberá");
        jLabel1.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 10));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("de colocar un valor en alguno de los campos que");
        jLabel2.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 10));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(" aparecen en la parte de arriba.");
        jLabel3.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, 0, 0, Short.MAX_VALUE)
                    .addComponent(pnlBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-382)/2, (screenSize.height-474)/2, 382, 474);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        cerrarAplicacion();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar();//GEN-LAST:event_btnBuscarActionPerformed
    }                                         

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        maximoNumeroDeCaracteres(evt);
    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        maximoNumeroDeCaracteres(evt);
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        maximoNumeroDeCaracteres(evt);
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtMunicipioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMunicipioKeyTyped
        maximoNumeroDeCaracteres(evt);
    }//GEN-LAST:event_txtMunicipioKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        maximoNumeroDeCaracteres(evt);
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrarAplicacion();
    }//GEN-LAST:event_formWindowClosing
    
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new dialogoBuscar(new javax.swing.JFrame(), true).setVisible(true);
            }
        });
    }
    
    //-----------------------------MIS MÉTODOS----------------------------------
    private void buscar()
    {
        String consultaSQL = "";
        Statement stmtAux = null;
        ResultSet rsAux = null;
        if(!seColocoAlgoQueBuscar())
        {
            JOptionPane.showMessageDialog(this,"Es necesario colocar algo dentro de los patrones de busqueda","Buscar...",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if(cmbDepartamento.getSelectedItem().equals("<Departamento>"))
            consultaSQL = "SELECT * FROM Persona WHERE Nombres LIKE '" + txtNombres.getText() + "%' AND Apellidos LIKE '" + txtApellidos.getText() + "%' AND Direccion LIKE '%" + txtDireccion.getText() + "%' AND Municipio LIKE '%" + txtMunicipio.getText() + "%'";
        else
            consultaSQL = "SELECT * FROM Persona WHERE Nombres LIKE '" + txtNombres.getText() + "%' AND Apellidos LIKE '" + txtApellidos.getText() + "%' AND Direccion LIKE '%" + txtDireccion.getText() + "%' AND Departamento='" + cmbDepartamento.getSelectedItem().toString() +"' AND Municipio LIKE '%" + txtMunicipio.getText() + "%'";
        try
        {
            stmtAux = objAt.conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rsAux = stmtAux.executeQuery(consultaSQL);
            if(!rsAux.first())  //Si no podemos alcanzar el primer registro quiere decir que la consulta no devolvio resultados
            {
                objAt.limpiarAplicacion();
                objAt.deshabilitarBotonesAlHacerBusqueda();
                objAt.lblInformacion.setText("Resultados de la búsqueda - La búsqueda no devolvio resultados");
                JOptionPane.showMessageDialog(this,"La búsqueda no devolvio ningún resultado");
                return;
            }
            objAt.rsPersona = objAt.stmtPersona.executeQuery(consultaSQL);
            objAt.rsPersona.first();
            objAt.cargarDatosPersona();
            objAt.cargarDatosTelefono(String.valueOf(objAt.rsPersona.getInt("Id")));
            objAt.lblInformacion.setText("Resultados de la búsqueda");
            objAt.habilitarBotonesAlHacerBusqueda();
            objAt.consultaSQLDesdeElDialogoBuscar = consultaSQL;
        }
        catch(SQLException sqle)
        {
            JOptionPane.showMessageDialog(this,"Error en el método buscar" + "\n" + "Message: " + sqle.getMessage() + "\n" + "SQLState: " + sqle.getSQLState() + "\n" + "ErrorCode: " + sqle.getErrorCode(),"Error método buscar...",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private boolean seColocoAlgoQueBuscar()
    {
        if((txtNombres.getText().length()!=0) || (txtApellidos.getText().length()!=0) || (txtDireccion.getText().length()!=0) || (!(cmbDepartamento.getSelectedItem().equals("<Departamento>"))) || (txtMunicipio.getText().length()!=0) || (txtTelefono.getText().length()!=0))
            return true;
        else
            return false;
    }
    
    private void maximoNumeroDeCaracteres(java.awt.event.KeyEvent ke)
    {
        if(ke.getSource()==txtNombres)
        {
            if(txtNombres.getText().length()==100)  //El máximo número de caracteres permitidos para la caja de texto Nombres es de 100
            {
                ke.consume();
                return;
            }
        }
        if(ke.getSource()==txtApellidos)  //El máximo número de caracteres permitidos para la caja de texto Apellidos es de 100
        {
            if(txtApellidos.getText().length()==100)
            {
                ke.consume();
                return;
            }
        }
        if(ke.getSource()==txtDireccion)  //El máximo número de caracteres permitidos para la caja de texto Dirección es de 150
        {
            if(txtDireccion.getText().length()==150)
            {
                ke.consume();
                return;
            }
        }
        if(ke.getSource()==txtMunicipio)  //El máximo número de caracteres permitidos para la caja de texto Municipio es de 50
        {
            if(txtMunicipio.getText().length()==50)
            {
                ke.consume();
                return;
            }
        }
        if(ke.getSource()==txtTelefono)  //El máximo número de caracteres permitidos para la caja de texto Telefono es de 7
        {
            if(txtTelefono.getText().length()==7)
            {
                ke.consume();
                return;
            }
        }
    }
    
    private void cerrarAplicacion()
    {
        setVisible(false);
        dispose();
        objAt.dlgBuscar = null;
        objAt.cargarDatos("SELECT * FROM Persona");
        objAt.lblInformacion.setText("");
        objAt = null;
    }
    
    //-------------------------------MIS VARIABLES------------------------------
    private AgendaTelefonica objAt = null;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox cmbDepartamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblDepartamento;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblMunicipio;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JPanel pnlBuscar;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtMunicipio;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
