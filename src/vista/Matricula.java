package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.SoftBevelBorder;

import datos.Libreria;

import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JTextField;
import java.awt.Choice;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Matricula extends JFrame {
	Libreria lib=new Libreria();
	

	private JPanel contentPane;
	private JTextField textDniA;
	private JTextField textNombreA;
	private JTextField textApellidosA;
	private JTextField textDireccionA;
	private JTextField textEdadA;
	private JTextField textNacimiento;
	private JTextField textAño;
	private JTextField textLnacimiento;
	private JTextField textDniP;
	private JTextField textNombreP;
	private JTextField textApellidoP;
	private JTextField textDireccionP;
	private JTextField textEdadP;
	private JTextField textTel;
	private JTextField textBusqueda;
	
	public void limpiar() {
			textDniA.setText("");
			textNombreA.setText("");
			textApellidosA.setText("");
			textDireccionA.setText("");
			textEdadA.setText("");
			textNacimiento.setText("");
			textAño.setText("");
			textLnacimiento.setText("");
			textDniP.setText("");
			textNombreP.setText("");
			textApellidoP.setText("");
			textDireccionP.setText("");
			textEdadP.setText("");
			textTel.setText("");
			textBusqueda.setText("");
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Matricula frame = new Matricula();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Matricula() {
		setTitle("Sistema de Matricula");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder());
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(10, 125, 321, 298);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("D.N.I:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 11, 65, 21);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nombres:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(10, 33, 65, 21);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Apellidos:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(10, 58, 65, 21);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Direccion:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(10, 79, 65, 21);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Sexo:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(10, 111, 43, 21);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Edad:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(170, 113, 39, 16);
		panel.add(lblNewLabel_8);
		
		textDniA = new JTextField();
		textDniA.setBounds(89, 13, 104, 20);
		panel.add(textDniA);
		textDniA.setColumns(10);
		
		textNombreA = new JTextField();
		textNombreA.setBounds(89, 35, 197, 20);
		panel.add(textNombreA);
		textNombreA.setColumns(10);
		
		textApellidosA = new JTextField();
		textApellidosA.setBounds(89, 58, 197, 20);
		panel.add(textApellidosA);
		textApellidosA.setColumns(10);
		
		textDireccionA = new JTextField();
		textDireccionA.setBounds(89, 82, 197, 20);
		panel.add(textDireccionA);
		textDireccionA.setColumns(10);
		
		textEdadA = new JTextField();
		textEdadA.setBounds(219, 113, 36, 20);
		panel.add(textEdadA);
		textEdadA.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Grado a Matricular:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(10, 146, 130, 21);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Repite:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_10.setBounds(89, 172, 51, 21);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("F. Nacimiento:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11.setBounds(10, 203, 96, 21);
		panel.add(lblNewLabel_11);
		
		textNacimiento = new JTextField();
		textNacimiento.setBounds(123, 204, 43, 20);
		panel.add(textNacimiento);
		textNacimiento.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Mes:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_12.setBounds(75, 224, 39, 21);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("A\u00F1o:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_13.setBounds(75, 244, 39, 21);
		panel.add(lblNewLabel_13);
		
		textAño = new JTextField();
		textAño.setBounds(123, 246, 43, 20);
		panel.add(textAño);
		textAño.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("L. Nacimiento:");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_14.setBounds(15, 262, 99, 25);
		panel.add(lblNewLabel_14);
		
		textLnacimiento = new JTextField();
		textLnacimiento.setBounds(123, 266, 163, 20);
		panel.add(textLnacimiento);
		textLnacimiento.setColumns(10);
		
		JComboBox comboBoxSexoA = new JComboBox();
		comboBoxSexoA.addItem("Masculino");
		comboBoxSexoA.addItem("Femenino");
		comboBoxSexoA.addItem("Otro");
		comboBoxSexoA.setSelectedItem(null);
		
		comboBoxSexoA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBoxSexoA.setBounds(63, 111, 97, 21);
		panel.add(comboBoxSexoA);
		
		JComboBox comboBoxGrado = new JComboBox();
		comboBoxGrado.addItem("1er");
		comboBoxGrado.addItem("2do");
		comboBoxGrado.addItem("3er");
		comboBoxGrado.addItem("4to");
		comboBoxGrado.addItem("5to");
		comboBoxGrado.setSelectedItem(null);
		
		comboBoxGrado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBoxGrado.setBounds(150, 147, 59, 20);
		panel.add(comboBoxGrado);
		
		JComboBox comboBoxRepite = new JComboBox();
		comboBoxRepite.addItem("Si");
		comboBoxRepite.addItem("No");
		comboBoxRepite.setSelectedItem(null);
		
		comboBoxRepite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBoxRepite.setBounds(150, 174, 59, 20);
		panel.add(comboBoxRepite);
		
		JComboBox comboBoxMes = new JComboBox();
		comboBoxMes.addItem("Enero");
		comboBoxMes.addItem("Febrero");
		comboBoxMes.addItem("Marzo");
		comboBoxMes.addItem("Abril");
		comboBoxMes.addItem("Mayo");
		comboBoxMes.addItem("Junio");
		comboBoxMes.addItem("Julio");
		comboBoxMes.addItem("Agosto");
		comboBoxMes.addItem("Setiembre");
		comboBoxMes.addItem("Octubre");
		comboBoxMes.addItem("Noviembre");
		comboBoxMes.addItem("Diciembre");
		comboBoxMes.setSelectedItem(null);
		comboBoxMes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBoxMes.setBounds(123, 225, 86, 22);
		panel.add(comboBoxMes);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBorder(new CompoundBorder());
		panel_1.setBounds(341, 125, 411, 298);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3_1 = new JLabel("D.N.I:");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(10, 11, 65, 21);
		panel_1.add(lblNewLabel_3_1);
		
		textDniP = new JTextField();
		textDniP.setColumns(10);
		textDniP.setBounds(85, 13, 104, 20);
		panel_1.add(textDniP);
		
		JLabel lblNewLabel_4_1 = new JLabel("Nombres:");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_1.setBounds(10, 31, 65, 21);
		panel_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Apellidos:");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5_1.setBounds(10, 56, 65, 21);
		panel_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("Direccion:");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6_1.setBounds(10, 79, 65, 21);
		panel_1.add(lblNewLabel_6_1);
		
		textNombreP = new JTextField();
		textNombreP.setColumns(10);
		textNombreP.setBounds(85, 33, 197, 20);
		panel_1.add(textNombreP);
		
		textApellidoP = new JTextField();
		textApellidoP.setColumns(10);
		textApellidoP.setBounds(85, 58, 197, 20);
		panel_1.add(textApellidoP);
		
		textDireccionP = new JTextField();
		textDireccionP.setColumns(10);
		textDireccionP.setBounds(85, 81, 197, 20);
		panel_1.add(textDireccionP);
		
		JLabel lblNewLabel_7_1 = new JLabel("Sexo:");
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7_1.setBounds(10, 106, 43, 21);
		panel_1.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("Edad:");
		lblNewLabel_8_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8_1.setBounds(199, 108, 39, 16);
		panel_1.add(lblNewLabel_8_1);
		
		textEdadP = new JTextField();
		textEdadP.setColumns(10);
		textEdadP.setBounds(248, 108, 36, 20);
		panel_1.add(textEdadP);
		
		JLabel lblNewLabel_9_1 = new JLabel("Parentesco:");
		lblNewLabel_9_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9_1.setBounds(6, 132, 83, 21);
		panel_1.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_10_1 = new JLabel("Tel.");
		lblNewLabel_10_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_10_1.setBounds(164, 132, 25, 21);
		panel_1.add(lblNewLabel_10_1);
		
		textTel = new JTextField();
		textTel.setBounds(196, 135, 86, 20);
		panel_1.add(textTel);
		textTel.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("D.N.I:");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_15.setBounds(10, 182, 51, 21);
		panel_1.add(lblNewLabel_15);
		
		textBusqueda = new JTextField();
		textBusqueda.setBounds(58, 184, 86, 20);
		panel_1.add(textBusqueda);
		textBusqueda.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Buscar/Eliminar");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_16.setBounds(125, 164, 130, 22);
		panel_1.add(lblNewLabel_16);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 214, 391, 73);
		panel_1.add(textArea);
		
		JComboBox comboBoxSexoP = new JComboBox();
		comboBoxSexoP.addItem("Masculino");
		comboBoxSexoP.addItem("Femenino");
		comboBoxSexoP.addItem("otro");
		comboBoxSexoP.setSelectedItem(null);
		comboBoxSexoP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBoxSexoP.setBounds(85, 107, 86, 20);
		panel_1.add(comboBoxSexoP);
		
		JComboBox comboBoxParentesco = new JComboBox();
		comboBoxParentesco.addItem("Padre");
		comboBoxParentesco.addItem("Madre");
		comboBoxParentesco.addItem("Otros");
		comboBoxParentesco.setSelectedItem(null);
		comboBoxParentesco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBoxParentesco.setBounds(85, 133, 75, 21);
		panel_1.add(comboBoxParentesco);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();
			}
		});
		btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLimpiar.setBounds(265, 172, 120, 38);
		panel_1.add(btnLimpiar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.textHighlight);
		panel_2.setForeground(Color.BLACK);
		panel_2.setBounds(0, 0, 762, 504);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CONTROL DE MATRICULA");
		lblNewLabel.setForeground(SystemColor.info);
		lblNewLabel.setBounds(80, 11, 583, 76);
		panel_2.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 40));
		
		JLabel lblNewLabel_1 = new JLabel("DATOS DEL ALUMNO");
		lblNewLabel_1.setBounds(41, 79, 245, 45);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(SystemColor.scrollbar);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JLabel lblNewLabel_2 = new JLabel("DATOS DEL PADRE/APODERADO");
		lblNewLabel_2.setBounds(356, 79, 379, 45);
		panel_2.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(SystemColor.scrollbar);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dniA=Integer.parseInt(textDniA.getText());
				String nombreA=textNombreA.getText();
				String apellidosA=textApellidosA.getText();
				String sexoA=(String)comboBoxSexoA.getSelectedItem();
				String direccionA=textDireccionA.getText();
				String gradoA=(String)comboBoxGrado.getSelectedItem();
				String repiteA=(String)comboBoxRepite.getSelectedItem();
				int dniP=Integer.parseInt(textDniP.getText());
				String nombreP=textNombreP.getText();
				String apellidosP=textApellidoP.getText();
				String direccionP=textDireccionP.getText();
				String sexoP=(String)comboBoxSexoP.getSelectedItem();
				String parentescoP=(String)comboBoxParentesco.getSelectedItem();
				int telefono=Integer.parseInt(textTel.getText());
				int fechaN=Integer.parseInt(textNacimiento.getText());
				String mes=(String)comboBoxMes.getSelectedItem();
				int agno=Integer.parseInt(textAño.getText());
				String lugar=textLnacimiento.getText();
				int edadA=Integer.parseInt(textEdadA.getText());
				int edadP=Integer.parseInt(textEdadP.getText());	
				lib.insertar(dniA,nombreA,apellidosA,sexoA,direccionA,gradoA,repiteA,dniP,nombreP,apellidosP,direccionP, sexoP,parentescoP,telefono,fechaN,mes,agno,lugar,edadA,edadP );
				textArea.setText("Alumno registrado correctamente");

			}
		});
		btnRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnRegistrar.setBounds(25, 441, 150, 42);
		panel_2.add(btnRegistrar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dniA=Integer.parseInt(textBusqueda.getText());
				lib.buscar("raporte2","SELECT * FROM alumnos WHERE dniA=$P{dniA}",dniA);
			}
		});
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBuscar.setBounds(207, 440, 150, 45);
		panel_2.add(btnBuscar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int dniA=Integer.parseInt(textBusqueda.getText());
				lib.eliminarDatos(dniA);
				textArea.setText("Alumnos eliminado");
				
			}
		});
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnEliminar.setBounds(393, 440, 150, 45);
		panel_2.add(btnEliminar);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Libreria lib = new Libreria();
				lib.procesar_reporte("raporte", "select * from alumnos");
			}
		});
		btnImprimir.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnImprimir.setBounds(574, 440, 150, 45);
		panel_2.add(btnImprimir);
	}
		
	
	
	
	
}
