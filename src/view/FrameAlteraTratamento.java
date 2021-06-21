package view;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import bo.Tratamento;
import controller.TratamentoController;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class FrameAlteraTratamento extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTipoTratamento;
	private JTextField txtPreco;
	private JTextField txtCodigo;


	/**
	 * Create the frame.
	 */
	public FrameAlteraTratamento() {
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
		lblSair.setBounds(1468, 25, 20, 20);
		lblSair.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(lblSair);
		lblSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameAlteraTratamento.this.dispose();
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
		
		JPanel pnlTratamentoAlterar_1 = new JPanel();
		pnlTratamentoAlterar_1.setBackground(new Color(102, 0, 140));
		pnlTratamentoAlterar_1.setBounds(958, 25, 257, 42);
		pnlTratamentoAlterar_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(pnlTratamentoAlterar_1);
		pnlTratamentoAlterar_1.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameAlteraTratamento.this.dispose();
				FrameHomePage frame = new FrameHomePage();
				frame.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlTratamentoAlterar_1.setBackground(new Color (102, 0, 120));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlTratamentoAlterar_1.setBackground(new Color (102, 0, 190));
			}
		});
		
		JLabel lblVoltarATela = new JLabel("Voltar a Tela Inicial");
		lblVoltarATela.setForeground(Color.WHITE);
		lblVoltarATela.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlTratamentoAlterar_1.add(lblVoltarATela);
		
		JLabel lblAterarTratamento = new JLabel("Alterar  Tratamento");
		lblAterarTratamento.setForeground(Color.WHITE);
		lblAterarTratamento.setFont(new Font("Dialog", Font.BOLD, 30));
		lblAterarTratamento.setBounds(477, 148, 428, 44);
		contentPane.add(lblAterarTratamento);
		
		JLabel lblTipo = new JLabel("Tipo :");
		lblTipo.setForeground(Color.WHITE);
		lblTipo.setFont(new Font("Dialog", Font.BOLD, 20));
		lblTipo.setBounds(477, 264, 99, 32);
		contentPane.add(lblTipo);
		
		txtTipoTratamento = new JTextField();
		txtTipoTratamento.setColumns(10);
		txtTipoTratamento.setBounds(477, 320, 380, 37);
		contentPane.add(txtTipoTratamento);
		
		JLabel lblValor = new JLabel("Valor :");
		lblValor.setForeground(Color.WHITE);
		lblValor.setFont(new Font("Dialog", Font.BOLD, 20));
		lblValor.setBounds(477, 420, 99, 32);
		contentPane.add(lblValor);
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		txtPreco.setBounds(477, 480, 380, 37);
		contentPane.add(txtPreco);
		
		JLabel lblCodigo = new JLabel("Codigo  :");
		lblCodigo.setForeground(Color.WHITE);
		lblCodigo.setFont(new Font("Dialog", Font.BOLD, 20));
		lblCodigo.setBounds(477, 583, 112, 32);
		contentPane.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(477, 643, 380, 37);
		contentPane.add(txtCodigo);
		
		JPanel pnlTratamentoAlterar = new JPanel();
		pnlTratamentoAlterar.setBackground(new Color(102, 0, 140));
		pnlTratamentoAlterar.setBounds(477, 753, 165, 42);
		pnlTratamentoAlterar.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(pnlTratamentoAlterar);
		pnlTratamentoAlterar.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Tratamento tratamento = new Tratamento();
				tratamento.setCodigo(txtCodigo.getText());
				tratamento.setTipo(txtTipoTratamento.getText());
				tratamento.setPreco(Float.parseFloat(txtPreco.getText()));
				TratamentoController controller = new TratamentoController();
				controller.update(tratamento);
				controller= null;
				tratamento=null;
				
				JOptionPane.showConfirmDialog(null,"Paciente Cadastrado", " Aviso", JOptionPane.CLOSED_OPTION );
				txtCodigo.setText("");
				txtTipoTratamento.setText("");
				txtPreco.setText("");
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlTratamentoAlterar.setBackground(new Color (102, 0, 120));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlTratamentoAlterar.setBackground(new Color (102, 0, 190));
			}
		});
		
		JLabel lblCadastrar = new JLabel("Alterar");
		lblCadastrar.setForeground(Color.WHITE);
		lblCadastrar.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlTratamentoAlterar.add(lblCadastrar);
	}

}
