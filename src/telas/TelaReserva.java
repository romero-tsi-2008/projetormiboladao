package telas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;
import org.dyno.visual.swing.layouts.Trailing;

//VS4E -- DO NOT REMOVE THIS LINE!
public class TelaReserva extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton jButton0;
	private JInternalFrame jInternalFrame0;
	private JTabbedPane jTabbedPane0;
	private JButton jButton1;
	private JInternalFrame jInternalFrame1;
	private JButton jButton2;
	private JLabel jLabel0;
	private JLabel jLabel2;
	private JLabel jLabel1;
	private JComboBox jComboBox0;
	private JComboBox jComboBox1;
	private JLabel jLabel3;
	private JButton jButton3;
	private JTextField jTextField0;
	private JLabel jLabel4;
	private JLabel jLabel6;
	private JLabel jLabel5;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private JTextField jTextField1;
	private JButton jButton4;
	private JLabel jLabel9;
	private JLabel jLabel11;
	private JLabel jLabel10;
	private JLabel jLabel12;
	private JLabel jLabel13;
	private JLabel jLabel14;
	private JLabel jLabel15;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public TelaReserva() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJLabel0(), new Constraints(new Leading(176, 10, 10), new Leading(6, 12, 12)));
		add(getJTabbedPane0(), new Constraints(new Leading(22, 453, 12, 12), new Leading(48, 353, 10, 10)));
		add(getJButton2(), new Constraints(new Leading(26, 10, 10), new Leading(421, 28, 10, 10)));
		setSize(533, 484);
	}

	private JLabel getJLabel15() {
		if (jLabel15 == null) {
			jLabel15 = new JLabel();
			jLabel15.setText("-");
		}
		return jLabel15;
	}

	private JLabel getJLabel14() {
		if (jLabel14 == null) {
			jLabel14 = new JLabel();
			jLabel14.setText("Valor da divida:");
		}
		return jLabel14;
	}

	private JLabel getJLabel13() {
		if (jLabel13 == null) {
			jLabel13 = new JLabel();
			jLabel13.setText("-");
		}
		return jLabel13;
	}

	private JLabel getJLabel12() {
		if (jLabel12 == null) {
			jLabel12 = new JLabel();
		}
		return jLabel12;
	}

	private JLabel getJLabel10() {
		if (jLabel10 == null) {
			jLabel10 = new JLabel();
			jLabel10.setText("Endereço:");
		}
		return jLabel10;
	}

	private JLabel getJLabel11() {
		if (jLabel11 == null) {
			jLabel11 = new JLabel();
			jLabel11.setText("-");
		}
		return jLabel11;
	}

	private JLabel getJLabel9() {
		if (jLabel9 == null) {
			jLabel9 = new JLabel();
			jLabel9.setText("Nome:");
		}
		return jLabel9;
	}

	private JButton getJButton4() {
		if (jButton4 == null) {
			jButton4 = new JButton();
			jButton4.setText("Buscar");
		}
		return jButton4;
	}

	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
		}
		return jTextField1;
	}

	private JLabel getJLabel8() {
		if (jLabel8 == null) {
			jLabel8 = new JLabel();
			jLabel8.setText("CPF:");
		}
		return jLabel8;
	}

	private JLabel getJLabel7() {
		if (jLabel7 == null) {
			jLabel7 = new JLabel();
			jLabel7.setText("-");
		}
		return jLabel7;
	}

	private JLabel getJLabel5() {
		if (jLabel5 == null) {
			jLabel5 = new JLabel();
			jLabel5.setText("-");
		}
		return jLabel5;
	}

	private JLabel getJLabel6() {
		if (jLabel6 == null) {
			jLabel6 = new JLabel();
			jLabel6.setText("Endereo:");
		}
		return jLabel6;
	}

	private JLabel getJLabel4() {
		if (jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("Nome:");
		}
		return jLabel4;
	}

	private JTextField getJTextField0() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField();
		}
		return jTextField0;
	}

	private JButton getJButton3() {
		if (jButton3 == null) {
			jButton3 = new JButton();
			jButton3.setText("Buscar");
		}
		return jButton3;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("CPF:");
		}
		return jLabel3;
	}

	private JComboBox getJComboBox1() {
		if (jComboBox1 == null) {
			jComboBox1 = new JComboBox();
			jComboBox1.setModel(new DefaultComboBoxModel(new Object[] { "item0", "item1", "item2", "item3" }));
			jComboBox1.setDoubleBuffered(false);
			jComboBox1.setBorder(null);
		}
		return jComboBox1;
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

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("Hotel:");
		}
		return jLabel1;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("Quarto:");
		}
		return jLabel2;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel0.setText("Cadastro de reserva");
		}
		return jLabel0;
	}

	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setText("Voltar");
			jButton2.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton2ActionActionPerformed(event);
				}
			});
		}
		return jButton2;
	}

	private JInternalFrame getJInternalFrame1() {
		if (jInternalFrame1 == null) {
			jInternalFrame1 = new JInternalFrame();
			jInternalFrame1.setVisible(true);
			jInternalFrame1.setLayout(new GroupLayout());
			jInternalFrame1.add(getJButton1(), new Constraints(new Leading(311, 12, 12), new Trailing(12, 41, 219)));
			jInternalFrame1.add(getJLabel8(), new Constraints(new Leading(28, 10, 10), new Leading(22, 10, 10)));
			jInternalFrame1.add(getJTextField1(), new Constraints(new Leading(63, 206, 10, 10), new Leading(20, 12, 12)));
			jInternalFrame1.add(getJButton4(), new Constraints(new Leading(277, 10, 10), new Leading(17, 50, 50)));
			jInternalFrame1.add(getJLabel9(), new Constraints(new Leading(17, 12, 12), new Leading(58, 12, 12)));
			jInternalFrame1.add(getJLabel11(), new Constraints(new Leading(63, 291, 10, 10), new Leading(58, 12, 12)));
			jInternalFrame1.add(getJLabel10(), new Constraints(new Leading(7, 12, 12), new Leading(99, 10, 10)));
			jInternalFrame1.add(getJLabel12(), new Constraints(new Leading(74, 280, 12, 12), new Leading(124, -23, 10, 10)));
			jInternalFrame1.add(getJLabel13(), new Constraints(new Leading(72, 288, 10, 10), new Leading(99, 50, 50)));
			jInternalFrame1.add(getJLabel14(), new Constraints(new Leading(7, 12, 12), new Leading(131, 10, 10)));
			jInternalFrame1.add(getJLabel15(), new Constraints(new Leading(102, 235, 10, 10), new Leading(131, 50, 50)));
		}
		return jInternalFrame1;
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("Pagar dívida");
		}
		return jButton1;
	}

	private JTabbedPane getJTabbedPane0() {
		if (jTabbedPane0 == null) {
			jTabbedPane0 = new JTabbedPane();
			jTabbedPane0.addTab("Disponíveis", getJInternalFrame0());
			jTabbedPane0.addTab("Com dívida", getJInternalFrame1());
		}
		return jTabbedPane0;
	}

	private JInternalFrame getJInternalFrame0() {
		if (jInternalFrame0 == null) {
			jInternalFrame0 = new JInternalFrame();
			jInternalFrame0.setVisible(true);
			jInternalFrame0.setLayout(new GroupLayout());
			jInternalFrame0.add(getJLabel3(), new Constraints(new Leading(15, 12, 12), new Leading(28, 10, 10)));
			jInternalFrame0.add(getJButton3(), new Constraints(new Leading(286, 10, 10), new Leading(25, 12, 12)));
			jInternalFrame0.add(getJTextField0(), new Constraints(new Leading(48, 223, 10, 10), new Leading(28, 23, 12, 12)));
			jInternalFrame0.add(getJLabel4(), new Constraints(new Leading(15, 12, 12), new Leading(74, 10, 10)));
			jInternalFrame0.add(getJLabel6(), new Constraints(new Leading(15, 12, 12), new Leading(102, 12, 12)));
			jInternalFrame0.add(getJLabel5(), new Constraints(new Leading(57, 304, 12, 12), new Leading(74, 12, 12)));
			jInternalFrame0.add(getJLabel7(), new Constraints(new Leading(71, 290, 12, 12), new Leading(102, 12, 12)));
			jInternalFrame0.add(getJLabel1(), new Constraints(new Leading(24, 12, 12), new Leading(160, 10, 10)));
			jInternalFrame0.add(getJComboBox0(), new Constraints(new Leading(64, 348, 12, 12), new Leading(158, 10, 10)));
			jInternalFrame0.add(getJLabel2(), new Constraints(new Leading(15, 12, 12), new Leading(204, 10, 10)));
			jInternalFrame0.add(getJComboBox1(), new Constraints(new Leading(64, 145, 12, 12), new Leading(201, 12, 12)));
			jInternalFrame0.add(getJButton0(), new Constraints(new Leading(288, 10, 10), new Leading(241, 10, 10)));
		}
		return jInternalFrame0;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("Realizar reserva");
		}
		return jButton0;
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
				TelaReserva frame = new TelaReserva();
				frame.setDefaultCloseOperation(TelaReserva.EXIT_ON_CLOSE);
				frame.setTitle("TelaReserva");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}

	private void jButton2ActionActionPerformed(ActionEvent event) {
		this.dispose();
	}

}
