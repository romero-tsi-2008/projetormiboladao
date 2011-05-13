package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

import util.Servico;

//VS4E -- DO NOT REMOVE THIS LINE!
public class TelaEstenderReserva extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel0;
	private JLabel jLabel1;
	private JTextField jTextField0;
	private JTextField jTextField1;
	private JLabel jLabel3;
	private JTextField jTextField2;
	private JLabel jLabel4;
	private JTextField jTextField3;
	private JLabel jLabel2;
	private JButton jButton0;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public TelaEstenderReserva() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJLabel0(), new Constraints(new Leading(141, 10, 10), new Leading(15, 10, 10)));
		add(getJLabel1(), new Constraints(new Leading(22, 10, 10), new Leading(51, 10, 10)));
		add(getJTextField0(), new Constraints(new Leading(66, 240, 10, 10), new Leading(49, 12, 12)));
		add(getJTextField1(), new Constraints(new Leading(66, 216, 10, 10), new Leading(81, 12, 12)));
		add(getJLabel3(), new Constraints(new Leading(15, 10, 10), new Leading(118, 12, 12)));
		add(getJTextField2(), new Constraints(new Leading(66, 64, 10, 10), new Leading(116, 10, 10)));
		add(getJLabel4(), new Constraints(new Leading(157, 10, 10), new Leading(118, 12, 12)));
		add(getJTextField3(), new Constraints(new Leading(203, 63, 12, 12), new Leading(118, 12, 12)));
		add(getJLabel2(), new Constraints(new Leading(32, 12, 12), new Leading(83, 12, 12)));
		add(getJButton0(), new Constraints(new Leading(134, 12, 12), new Leading(172, 10, 10)));
		setSize(351, 235);
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("OK");
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
			jLabel2.setText("CPF");
		}
		return jLabel2;
	}

	private JTextField getJTextField3() {
		if (jTextField3 == null) {
			jTextField3 = new JTextField();
		}
		return jTextField3;
	}

	private JLabel getJLabel4() {
		if (jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("Dias:");
		}
		return jLabel4;
	}

	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
		}
		return jTextField2;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("Quarto");
		}
		return jLabel3;
	}

	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
		}
		return jTextField1;
	}

	private JTextField getJTextField0() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField();
		}
		return jTextField0;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("Hotel:");
		}
		return jLabel1;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("Estender estadia");
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
				TelaEstenderReserva frame = new TelaEstenderReserva();
				frame.setDefaultCloseOperation(TelaEstenderReserva.EXIT_ON_CLOSE);
				frame.setTitle("TelaEstenderReserva");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}

	private void jButton0ActionActionPerformed(ActionEvent event) {
		String nomeHotel = jTextField0.getText();
		String cpf  = jTextField1.getText();
		String quarto = jTextField2.getText();
		int q = Integer.parseInt(quarto);
		String dias = jTextField3.getText();
		int d = Integer.parseInt(dias);
		try{
			String msg = Servico.getServico().estenderReserva(nomeHotel, cpf, q, d);
			JOptionPane.showMessageDialog(null, msg,"",JOptionPane.INFORMATION_MESSAGE);
		}catch(Exception e){
			
		}
	}

}
