package telas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import models.Quarto;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

import util.Servico;

//VS4E -- DO NOT REMOVE THIS LINE!
public class TelaListagemQuartos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel0;
	private JButton jButton2;
	private JButton jButton3;
	private JList jList0;
	private JScrollPane jScrollPane0;
	private JLabel jLabel1;
	private JTextField jTextField0;
	private JButton jButton4;
	private DefaultListModel listModel;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public TelaListagemQuartos() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJButton2(), new Constraints(new Leading(16, 12, 12), new Leading(12, 12, 12)));
		add(getJLabel0(), new Constraints(new Leading(188, 10, 10), new Leading(14, 10, 10)));
		add(getJButton3(), new Constraints(new Leading(16, 12, 12), new Leading(286, 12, 12)));
		add(getJScrollPane0(), new Constraints(new Leading(17, 441, 10, 10), new Leading(89, 178, 10, 10)));
		add(getJLabel1(), new Constraints(new Leading(25, 10, 10), new Leading(65, 10, 10)));
		add(getJTextField0(), new Constraints(new Leading(165, 205, 12, 12), new Leading(63, 12, 12)));
		add(getJButton4(), new Constraints(new Leading(376, 12, 12), new Leading(57, 12, 12)));
		setSize(491, 329);
	}

	private JButton getJButton4() {
		if (jButton4 == null) {
			jButton4 = new JButton();
			jButton4.setText("Buscar");
			jButton4.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton4ActionActionPerformed(event);
				}
			});
		}
		return jButton4;
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
			jLabel1.setText("Listar quartos do hotel:");
		}
		return jLabel1;
	}

	private JScrollPane getJScrollPane0() {
		if (jScrollPane0 == null) {
			jScrollPane0 = new JScrollPane();
			jScrollPane0.setViewportView(getJList0());
		}
		return jScrollPane0;
	}

	private JList getJList0() {
		if (jList0 == null) {
			jList0 = new JList();
//			DefaultListModel listModel = new DefaultListModel();
//			listModel.addElement("item0");
//			listModel.addElement("item1");
//			listModel.addElement("item2");
//			listModel.addElement("item3");
//			jList0.setModel(listModel);
		}
		return jList0;
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
		this.dispose();
		TelaCadastroQuarto telaCadastroQuarto = new TelaCadastroQuarto();
		telaCadastroQuarto.setVisible(true);
	}

	private void jButton4ActionActionPerformed(ActionEvent event) {
		String hotel = jTextField0.getText();
		listModel = new DefaultListModel();
		try{
			ArrayList<Quarto> quartos = (ArrayList<Quarto>) Servico.getServico().pegarQuartos(hotel);
			for(Quarto q: quartos){
				listModel.addElement(q.getNum());
			}
			jList0.setModel(listModel);
		}catch(Exception e){}
		
	}

}
