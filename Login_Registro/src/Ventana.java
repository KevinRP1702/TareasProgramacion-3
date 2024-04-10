import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class Ventana {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtCorreo;
	private JTextField txtContra;
	private JTextField txtConfimarContra;
	private JTextField txtNombreUsu;
	private JTextField txtContra2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 513, 726);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
//		JPanel panel_1 = new JPanel();
//		panel_1.setBackground(new Color(105, 105, 105));
//		panel_1.setBounds(0, 0, 495, 687);
//		frame.getContentPane().add(panel_1);
//		panel_1.setLayout(null);
//		
//		JMenuBar menuBar2 = new JMenuBar();
//		menuBar2.setBounds(0, 0, 495, 22);
//		panel_1.add(menuBar2);
//		
//		JMenu mnNewMenu = new JMenu("Inicio");
//		menuBar2.add(mnNewMenu);
//		
//		JMenu mnNewMenu_1 = new JMenu("Login");
//		menuBar2.add(mnNewMenu_1);
//		
//		JMenu mnNewMenu_2 = new JMenu("Registro");
//		menuBar2.add(mnNewMenu_2);
//		
//		JMenu mnNewMenu_3 = new JMenu("Carga");
//		mnNewMenu_3.setEnabled(false);
//		menuBar2.add(mnNewMenu_3);
//		
//		JMenu mnNewMenu_4 = new JMenu("Ayuda");
//		mnNewMenu_4.setEnabled(false);
//		menuBar2.add(mnNewMenu_4);
//		
//		JLabel lblTitulo = new JLabel("Iniciar sesión");
//		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 25));
//		lblTitulo.setForeground(new Color(255, 255, 255));
//		lblTitulo.setBounds(163, 120, 180, 38);
//		panel_1.add(lblTitulo);
//		
//		JLabel lblNombreUsu = new JLabel("Ingrese el nombre de usuario");
//		lblNombreUsu.setFont(new Font("Tahoma", Font.BOLD, 13));
//		lblNombreUsu.setOpaque(true);
//		lblNombreUsu.setBackground(new Color(0, 0, 0));
//		lblNombreUsu.setForeground(new Color(255, 255, 255));
//		lblNombreUsu.setHorizontalAlignment(SwingConstants.CENTER);
//		lblNombreUsu.setBounds(104, 192, 282, 28);
//		panel_1.add(lblNombreUsu);
//		
//		txtNombreUsu = new JTextField();
//		txtNombreUsu.setBounds(104, 218, 282, 46);
//		panel_1.add(txtNombreUsu);
//		txtNombreUsu.setColumns(10);
//		
//		JLabel lblContra2 = new JLabel("Ingrese su contraseña");
//		lblContra2.setOpaque(true);
//		lblContra2.setHorizontalAlignment(SwingConstants.CENTER);
//		lblContra2.setForeground(Color.WHITE);
//		lblContra2.setFont(new Font("Tahoma", Font.BOLD, 13));
//		lblContra2.setBackground(Color.BLACK);
//		lblContra2.setBounds(104, 291, 282, 28);
//		panel_1.add(lblContra2);
//		
//		txtContra2 = new JTextField();
//		txtContra2.setColumns(10);
//		txtContra2.setBounds(104, 317, 282, 46);
//		panel_1.add(txtContra2);
//		
//		JButton btnLogin = new JButton("Login");
//		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 13));
//		btnLogin.setBounds(150, 408, 180, 38);
//		panel_1.add(btnLogin);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(75, 0, 130));
		panel.setBounds(0, 0, 495, 687);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("");
		menuBar.setBounds(0, 0, 495, 22);
		panel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Usuarios");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Login");
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Registrar");
		mntmNewMenuItem_1.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JLabel lblTitulo = new JLabel("Registrarse");
		lblTitulo.setForeground(new Color(222, 184, 135));
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(153, 79, 183, 43);
		panel.add(lblTitulo);
		
		textField = new JTextField();
		textField.setBounds(58, 185, 157, 43);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("Ingresa tu nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setForeground(new Color(240, 248, 255));
		lblNombre.setBounds(58, 162, 138, 22);
		panel.add(lblNombre);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(257, 185, 157, 43);
		panel.add(textField_1);
		
		JLabel lblApellido = new JLabel("Ingresa tu apellido");
		lblApellido.setHorizontalAlignment(SwingConstants.RIGHT);
		lblApellido.setForeground(new Color(240, 248, 255));
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblApellido.setBounds(276, 162, 138, 22);
		panel.add(lblApellido);
		
		JLabel lblCorreo = new JLabel("Correo electrónico");
		lblCorreo.setForeground(new Color(240, 248, 255));
		lblCorreo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCorreo.setBounds(104, 257, 132, 14);
		panel.add(lblCorreo);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(104, 281, 267, 43);
		panel.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		JLabel lblContra = new JLabel("Contraseña");
		lblContra.setForeground(new Color(240, 248, 255));
		lblContra.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblContra.setBounds(104, 340, 132, 14);
		panel.add(lblContra);
		
		txtContra = new JTextField();
		txtContra.setColumns(10);
		txtContra.setBounds(104, 361, 267, 43);
		panel.add(txtContra);
		
		JLabel lblConfirmarContra = new JLabel("Confirmas contraseña");
		lblConfirmarContra.setForeground(new Color(240, 248, 255));
		lblConfirmarContra.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblConfirmarContra.setBounds(104, 414, 148, 14);
		panel.add(lblConfirmarContra);
		
		txtConfimarContra = new JTextField();
		txtConfimarContra.setColumns(10);
		txtConfimarContra.setBounds(104, 439, 267, 43);
		panel.add(txtConfimarContra);
		
		JCheckBox checkTerminos = new JCheckBox("Acepto los términos y condiciones vendo mi alma al diablo");
		checkTerminos.setFont(new Font("Tahoma", Font.BOLD, 13));
		checkTerminos.setForeground(new Color(240, 248, 255));
		checkTerminos.setContentAreaFilled(false);
		checkTerminos.setBounds(51, 537, 406, 23);
		panel.add(checkTerminos);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBackground(new Color(218, 165, 32));
		btnRegistrarse.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRegistrarse.setBounds(185, 604, 133, 38);
		panel.add(btnRegistrarse);
	}
}
