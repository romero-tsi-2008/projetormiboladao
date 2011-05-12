package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

//VS4E -- DO NOT REMOVE THIS LINE!
public class TelaCadastroQuarto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JButton jButton0;
	private JButton jButton1;
	private JLabel jLabel0;
	private JTextField jTextField0;
	private JComboBox jComboBox0;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public TelaCadastroQuarto() {
		initComponents();
	}

	private void initComponents() {
//		setUndecorated(true);
		setLayout(new GroupLayout());
		add(getJLabel1(), new Constraints(new Leading(48, 10, 10), new Leading(59, 10, 10)));
		add(getJLabel0(), new Constraints(new Leading(156, 12, 12), new Leading(14, 25, 12, 12)));
		add(getJTextField0(), new Constraints(new Leading(104, 274, 10, 10), new Leading(59, 12, 12)));
		add(getJButton0(), new Constraints(new Leading(115, 10, 10), new Leading(147, 10, 10)));
		add(getJButton1(), new Constraints(new Leading(227, 10, 10), new Leading(147, 10, 10)));
		add(getJComboBox0(), new Constraints(new Leading(104, 236, 10, 10), new Leading(95, 12, 12)));
		add(getJLabel2(), new Constraints(new Leading(64, 12, 12), new Leading(101, 10, 10)));
		setSize(420, 214);
	}

	private JComboBox getJComboBox0() {
		if (jComboBox0 == null) {
			jComboBox0 = new JComboBox();
			jComboBox0.setModel(new DefaultComboBoxModel(new Object[] { "item0", "item1", "item2", "item3" }));
			jComboBox0.setDoubleBuffered(false);
			jComboBox0.setBorder(null);
		}
		return jComboBox0;
	}

	private JTextField getJTextField0() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField();
		}
		return jTextField0;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("Cadastro de Quarto");
		}
		return jLabel0;
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("CADASTRAR");
		}
		return jButton1;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("Cancelar");
			jButton0.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton0ActionActionPerformed(event);
				}
			});
		}
		return jButton0;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("Hotel:");
		}
		return jLabel2;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("Número:");
		}
		return jLabel1;
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
				TelaCadastroQuarto frame = new TelaCadastroQuarto();
				frame.setDefaultCloseOperation(TelaCadastroQuarto.EXIT_ON_CLOSE);
				frame.setTitle("TelaCadastroHotel");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}

	private void jButton0ActionActionPerformed(ActionEvent event) {
		TelaListagemQuartos tela = new TelaListagemQuartos();
		tela.setVisible(true);
		this.dispose();
	}

}
