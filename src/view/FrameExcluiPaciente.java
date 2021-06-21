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
import javax.swing.JTextField;

public class FrameExcluiPaciente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCpf;


	/**
	 * Create the frame.
	 */
	public FrameExcluiPaciente() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 102));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane_1.setBackground(new Color(102, 102, 102));
		contentPane_1.setBounds(0, 0, 1500, 1000);
		contentPane.add(contentPane_1);
		
		JLabel lblSair = new JLabel("[X]");
		lblSair.setForeground(Color.WHITE);
		lblSair.setBounds(1414, 61, 20, 20);
		lblSair.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane_1.add(lblSair);
		lblSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameExcluiPaciente.this.dispose();
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
		
		JLabel lblExclusaoDePaciente = new JLabel("Exclusao de Paciente");
		lblExclusaoDePaciente.setForeground(Color.WHITE);
		lblExclusaoDePaciente.setFont(new Font("Dialog", Font.BOLD, 30));
		lblExclusaoDePaciente.setBounds(561, 271, 380, 44);
		contentPane_1.add(lblExclusaoDePaciente);
		
		JLabel lblCpf = new JLabel("CPF :");
		lblCpf.setForeground(Color.WHITE);
		lblCpf.setFont(new Font("Dialog", Font.BOLD, 20));
		lblCpf.setBounds(561, 486, 99, 32);
		contentPane_1.add(lblCpf);
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(561, 546, 380, 37);
		contentPane_1.add(txtCpf);
		
		JPanel pnlPacienteExcluir = new JPanel();
		pnlPacienteExcluir.setBackground(new Color(102, 0, 140));
		pnlPacienteExcluir.setBounds(561, 656, 165, 42);
		pnlPacienteExcluir.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane_1.add(pnlPacienteExcluir);
		pnlPacienteExcluir.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				
				Paciente paciente = new Paciente();
				paciente.setCpf(txtCpf.getText());
				
				PacienteController controller = new PacienteController();
				controller.delete(paciente);
				controller= null;
				paciente=null;
				
				JOptionPane.showConfirmDialog(null,"Paciente Excluido", " Aviso", JOptionPane.CLOSED_OPTION );
				txtCpf.setText("");
				
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlPacienteExcluir.setBackground(new Color (102, 0, 120));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlPacienteExcluir.setBackground(new Color (102, 0, 190));
			}
		});
		
		
		JLabel lblExcluir = new JLabel("Excluir");
		lblExcluir.setForeground(Color.WHITE);
		lblExcluir.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlPacienteExcluir.add(lblExcluir);
		
		JPanel pnlPacienteExcluir_1 = new JPanel();
		pnlPacienteExcluir_1.setBackground(new Color(102, 0, 140));
		pnlPacienteExcluir_1.setBounds(1046, 61, 257, 42);
		pnlPacienteExcluir_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane_1.add(pnlPacienteExcluir_1);
		pnlPacienteExcluir_1.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameExcluiPaciente.this.dispose();
				FrameHomePage frame = new FrameHomePage();
				frame.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlPacienteExcluir_1.setBackground(new Color (102, 0, 120));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlPacienteExcluir_1.setBackground(new Color (102, 0, 190));
			}
		});
		
		JLabel lblVoltarATela = new JLabel("Voltar a Tela Inicial");
		lblVoltarATela.setForeground(Color.WHITE);
		lblVoltarATela.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlPacienteExcluir_1.add(lblVoltarATela);
	}

}
