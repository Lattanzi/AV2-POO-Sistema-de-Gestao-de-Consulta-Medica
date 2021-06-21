package view;


import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import bo.Tratamento;
import controller.TratamentoController;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class FrameCadastraTratamento extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtTipoTratamento;
	private JTextField txtPreco;
	private JTextField txtCodigo;


	/**
	 * Create the frame.
	 */
	public FrameCadastraTratamento() {
		getContentPane().setBackground(new Color(102, 102, 102));
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 1000);
		((JComponent) getContentPane()).setBorder(new LineBorder(new Color(0, 0, 0), 2));
		getContentPane().setLayout(null);
		
		JLabel lblSair = new JLabel("[X]");
		lblSair.setForeground(Color.WHITE);
		lblSair.setBounds(1452, 34, 20, 20);
		lblSair.setBorder(new LineBorder(new Color(0, 0, 0)));
		getContentPane().add(lblSair);
		lblSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameCadastraTratamento.this.dispose();
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
		
		JPanel pnlTratamentoCadastrar_1 = new JPanel();
		pnlTratamentoCadastrar_1.setBackground(new Color(102, 0, 140));
		pnlTratamentoCadastrar_1.setBounds(963, 34, 257, 42);
		pnlTratamentoCadastrar_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		getContentPane().add(pnlTratamentoCadastrar_1);
		pnlTratamentoCadastrar_1.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameCadastraTratamento.this.dispose();
				FrameHomePage frame = new FrameHomePage();
				frame.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlTratamentoCadastrar_1.setBackground(new Color (102, 0, 120));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlTratamentoCadastrar_1.setBackground(new Color (102, 0, 190));
			}
		});
		
		JLabel lblVoltarATela = new JLabel("Voltar a Tela Inicial");
		lblVoltarATela.setForeground(Color.WHITE);
		lblVoltarATela.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlTratamentoCadastrar_1.add(lblVoltarATela);
		
		JLabel lblCadastroDeTratamento = new JLabel("Cadastro de Tratamento");
		lblCadastroDeTratamento.setForeground(Color.WHITE);
		lblCadastroDeTratamento.setFont(new Font("Dialog", Font.BOLD, 30));
		lblCadastroDeTratamento.setBounds(482, 157, 428, 44);
		getContentPane().add(lblCadastroDeTratamento);
		
		JLabel lblTipo = new JLabel("Tipo :");
		lblTipo.setForeground(Color.WHITE);
		lblTipo.setFont(new Font("Dialog", Font.BOLD, 20));
		lblTipo.setBounds(482, 273, 99, 32);
		getContentPane().add(lblTipo);
		
		txtTipoTratamento = new JTextField();
		txtTipoTratamento.setColumns(10);
		txtTipoTratamento.setBounds(482, 329, 380, 37);
		getContentPane().add(txtTipoTratamento);
		
		JLabel lblPreco = new JLabel("Preco :");
		lblPreco.setForeground(Color.WHITE);
		lblPreco.setFont(new Font("Dialog", Font.BOLD, 20));
		lblPreco.setBounds(482, 429, 99, 32);
		getContentPane().add(lblPreco);
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		txtPreco.setBounds(482, 489, 380, 37);
		getContentPane().add(txtPreco);
		
		JLabel lblCodigo = new JLabel("Codigo  :");
		lblCodigo.setForeground(Color.WHITE);
		lblCodigo.setFont(new Font("Dialog", Font.BOLD, 20));
		lblCodigo.setBounds(482, 592, 112, 32);
		getContentPane().add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(482, 652, 380, 37);
		getContentPane().add(txtCodigo);
		
		JPanel pnlTratamentoCadastrar = new JPanel();
		pnlTratamentoCadastrar.setBackground(new Color(102, 0, 140));
		pnlTratamentoCadastrar.setBounds(482, 762, 165, 42);
		pnlTratamentoCadastrar.setBorder(new LineBorder(new Color(0, 0, 0)));
		getContentPane().add(pnlTratamentoCadastrar);
		pnlTratamentoCadastrar.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Tratamento tratamento = new Tratamento();
				tratamento.setCodigo(txtCodigo.getText());
				tratamento.setTipo(txtTipoTratamento.getText());
				tratamento.setPreco(Float.parseFloat(txtPreco.getText()));
				TratamentoController controller = new TratamentoController();
				controller.create(tratamento);
				controller= null;
				tratamento=null;
				
				JOptionPane.showConfirmDialog(null,"Paciente Cadastrado", " Aviso", JOptionPane.CLOSED_OPTION );
				txtCodigo.setText("");
				txtTipoTratamento.setText("");
				txtPreco.setText("");
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlTratamentoCadastrar.setBackground(new Color (102, 0, 120));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlTratamentoCadastrar.setBackground(new Color (102, 0, 190));
			}
		});
		
		JLabel lblCadastrar = new JLabel("Cadastrar");
		lblCadastrar.setForeground(Color.WHITE);
		lblCadastrar.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlTratamentoCadastrar.add(lblCadastrar);
	}

}
