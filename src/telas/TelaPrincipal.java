package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

//VS4E -- DO NOT REMOVE THIS LINE!
public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JMenuItem jMenuItem0;
	private JMenuItem jMenuItem1;
	private JMenuItem jMenuItem2;
	private JMenu jMenu0;
	private JMenuItem jMenuItem3;
	private JMenuItem jMenuItem4;
	private JMenu jMenu1;
	private JMenuItem jMenuItem7;
	private JMenu jMenu2;
	private JMenuBar jMenuBar0;
	private JMenuItem jMenuItem8;
	private JLabel jLabel0;
	private JLabel jLabel1;
	private JMenuItem jMenuItem5;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public TelaPrincipal() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJLabel1(), new Constraints(new Leading(147, 10, 10), new Leading(247, 10, 10)));
		add(getJLabel0(), new Constraints(new Leading(193, 92, 10, 10), new Leading(51, 22, 10, 10)));
		setJMenuBar(getJMenuBar0());
		setSize(467, 318);
	}

	private JMenuItem getJMenuItem5() {
		if (jMenuItem5 == null) {
			jMenuItem5 = new JMenuItem();
			jMenuItem5.setText("Estender estadia");
			jMenuItem5.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jMenuItem5ActionActionPerformed(event);
				}
			});
		}
		return jMenuItem5;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("Sistema Gerenciador de Hotel");
		}
		return jLabel1;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("Hot�is Hilton");
		}
		return jLabel0;
	}

	private JMenuItem getJMenuItem8() {
		if (jMenuItem8 == null) {
			jMenuItem8 = new JMenuItem();
			jMenuItem8.setText("Excluir");
			jMenuItem8.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jMenuItem8ActionActionPerformed(event);
				}
			});
		}
		return jMenuItem8;
	}

	private JMenuBar getJMenuBar0() {
		if (jMenuBar0 == null) {
			jMenuBar0 = new JMenuBar();
			jMenuBar0.add(getJMenu0());
			jMenuBar0.add(getJMenu1());
			jMenuBar0.add(getJMenu2());
		}
		return jMenuBar0;
	}

	private JMenu getJMenu2() {
		if (jMenu2 == null) {
			jMenu2 = new JMenu();
			jMenu2.setText("Movimenta��o");
			jMenu2.setOpaque(false);
			jMenu2.add(getJMenuItem7());
			jMenu2.add(getJMenuItem5());
		}
		return jMenu2;
	}

	private JMenuItem getJMenuItem7() {
		if (jMenuItem7 == null) {
			jMenuItem7 = new JMenuItem();
			jMenuItem7.setText("Reservar quarto");
			jMenuItem7.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jMenuItem7ActionActionPerformed(event);
				}
			});
		}
		return jMenuItem7;
	}

	private JMenu getJMenu1() {
		if (jMenu1 == null) {
			jMenu1 = new JMenu();
			jMenu1.setText("Sobre");
			jMenu1.add(getJMenuItem3());
			jMenu1.add(getJMenuItem4());
		}
		return jMenu1;
	}

	private JMenuItem getJMenuItem4() {
		if (jMenuItem4 == null) {
			jMenuItem4 = new JMenuItem();
			jMenuItem4.setText("Equipe");
		}
		return jMenuItem4;
	}

	private JMenuItem getJMenuItem3() {
		if (jMenuItem3 == null) {
			jMenuItem3 = new JMenuItem();
			jMenuItem3.setText("Vers�o do software");
			jMenuItem3.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jMenuItem3ActionActionPerformed(event);
				}
			});
		}
		return jMenuItem3;
	}

	private JMenu getJMenu0() {
		if (jMenu0 == null) {
			jMenu0 = new JMenu();
			jMenu0.setText("Cadastro");
			jMenu0.setOpaque(false);
			jMenu0.add(getJMenuItem0());
			jMenu0.add(getJMenuItem1());
			jMenu0.add(getJMenuItem2());
			jMenu0.add(getJMenuItem8());
		}
		return jMenu0;
	}

	private JMenuItem getJMenuItem2() {
		if (jMenuItem2 == null) {
			jMenuItem2 = new JMenuItem();
			jMenuItem2.setText("Quarto");
			jMenuItem2.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jMenuItem2ActionActionPerformed(event);
				}
			});
		}
		return jMenuItem2;
	}

	private JMenuItem getJMenuItem1() {
		if (jMenuItem1 == null) {
			jMenuItem1 = new JMenuItem();
			jMenuItem1.setText("H�spede");
			jMenuItem1.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jMenuItem1ActionActionPerformed(event);
				}
			});
		}
		return jMenuItem1;
	}

	private JMenuItem getJMenuItem0() {
		if (jMenuItem0 == null) {
			jMenuItem0 = new JMenuItem();
			jMenuItem0.setText("Hotel");
			jMenuItem0.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jMenuItem0ActionActionPerformed(event);
				}
			});
		}
		return jMenuItem0;
	}

	private static void installLnF() {
		try {
			String lnfClassname = PREFERRED_LOOK_AND_FEEL;
			if (lnfClassname == null)
				lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(lnfClassname);
		} catch (Exception e) {
			System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL
					+ " on this platform:" + e.getMessage());
		}
	}

	/**
	 * Main entry of the class.
	 * Note: This class is only created so that you can easily preview the result at runtime.
	 * It is not expected to be managed by the designer.
	 * You can modify it as you like.
	 */
	public static void main(String[] args) {
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				TelaPrincipal frame = new TelaPrincipal();
				frame.setDefaultCloseOperation(TelaPrincipal.EXIT_ON_CLOSE);
				frame.setTitle("TelaPrincipal");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
		
		
	}

	private void jMenuItem1ActionActionPerformed(ActionEvent event) {
		TelaListagemHospedes telaListagemHospedes = new TelaListagemHospedes();
		telaListagemHospedes.setVisible(true);
	}

	private void jMenuItem3ActionActionPerformed(ActionEvent event) {
		TelaVersao telaVersao = new TelaVersao();
		telaVersao.setVisible(true);
	}

	private void jMenuItem2ActionActionPerformed(ActionEvent event) {
		TelaListagemQuartos telaListagemQuartos = new TelaListagemQuartos();
		telaListagemQuartos.setVisible(true);
	}

	private void jMenuItem0ActionActionPerformed(ActionEvent event) {
		TelaCadastroHotel telaCadastroHotel = new TelaCadastroHotel();
		telaCadastroHotel.setVisible(true);
	}

	private void jMenuItem7ActionActionPerformed(ActionEvent event) {
		TelaReserva telaReserva = new TelaReserva();
		telaReserva.setVisible(true);
	}

	private void jMenuItem8ActionActionPerformed(ActionEvent event) {
		TelaExcluir telaExcluir = new TelaExcluir();
		telaExcluir.setVisible(true);
	}

	private void jMenuItem5ActionActionPerformed(ActionEvent event) {
		TelaEstenderReserva tela = new TelaEstenderReserva();
		tela.setVisible(true);
	}

}
