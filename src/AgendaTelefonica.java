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
import javax.swing.table.*;

public class AgendaTelefonica extends javax.swing.JFrame {
    
    public AgendaTelefonica() {
        initComponents();
        registrarDirver();  //Cargamos el controlar (Driver) JDBC
        /*Obtenemos la URL correspondiente del icono que vamos a colocar como imagen para nuestra aplicación*/
        java.net.URL url = getClass().getResource("Imagenes/AgendaTelefonica.png");
        java.awt.Image imagen = getToolkit().getImage(url);
        setIconImage(imagen);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        pnlNavegacionPorRegistros = new javax.swing.JPanel();
        btnCargarDatos = new javax.swing.JButton();
        btnPrimero = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        pnlEdicionDeRegistros = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        pnlTelefono = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTelefonos = new javax.swing.JTable();
        lblInformacion = new javax.swing.JLabel();
        mbarBarraDeMenus = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        sepSeparadorUno = new javax.swing.JSeparator();
        mnuItSalir = new javax.swing.JMenuItem();
        mnuEdicion = new javax.swing.JMenu();
        mnuItNuevo = new javax.swing.JMenuItem();
        mnuItInsertar = new javax.swing.JMenuItem();
        mnuItBorrar = new javax.swing.JMenuItem();
        mnuItActualizar = new javax.swing.JMenuItem();
        mnuOpciones = new javax.swing.JMenu();
        mnuItBuscar = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenu();
        mnuItAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda telefónica");
        setLocationByPlatform(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblNombres.setLabelFor(txtNombres);
        lblNombres.setText("Nombres:");

        txtNombres.setToolTipText("Ingrese el primer y segundo nombre");
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });

        lblApellidos.setLabelFor(txtApellidos);
        lblApellidos.setText("Apellidos:");

