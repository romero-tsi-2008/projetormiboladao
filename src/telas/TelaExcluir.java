package telas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import models.Hospede;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

import util.Servico;

//VS4E -- DO NOT REMOVE THIS LINE!
public class TelaExcluir extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel1;
	private JTextField jTextField0;
	private JButton jButton0;
	private JLabel jLabel0;
	private JLabel jLabel2;
	private JTextField jTextField1;
	private JSeparator jSeparator0;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JTextField jTextField2;
	private JButton jButton1;
	private JSeparator jSeparator1;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JTextField jTextField3;
	private JLabel jLabel7;
	private JTextField jTextField4;
	private JButton jButton2;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public TelaExcluir() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJLabel1(), new Constraints(new Leading(23, 10, 10), new Leading(40, 12, 12)));
		add(getJTextField0(), new Constraints(new Leading(56, 173, 10, 10), new Leading(38, 12, 12)));
		add(getJButton0(), new Constraints(new Leading(238, 10, 10), new Leading(34, 12, 12)));
		add(getJLabel2(), new Constraints(new Leading(12, 12, 12), new Leading(72, 12, 12)));
		add(getJTextField1(), new Constraints(new Leading(56, 172, 12, 12), new Leading(72, 12, 12)));
		add(getJSeparator0(), new Constraints(new Leading(4, 343, 10, 10), new Leading(104, 10, 12, 12)));
		add(getJSeparator1(), new Constraints(new Leading(0, 350, 12, 12), new Leading(210, 10, 10, 10)));
		add(getJTextField2(), new Constraints(new Leading(56, 176, 12, 12), new Leading(157, 10, 10)));
		add(getJLabel4(), new Constraints(new Leading(14, 10, 10), new Leading(159, 12, 12)));
		add(getJButton1(), new Constraints(new Leading(241, 10, 10), new Leading(151, 12, 12)));
		add(getJLabel6(), new Constraints(new Leading(15, 12, 12), new Leading(259, 10, 10)));
		add(getJTextField3(), new Constraints(new Leading(56, 184, 10, 10), new Leading(257, 12, 12)));
		add(getJLabel7(), new Constraints(new Leading(17, 10, 10), new Leading(295, 12, 12)));
		add(getJTextField4(), new Constraints(new Leading(65, 41, 10, 10), new Leading(293, 12, 12)));
		add(getJButton2(), new Constraints(new Leading(128, 10, 10), new Leading(289, 12, 12)));
		add(getJLabel5(), new Constraints(new Leading(93, 12, 12), new Leading(222, 12, 12)));
		add(getJLabel3(), new Constraints(new Leading(123, 10, 10), new Leading(118, 10, 10)));
		add(getJLabel0(), new Constraints(new Leading(112, 10, 10), new Leading(7, 12, 12)));
		setSize(362, 340);
	}

	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setText("OK");
			jButton2.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton2ActionActionPerformed(event);
				}
			});
		}
		return jButton2;
	}

	private JTextField getJTextField4() {
		if (jTextField4 == null) {
			jTextField4 = new JTextField();
		}
		return jTextField4;
	}

	private JLabel getJLabel7() {
		if (jLabel7 == null) {
			jLabel7 = new JLabel();
			jLabel7.setText("Quarto");
		}
		return jLabel7;
	}

	private JTextField getJTextField3() {
		if (jTextField3 == null) {
			jTextField3 = new JTextField();
		}
		return jTextField3;
	}

	private JLabel getJLabel6() {
		if (jLabel6 == null) {
			jLabel6 = new JLabel();
			jLabel6.setText("Hotel:");
		}
		return jLabel6;
	}

	private JLabel getJLabel5() {
		if (jLabel5 == null) {
			jLabel5 = new JLabel();
			jLabel5.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel5.setText("Excluir quarto de hotel");
		}
		return jLabel5;
	}

	private JSeparator getJSeparator1() {
		if (jSeparator1 == null) {
			jSeparator1 = new JSeparator();
		}
		return jSeparator1;
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("OK");
			jButton1.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton1ActionActionPerformed(event);
				}
			});
		}
		return jButton1;
	}

	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
		}
		return jTextField2;
	}

	private JLabel getJLabel4() {
		if (jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("Hotel:");
		}
		return jLabel4;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel3.setText("Excluir hotel");
		}
		return jLabel3;
	}

	private JSeparator getJSeparator0() {
		if (jSeparator0 == null) {
			jSeparator0 = new JSeparator();
		}
		return jSeparator0;
	}

	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
		}
		return jTextField1;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("Hotel:");
		}
		return jLabel2;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setFont(new Font("Dialog", Font.BOLD, 14));
			jLabel0.setText("Excluir hospede");
		}
		return jLabel0;
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

	private JTextField getJTextField0() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField();
		}
		return jTextField0;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("CPF:");
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
				TelaExcluir frame = new TelaExcluir();
				frame.setDefaultCloseOperation(TelaExcluir.EXIT_ON_CLOSE);
				frame.setTitle("TelaExcluir");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}

	private void jButton0ActionActionPerformed(ActionEvent event) {
		String cpf = jTextField0.getText();
		String nomeHotel = jTextField1.getText();
		
		try{
			Hospede h = (Hospede) Servico.getServico().getHospedeByCpf(nomeHotel, cpf);
			Servico.getServico().removeHospedeByCpf(nomeHotel, cpf);
			JOptionPane.showMessageDialog(null, "Hospede "+h.getNome()+" removido com sucesso!","",JOptionPane.INFORMATION_MESSAGE);
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Erro ao remover hospede! "+e.getMessage(),"",JOptionPane.ERROR_MESSAGE);
		}
		
		
		
	}

	private void jButton1ActionActionPerformed(ActionEvent event) {
		String nome = jTextField2.getText();
		try{
			Servico.getServico().removeHotelByNome(nome);
			JOptionPane.showMessageDialog(null, "Removido com sucesso!","",JOptionPane.INFORMATION_MESSAGE);
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "Erro ao remover hotel! "+e.getMessage(),"",JOptionPane.ERROR_MESSAGE);
		}
	}

	private void jButton2ActionActionPerformed(ActionEvent event) {
		String nome = jTextField3.getText();
		String q = jTextField4.getText();
		int quarto = Integer.parseInt(q);
		try{
			Servico.getServico().deleteQuarto(nome, quarto);
			JOptionPane.showMessageDialog(null, "Removido com sucesso!","",JOptionPane.INFORMATION_MESSAGE);
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Erro ao remover quarto de hotel! "+e.getMessage(),"",JOptionPane.ERROR_MESSAGE);
		}
	}

}
