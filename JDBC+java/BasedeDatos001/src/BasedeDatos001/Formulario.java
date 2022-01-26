package BasedeDatos001;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JLabel labelResultado;
	private JButton btnConsultaPorCdigo;
	private JLabel lblIngreseCdigoDe;
	private JTextField tf3;

	/**
	 * Lanzar la aplicacion
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creacion del Frame.
	 */
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblDescripcinDelArtculo = new JLabel("Descripción del artículo:");
		lblDescripcinDelArtculo.setBounds(23, 38, 193, 14);
		contentPane.add(lblDescripcinDelArtculo);

		tf1 = new JTextField();
		tf1.setBounds(247, 35, 193, 20);
		contentPane.add(tf1);
		tf1.setColumns(10);

		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(23, 74, 95, 14);
		contentPane.add(lblPrecio);

		tf2 = new JTextField();
		tf2.setBounds(247, 71, 107, 20);
		contentPane.add(tf2);
		tf2.setColumns(10);

		JButton btnAlta = new JButton("Alta");
		btnAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelResultado.setText("");
				try {
					Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/bd1", "root", "");
					Statement comando = (Statement) conexion.createStatement();
					comando.executeUpdate("insert into articulos(descripcion,precio) values ('" + tf1.getText() + "',"
							+ tf2.getText() + ")");
					conexion.close();
					labelResultado.setText("se registraron los datos");
					tf1.setText("");
					tf2.setText("");
				} catch (SQLException ex) {
					setTitle(ex.toString());
				}
			}
		});
		btnAlta.setBounds(247, 118, 89, 23);
		contentPane.add(btnAlta);

		labelResultado = new JLabel("resultado");
		labelResultado.setBounds(361, 122, 229, 14);
		contentPane.add(labelResultado);

		btnConsultaPorCdigo = new JButton("Consulta por código");
		btnConsultaPorCdigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelResultado.setText("");
				tf1.setText("");
				tf2.setText("");
				try {
					Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/pruebajdbc", "root", "usuario");
					Statement comando = (Statement) conexion.createStatement();
					ResultSet registro = comando
							.executeQuery("select descripcion,precio from articulos where codigo=" + tf3.getText());
					if (registro.next() == true) {
						tf1.setText(registro.getString("descripcion"));
						tf2.setText(registro.getString("precio"));
					} else {
						labelResultado.setText("No existe un artículo con dicho código");
					}
					conexion.close();
				} catch (SQLException ex) {
					setTitle(ex.toString());
				}
			}
		});
		btnConsultaPorCdigo.setBounds(23, 212, 177, 23);
		contentPane.add(btnConsultaPorCdigo);

		lblIngreseCdigoDe = new JLabel("Ingrese código de articulo a consultar:");
		lblIngreseCdigoDe.setBounds(10, 179, 243, 14);
		contentPane.add(lblIngreseCdigoDe);

		tf3 = new JTextField();
		tf3.setBounds(247, 176, 86, 20);
		contentPane.add(tf3);
		tf3.setColumns(10);
		cargarDriver();
	}

	private void cargarDriver() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception ex) {
			setTitle(ex.toString());
		}
	}
}

