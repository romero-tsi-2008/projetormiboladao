package telas;

import interfaces.HotelIF;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

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
public class TelaCadastroHotel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JButton jButton0;
	private JButton jButton1;
	private JLabel jLabel0;
	private JTextField jTextField1;
	private JTextField jTextField0;
	private JTextField jTextField2;
	private JLabel jLabel4;
	private JTextField jTextField3;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public TelaCadastroHotel() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJLabel1(), new Constraints(new Leading(48, 10, 10), new Leading(59, 10, 10)));
		add(getJLabel2(), new Constraints(new Leading(39, 12, 12), new Leading(99, 12, 12)));
		add(getJLabel3(), new Constraints(new Leading(30, 12, 12), new Leading(135, 12, 12)));
		add(getJLabel0(), new Constraints(new Leading(156, 12, 12), new Leading(14, 25, 12, 12)));
		add(getJTextField1(), new Constraints(new Leading(97, 199, 10, 10), new Leading(99, 12, 12)));
		add(getJTextField0(), new Constraints(new Leading(97, 274, 10, 10), new Leading(59, 12, 12)));
		add(getJTextField2(), new Constraints(new Leading(97, 274, 12, 12), new Leading(135, 12, 12)));
		add(getJButton0(), new Constraints(new Leading(118, 10, 10), new Leading(208, 12, 12)));
		add(getJButton1(), new Constraints(new Leading(230, 10, 10), new Leading(208, 12, 12)));
		add(getJLabel4(), new Constraints(new Leading(55, 10, 10), new Leading(171, 10, 10)));
		add(getJTextField3(), new Constraints(new Leading(100, 176, 10, 10), new Leading(171, 12, 12)));
		setSize(420, 251);
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
			jLabel4.setText("Diaria:");
		}
		return jLabel4;
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

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("Cadastro de Hotel");
		}
		return jLabel0;
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("CADASTRAR");
			jButton1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent event) {
					// TODO Auto-generated method stub
					jButton1ActionActionPerformed(event);
				}
			});
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

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("Endereco:");
		}
		return jLabel3;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("Gerente:");
		}
		return jLabel2;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("Nome: ");
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
				TelaCadastroHotel frame = new TelaCadastroHotel();
				frame.setDefaultCloseOperation(TelaCadastroHotel.EXIT_ON_CLOSE);
				frame.setTitle("TelaCadastroHotel");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}

	private void jButton0ActionActionPerformed(ActionEvent event) {
		this.dispose();
	}
	
	private void jButton1ActionActionPerformed(ActionEvent event) {
		String nome = jTextField0.getText();
		String gerente = jTextField1.getText();
		String endereco = jTextField2.getText();
		String diaria = jTextField3.getText();
		double valorDiaria = Double.parseDouble(diaria);
		
		try{
			Servico.getServico().cadastrarHotel(nome, gerente, endereco, valorDiaria);
			JOptionPane.showMessageDialog(null, "Hotel cadastrado!","",JOptionPane.INFORMATION_MESSAGE);
		}catch(Exception e){}
	}

}
