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
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextField;

public class FrameBuscaTratamento extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNomeTratamento;
	private JTextField txtImprimeTratamento;

	/**
	 * Create the frame.
	 */
	public FrameBuscaTratamento() {
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
		lblSair.setBounds(1468, 39, 20, 20);
		lblSair.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(lblSair);
		lblSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameBuscaTratamento.this.dispose();
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
		
		JPanel pnlTratamentoBusca_1 = new JPanel();
		pnlTratamentoBusca_1.setBackground(new Color(102, 0, 140));
		pnlTratamentoBusca_1.setBounds(905, 39, 257, 42);
		pnlTratamentoBusca_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(pnlTratamentoBusca_1);
		pnlTratamentoBusca_1.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameBuscaTratamento.this.dispose();
				FrameHomePage frame = new FrameHomePage();
				frame.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlTratamentoBusca_1.setBackground(new Color (102, 0, 120));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlTratamentoBusca_1.setBackground(new Color (102, 0, 190));
			}
		});
		
		JLabel lblVoltarATela = new JLabel("Voltar a Tela Inicial");
		lblVoltarATela.setForeground(Color.WHITE);
		lblVoltarATela.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlTratamentoBusca_1.add(lblVoltarATela);
		
		JLabel lblBuscarTratamento = new JLabel("Buscar  Tratamento");
		lblBuscarTratamento.setForeground(Color.WHITE);
		lblBuscarTratamento.setFont(new Font("Dialog", Font.BOLD, 30));
		lblBuscarTratamento.setBounds(401, 161, 380, 44);
		contentPane.add(lblBuscarTratamento);
		
		JLabel lblTipo = new JLabel("Tipo :");
		lblTipo.setForeground(Color.WHITE);
		lblTipo.setFont(new Font("Dialog", Font.BOLD, 20));
		lblTipo.setBounds(401, 254, 99, 32);
		contentPane.add(lblTipo);
		
		txtNomeTratamento = new JTextField();
		txtNomeTratamento.setColumns(10);
		txtNomeTratamento.setBounds(401, 310, 380, 37);
		contentPane.add(txtNomeTratamento);
		
		JPanel pnlTratamentoBusca = new JPanel();
		pnlTratamentoBusca.setBackground(new Color(102, 0, 140));
		pnlTratamentoBusca.setBounds(401, 399, 165, 42);
		pnlTratamentoBusca.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(pnlTratamentoBusca);
		pnlTratamentoBusca.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Tratamento tratamento = new Tratamento();
				tratamento.setTipo(txtNomeTratamento.getText());
				
				TratamentoController controller = new TratamentoController();
				
				ResultSet rs=controller.read(tratamento);
				
				txtImprimeTratamento.setText("");

				try {
					while(rs.next()){
						
						txtImprimeTratamento.setText(txtImprimeTratamento.getText()+ "||" + "Tipo : " + rs.getString("tipo") + " ->  Preco : " + rs.getString("preco")  + " -> Codigo : " + rs.getString("Codigo"));
					
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				controller= null;
				tratamento=null;
				
				JOptionPane.showConfirmDialog(null,"Tratamento Buscado", " Aviso", JOptionPane.CLOSED_OPTION );
				
				txtNomeTratamento.setText("");
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlTratamentoBusca.setBackground(new Color (102, 0, 120));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlTratamentoBusca.setBackground(new Color (102, 0, 190));
			}
		});
		
		JLabel lblBuscar = new JLabel("Buscar");
		lblBuscar.setForeground(Color.WHITE);
		lblBuscar.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlTratamentoBusca.add(lblBuscar);
		
		JLabel lblTratamento = new JLabel("Tratamento");
		lblTratamento.setForeground(Color.WHITE);
		lblTratamento.setFont(new Font("Dialog", Font.BOLD, 30));
		lblTratamento.setBounds(401, 530, 380, 44);
		contentPane.add(lblTratamento);
		
		txtImprimeTratamento = new JTextField();
		txtImprimeTratamento.setColumns(10);
		txtImprimeTratamento.setBounds(401, 614, 738, 42);
		contentPane.add(txtImprimeTratamento);
	}

}
