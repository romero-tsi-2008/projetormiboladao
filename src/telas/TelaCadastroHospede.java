package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

//VS4E -- DO NOT REMOVE THIS LINE!
public class TelaCadastroHospede extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel5;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JTextField jTextField4;
	private JTextField jTextField1;
	private JTextField jTextField0;
	private JTextField jTextField2;
	private JTextField jTextField3;
	private JButton jButton0;
	private JButton jButton1;
	private JLabel jLabel0;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public TelaCadastroHospede() {
		initComponents();
	}

	private void initComponents() {
//		setUndecorated(true);
		setLayout(new GroupLayout());
		add(getJLabel1(), new Constraints(new Leading(61, 12, 12), new Leading(59, 12, 12)));
		add(getJLabel2(), new Constraints(new Leading(58, 12, 12), new Leading(95, 12, 12)));
		add(getJLabel5(), new Constraints(new Leading(72, 12, 12), new Leading(209, 12, 12)));
		add(getJLabel3(), new Constraints(new Leading(40, 12, 12), new Leading(170, 10, 10)));
		add(getJLabel4(), new Constraints(new Leading(42, 12, 12), new Leading(131, 10, 10)));
		add(getJTextField4(), new Constraints(new Leading(109, 260, 10, 10), new Leading(59, 12, 12)));
		add(getJTextField1(), new Constraints(new Leading(109, 144, 10, 10), new Leading(132, 12, 12)));
		add(getJTextField0(), new Constraints(new Leading(109, 208, 10, 10), new Leading(97, 12, 12)));
		add(getJTextField2(), new Constraints(new Leading(109, 297, 10, 10), new Leading(170, 12, 12)));
		add(getJTextField3(), new Constraints(new Leading(109, 144, 12, 12), new Leading(204, 12, 12)));
		add(getJButton0(), new Constraints(new Leading(124, 10, 10), new Leading(253, 10, 10)));
		add(getJButton1(), new Constraints(new Leading(252, 10, 10), new Leading(253, 12, 12)));
		add(getJLabel0(), new Constraints(new Leading(180, 10, 10), new Leading(12, 21, 12, 12)));
		setSize(468, 311);
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("Cadastro de Hóspede");
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

	private JTextField getJTextField3() {
		if (jTextField3 == null) {
			jTextField3 = new JTextField();
		}
		return jTextField3;
	}

	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
		}
		return jTextField2;
	}

	private JTextField getJTextField0() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField();
		}
		return jTextField0;
	}

	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
		}
		return jTextField1;
	}

	private JTextField getJTextField4() {
		if (jTextField4 == null) {
			jTextField4 = new JTextField();
		}
		return jTextField4;
	}

	private JLabel getJLabel4() {
		if (jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("Telefone:");
		}
		return jLabel4;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("Endereço:");
		}
		return jLabel3;
	}

	private JLabel getJLabel5() {
		if (jLabel5 == null) {
			jLabel5 = new JLabel();
			jLabel5.setText("CPF:");
		}
		return jLabel5;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("E-mail:");
		}
		return jLabel2;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("Nome:");
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
				TelaCadastroHospede frame = new TelaCadastroHospede();
				frame.setDefaultCloseOperation(TelaCadastroHospede.EXIT_ON_CLOSE);
				frame.setTitle("TelaCadastroHospede");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}

	private void jButton0ActionActionPerformed(ActionEvent event) {
		TelaListagemHospedes tela = new TelaListagemHospedes();
		tela.setVisible(true);
		this.dispose();
	}

}
