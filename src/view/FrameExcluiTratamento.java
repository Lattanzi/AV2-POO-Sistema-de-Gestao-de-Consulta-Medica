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

public class FrameExcluiTratamento extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCodigo;

	/**
	 * Create the frame.
	 */
	public FrameExcluiTratamento() {
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
		lblSair.setBounds(1468, 26, 20, 20);
		lblSair.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(lblSair);
		lblSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//fecha o frame
				FrameExcluiTratamento.this.dispose();
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
		
		JPanel pnlTratamentoExcluir_1 = new JPanel();
		pnlTratamentoExcluir_1.setBackground(new Color(102, 0, 140));
		pnlTratamentoExcluir_1.setBounds(958, 26, 257, 42);
		pnlTratamentoExcluir_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(pnlTratamentoExcluir_1);
		pnlTratamentoExcluir_1.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameExcluiTratamento.this.dispose();
				FrameHomePage frame = new FrameHomePage();
				frame.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlTratamentoExcluir_1.setBackground(new Color (102, 0, 120));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlTratamentoExcluir_1.setBackground(new Color (102, 0, 190));
			}
		});
		
		JLabel lblVoltarATela = new JLabel("Voltar a Tela Inicial");
		lblVoltarATela.setForeground(Color.WHITE);
		lblVoltarATela.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlTratamentoExcluir_1.add(lblVoltarATela);
		
		JLabel lblExcluirTratamento = new JLabel("Excluir  Tratamento");
		lblExcluirTratamento.setForeground(Color.WHITE);
		lblExcluirTratamento.setFont(new Font("Dialog", Font.BOLD, 30));
		lblExcluirTratamento.setBounds(477, 149, 428, 44);
		contentPane.add(lblExcluirTratamento);
		
		JLabel lblCodigo = new JLabel("Codigo  :");
		lblCodigo.setForeground(Color.WHITE);
		lblCodigo.setFont(new Font("Dialog", Font.BOLD, 20));
		lblCodigo.setBounds(477, 317, 112, 32);
		contentPane.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(477, 377, 380, 37);
		contentPane.add(txtCodigo);
		
		JPanel pnlTratamentoExcluir = new JPanel();
		pnlTratamentoExcluir.setBackground(new Color(102, 0, 140));
		pnlTratamentoExcluir.setBounds(477, 487, 165, 42);
		pnlTratamentoExcluir.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(pnlTratamentoExcluir);
		pnlTratamentoExcluir.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Tratamento tratamento = new Tratamento();
				tratamento.setCodigo(txtCodigo.getText());
				
			
				TratamentoController controller = new TratamentoController();
				controller.delete(tratamento);
				controller= null;
				tratamento=null;
				
				
				
				
				JOptionPane.showConfirmDialog(null,"Tratamento Excluido", " Aviso", JOptionPane.CLOSED_OPTION );
				txtCodigo.setText("");
				
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlTratamentoExcluir.setBackground(new Color (102, 0, 120));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlTratamentoExcluir.setBackground(new Color (102, 0, 190));
			}
		});
		
		JLabel lblExcluir = new JLabel("Excluir");
		lblExcluir.setForeground(Color.WHITE);
		lblExcluir.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlTratamentoExcluir.add(lblExcluir);
	}

}
