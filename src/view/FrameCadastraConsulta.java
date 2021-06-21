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
import javax.swing.JTextField;

public class FrameCadastraConsulta extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPacienteCpf;
	private JTextField txtConsultaCodigo;
	private JTextField txtConsultaDetalhes;
	private JTextField txtTratamentoCodigo;


	/**
	 * Create the frame.
	 */
	public FrameCadastraConsulta() {
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
		lblSair.setBounds(1411, 37, 20, 20);
		lblSair.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(lblSair);
		lblSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameCadastraConsulta.this.dispose();
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
		
		JPanel pnlConsultaCadastrar_1 = new JPanel();
		pnlConsultaCadastrar_1.setBackground(new Color(102, 0, 140));
		pnlConsultaCadastrar_1.setBounds(922, 37, 257, 42);
		pnlConsultaCadastrar_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(pnlConsultaCadastrar_1);
		pnlConsultaCadastrar_1.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameCadastraConsulta.this.dispose();
				FrameHomePage frame = new FrameHomePage();
				frame.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlConsultaCadastrar_1.setBackground(new Color (102, 0, 120));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlConsultaCadastrar_1.setBackground(new Color (102, 0, 190));
			}
		});
		
		JLabel lblVoltarATela = new JLabel("Voltar a Tela Inicial");
		lblVoltarATela.setForeground(Color.WHITE);
		lblVoltarATela.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlConsultaCadastrar_1.add(lblVoltarATela);
		
		JLabel lblCadastroDeConsulta = new JLabel("Cadastro de Consulta");
		lblCadastroDeConsulta.setForeground(Color.WHITE);
		lblCadastroDeConsulta.setFont(new Font("Dialog", Font.BOLD, 30));
		lblCadastroDeConsulta.setBounds(441, 160, 428, 44);
		contentPane.add(lblCadastroDeConsulta);
		
		JLabel txtCpf = new JLabel("CPF do Paciente :");
		txtCpf.setForeground(Color.WHITE);
		txtCpf.setFont(new Font("Dialog", Font.BOLD, 20));
		txtCpf.setBounds(441, 236, 230, 32);
		contentPane.add(txtCpf);
		
		txtPacienteCpf = new JTextField();
		txtPacienteCpf.setColumns(10);
		txtPacienteCpf.setBounds(441, 292, 380, 37);
		contentPane.add(txtPacienteCpf);
		
		JLabel txtCodigoConsulta = new JLabel("Codigo da Consulta :");
		txtCodigoConsulta.setForeground(Color.WHITE);
		txtCodigoConsulta.setFont(new Font("Dialog", Font.BOLD, 20));
		txtCodigoConsulta.setBounds(441, 475, 263, 32);
		contentPane.add(txtCodigoConsulta);
		
		txtConsultaCodigo = new JTextField();
		txtConsultaCodigo.setColumns(10);
		txtConsultaCodigo.setBounds(441, 535, 380, 37);
		contentPane.add(txtConsultaCodigo);
		
		JLabel txtDescricao = new JLabel("Detalhes da Consulta  :");
		txtDescricao.setForeground(Color.WHITE);
		txtDescricao.setFont(new Font("Dialog", Font.BOLD, 20));
		txtDescricao.setBounds(441, 595, 346, 32);
		contentPane.add(txtDescricao);
		
		txtConsultaDetalhes = new JTextField();
		txtConsultaDetalhes.setColumns(10);
		txtConsultaDetalhes.setBounds(441, 655, 738, 37);
		contentPane.add(txtConsultaDetalhes);
		
		JPanel pnlConsultaCadastrar = new JPanel();
		pnlConsultaCadastrar.setBackground(new Color(102, 0, 140));
		pnlConsultaCadastrar.setBounds(441, 765, 165, 42);
		pnlConsultaCadastrar.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(pnlConsultaCadastrar);
		pnlConsultaCadastrar.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Consulta consulta = new Consulta();
				consulta.setCodigo(txtConsultaCodigo.getText());
				consulta.setPacienteCpf(txtPacienteCpf.getText());
				consulta.setTratamentoCodigo(txtTratamentoCodigo.getText());
				consulta.setDetalhes(txtConsultaDetalhes.getText());
				
				ConsultaController controller = new ConsultaController();
				controller.create(consulta);
				controller= null;
				consulta=null;
				
				JOptionPane.showConfirmDialog(null,"Consulta Cadastrada", " Aviso", JOptionPane.CLOSED_OPTION );
				txtConsultaCodigo.setText("");
				txtPacienteCpf.setText("");
				txtTratamentoCodigo.setText("");
				txtConsultaDetalhes.setText("");
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlConsultaCadastrar.setBackground(new Color (102, 0, 120));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlConsultaCadastrar.setBackground(new Color (102, 0, 190));
			}
		});
		
		JLabel lblCadastrar = new JLabel("Cadastrar");
		lblCadastrar.setForeground(Color.WHITE);
		lblCadastrar.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlConsultaCadastrar.add(lblCadastrar);
		
		JLabel lblCodigoDoTratamento = new JLabel("Codigo do Tratamento :");
		lblCodigoDoTratamento.setForeground(Color.WHITE);
		lblCodigoDoTratamento.setFont(new Font("Dialog", Font.BOLD, 20));
		lblCodigoDoTratamento.setBounds(441, 349, 346, 32);
		contentPane.add(lblCodigoDoTratamento);
		
		txtTratamentoCodigo = new JTextField();
		txtTratamentoCodigo.setColumns(10);
		txtTratamentoCodigo.setBounds(441, 405, 380, 37);
		contentPane.add(txtTratamentoCodigo);
	}

}
