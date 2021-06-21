package view;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import bo.Paciente;
import controller.PacienteController;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextField;

public class FrameBuscaPaciente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNomePaciente;
	private JTextField txtImprimeConsulta;


	/**
	 * Create the frame.
	 */
	public FrameBuscaPaciente() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 102));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlPacienteBuscar_1 = new JPanel();
		pnlPacienteBuscar_1.setBackground(new Color(102, 0, 140));
		pnlPacienteBuscar_1.setBounds(874, 66, 257, 42);
		pnlPacienteBuscar_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(pnlPacienteBuscar_1);
		pnlPacienteBuscar_1.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameBuscaPaciente.this.dispose();
				FrameHomePage frame = new FrameHomePage();
				frame.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlPacienteBuscar_1.setBackground(new Color (102, 0, 120));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlPacienteBuscar_1.setBackground(new Color (102, 0, 190));
			}
		});
		
		JLabel lblVoltarATela = new JLabel("Voltar a Tela Inicial");
		lblVoltarATela.setForeground(Color.WHITE);
		lblVoltarATela.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlPacienteBuscar_1.add(lblVoltarATela);
		
		JLabel lblSair = new JLabel("[X]");
		lblSair.setForeground(Color.WHITE);
		lblSair.setBounds(1428, 66, 20, 20);
		lblSair.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(lblSair);
		lblSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameBuscaPaciente.this.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblSair.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblSair.setForeground(Color.WHITE);
			}
		});
		
		JLabel lblBuscarPaciente = new JLabel("Buscar  Paciente");
		lblBuscarPaciente.setForeground(Color.WHITE);
		lblBuscarPaciente.setFont(new Font("Dialog", Font.BOLD, 30));
		lblBuscarPaciente.setBounds(393, 252, 380, 44);
		contentPane.add(lblBuscarPaciente);
		
		JLabel lblNome = new JLabel("Nome :");
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNome.setBounds(393, 345, 99, 32);
		contentPane.add(lblNome);
		
		txtNomePaciente = new JTextField();
		txtNomePaciente.setColumns(10);
		txtNomePaciente.setBounds(393, 401, 380, 37);
		contentPane.add(txtNomePaciente);
		
		
		
		JPanel pnlPacienteBuscar = new JPanel();
		pnlPacienteBuscar.setBackground(new Color(102, 0, 140));
		pnlPacienteBuscar.setBounds(393, 490, 165, 42);
		pnlPacienteBuscar.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(pnlPacienteBuscar);
		pnlPacienteBuscar.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Paciente paciente = new Paciente();
				paciente.setNome(txtNomePaciente.getText());
				
				PacienteController controller = new PacienteController();
				
				ResultSet rs=controller.read(paciente);
				
				txtImprimeConsulta.setText("");

				try {
					while(rs.next()){
						
						txtImprimeConsulta.setText(txtImprimeConsulta.getText()+ "||" + "Nome : " + rs.getString("nome") + " ->  Email : " + rs.getString("email")  + " -> CPF : " + rs.getString("cpf"));
					 
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				controller= null;
				paciente=null;
				
				JOptionPane.showConfirmDialog(null,"Paciente Buscado", " Aviso", JOptionPane.CLOSED_OPTION );
				
				txtNomePaciente.setText("");
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlPacienteBuscar.setBackground(new Color (102, 0, 120));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlPacienteBuscar.setBackground(new Color (102, 0, 190));
			}
		});
		
		JLabel lblBuscar = new JLabel("Buscar");
		lblBuscar.setForeground(Color.WHITE);
		lblBuscar.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlPacienteBuscar.add(lblBuscar);
		
		txtImprimeConsulta = new JTextField();
		txtImprimeConsulta.setBounds(393, 705, 738, 42);
		contentPane.add(txtImprimeConsulta);
		txtImprimeConsulta.setColumns(10);
		
		JLabel lblPaciente = new JLabel("Paciente");
		lblPaciente.setForeground(Color.WHITE);
		lblPaciente.setFont(new Font("Dialog", Font.BOLD, 30));
		lblPaciente.setBounds(393, 621, 380, 44);
		contentPane.add(lblPaciente);
		
	}
}
