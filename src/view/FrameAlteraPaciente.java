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

public class FrameAlteraPaciente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCpf;
	private JTextField txtNomePaciente;	
	private JTextField txtEmail;


	/**
	 * Create the frame.
	 */
	public FrameAlteraPaciente() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 102));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblExclusoDePaciente = new JLabel("Alterar Paciente");
		lblExclusoDePaciente.setForeground(Color.WHITE);
		lblExclusoDePaciente.setFont(new Font("Dialog", Font.BOLD, 30));
		lblExclusoDePaciente.setBounds(562, 278, 380, 44);
		contentPane.add(lblExclusoDePaciente);
		
		JLabel lblCpf = new JLabel("CPF :");
		lblCpf.setForeground(Color.WHITE);
		lblCpf.setFont(new Font("Dialog", Font.BOLD, 20));
		lblCpf.setBounds(562, 713, 99, 32);
		contentPane.add(lblCpf);
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(562, 773, 380, 37);
		contentPane.add(txtCpf);
		
		JLabel lblName = new JLabel("Nome :");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Dialog", Font.BOLD, 20));
		lblName.setBounds(562, 550, 99, 32);
		contentPane.add(lblName);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(562, 610, 380, 37);
		contentPane.add(txtEmail);
		
		JLabel lblEmail = new JLabel("E-mail :");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Dialog", Font.BOLD, 20));
		lblEmail.setBounds(562, 394, 99, 32);
		contentPane.add(lblEmail);
		
		txtNomePaciente = new JTextField();
		txtNomePaciente.setColumns(10);
		txtNomePaciente.setBounds(562, 450, 380, 37);
		contentPane.add(txtNomePaciente);
				
		JPanel pnlPacienteCadastrar = new JPanel();
		pnlPacienteCadastrar.setBackground(new Color(102, 0, 140));
		pnlPacienteCadastrar.setBounds(562, 883, 165, 42);
		pnlPacienteCadastrar.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(pnlPacienteCadastrar);
		pnlPacienteCadastrar.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Paciente paciente = new Paciente();
				paciente.setCpf(txtCpf.getText());
				paciente.setNome(txtEmail.getText());
				paciente.setEmail(txtNomePaciente.getText());
				PacienteController controller = new PacienteController();
				controller.update(paciente);
				controller= null;
				paciente=null;
				
				
				
				
				JOptionPane.showConfirmDialog(null,"Paciente Alterado", " Aviso", JOptionPane.CLOSED_OPTION );
				txtCpf.setText("");
				txtEmail.setText("");
				txtNomePaciente.setText("");
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlPacienteCadastrar.setBackground(new Color (102, 0, 120));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlPacienteCadastrar.setBackground(new Color (102, 0, 190));
			}
		});
		
		JLabel lblCadastrar = new JLabel("Alterar");
		lblCadastrar.setForeground(Color.WHITE);
		lblCadastrar.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlPacienteCadastrar.add(lblCadastrar);
		
		JPanel pnlPacienteCadastrar_1 = new JPanel();
		pnlPacienteCadastrar_1.setBackground(new Color(102, 0, 140));
		pnlPacienteCadastrar_1.setBounds(1040, 31, 257, 42);
		pnlPacienteCadastrar_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(pnlPacienteCadastrar_1);
		pnlPacienteCadastrar_1.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameAlteraPaciente.this.dispose();
				FrameHomePage frame = new FrameHomePage();
				frame.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlPacienteCadastrar_1.setBackground(new Color (102, 0, 120));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlPacienteCadastrar_1.setBackground(new Color (102, 0, 190));
			}
		});
		
		JLabel lblVoltarATela = new JLabel("Voltar a Tela Inicial");
		lblVoltarATela.setForeground(Color.WHITE);
		lblVoltarATela.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlPacienteCadastrar_1.add(lblVoltarATela);
		
		JLabel lblSair = new JLabel("[X]");
		lblSair.setForeground(Color.WHITE);
		lblSair.setBounds(1408, 31, 20, 20);
		lblSair.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(lblSair);
		lblSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameAlteraPaciente.this.dispose();
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
	}

}
