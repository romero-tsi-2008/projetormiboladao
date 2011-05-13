package telas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import models.Hospede;
import models.Hotel;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

import util.Servico;

//VS4E -- DO NOT REMOVE THIS LINE!
public class TelaListagemHospedes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel0;
	private JButton jButton2;
	private JButton jButton3;
	private JList jList0;
	private DefaultListModel listModel;
	private JScrollPane jScrollPane0;
	private JLabel jLabel1;
	private JTextField jTextField0;
	private JButton jButton4;
	private JComboBox jComboBox0;
	private DefaultComboBoxModel comboModel;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public TelaListagemHospedes() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJButton2(), new Constraints(new Leading(16, 12, 12), new Leading(12, 12, 12)));
		add(getJLabel0(), new Constraints(new Leading(188, 10, 10), new Leading(14, 10, 10)));
		add(getJButton3(), new Constraints(new Leading(21, 12, 12), new Leading(327, 10, 10)));
		add(getJScrollPane0(), new Constraints(new Leading(22, 470, 10, 10), new Leading(117, 199, 10, 10)));
		add(getJLabel1(), new Constraints(new Leading(30, 10, 10), new Leading(77, 10, 10)));
		add(getJTextField0(), new Constraints(new Leading(181, 182, 10, 10), new Leading(75, 12, 12)));
		add(getJButton4(), new Constraints(new Leading(375, 12, 12), new Leading(72, 12, 12)));
		add(getJComboBox0(), new Constraints(new Leading(179, 182, 10, 10), new Leading(44, 12, 12)));
		setSize(510, 394);
	}

	private JComboBox getJComboBox0() {
		if (jComboBox0 == null) {
			jComboBox0 = new JComboBox();
//			jComboBox0.setModel(new DefaultComboBoxModel(new Object[] { "item0", "item1", "item2", "item3" }));
//			comboModel = new DefaultComboBoxModel();
//			try{
//				ArrayList<Hotel> hoteis = Servico.getServico().pegarHoteis();
//				for(Hotel h: hoteis){
//					comboModel.addElement(h.getNome());
//				}
//				jComboBox0.setModel(comboModel);
//			}catch(Exception e){
//				
//			}
			
			jComboBox0.setDoubleBuffered(false);
			jComboBox0.setBorder(null);
			jComboBox0.setVisible(false);
		}
		return jComboBox0;
	}

	private JButton getJButton4() {
		if (jButton4 == null) {
			jButton4 = new JButton();
			jButton4.setText("Listar");
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
			jLabel1.setText("Listar hospedes de hotel:");
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
//			listModel = new DefaultListModel();
//			
////			Servico.getServico().pegarHospedes();
//			
//			listModel.addElement("item0");
//			listModel.addElement("item1");
//			listModel.addElement("item2");
//			listModel.addElement("item3");
//			listModel.addElement("item4");
//			listModel.addElement("item5");
//			listModel.addElement("item6");
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
			jLabel0.setText("Listagem de hóspedes");
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
				TelaListagemHospedes frame = new TelaListagemHospedes();
				frame.setDefaultCloseOperation(TelaListagemHospedes.EXIT_ON_CLOSE);
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
		TelaCadastroHospede telaCadastroHospede = new TelaCadastroHospede();
		telaCadastroHospede.setVisible(true);
	}

	private void jButton0ActionActionPerformed(ActionEvent event) {
		TesteGetIndex x = new TesteGetIndex();
		int i = jList0.getSelectedIndex();
		if(i>=0){
//			x.getJLabel0().setText(listModel.get(i).toString());
//			
//			
//			x.setVisible(true);
			
		}
	}

	private void jButton4ActionActionPerformed(ActionEvent event) {
		listModel = new DefaultListModel();
		String nomeHotel = jTextField0.getText();
		
//		int i = jComboBox0.getSelectedIndex();
//		String nomeHotel = comboModel.getElementAt(i).toString();
		
		try{
			ArrayList<Hospede> hospedes = Servico.getServico().pegarHospedes(nomeHotel);
		    for(Hospede h: hospedes){
		    	listModel.addElement(h.getNome() + "       " + h.getCpf());
		    }
		
		}catch(Exception e){}
		jList0.setModel(listModel);
	}

}
