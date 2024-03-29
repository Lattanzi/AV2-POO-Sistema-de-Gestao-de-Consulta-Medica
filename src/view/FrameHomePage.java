package view;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;


public class FrameHomePage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public FrameHomePage() {
		setUndecorated(true);
		setBackground(new Color(102, 102, 102));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 102, 102));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSistemaMedico = new JLabel("Sistema de Gest�o M�dica");
		lblSistemaMedico.setForeground(new Color(255, 255, 255));
		lblSistemaMedico.setFont(new Font("Dialog", Font.BOLD, 30));
		lblSistemaMedico.setBounds(550, 150, 380, 50);
		lblSistemaMedico.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(lblSistemaMedico);
		
		JLabel lblPaciente = new JLabel("   Paciente");
		lblPaciente.setFont(new Font("Dialog", Font.BOLD, 24));
		lblPaciente.setForeground(new Color(255, 255, 255));
		lblPaciente.setBounds(355, 355, 155, 50);
		lblPaciente.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(lblPaciente);
		
		JLabel lblTratamento = new JLabel("  Tratamento");
		lblTratamento.setFont(new Font("Dialog", Font.BOLD, 24));
		lblTratamento.setForeground(new Color(255, 255, 255));
		lblTratamento.setBounds(660, 355, 165, 50);
		lblTratamento.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(lblTratamento);
		
		JLabel lblConsulta = new JLabel("   Consulta");
		lblConsulta.setFont(new Font("Dialog", Font.BOLD, 24));
		lblConsulta.setForeground(new Color(255, 255, 255));
		lblConsulta.setBounds(940, 355, 155, 50);
		lblConsulta.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(lblConsulta);
		
		JPanel pnlPacienteCadastrar = new JPanel();
		pnlPacienteCadastrar.setBackground(new Color(102, 0, 140));
		pnlPacienteCadastrar.setBounds(349, 448, 165, 42);
		pnlPacienteCadastrar.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(pnlPacienteCadastrar);
		pnlPacienteCadastrar.addMouseListener(new MouseAdapter() {

			
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameHomePage.this.dispose();
				FrameCadastraPaciente frame = new FrameCadastraPaciente();
				frame.setVisible(true);
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
		
		JLabel lblCadastrar = new JLabel("Cadastrar");
		lblCadastrar.setFont(new Font("Dialog", Font.BOLD, 18));
		lblCadastrar.setForeground(new Color(255, 255, 255));
		pnlPacienteCadastrar.add(lblCadastrar);
		
		
		JPanel pnlPacienteAlterar = new JPanel();
		pnlPacienteAlterar.setBackground(new Color(102, 0, 140));
		pnlPacienteAlterar.setBounds(349, 528, 165, 42);
		pnlPacienteAlterar.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(pnlPacienteAlterar);
		pnlPacienteAlterar.addMouseListener(new MouseAdapter() {

			
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameHomePage.this.dispose();
				FrameAlteraPaciente frame = new FrameAlteraPaciente();
				frame.setVisible(true);

			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlPacienteAlterar.setBackground(new Color (102, 0, 120));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlPacienteAlterar.setBackground(new Color (102, 0, 190));
			}
		});
		
		JLabel lblAlterar = new JLabel("Alterar");
		lblAlterar.setFont(new Font("Dialog", Font.BOLD, 18));
		lblAlterar.setForeground(new Color(255, 255, 255));
		pnlPacienteAlterar.add(lblAlterar);
		
		JPanel pnlPacienteExcluir = new JPanel();
		pnlPacienteExcluir.setBackground(new Color(102, 0, 140));
		pnlPacienteExcluir.setBounds(349, 608, 165, 42);
		pnlPacienteExcluir.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(pnlPacienteExcluir);
		pnlPacienteExcluir.addMouseListener(new MouseAdapter() {

			
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameHomePage.this.dispose();
				FrameExcluiPaciente frame = new FrameExcluiPaciente();
				frame.setVisible(true);
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
		lblExcluir.setFont(new Font("Dialog", Font.BOLD, 18));
		lblExcluir.setForeground(new Color(255, 255, 255));
		pnlPacienteExcluir.add(lblExcluir);
		
		JPanel pnlPacienteBuscar = new JPanel();
		pnlPacienteBuscar.setBackground(new Color(102, 0, 140));
		pnlPacienteBuscar.setBounds(349, 684, 165, 42);
		pnlPacienteBuscar.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(pnlPacienteBuscar);
		pnlPacienteBuscar.addMouseListener(new MouseAdapter() {

			
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameHomePage.this.dispose();
				FrameBuscaPaciente frame = new FrameBuscaPaciente();
				frame.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlPacienteBuscar.setBackground(new Color (102, 0, 120));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlPacienteBuscar.setBackground(new Color (102, 0, 190));
			}
		});
		
		JLabel lblBuscar = new JLabel("Buscar");
		lblBuscar.setFont(new Font("Dialog", Font.BOLD, 18));
		lblBuscar.setForeground(new Color(255, 255, 255));
		pnlPacienteBuscar.add(lblBuscar);
		
		JPanel pnlTratamentoCadastrar = new JPanel();
		pnlTratamentoCadastrar.setBackground(new Color(102, 0, 140));
		pnlTratamentoCadastrar.setBounds(660, 448, 165, 42);
		pnlTratamentoCadastrar.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(pnlTratamentoCadastrar);
		pnlTratamentoCadastrar.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameHomePage.this.dispose();
				FrameCadastraTratamento frame = new FrameCadastraTratamento();
				frame.setVisible(true);
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
		
		JLabel lblCadastrar_1 = new JLabel("Cadastrar");
		lblCadastrar_1.setForeground(Color.WHITE);
		lblCadastrar_1.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlTratamentoCadastrar.add(lblCadastrar_1);
		
		JPanel pnlTratamentoAlterar = new JPanel();
		pnlTratamentoAlterar.setBackground(new Color(102, 0, 140));
		pnlTratamentoAlterar.setBounds(660, 528, 165, 42);
		pnlTratamentoAlterar.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(pnlTratamentoAlterar);
		pnlTratamentoAlterar.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameHomePage.this.dispose();
				FrameAlteraTratamento frame = new FrameAlteraTratamento();
				frame.setVisible(true);
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
		
		JLabel lblAlterar_1 = new JLabel("Alterar");
		lblAlterar_1.setForeground(Color.WHITE);
		lblAlterar_1.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlTratamentoAlterar.add(lblAlterar_1);
		
		JPanel pnlTratamentoExcluir = new JPanel();
		pnlTratamentoExcluir.setBackground(new Color(102, 0, 140));
		pnlTratamentoExcluir.setBounds(660, 608, 165, 42);
		pnlTratamentoExcluir.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(pnlTratamentoExcluir);
		pnlTratamentoExcluir.addMouseListener(new MouseAdapter() {
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameHomePage.this.dispose();
				FrameExcluiTratamento frame = new FrameExcluiTratamento();
				frame.setVisible(true);
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
		
		JLabel lblExcluir_1 = new JLabel("Excluir");
		lblExcluir_1.setForeground(Color.WHITE);
		lblExcluir_1.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlTratamentoExcluir.add(lblExcluir_1);
		
		JPanel pnlTratamentoBuscar = new JPanel();
		pnlTratamentoBuscar.setBackground(new Color(102, 0, 140));
		pnlTratamentoBuscar.setBounds(660, 684, 165, 42);
		pnlTratamentoBuscar.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(pnlTratamentoBuscar);
		pnlTratamentoBuscar.addMouseListener(new MouseAdapter() {
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameHomePage.this.dispose();
				FrameBuscaTratamento frame = new FrameBuscaTratamento();
				frame.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlTratamentoBuscar.setBackground(new Color (102, 0, 120));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlTratamentoBuscar.setBackground(new Color (102, 0, 190));
			}
		});
		
		JLabel lblBuscar_1 = new JLabel("Buscar");
		lblBuscar_1.setForeground(Color.WHITE);
		lblBuscar_1.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlTratamentoBuscar.add(lblBuscar_1);
		
		JPanel pnlConsultaCadastrar = new JPanel();
		pnlConsultaCadastrar.setBackground(new Color(102, 0, 140));
		pnlConsultaCadastrar.setBounds(935, 448, 165, 42);
		pnlConsultaCadastrar.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(pnlConsultaCadastrar);
		pnlConsultaCadastrar.addMouseListener(new MouseAdapter() {
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameHomePage.this.dispose();
				FrameCadastraConsulta frame = new FrameCadastraConsulta();
				frame.setVisible(true);
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
		
		JLabel lblCadastrar_2 = new JLabel("Cadastrar");
		lblCadastrar_2.setForeground(Color.WHITE);
		lblCadastrar_2.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlConsultaCadastrar.add(lblCadastrar_2);
		
		JPanel pnlConsultaAlterar = new JPanel();
		pnlConsultaAlterar.setBackground(new Color(102, 0, 140));
		pnlConsultaAlterar.setBounds(935, 528, 165, 42);
		pnlConsultaAlterar.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(pnlConsultaAlterar);
		pnlConsultaAlterar.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameHomePage.this.dispose();
				FrameAlteraConsulta frame = new FrameAlteraConsulta();
				frame.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlConsultaAlterar.setBackground(new Color (102, 0, 120));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlConsultaAlterar.setBackground(new Color (102, 0, 190));
			}
		});
		
		JLabel lblAlterar_2 = new JLabel("Alterar");
		lblAlterar_2.setForeground(Color.WHITE);
		lblAlterar_2.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlConsultaAlterar.add(lblAlterar_2);
		
		JPanel pnlConsultaExcluir = new JPanel();
		pnlConsultaExcluir.setBackground(new Color(102, 0, 140));
		pnlConsultaExcluir.setBounds(935, 608, 165, 42);
		pnlConsultaExcluir.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(pnlConsultaExcluir);
		pnlConsultaExcluir.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameHomePage.this.dispose();
				FrameExcluiConsulta frame = new FrameExcluiConsulta();
				frame.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlConsultaExcluir.setBackground(new Color (102, 0, 120));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlConsultaExcluir.setBackground(new Color (102, 0, 190));
			}
		});
		
		JLabel lblExcluir_2 = new JLabel("Excluir");
		lblExcluir_2.setForeground(Color.WHITE);
		lblExcluir_2.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlConsultaExcluir.add(lblExcluir_2);
		
		JPanel pnlConsultaBuscar = new JPanel();
		pnlConsultaBuscar.setBackground(new Color(102, 0, 140));
		pnlConsultaBuscar.setBounds(935, 684, 165, 42);
		pnlConsultaBuscar.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(pnlConsultaBuscar);
		pnlConsultaBuscar.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameHomePage.this.dispose();
				FrameBuscaConsulta frame = new FrameBuscaConsulta();
				frame.setVisible(true);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlConsultaBuscar.setBackground(new Color (102, 0, 120));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlConsultaBuscar.setBackground(new Color (102, 0, 190));
			}
		});
		
		JLabel lblBuscar_2 = new JLabel("Buscar");
		lblBuscar_2.setForeground(Color.WHITE);
		lblBuscar_2.setFont(new Font("Dialog", Font.BOLD, 18));
		pnlConsultaBuscar.add(lblBuscar_2);
		
		JLabel lblSair = new JLabel("[X]");
		lblSair.setForeground(Color.WHITE);
		lblSair.setBounds(1468, 24, 20, 20);
		lblSair.setBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(lblSair);
		lblSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameHomePage.this.dispose();
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
