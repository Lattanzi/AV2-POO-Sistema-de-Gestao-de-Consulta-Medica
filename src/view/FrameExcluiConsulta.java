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

public class FrameExcluiConsulta extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtConsultaCodigo;

	/**
	 * Create the frame.
	 */
	public FrameExcluiConsulta() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 102));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSair_1 = new JLabel("[X]");
		lblSair_1.setForeground(Color.WHITE);
		lblSair_1.setBounds(1419, 34, 20, 20);
		lblSair_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(lblSair_1);
		lblSair_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameExcluiConsulta.this.dispose();
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
		
		
		JPanel pnlConsultaExcluir_1_1 = new JPanel();
		pnlConsultaExcluir_1_1.setBackground(new Color(102, 0, 140));
		pnlConsultaExcluir_1_1.setBounds(930, 34, 257, 42);
		pnlConsultaExcluir_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(pnlConsultaExcluir_1_1);
		pnlConsultaExcluir_1_1.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameExcluiConsulta.this.dispose();
				FrameHomePage frame = new FrameHomePage();
				frame.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlConsultaExcluir_1_1.setBackground(new Color (102, 0, 120));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlConsultaExcluir_1_1.setBackground(new Color (102, 0, 190));
			}
		});
		
		JLabel lblVoltarATela_1 = new JLabel("Voltar a Tela Inicial");
		lblVoltarATela_1.setForeground(Color.WHITE);
		lblVoltarATela_1.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlConsultaExcluir_1_1.add(lblVoltarATela_1);
		
		JPanel pnlConsultaExcluir_2 = new JPanel();
		pnlConsultaExcluir_2.setBackground(new Color(102, 0, 140));
		pnlConsultaExcluir_2.setBounds(449, 611, 165, 42);
		pnlConsultaExcluir_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(pnlConsultaExcluir_2);
		pnlConsultaExcluir_2.addMouseListener(new MouseAdapter() {
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Consulta consulta = new Consulta();
				consulta.setCodigo(txtConsultaCodigo.getText());
				
				ConsultaController controller = new ConsultaController();
				controller.delete(consulta);
				controller= null;
				consulta=null;
				
				JOptionPane.showConfirmDialog(null,"Consulta Excluida", " Aviso", JOptionPane.CLOSED_OPTION );
				txtConsultaCodigo.setText("");
				
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlConsultaExcluir_2.setBackground(new Color (102, 0, 120));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlConsultaExcluir_2.setBackground(new Color (102, 0, 190));
			}
		});
		
		JLabel lblExcluir = new JLabel("Excluir");
		lblExcluir.setForeground(Color.WHITE);
		lblExcluir.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlConsultaExcluir_2.add(lblExcluir);
		
		JLabel lblExcluirConsulta = new JLabel("Excluir  Consulta");
		lblExcluirConsulta.setForeground(Color.WHITE);
		lblExcluirConsulta.setFont(new Font("Dialog", Font.BOLD, 30));
		lblExcluirConsulta.setBounds(449, 157, 428, 44);
		contentPane.add(lblExcluirConsulta);
		
		JLabel txtCodigoConsulta_1 = new JLabel("Codigo da Consulta :");
		txtCodigoConsulta_1.setForeground(Color.WHITE);
		txtCodigoConsulta_1.setFont(new Font("Dialog", Font.BOLD, 20));
		txtCodigoConsulta_1.setBounds(449, 321, 263, 32);
		contentPane.add(txtCodigoConsulta_1);
		
		txtConsultaCodigo = new JTextField();
		txtConsultaCodigo.setColumns(10);
		txtConsultaCodigo.setBounds(449, 381, 380, 37);
		contentPane.add(txtConsultaCodigo);
	}

}
