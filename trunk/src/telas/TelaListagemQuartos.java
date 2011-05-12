package telas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

//VS4E -- DO NOT REMOVE THIS LINE!
public class TelaListagemQuartos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel0;
	private JScrollBar jScrollBar0;
	private JPanel jPanel0;
	private JButton jButton0;
	private JButton jButton1;
	private JButton jButton2;
	private JButton jButton3;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public TelaListagemQuartos() {
		initComponents();
	}

	private void initComponents() {
		setUndecorated(true);
		setLayout(new GroupLayout());
		add(getJPanel0(), new Constraints(new Leading(16, 468, 12, 12), new Leading(46, 220, 10, 10)));
		add(getJButton2(), new Constraints(new Leading(16, 12, 12), new Leading(12, 12, 12)));
		add(getJLabel0(), new Constraints(new Leading(188, 10, 10), new Leading(14, 10, 10)));
		add(getJButton1(), new Constraints(new Leading(311, 150, 10, 10), new Leading(286, 10, 10)));
		add(getJButton0(), new Constraints(new Leading(133, 10, 10), new Leading(286, 12, 12)));
		add(getJButton3(), new Constraints(new Leading(16, 12, 12), new Leading(286, 12, 12)));
		setSize(510, 329);
	}

	private JButton getJButton3() {
		if (jButton3 == null) {
			jButton3 = new JButton();
			jButton3.setText("Voltar");
			jButton3.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton3ActionActionPerformed(event);
				}
			});
		}
		return jButton3;
	}

	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setBackground(new Color(128, 255, 128));
			jButton2.setText("Novo");
			jButton2.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton2ActionActionPerformed(event);
				}
			});
		}
		return jButton2;
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("Editar selecionado");
		}
		return jButton1;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("Apagar selecionado");
		}
		return jButton0;
	}

	private JPanel getJPanel0() {
		if (jPanel0 == null) {
			jPanel0 = new JPanel();
			jPanel0.setBorder(new LineBorder(Color.black, 1, false));
			jPanel0.setLayout(new GroupLayout());
			jPanel0.add(getJScrollBar0(), new Constraints(new Leading(444, 22, 10, 10), new Bilateral(0, 0, 5)));
		}
		return jPanel0;
	}

	private JScrollBar getJScrollBar0() {
		if (jScrollBar0 == null) {
			jScrollBar0 = new JScrollBar();
		}
		return jScrollBar0;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("Listagem de quartos");
		}
		return jLabel0;
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
				TelaListagemQuartos frame = new TelaListagemQuartos();
				frame.setDefaultCloseOperation(TelaListagemQuartos.EXIT_ON_CLOSE);
				frame.setTitle("TelaListagemHospedes");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}

	private void jButton3ActionActionPerformed(ActionEvent event) {
		this.dispose();
	}

	private void jButton2ActionActionPerformed(ActionEvent event) {
		TelaCadastroQuarto telaCadastroQuarto = new TelaCadastroQuarto();
		telaCadastroQuarto.setVisible(true);
	}

}