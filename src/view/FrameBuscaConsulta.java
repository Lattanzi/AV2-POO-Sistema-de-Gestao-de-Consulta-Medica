package view;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import bo.Consulta;
import controller.ConsultaController;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextField;

public class FrameBuscaConsulta extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtConsultaCodigo;
	private JTextField txtImprimeConsulta;

	/**
	 * Create the frame.
	 */
	public FrameBuscaConsulta() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 102));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSair = new JLabel("[X]");
		lblSair.setForeground(Color.WHITE);
		lblSair.setBounds(1468, 46, 20, 20);
		lblSair.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(lblSair);
		lblSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameBuscaConsulta.this.dispose();
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
		
		JPanel pnlBuscarConsulta_1 = new JPanel();
		pnlBuscarConsulta_1.setBackground(new Color(102, 0, 140));
		pnlBuscarConsulta_1.setBounds(905, 46, 257, 42);
		pnlBuscarConsulta_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(pnlBuscarConsulta_1);
		pnlBuscarConsulta_1.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameBuscaConsulta.this.dispose();
				FrameHomePage frame = new FrameHomePage();
				frame.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlBuscarConsulta_1.setBackground(new Color (102, 0, 120));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlBuscarConsulta_1.setBackground(new Color (102, 0, 190));
			}
		});
		
		JLabel lblVoltarATela = new JLabel("Voltar a Tela Inicial");
		lblVoltarATela.setForeground(Color.WHITE);
		lblVoltarATela.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlBuscarConsulta_1.add(lblVoltarATela);
		
		JLabel lblBuscarConsulta = new JLabel("Buscar  Consulta");
		lblBuscarConsulta.setForeground(Color.WHITE);
		lblBuscarConsulta.setFont(new Font("Dialog", Font.BOLD, 30));
		lblBuscarConsulta.setBounds(401, 168, 380, 44);
		contentPane.add(lblBuscarConsulta);
		
		JLabel lblCodigoDaConsulta = new JLabel("Codigo da Consulta :");
		lblCodigoDaConsulta.setForeground(Color.WHITE);
		lblCodigoDaConsulta.setFont(new Font("Dialog", Font.BOLD, 20));
		lblCodigoDaConsulta.setBounds(401, 261, 291, 32);
		contentPane.add(lblCodigoDaConsulta);
		
		txtConsultaCodigo = new JTextField();
		txtConsultaCodigo.setColumns(10);
		txtConsultaCodigo.setBounds(401, 317, 380, 37);
		contentPane.add(txtConsultaCodigo);
		
		JPanel pnlBuscarConsulta = new JPanel();
		pnlBuscarConsulta.setBackground(new Color(102, 0, 140));
		pnlBuscarConsulta.setBounds(401, 406, 165, 42);
		pnlBuscarConsulta.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(pnlBuscarConsulta);
		pnlBuscarConsulta.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Consulta consulta = new Consulta();
				consulta.setCodigo(txtConsultaCodigo.getText());
				
				ConsultaController controller = new ConsultaController();
				
				ResultSet rs=controller.read(consulta);
				
				txtImprimeConsulta.setText("");

				try {
					while(rs.next()){
						
						txtImprimeConsulta.setText(txtImprimeConsulta.getText()+ "||" + "Codigo : " + rs.getString("codigo") + " ->  Cpf Paciente : " + rs.getString("fk_paciente_cpf")  + " -> Codigo Tratamento : " + rs.getString("fk_tratamento_codigo") + " -> Detalhes : " + rs.getString("detalhes"));
					
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				controller= null;
				consulta=null;
				
				JOptionPane.showConfirmDialog(null,"Consulta Buscada", " Aviso", JOptionPane.CLOSED_OPTION );
				
				txtConsultaCodigo.setText("");
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlBuscarConsulta.setBackground(new Color (102, 0, 120));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlBuscarConsulta.setBackground(new Color (102, 0, 190));
			}
		});
		
		JLabel lblBuscar = new JLabel("Buscar");
		lblBuscar.setForeground(Color.WHITE);
		lblBuscar.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlBuscarConsulta.add(lblBuscar);
		
		JLabel lblConsulta = new JLabel("Consulta");
		lblConsulta.setForeground(Color.WHITE);
		lblConsulta.setFont(new Font("Dialog", Font.BOLD, 30));
		lblConsulta.setBounds(401, 537, 380, 44);
		contentPane.add(lblConsulta);
		
		txtImprimeConsulta = new JTextField();
		txtImprimeConsulta.setColumns(10);
		txtImprimeConsulta.setBounds(401, 621, 738, 42);
		contentPane.add(txtImprimeConsulta);
	}

}