        txtApellidos.setToolTipText("Ingrese el primer y segundo apellido");
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });

        lblDireccion.setLabelFor(txtDireccion);
        lblDireccion.setText("Dirección:");

        txtDireccion.setToolTipText("Ingrese la dirección correspondiente");
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });

        lblDepartamento.setLabelFor(cmbDepartamento);
        lblDepartamento.setText("Departamento:");

        cmbDepartamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Boaco", "Carazo", "Chinandega", "Chontales", "Estelí", "Granada", "Jinotega", "León", "Madriz", "Managua", "Masaya", "Matagalpa", "Nueva Segovia", "Rivas", "Río San Juan", "RAAN", "RAAS" }));
        cmbDepartamento.setToolTipText("Seleccione el departamento al que pertenece");

        lblMunicipio.setLabelFor(txtMunicipio);
        lblMunicipio.setText("Municipio:");

        txtMunicipio.setToolTipText("Ingrese el municipio al que pertenece");
        txtMunicipio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMunicipioKeyTyped(evt);
            }
        });

        pnlNavegacionPorRegistros.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Navegación por registros", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        btnCargarDatos.setMnemonic('a');
        btnCargarDatos.setText("Cargar datos");
        btnCargarDatos.setToolTipText("Clic aquí para cargar los datos de la base de datos");
        btnCargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarDatosActionPerformed(evt);
            }
        });

        btnPrimero.setText("<<");
        btnPrimero.setToolTipText("Clic aquí para ir al primer registro");
        btnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeroActionPerformed(evt);
            }
        });

        btnAnterior.setText("<");
        btnAnterior.setToolTipText("Clic aquí para ir al registro anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        lblMensaje.setBackground(javax.swing.UIManager.getDefaults().getColor("Label.disabledShadow"));
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblMensaje.setFocusable(false);
        lblMensaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblMensaje.setOpaque(true);

        btnSiguiente.setText(">");
        btnSiguiente.setToolTipText("Clic aquí para ir al siguiente registro");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnUltimo.setText(">>");
        btnUltimo.setToolTipText("Clic aquí para ir al último registro");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNavegacionPorRegistrosLayout = new javax.swing.GroupLayout(pnlNavegacionPorRegistros);
        pnlNavegacionPorRegistros.setLayout(pnlNavegacionPorRegistrosLayout);
        pnlNavegacionPorRegistrosLayout.setHorizontalGroup(
            pnlNavegacionPorRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNavegacionPorRegistrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCargarDatos)
                .addGap(44, 44, 44)
                .addComponent(btnPrimero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUltimo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlNavegacionPorRegistrosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAnterior, btnPrimero, btnSiguiente, btnUltimo});

        pnlNavegacionPorRegistrosLayout.setVerticalGroup(
            pnlNavegacionPorRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNavegacionPorRegistrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNavegacionPorRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNavegacionPorRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCargarDatos)
                        .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPrimero)
                        .addComponent(btnAnterior))
                    .addGroup(pnlNavegacionPorRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSiguiente)
                        .addComponent(btnUltimo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlNavegacionPorRegistrosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAnterior, btnPrimero, btnSiguiente, btnUltimo, lblMensaje});

        pnlEdicionDeRegistros.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Edición de registros", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        btnNuevo.setMnemonic('u');
        btnNuevo.setText("Nuevo");
        btnNuevo.setToolTipText("Clic aquí para insertar un nuevo registro");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnInsertar.setMnemonic('i');
        btnInsertar.setText("Insertar");
        btnInsertar.setToolTipText("Clic aquí para guardar el nuevo registro");
        btnInsertar.setEnabled(false);
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnBorrar.setMnemonic('o');
        btnBorrar.setText("Borrar");
        btnBorrar.setToolTipText("Clic aquí para borrar el registro actual");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnActualizar.setMnemonic('c');
        btnActualizar.setText("Actualizar");
        btnActualizar.setToolTipText("Clic aquí para actualizar el registro actual");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnSalir.setMnemonic('s');
        btnSalir.setText("Salir");
        btnSalir.setToolTipText("Clic aquí para salir de la aplicación");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEdicionDeRegistrosLayout = new javax.swing.GroupLayout(pnlEdicionDeRegistros);
        pnlEdicionDeRegistros.setLayout(pnlEdicionDeRegistrosLayout);
        pnlEdicionDeRegistrosLayout.setHorizontalGroup(
            pnlEdicionDeRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEdicionDeRegistrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo)
                .addGap(18, 18, 18)
                .addComponent(btnInsertar)
                .addGap(18, 18, 18)
                .addComponent(btnBorrar)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pnlEdicionDeRegistrosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnActualizar, btnBorrar, btnInsertar, btnNuevo, btnSalir});

        pnlEdicionDeRegistrosLayout.setVerticalGroup(
            pnlEdicionDeRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEdicionDeRegistrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEdicionDeRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnInsertar)
                    .addComponent(btnBorrar)
                    .addComponent(btnActualizar)
                    .addComponent(btnSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlEdicionDeRegistrosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnActualizar, btnBorrar, btnInsertar, btnNuevo, btnSalir});

        pnlTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Teléfonos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        tblTelefonos.setAutoCreateRowSorter(true);
        tblTelefonos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Número"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTelefonos.setRowSelectionAllowed(false);
        tblTelefonos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblTelefonos);
        tblTelefonos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout pnlTelefonoLayout = new javax.swing.GroupLayout(pnlTelefono);
        pnlTelefono.setLayout(pnlTelefonoLayout);
        pnlTelefonoLayout.setHorizontalGroup(
            pnlTelefonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTelefonoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTelefonoLayout.setVerticalGroup(
            pnlTelefonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTelefonoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblInformacion.setFont(new java.awt.Font("DejaVu Sans", 1, 14));
        lblInformacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInformacion.setEnabled(false);

        mnuArchivo.setMnemonic('a');
        mnuArchivo.setText("Archivo");
        mnuArchivo.add(sepSeparadorUno);

        mnuItSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        mnuItSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        mnuItSalir.setText("Salir");
        mnuItSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItSalirActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuItSalir);

        mbarBarraDeMenus.add(mnuArchivo);

        mnuEdicion.setMnemonic('e');
        mnuEdicion.setText("Edición");

        mnuItNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mnuItNuevo.setText("Nuevo");
        mnuItNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItNuevoActionPerformed(evt);
            }
        });
        mnuEdicion.add(mnuItNuevo);

        mnuItInsertar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        mnuItInsertar.setText("Insertar");
        mnuItInsertar.setEnabled(false);
        mnuItInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItInsertarActionPerformed(evt);
            }
        });
        mnuEdicion.add(mnuItInsertar);

        mnuItBorrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mnuItBorrar.setText("Borrar");
        mnuItBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItBorrarActionPerformed(evt);
            }
        });
        mnuEdicion.add(mnuItBorrar);

        mnuItActualizar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mnuItActualizar.setText("Actualizar");
        mnuItActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItActualizarActionPerformed(evt);
            }
        });
        mnuEdicion.add(mnuItActualizar);

        mbarBarraDeMenus.add(mnuEdicion);

        mnuOpciones.setMnemonic('o');
        mnuOpciones.setText("Opciones");
        mnuOpciones.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                mnuOpcionesMenuSelected(evt);
            }
        });

        mnuItBuscar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        mnuItBuscar.setText("Buscar");
        mnuItBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItBuscarActionPerformed(evt);
            }
        });
        mnuOpciones.add(mnuItBuscar);

        mbarBarraDeMenus.add(mnuOpciones);

        mnuAyuda.setMnemonic('y');
        mnuAyuda.setText("Ayuda");

        mnuItAcercaDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mnuItAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ayuda.png"))); // NOI18N
        mnuItAcercaDe.setText("Acerca de...");
        mnuItAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItAcercaDeActionPerformed(evt);
            }
        });
        mnuAyuda.add(mnuItAcercaDe);

        mbarBarraDeMenus.add(mnuAyuda);

        setJMenuBar(mbarBarraDeMenus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblInformacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombres)
                            .addComponent(lblApellidos)
                            .addComponent(lblDireccion))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                                .addGap(2, 2, 2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                                .addGap(2, 2, 2))
                            .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)))
                    .addComponent(lblDepartamento, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(cmbDepartamento, 0, 195, Short.MAX_VALUE)
                        .addGap(19, 19, 19)
                        .addComponent(lblMunicipio)
                        .addGap(164, 164, 164))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 378, Short.MAX_VALUE)
                        .addComponent(txtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addComponent(pnlTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlEdicionDeRegistros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlNavegacionPorRegistros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblNombres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblApellidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDireccion))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDepartamento)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMunicipio)
                        .addComponent(cmbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(pnlTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlNavegacionPorRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlEdicionDeRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-615)/2, (screenSize.height-643)/2, 615, 643);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMunicipioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMunicipioKeyTyped
        maximoNumeroDeCaracteres(evt);
    }//GEN-LAST:event_txtMunicipioKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        maximoNumeroDeCaracteres(evt);
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        maximoNumeroDeCaracteres(evt);
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        maximoNumeroDeCaracteres(evt);
    }//GEN-LAST:event_txtNombresKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        habilitarDeshabilitarBotones(false);
        btnCargarDatos.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        cerrarObjetos();
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarDatosActionPerformed
        cargarDatos("SELECT * FROM Persona");
    }//GEN-LAST:event_btnCargarDatosActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrarObjetos();
    }//GEN-LAST:event_formWindowClosing

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        siguiente();
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        anterior();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        irAlPrimero();
    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        irAlUltimo();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        borrarRegistro();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizarRegistro();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        anadirNuevoRegistro();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        insertarElNuevoRegistro();
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void mnuItBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItBuscarActionPerformed
        if(dlgBuscar == null)
        {
            dlgBuscar = new dialogoBuscar(this,false);
            dlgBuscar.setVisible(true);
            limpiarAplicacion();
            deshabilitarBotonesAlHacerBusqueda();
        }
        else
            dlgBuscar.requestFocus();
    }//GEN-LAST:event_mnuItBuscarActionPerformed

    private void mnuOpcionesMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_mnuOpcionesMenuSelected
        if(conn == null)  //Si aún no hemos establecido la conexión con la base de datos
            mnuItBuscar.setEnabled(false);  //Deshabilitamos la opción Buscar del menú Opciones
        else
        {
            if(baseDeDatosVacia())  //Si la base de datos se encuentra vacía
                mnuItBuscar.setEnabled(false);
            else
                mnuItBuscar.setEnabled(true);
        }
    }//GEN-LAST:event_mnuOpcionesMenuSelected

    private void mnuItSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItSalirActionPerformed
        btnSalirActionPerformed(evt);
    }//GEN-LAST:event_mnuItSalirActionPerformed

    private void mnuItNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItNuevoActionPerformed
        btnNuevoActionPerformed(evt);
    }//GEN-LAST:event_mnuItNuevoActionPerformed

    private void mnuItInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItInsertarActionPerformed
        btnInsertarActionPerformed(evt);
    }//GEN-LAST:event_mnuItInsertarActionPerformed

    private void mnuItBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItBorrarActionPerformed
        btnBorrarActionPerformed(evt);
    }//GEN-LAST:event_mnuItBorrarActionPerformed

    private void mnuItActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItActualizarActionPerformed
        btnActualizarActionPerformed(evt);
    }//GEN-LAST:event_mnuItActualizarActionPerformed

    private void mnuItAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItAcercaDeActionPerformed
        new dialogoAcercaDe(this,true).setVisible(true);
    }//GEN-LAST:event_mnuItAcercaDeActionPerformed
    
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new AgendaTelefonica().setVisible(true);
            }
        });
    }
    //-----------------------------MIS MÉTODOS----------------------------------
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
        if(ke.getSource()==txtApellidos)
        {
            if(txtApellidos.getText().length()==100)  //El máximo número de caracteres permitidos para la caja de texto Apellidos es de 100
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
    }
    
    private void habilitarDeshabilitarBotones(boolean estado)
    {
        btnPrimero.setEnabled(estado);
        btnAnterior.setEnabled(estado);
        btnSiguiente.setEnabled(estado);
        btnUltimo.setEnabled(estado);
        btnNuevo.setEnabled(estado);
        mnuItNuevo.setEnabled(estado);
        btnActualizar.setEnabled(estado);
        mnuItActualizar.setEnabled(estado);
        btnBorrar.setEnabled(estado);
        mnuItBorrar.setEnabled(estado);
    }
    
    private void registrarDirver()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("-----------------------------------------");
            System.out.println("Método registrarDriver()");
            System.out.println("El driver ha sido registrado exitosamente");
            System.out.println("-----------------------------------------");
            System.out.println();
        }
        catch(ClassNotFoundException cnfe)
        {
            JOptionPane.showMessageDialog(this,"Excepción: ClassNotFoundException" + "\n" + "ERROR cargando el driver: " + cnfe.getMessage(),"ERROR método registrarDriver...",JOptionPane.ERROR_MESSAGE);
        }
        catch(InstantiationException ie)
        {
            JOptionPane.showMessageDialog(this,"Excepción: InstantiationException" + "\n" + "ERROR cargando el driver: " + ie.getMessage(),"Error método registrarDriver...",JOptionPane.ERROR_MESSAGE);
        }
        catch(java.lang.IllegalAccessException iae)
        {
            JOptionPane.showMessageDialog(this,"Excepción: IllegalAccessException" + "\n" + "ERROR cargando el driver: " + iae.getMessage(),"Error método registrarDriver...",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void conectarABaseDeDatos()
    {
        try
        {
            String url = "jdbc:mysql://localhost:3306/AgendaTelefonica";
            String usuario = "root";
            String contrasena = "123456";
            conn = DriverManager.getConnection(url,usuario,contrasena);
            System.out.println("-----------------------------------------------------------");
            System.out.println("Método conectarABaseDeDatos()");
            System.out.println("La conexión a la base de datos se ha realizado exitosamente");
            System.out.println("-----------------------------------------------------------");
            System.out.println();
            
        }
        catch(SQLException sqle)
        {
            JOptionPane.showMessageDialog(this,"Error al realizar la conexión con la base de datos" + "\n" + "Message: " + sqle.getMessage() + "\n" + "SQLState: " + sqle.getSQLState() + "\n" + "ErrorCode: " + sqle.getErrorCode(),"Error método conectarABaseDeDatos...",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void cerrarObjetos()
    {
        try
        {
            if(conn != null)
            {
                conn.close();
                conn = null;
                System.out.println("-------------------------------------------");
                System.out.println("Método cerrarObjetos()");
                System.out.println("El objeto conn ha sido cerrado exitosamente");
                System.out.println("-------------------------------------------");
                System.out.println();
            }
            if(stmtPersona != null)
            {
                stmtPersona.close();
                stmtPersona = null;
                System.out.println("--------------------------------------------------");
                System.out.println("Método cerrarObjetos()");
                System.out.println("El objeto stmtPersona ha sido cerrado exitosamente");
                System.out.println("--------------------------------------------------");
                System.out.println();
            }
            if(stmtTelefono != null)
            {
                stmtTelefono.close();
                stmtTelefono = null;
                System.out.println("---------------------------------------------------");
                System.out.println("Método cerrarObjetos()");
                System.out.println("El objeto stmtTelefono ha sido cerrado exitosamente");
                System.out.println("---------------------------------------------------");
                System.out.println();
            }
            if(rsPersona != null)
            {
                rsPersona.close();
                rsPersona = null;
                System.out.println("-----------------------------------------------");
                System.out.println("Método cerrarObjetos()");
                System.out.println("El objeto rsPersona ha sido cerrado exitosamente");
                System.out.println("------------------------------------------------");
                System.out.println();
            }
            if(rsTelefono != null)
            {
                rsTelefono.close();
                rsTelefono = null;
                System.out.println("-------------------------------------------------");
                System.out.println("Método cerrarObjetos()");
                System.out.println("El objeto rsTelefono ha sido cerrado exitosamente");
                System.out.println("-------------------------------------------------");
                System.out.println();
            }
        }
        catch(SQLException sqle)
        {
            JOptionPane.showMessageDialog(this,"Error al cerrar los siguientes objetos: conn, stmtPersona, stmtTelefono, rsPersona, rsTelefono" + "\n" + "Message: " + sqle.getMessage() + "\n" + "SQLState: " + sqle.getSQLState() + "\n" + "ErrorCode: " + sqle.getErrorCode(),"Error método cerrarObjetos...",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void mostrarPosicion()
    {
        int totalRegistros = 0;
        int posicionActual = 0;
        if(baseDeDatosVacia())  //Si la base de datos esta vacía
        {
            lblMensaje.setText("Nº registro");
            return;
        }
        try
        {
            posicionActual = rsPersona.getRow();  //Obtenemos la posición actual del registro dentro del conjunto de resultados
            rsPersona.last();  //Movemos el cursor a la última fila para llegar hasta el último registro
            totalRegistros = rsPersona.getRow();  //Obtenemos la posición actual del registro dentro del conjunto de resultados
            rsPersona.absolute(posicionActual);  //Volvemos a posicionar el cursor al registro original (antes de movernos al final del conjunto de resultados)
            lblMensaje.setText(String.valueOf(posicionActual) + " de " + String.valueOf(totalRegistros));
        }
        catch(SQLException sqle)
        {
            JOptionPane.showMessageDialog(this,"Error al hacer los desplazamientos con el objeto rsPersona" + "\n" + "Message: " + sqle.getMessage() + "\n" + "SQLState: " + sqle.getSQLState() + "\n" + "ErrorCode: " + sqle.getErrorCode(),"Error método mostrarPosicion...",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private boolean baseDeDatosVacia()
    {
        boolean bRetorno = true;
        Statement stmtAux = null;
        ResultSet rsAux = null;
        String sentenciaSQL = "SELECT * FROM Persona";
        try
        {
            stmtAux = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rsAux = stmtAux.executeQuery(sentenciaSQL);
            if(rsAux.first())
                bRetorno = false;  //La base de datos no esta vacía
            else
                bRetorno = true;  //La base de datos se encuentra vacía
            stmtAux.close();
            rsAux.close();
        }
        catch(SQLException sqle)
        {
            JOptionPane.showMessageDialog(this,"Error al realizar la siguiente sentencia SQL: " + "SELECT * FROM Persona" + "\n" + "Message: " + sqle.getMessage() + "\n" + "SQLState: " + sqle.getSQLState() + "\n" + "ErrorCode: " + sqle.getErrorCode(),"Error método baseDeDatosVacia...",JOptionPane.ERROR_MESSAGE);
        }
        return bRetorno;
    }
    
    private void rellenarRejilla()
    {
        establecerModeloRejilla();
        try
        {
            rsTelefono.beforeFirst();
            while(rsTelefono.next())
            {
                if(rsTelefono.getObject("Tipo").equals("Casa"))
                    tblTelefonos.setValueAt(rsTelefono.getObject("Telefono"),0,1);
                if(rsTelefono.getObject("Tipo").equals("Fax"))
                    tblTelefonos.setValueAt(rsTelefono.getObject("Telefono"),1,1);
                if(rsTelefono.getObject("Tipo").equals("Movil"))
                    tblTelefonos.setValueAt(rsTelefono.getObject("Telefono"),2,1);
                if(rsTelefono.getObject("Tipo").equals("Oficina"))
                    tblTelefonos.setValueAt(rsTelefono.getObject("Telefono"),3,1);
                if(rsTelefono.getObject("Tipo").equals("Otro"))
                    tblTelefonos.setValueAt(rsTelefono.getObject("Telefono"),4,1);
            }
        }
        catch(SQLException sqle)
        {
            JOptionPane.showMessageDialog(this,"Error al realizar los desplazamientos con el objeto rsTelefono" + "\n" + "Message: " + sqle.getMessage() + "\n" + "SQLState: " + sqle.getSQLState() + "\n" + "ErrorCode: " + sqle.getErrorCode(),"Error método rellenarRejilla...",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void siguiente()
    {
        try
        {
            if(!rsPersona.isLast())  //Si aún no hemos llegado al último registro
            {
                rsPersona.next();  //Mover el cursor al siguiente registro
                cargarDatosPersona();
                cargarDatosTelefono(String.valueOf(rsPersona.getInt("Id")));
            }
            else
                JOptionPane.showMessageDialog(this,"Se ha alcanzado el último registro de la base de datos","método siguiente",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException sqle)
        {
            JOptionPane.showMessageDialog(this,"Error al utilizar el método siguiente" + "\n" + "Message: " + sqle.getMessage() + "\n" + "SQLState: " + sqle.getSQLState() + "\n" + "ErrorCode: " + sqle.getErrorCode(),"Error método siguiente...",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void cargarDatosPersona()
    {
        try
        {
            txtNombres.setText(rsPersona.getString("Nombres"));
            txtNombres.setText(rsPersona.getString("Nombres"));
            txtApellidos.setText(rsPersona.getString("Apellidos"));
            txtDireccion.setText(rsPersona.getString("Direccion"));
            cmbDepartamento.setSelectedItem(rsPersona.getString("Departamento"));
            txtMunicipio.setText(rsPersona.getString("Municipio"));
            mostrarPosicion();
        }
        catch(SQLException sqle)
        {
            JOptionPane.showMessageDialog(this,"Error al utilizar el método cargarDatosPersona" + "\n" + "Message: " + sqle.getMessage() + "\n" + "SQLState: " + sqle.getSQLState() + "\n" + "ErrorCode: " + sqle.getErrorCode(),"Error método cargarDatosPersona...",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void cargarDatosTelefono(String id)
    {
        String sentenciaSQLTelefono = "SELECT Tipo,Telefono FROM Telefono WHERE Id=" + id;
        try
        {
            if(stmtTelefono == null)
                stmtTelefono = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rsTelefono = stmtTelefono.executeQuery(sentenciaSQLTelefono);
            if(rsTelefono.last())  //La consulta regreso resultados
                rellenarRejilla();
            else
            {
                establecerModeloRejilla();
                JOptionPane.showMessageDialog(this,"Aún no se han ingresado registros asociados a los números de telefonos para esta persona","Cargar datos...",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(SQLException sqle)
        {
            JOptionPane.showMessageDialog(this,"Error al utilizar el método cargarDatosTelefono" + "\n" + "Message: " + sqle.getMessage() + "\n" + "SQLState: " + sqle.getSQLState() + "\n" + "ErrorCode: " + sqle.getErrorCode(),"Error método cargarDatosTelefono...",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void anterior()
    {
        try
        {
            if(!rsPersona.isFirst())  //Si aún no hemos llegado al primer registro
            {
                rsPersona.previous();  //Movemos el cursor al registro anterior
                cargarDatosPersona();
                cargarDatosTelefono(String.valueOf(rsPersona.getInt("Id")));
            }
            else
                JOptionPane.showMessageDialog(this,"Se ha alcanzado el primer registro de la base de datos","método anterior",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException sqle)
        {
            JOptionPane.showMessageDialog(this,"Error al utilizar el método anterior" + "\n" + "Message: " + sqle.getMessage() + "\n" + "SQLState: " + sqle.getSQLState() + "\n" + "ErrorCode: " + sqle.getErrorCode(),"Error método anterior...",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void irAlUltimo()
    {
        try
        {
            rsPersona.last();
            cargarDatosPersona();
            cargarDatosTelefono(String.valueOf(rsPersona.getInt("Id")));
        }
        catch(SQLException sqle)
        {
            JOptionPane.showMessageDialog(this,"Error al utilizar el método irAlUltimo" + "\n" + "Message: " + sqle.getMessage() + "\n" + "SQLState: " + sqle.getSQLState() + "\n" + "ErrorCode: " + sqle.getErrorCode(),"Error método irAlUltimo...",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void irAlPrimero()
    {
        try
        {
            rsPersona.first();
            cargarDatosPersona();
            cargarDatosTelefono(String.valueOf(rsPersona.getInt("Id")));
        }
        catch(SQLException sqle)
        {
            JOptionPane.showMessageDialog(this,"Error al utilizar el método irAlPrimero" + "\n" + "Message: " + sqle.getMessage() + "\n" + "SQLState: " + sqle.getSQLState() + "\n" + "ErrorCode: " + sqle.getErrorCode(),"Error método irAlPrimero...",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void limpiarRejilla()
    {
        tblTelefonos.setModel(new DefaultTableModel(null,new String[] {"Tipo","Teléfono"}));
    }
    
    private void borrarRegistro()
    {
        boolean moverPrimero = false;
        boolean moverUltimo = false;
        boolean baseVacia = false;
        
        int OpcionPulsada = javax.swing.JOptionPane.showConfirmDialog(this,"¿Desea borrar el registro actual?","Borrar...",javax.swing.JOptionPane.YES_NO_OPTION,javax.swing.JOptionPane.QUESTION_MESSAGE);
        if((OpcionPulsada == javax.swing.JOptionPane.CLOSED_OPTION) || (OpcionPulsada == javax.swing.JOptionPane.NO_OPTION))  //Si se pulso no o se cerro la ventana de diálogo
            return;
        if(OpcionPulsada == javax.swing.JOptionPane.YES_OPTION)  //Si se pulso la tecla Sí
        {
            try
            {
                if(rsPersona.isLast())  //Si el registro a borrar es el último
                    moverUltimo = true;  //Una vez borrado el registro actual nos hiremos al último registro
                else if(rsPersona.isFirst())  //Si el registro a borrar es el primero
                    moverPrimero = true;  //Una vez borrado el registro actual nos hiremos al primer registro
                
                if(rsPersona.isLast() && rsPersona.isFirst())  //Si el registro a borrar es el último y el primero al mismo tiempo, quiere decir que es el único registro dentro de la base de datos 
                    baseVacia = true;  //Una vez borrado el registro actual la base de datos quedará vacía
                
                rsPersona.deleteRow();  //Borramos el registro actual de la base de datos

                if(baseVacia)  //Si la base de datos quedo vacía después de haber borrado el registro
                {
                    limpiarAplicacion();  //Limpiamos las cajas de texto
                    limpiarRejilla();  //Limpiamos la rejilla
                    if(dlgBuscar == null)
                    {
                        habilitarDeshabilitarBotones(false);  //Deshabilitamos los botónes
                        btnNuevo.setEnabled(true);  //Habilitamos el botón nuevo
                        mnuItNuevo.setEnabled(true);
                        btnNuevo.requestFocus();
                        JOptionPane.showMessageDialog(this,"La base de datos se encuentra vacía" + "\n" + "Debe ingresar nuevos registros utilizando el botón Nuevo" + "\n" + "Luego los debe guardar utilizando el botón Insertar","Método borrarRegistro...",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                        deshabilitarBotonesAlHacerBusqueda();
                    return;
                }

                if(moverPrimero)
                    rsPersona.first();

                if(moverUltimo)
                    rsPersona.last();

                if(!moverUltimo && !moverPrimero)  //Si el registro borrardo no era ni el primero ni el último
                {
                    rsPersona.previous();  //Movemos el cursor hacia atrás
                    rsPersona.next();  //Movemos el cursor hacia adelante
                }

                cargarDatosPersona();
                cargarDatosTelefono(String.valueOf(rsPersona.getInt("Id")));
            }
            catch(SQLException sqle)
            {
                JOptionPane.showMessageDialog(this,"Error al utilizar el método borrarRegistro" + "\n" + "Message: " + sqle.getMessage() + "\n" + "SQLState: " + sqle.getSQLState() + "\n" + "ErrorCode: " + sqle.getErrorCode(),"Error método borrarRegistro...",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void limpiarAplicacion()
    {
        txtNombres.setText("");
        txtApellidos.setText("");
        txtDireccion.setText("");
        cmbDepartamento.setSelectedItem("León");
        txtMunicipio.setText("");
        lblMensaje.setText("");
        establecerModeloRejilla();
    }
    
    private boolean existenCajasDeTextoVacias(String metodo)
    {
        boolean bRetorno = false;
        if((txtNombres.getText().length()==0) || (txtApellidos.getText().length()==0) || (txtDireccion.getText().length()==0) || (txtMunicipio.getText().length()==0))
        {
            JOptionPane.showMessageDialog(this,"Los siguientes campos son de caracter obligatorio: " + "\n" + "* Nombres" + "\n" + "* Apellidos" + "\n" + "* Dirección" + "\n" + "* Municipio","Error método " + metodo + "...",JOptionPane.ERROR_MESSAGE);
            bRetorno = true;
        }
        else
            bRetorno = false;
        return bRetorno;
    }
    
    private void establecerModeloRejilla()
    {
        Object[][] modelo = new Object[5][2];
        modelo[0][0] = "Casa";
        modelo[1][0] = "Fax";
        modelo[2][0] = "Movil";
        modelo[3][0] = "Oficina";
        modelo[4][0] = "Otro";
        tblTelefonos.setModel(new DefaultTableModel(modelo,new String[] {"Tipo","Teléfono"}));
    }
    
    private boolean existenNumerosDeTelefonosErroneos(String metodo)
    {
        int contadorNumTelefonos = 0;
        boolean bRetorno = false;
        for(int i=0;i<tblTelefonos.getRowCount();i++)
        {
            if(tblTelefonos.getValueAt(i,1)==null)
                bRetorno = false;
            else
            {
                contadorNumTelefonos++;
                if(tblTelefonos.getValueAt(i, 1).toString().length()!=0)
                {
                    if(tblTelefonos.getValueAt(i, 1).toString().length()==7)
                    {
                        for(int j=0;j<7;j++)
                        {
                            if(!Character.isDigit(tblTelefonos.getValueAt(i, 1).toString().charAt(j)))
                            {
                                JOptionPane.showMessageDialog(this,"Alguno de los caracteres contenido en el campo Número, dentro de la tabla Teléfonos no es numérico" + "\n" + "El campo Número, dentro de la tabla Teléfonos sólo admite valores numéricos","Error método " + metodo + "...",JOptionPane.ERROR_MESSAGE);
                                return true;
                            }
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this,"Alguno de los valores contenidos en el campo Número, dentro de la tabla Teléfonos esta erróneo" + "\n" +"El campo Número, dentro de la tabla Teléfonos sólo admite números de teléfono que tengan 7 dígitos","Error método " + metodo + "...",JOptionPane.ERROR_MESSAGE);
                        return true;
                    }
                }
                else
                    bRetorno = false;
            }
        }
        if(contadorNumTelefonos == 0)
        {
            JOptionPane.showMessageDialog(this,"Dentro de la tabla Teléfonos no existe ningún Número de teléfono asociado con el registro actual" + "\n" + "Como mínimo se debe ingresar un número de télefono para cada registro","Error método " + metodo + "...",JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return bRetorno;
    }
    
    private void actualizarRegistro()
    {
        Statement stmtAux = null;
        ResultSet rsAux = null;
        String consultaSQL = "";  //Utilizada para los INSERT o UPDATE
        String sentenciaSQL = "";  //Utilizada para los SELECT
        if(existenCajasDeTextoVacias("actualizarRegistro"))
            return;
        if(existenNumerosDeTelefonosErroneos("actualizarRegistro"))
            return;
        try
        {
            int idActual = rsPersona.getInt("Id");  //Obtenemos el Id actual del registro que estamos actualizando
            stmtAux = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            //Actulizamos el registro actual dentro de la tabla Persona
            consultaSQL = "UPDATE Persona SET Nombres='" + txtNombres.getText() + "',Apellidos='" + txtApellidos.getText() + "',Direccion='" + txtDireccion.getText() + "',Departamento='" + cmbDepartamento.getSelectedItem().toString() + "',Municipio='" + txtMunicipio.getText() + "' WHERE Id='" + rsPersona.getInt("Id") + "'";
            stmtAux.executeUpdate(consultaSQL);
            consultaSQL = "";
            //Actualizamos el registro actual dentro de la tabla Telefono
            for(int i=0;i<tblTelefonos.getRowCount();i++)  //Recorremos todas las filas dentro de la rejilla
            {
                if(tblTelefonos.getValueAt(i,1)!=null)
                {
                    //Verificamos si tenemos que hacer un UPDATE o un INSERT
                    sentenciaSQL = "SELECT * FROM Telefono WHERE Id='" + rsPersona.getInt("Id") + "' AND Tipo='" + tblTelefonos.getValueAt(i,0).toString() + "'";
                    rsAux = stmtAux.executeQuery(sentenciaSQL);
                    if(rsAux.first())  //El conjunto de resultados devolvio un valor, por ende tendremos que hacer un UPDATE
                    {
                        consultaSQL = "UPDATE Telefono SET Telefono='" + tblTelefonos.getValueAt(i, 1).toString() + "' WHERE Id=" + rsPersona.getInt("Id") +" AND Tipo='" + tblTelefonos.getValueAt(i,0).toString() + "'";
                        stmtAux.executeUpdate(consultaSQL);
                        consultaSQL = "";
                    }
                    else //El conjunto de resultados no devolvio un valor, por ende tendremos que hacer un INSERT
                    {
                        consultaSQL = "INSERT INTO Telefono VALUES(" + rsPersona.getInt("Id") + ",'" + tblTelefonos.getValueAt(i, 0).toString() + "','" + tblTelefonos.getValueAt(i,1).toString() + "')";
                        stmtAux.executeUpdate(consultaSQL);
                        consultaSQL = "";
                    }
                }
            }
            if(stmtAux != null)
            {
                stmtAux.close();
                stmtAux = null;
            }
            if(rsAux != null)
            {
                rsAux.close();
                rsAux = null;
            }
            if(stmtPersona != null)
            {
                stmtPersona.close();
                stmtPersona = null;
            }
            if(rsPersona != null)
            {
                rsPersona.close();
                rsPersona = null;
            }
            if(dlgBuscar != null)
                cargarDatos(consultaSQLDesdeElDialogoBuscar);
            else
                cargarDatos("SELECT * FROM Persona");
            rsPersona.beforeFirst();
            while(rsPersona.next())
            {
                if(rsPersona.getInt("Id") == idActual)
                {
                    cargarDatosPersona();
                    cargarDatosTelefono(String.valueOf(rsPersona.getInt("Id")));
                    break;
                }
            }
        }
        catch(SQLException sqle)
        {
            JOptionPane.showMessageDialog(this,"Error al utilizar el método actualizarRegistro" + "\n" + "Message: " + sqle.getMessage() + "\n" + "SQLState: " + sqle.getSQLState() + "\n" + "ErrorCode: " + sqle.getErrorCode(),"Error método actualizarRegistro...",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void anadirNuevoRegistro()
    {
        txtNombres.requestFocus();  //Lanzamos el foco sobre la caja de texto que contendrá los Nombres
        habilitarDeshabilitarBotones(false);  //Dehabilitamos los botones de pulsación
        limpiarAplicacion();  //Limpiamos las cajas de texto
        btnInsertar.setEnabled(true);  //Habilitamos el botón de Insertar
        mnuItInsertar.setEnabled(true);
    }
    
    private void insertarElNuevoRegistro()
    {
        int miContador = 1;
        Statement stmtAux = null;
        ResultSet rsAux = null;
        String consultaSQLid = "SELECT Id FROM Persona ORDER BY Id ASC";
        String consultaSQL = "";
        if(existenCajasDeTextoVacias("insertarElNuevoRegistro"))
            return;
        if(existenNumerosDeTelefonosErroneos("insertarElNuevoRegistro"))
            return;
        try
        {
            stmtAux = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            if(baseDeDatosVacia())  //Si la base de datos esta vacía
            {
                //Insertamos los registros dentro de la tabla Persona
                consultaSQL = "INSERT INTO Persona VALUES ('" + miContador + "','" + txtNombres.getText() + "','" + txtApellidos.getText() + "','" + txtDireccion.getText() + "','" + cmbDepartamento.getSelectedItem().toString() + "','" + txtMunicipio.getText() + "')";
                stmtAux.executeUpdate(consultaSQL);
                consultaSQL = "";
                //Insertamos los registros dentro de la tabla Telefono
                for(int i=0;i<tblTelefonos.getRowCount();i++)
                {
                    if(tblTelefonos.getValueAt(i,1)!=null)
                    {
                        consultaSQL = "INSERT INTO Telefono VALUES('" + miContador + "','" + tblTelefonos.getValueAt(i, 0).toString() + "','" + tblTelefonos.getValueAt(i,1).toString() + "')";
                        stmtAux.executeUpdate(consultaSQL);
                        consultaSQL = "";
                    }
                }
            }
            else
            {
                rsAux = stmtAux.executeQuery(consultaSQLid);
                while(rsAux.next())
                {
                    if(rsAux.getInt("Id") == miContador)
                        miContador++;
                    else if(rsAux.getInt("Id") > miContador)
                    {
                        miContador = rsAux.getInt("Id") - 1;
                        break;
                    }
                }
                consultaSQL = "INSERT INTO Persona VALUES ('" + miContador + "','" + txtNombres.getText() + "','" + txtApellidos.getText() + "','" + txtDireccion.getText() + "','" + cmbDepartamento.getSelectedItem().toString() + "','" + txtMunicipio.getText() + "')";
                stmtAux.executeUpdate(consultaSQL);
                consultaSQL = "";
                //Insertamos los registros dentro de la tabla Telefono
                for(int i=0;i<tblTelefonos.getRowCount();i++)
                {
                    if(tblTelefonos.getValueAt(i,1)!=null)
                    {
                        consultaSQL = "INSERT INTO Telefono VALUES('" + miContador + "','" + tblTelefonos.getValueAt(i, 0).toString() + "','" + tblTelefonos.getValueAt(i,1).toString() + "')";
                        stmtAux.executeUpdate(consultaSQL);
                        consultaSQL = "";
                    }
                }
            }
            if(stmtAux != null)
            {
                stmtAux.close();
                stmtAux = null;
            }
            if(rsAux != null)
            {
                rsAux.close();
                rsAux = null;
            }
            if(stmtPersona != null)
            {
                stmtPersona.close();
                stmtPersona = null;
            }
            if(rsPersona != null)
            {
                rsPersona.close();
                rsPersona = null;
            }
            habilitarDeshabilitarBotones(true);
            btnInsertar.setEnabled(false);
            mnuItInsertar.setEnabled(false);
            cargarDatos("SELECT * FROM Persona");
            rsPersona.beforeFirst();
            while(rsPersona.next())
            {
                if(rsPersona.getInt("Id") == miContador)
                {
                    cargarDatosPersona();
                    cargarDatosTelefono(String.valueOf(rsPersona.getInt("Id")));
                    break;
                }
            }
        }
        catch(SQLException sqle)
        {
            JOptionPane.showMessageDialog(this,"Error al utilizar el método insertarElNuevoRegistro" + "\n" + "Message: " + sqle.getMessage() + "\n" + "SQLState: " + sqle.getSQLState() + "\n" + "ErrorCode: " + sqle.getErrorCode(),"Error método insertarElNuevoRegistro...",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void cargarDatos(String conSQL)
    {
        if(conn == null)  //La conexión con la BD aún no ha sido establecida
            conectarABaseDeDatos();
        
        if(baseDeDatosVacia())  //Si la base de datos se encuentra vacía
        {
            JOptionPane.showMessageDialog(this,"La base de datos se encuentra vacía" + "\n" + "Debe ingresar nuevos registros utilizando el botón Nuevo" + "\n" + "Luego los debe guardar utilizando el botón Insertar","Método cargarDatos...",JOptionPane.INFORMATION_MESSAGE);
            btnCargarDatos.setEnabled(false);
            btnNuevo.setEnabled(true);
            mnuItNuevo.setEnabled(true);
            btnNuevo.requestFocus();
            return;
        }
        
        try
        {
            if(stmtPersona == null)
                stmtPersona = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rsPersona = stmtPersona.executeQuery(conSQL);
            rsPersona.first();  //Movemos el cursor hacia el primer registro dentro de la base de datos
            cargarDatosPersona();
            cargarDatosTelefono(String.valueOf(rsPersona.getInt("Id")));
            if(dlgBuscar == null)
            {
                habilitarDeshabilitarBotones(true);
                btnCargarDatos.setEnabled(false);
            }
        }
        catch(SQLException sqle)
        {
            JOptionPane.showMessageDialog(this,"Error en el método cargarDatos" + "\n" + "Message: " + sqle.getMessage() + "\n" + "SQLState: " + sqle.getSQLState() + "\n" + "ErrorCode: " + sqle.getErrorCode(),"Error método cargarDatos...",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void deshabilitarBotonesAlHacerBusqueda()
    {
        btnPrimero.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnSiguiente.setEnabled(false);
        btnUltimo.setEnabled(false);
        btnNuevo.setEnabled(false);
        mnuItNuevo.setEnabled(false);
        btnBorrar.setEnabled(false);
        mnuItBorrar.setEnabled(false);
        btnActualizar.setEnabled(false);
        mnuItActualizar.setEnabled(false);
    }
    
    public void habilitarBotonesAlHacerBusqueda()
    {
        btnPrimero.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnSiguiente.setEnabled(true);
        btnUltimo.setEnabled(true);
        btnBorrar.setEnabled(true);
        mnuItBorrar.setEnabled(true);
        btnActualizar.setEnabled(true);
        mnuItActualizar.setEnabled(true);
    }
    
    //-----------------------------MIS VARIABLES--------------------------------
    public Connection conn = null;  //El objeto de tipo conexion
    public Statement stmtPersona = null;  //El objeto que nos va a permitir realizar las consultas asociadas a la tabla Persona
    private Statement stmtTelefono = null; //El objeto que nos va a permitir realizar las consultas asociadas a la tabla Telefono
    public ResultSet rsPersona = null; //El objeto que nos va a permitir almacenar los resultados arrojados por las consultas SQL sobre la tabla Persona
    private ResultSet rsTelefono = null; //El objeto que nos va a permitir almacenar los resultados arrojados por las consultas SQL sobre la tabla Telefono
    public dialogoBuscar dlgBuscar = null;
    public String consultaSQLDesdeElDialogoBuscar = "";
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCargarDatos;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPrimero;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox cmbDepartamento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblDepartamento;
    private javax.swing.JLabel lblDireccion;
    public javax.swing.JLabel lblInformacion;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblMunicipio;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JMenuBar mbarBarraDeMenus;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenu mnuEdicion;
    private javax.swing.JMenuItem mnuItAcercaDe;
    private javax.swing.JMenuItem mnuItActualizar;
    private javax.swing.JMenuItem mnuItBorrar;
    private javax.swing.JMenuItem mnuItBuscar;
    private javax.swing.JMenuItem mnuItInsertar;
    private javax.swing.JMenuItem mnuItNuevo;
    private javax.swing.JMenuItem mnuItSalir;
    private javax.swing.JMenu mnuOpciones;
    private javax.swing.JPanel pnlEdicionDeRegistros;
    private javax.swing.JPanel pnlNavegacionPorRegistros;
    private javax.swing.JPanel pnlTelefono;
    private javax.swing.JSeparator sepSeparadorUno;
    private javax.swing.JTable tblTelefonos;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtMunicipio;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
