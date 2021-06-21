package view;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

public class FrameAlteraConsulta extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtPacienteCpf;
	private JTextField txtConsultaCodigo;
	private JTextField txtConsultaDetalhes;
	private JTextField txtTratamentoCodigo;


	/**
	 * Create the frame.
	 */
	public FrameAlteraConsulta() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 102));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBounds(5, 5, 1490, 1);
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane_1.setBackground(new Color(102, 102, 102));
		contentPane.add(contentPane_1);
		
		JLabel lblSair = new JLabel("[X]");
		lblSair.setForeground(Color.WHITE);
		lblSair.setBounds(1411, 37, 20, 20);
		lblSair.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane_1.add(lblSair);
		
		JPanel pnlConsultaAlterar_1 = new JPanel();
		pnlConsultaAlterar_1.setBackground(new Color(102, 102, 102));
		pnlConsultaAlterar_1.setBounds(922, 37, 257, 42);
		pnlConsultaAlterar_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane_1.add(pnlConsultaAlterar_1);
		
		JLabel lblVoltarATela = new JLabel("Voltar a Tela Inicial");
		lblVoltarATela.setForeground(Color.WHITE);
		lblVoltarATela.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlConsultaAlterar_1.add(lblVoltarATela);
		
		JLabel lblCadastroDeConsulta = new JLabel("Cadastro de Consulta");
		lblCadastroDeConsulta.setForeground(Color.WHITE);
		lblCadastroDeConsulta.setFont(new Font("Dialog", Font.BOLD, 30));
		lblCadastroDeConsulta.setBounds(441, 160, 428, 44);
		contentPane_1.add(lblCadastroDeConsulta);
		
		JLabel txtCpf = new JLabel("CPF do Paciente :");
		txtCpf.setForeground(Color.WHITE);
		txtCpf.setFont(new Font("Dialog", Font.BOLD, 20));
		txtCpf.setBounds(441, 236, 230, 32);
		contentPane_1.add(txtCpf);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(441, 292, 380, 37);
		contentPane_1.add(textField);
		
		JLabel txtCodigoConsulta = new JLabel("Codigo da Consulta :");
		txtCodigoConsulta.setForeground(Color.WHITE);
		txtCodigoConsulta.setFont(new Font("Dialog", Font.BOLD, 20));
		txtCodigoConsulta.setBounds(441, 475, 263, 32);
		contentPane_1.add(txtCodigoConsulta);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(441, 535, 380, 37);
		contentPane_1.add(textField_1);
		
		JLabel txtDescricao = new JLabel("Detalhes da Consulta  :");
		txtDescricao.setForeground(Color.WHITE);
		txtDescricao.setFont(new Font("Dialog", Font.BOLD, 20));
		txtDescricao.setBounds(441, 595, 346, 32);
		contentPane_1.add(txtDescricao);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(441, 655, 738, 37);
		contentPane_1.add(textField_2);
		
		JPanel pnlConsultaAlterar = new JPanel();
		pnlConsultaAlterar.setBackground(new Color(102, 102, 102));
		pnlConsultaAlterar.setBounds(441, 765, 165, 42);
		contentPane_1.add(pnlConsultaAlterar);
		
		JLabel lblCadastrar = new JLabel("Cadastrar");
		lblCadastrar.setForeground(Color.WHITE);
		lblCadastrar.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlConsultaAlterar.add(lblCadastrar);
		
		JLabel lblCodigoDoTratamento = new JLabel("Codigo do Tratamento :");
		lblCodigoDoTratamento.setForeground(Color.WHITE);
		lblCodigoDoTratamento.setFont(new Font("Dialog", Font.BOLD, 20));
		lblCodigoDoTratamento.setBounds(441, 349, 346, 32);
		contentPane_1.add(lblCodigoDoTratamento);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(441, 405, 380, 37);
		contentPane_1.add(textField_3);
		
		JLabel lblSair_1 = new JLabel("[X]");
		lblSair_1.setForeground(Color.WHITE);
		lblSair_1.setBounds(1396, 75, 20, 20);
		lblSair_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(lblSair_1);
		lblSair_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameAlteraConsulta.this.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblSair_1.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblSair_1.setForeground(Color.WHITE);
			}
		});
		
		JPanel pnlConsultaAlterar_1_1 = new JPanel();
		pnlConsultaAlterar_1_1.setBackground(new Color(102, 0, 140));
		pnlConsultaAlterar_1_1.setBounds(907, 75, 257, 42);
		pnlConsultaAlterar_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(pnlConsultaAlterar_1_1);
		pnlConsultaAlterar_1_1.addMouseListener(new MouseAdapter() {
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameAlteraConsulta.this.dispose();
				FrameHomePage frame = new FrameHomePage();
				frame.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlConsultaAlterar_1_1.setBackground(new Color (102, 0, 120));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlConsultaAlterar_1_1.setBackground(new Color (102, 0, 190));
			}
		});
		
		JLabel lblVoltarATela_1 = new JLabel("Voltar a Tela Inicial");
		lblVoltarATela_1.setForeground(Color.WHITE);
		lblVoltarATela_1.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlConsultaAlterar_1_1.add(lblVoltarATela_1);
		
		JLabel lblAlterarConsulta = new JLabel("Alterar  Consulta");
		lblAlterarConsulta.setForeground(Color.WHITE);
		lblAlterarConsulta.setFont(new Font("Dialog", Font.BOLD, 30));
		lblAlterarConsulta.setBounds(426, 198, 428, 44);
		contentPane.add(lblAlterarConsulta);
		
		JLabel txtCpf_1 = new JLabel("CPF do Paciente :");
		txtCpf_1.setForeground(Color.WHITE);
		txtCpf_1.setFont(new Font("Dialog", Font.BOLD, 20));
		txtCpf_1.setBounds(426, 274, 230, 32);
		contentPane.add(txtCpf_1);
		
		txtPacienteCpf = new JTextField();
		txtPacienteCpf.setColumns(10);
		txtPacienteCpf.setBounds(426, 330, 380, 37);
		contentPane.add(txtPacienteCpf);
		
		JLabel txtCodigoConsulta_1 = new JLabel("Codigo da Consulta :");
		txtCodigoConsulta_1.setForeground(Color.WHITE);
		txtCodigoConsulta_1.setFont(new Font("Dialog", Font.BOLD, 20));
		txtCodigoConsulta_1.setBounds(426, 513, 263, 32);
		contentPane.add(txtCodigoConsulta_1);
		
		txtConsultaCodigo = new JTextField();
		txtConsultaCodigo.setColumns(10);
		txtConsultaCodigo.setBounds(426, 573, 380, 37);
		contentPane.add(txtConsultaCodigo);
		
		JLabel txtDescricao_1 = new JLabel("Descricao da Consulta  :");
		txtDescricao_1.setForeground(Color.WHITE);
		txtDescricao_1.setFont(new Font("Dialog", Font.BOLD, 20));
		txtDescricao_1.setBounds(426, 633, 346, 32);
		contentPane.add(txtDescricao_1);
		
		txtConsultaDetalhes = new JTextField();
		txtConsultaDetalhes.setColumns(10);
		txtConsultaDetalhes.setBounds(426, 693, 738, 37);
		contentPane.add(txtConsultaDetalhes);
		
		JPanel pnlConsultaAlterar_2 = new JPanel();
		pnlConsultaAlterar_2.setBackground(new Color(102, 0, 140));
		pnlConsultaAlterar_2.setBounds(426, 803, 165, 42);
		pnlConsultaAlterar_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(pnlConsultaAlterar_2);
		pnlConsultaAlterar_2.addMouseListener(new MouseAdapter() {
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Consulta consulta = new Consulta();
				consulta.setCodigo(txtConsultaCodigo.getText());
				consulta.setPacienteCpf(txtPacienteCpf.getText());
				consulta.setTratamentoCodigo(txtTratamentoCodigo.getText());
				consulta.setDetalhes(txtConsultaDetalhes.getText());
				
				ConsultaController controller = new ConsultaController();
				controller.update(consulta);
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
				pnlConsultaAlterar_2.setBackground(new Color (102, 0, 120));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlConsultaAlterar_2.setBackground(new Color (102, 0, 190));
			}
		});
		
		
		JLabel lblAlterar = new JLabel("Alterar");
		lblAlterar.setForeground(Color.WHITE);
		lblAlterar.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlConsultaAlterar_2.add(lblAlterar);
		
		JLabel lblCodigoDoTratamento_1 = new JLabel("Codigo do Tratamento :");
		lblCodigoDoTratamento_1.setForeground(Color.WHITE);
		lblCodigoDoTratamento_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblCodigoDoTratamento_1.setBounds(426, 387, 346, 32);
		contentPane.add(lblCodigoDoTratamento_1);
		
		txtTratamentoCodigo = new JTextField();
		txtTratamentoCodigo.setColumns(10);
		txtTratamentoCodigo.setBounds(426, 443, 380, 37);
		contentPane.add(txtTratamentoCodigo);
	}

}
