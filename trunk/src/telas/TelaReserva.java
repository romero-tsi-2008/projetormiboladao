package telas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import models.Hospede;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;
import org.dyno.visual.swing.layouts.Trailing;

import util.Servico;

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
	private JLabel jLabel3;
	private JButton jButton3;
	private JTextField jTextField0;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel8;
	private JTextField jTextField1;
	private JButton jButton4;
	private JLabel jLabel9;
	private JLabel jLabel10;
	private JLabel jLabel12;
	private JLabel jLabel14;
	private JTextField jTextField2;
	private JTextField jTextField3;
	private JLabel jLabel16;
	private JTextField jTextField4;
	private JLabel jLabel6;
	private JTextField jTextField5;
	private JLabel jLabel7;
	private JTextField jTextField6;
	private JTextField jTextField7;
	private JTextField jTextField8;
	private JLabel jLabel11;
	private JTextField jTextField9;
	private JLabel jLabel13;
	private JTextField jTextField10;
	private JLabel jLabel15;
	private JTextField jTextField11;
	private JLabel jLabel17;
	private JTextField jTextField12;
	private JInternalFrame jInternalFrame2;
	private JLabel jLabel18;
	private JTextField jTextField13;
	private JButton jButton5;
	private JButton jButton6;
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

	private JButton getJButton6() {
		if (jButton6 == null) {
			jButton6 = new JButton();
			jButton6.setText("Reservar");
			jButton6.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton6ActionActionPerformed(event);
				}
			});
		}
		return jButton6;
	}

	private JButton getJButton5() {
		if (jButton5 == null) {
			jButton5 = new JButton();
			jButton5.setText("OK");
			jButton5.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton5ActionActionPerformed(event);
				}
			});
		}
		return jButton5;
	}

	private JTextField getJTextField13() {
		if (jTextField13 == null) {
			jTextField13 = new JTextField();
		}
		return jTextField13;
	}

	private JLabel getJLabel18() {
		if (jLabel18 == null) {
			jLabel18 = new JLabel();
			jLabel18.setText("Data de saida:");
		}
		return jLabel18;
	}

	private JInternalFrame getJInternalFrame2() {
		if (jInternalFrame2 == null) {
			jInternalFrame2 = new JInternalFrame();
			jInternalFrame2.setVisible(true);
			jInternalFrame2.setLayout(new GroupLayout());
			jInternalFrame2.add(getJLabel18(), new Constraints(new Leading(17, 10, 10), new Leading(153, 10, 10)));
			jInternalFrame2.add(getJLabel17(), new Constraints(new Leading(56, 12, 12), new Leading(111, 12, 12)));
			jInternalFrame2.add(getJLabel15(), new Constraints(new Leading(67, 12, 12), new Leading(73, 12, 12)));
			jInternalFrame2.add(getJLabel13(), new Constraints(new Leading(61, 12, 12), new Leading(36, 12, 12)));
			jInternalFrame2.add(getJTextField11(), new Constraints(new Leading(102, 191, 12, 12), new Leading(72, 21, 12, 12)));
			jInternalFrame2.add(getJTextField10(), new Constraints(new Leading(102, 247, 10, 10), new Leading(38, 12, 12)));
			jInternalFrame2.add(getJTextField12(), new Constraints(new Leading(102, 60, 12, 12), new Leading(111, 12, 12)));
			jInternalFrame2.add(getJTextField13(), new Constraints(new Leading(102, 112, 10, 10), new Leading(151, 12, 12)));
			jInternalFrame2.add(getJButton5(), new Constraints(new Leading(291, 10, 10), new Leading(212, 10, 10)));
			jInternalFrame2.add(getJButton0(), new Constraints(new Leading(67, 16, 12, 12), new Leading(220, 10, 10)));
		}
		return jInternalFrame2;
	}

	private JTextField getJTextField12() {
		if (jTextField12 == null) {
			jTextField12 = new JTextField();
		}
		return jTextField12;
	}

	private JLabel getJLabel17() {
		if (jLabel17 == null) {
			jLabel17 = new JLabel();
			jLabel17.setText("Quarto");
		}
		return jLabel17;
	}

	private JTextField getJTextField11() {
		if (jTextField11 == null) {
			jTextField11 = new JTextField();
		}
		return jTextField11;
	}

	private JLabel getJLabel15() {
		if (jLabel15 == null) {
			jLabel15 = new JLabel();
			jLabel15.setText("CPF:");
		}
		return jLabel15;
	}

	private JTextField getJTextField10() {
		if (jTextField10 == null) {
			jTextField10 = new JTextField();
		}
		return jTextField10;
	}

	private JLabel getJLabel13() {
		if (jLabel13 == null) {
			jLabel13 = new JLabel();
			jLabel13.setText("Hotel");
		}
		return jLabel13;
	}

	private JTextField getJTextField9() {
		if (jTextField9 == null) {
			jTextField9 = new JTextField();
		}
		return jTextField9;
	}

	private JLabel getJLabel11() {
		if (jLabel11 == null) {
			jLabel11 = new JLabel();
			jLabel11.setText("Valor recebido do cliente;");
		}
		return jLabel11;
	}

	private JTextField getJTextField8() {
		if (jTextField8 == null) {
			jTextField8 = new JTextField();
			jTextField8.setEditable(false);
		}
		return jTextField8;
	}

	private JTextField getJTextField7() {
		if (jTextField7 == null) {
			jTextField7 = new JTextField();
			jTextField7.setEditable(false);
		}
		return jTextField7;
	}

	private JTextField getJTextField6() {
		if (jTextField6 == null) {
			jTextField6 = new JTextField();
		}
		return jTextField6;
	}

	private JLabel getJLabel7() {
		if (jLabel7 == null) {
			jLabel7 = new JLabel();
			jLabel7.setText("Hotel:");
		}
		return jLabel7;
	}

	private JTextField getJTextField5() {
		if (jTextField5 == null) {
			jTextField5 = new JTextField();
		}
		return jTextField5;
	}

	private JLabel getJLabel6() {
		if (jLabel6 == null) {
			jLabel6 = new JLabel();
			jLabel6.setText("Saida:");
		}
		return jLabel6;
	}

	private JTextField getJTextField4() {
		if (jTextField4 == null) {
			jTextField4 = new JTextField();
		}
		return jTextField4;
	}

	private JLabel getJLabel16() {
		if (jLabel16 == null) {
			jLabel16 = new JLabel();
			jLabel16.setText("Entrada:");
		}
		return jLabel16;
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

	private JLabel getJLabel14() {
		if (jLabel14 == null) {
			jLabel14 = new JLabel();
			jLabel14.setText("Valor da divida:");
		}
		return jLabel14;
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
			jButton4.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton4ActionActionPerformed(event);
				}
			});
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

	private JLabel getJLabel5() {
		if (jLabel5 == null) {
			jLabel5 = new JLabel();
			jLabel5.setText("-");
		}
		return jLabel5;
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
			jTextField0.setEditable(false);
		}
		return jTextField0;
	}

	private JButton getJButton3() {
		if (jButton3 == null) {
			jButton3 = new JButton();
			jButton3.setText("Buscar");
			jButton3.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton3ActionActionPerformed(event);
				}
			});
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
			jInternalFrame1.add(getJLabel12(), new Constraints(new Leading(74, 280, 12, 12), new Leading(124, -23, 10, 10)));
			jInternalFrame1.add(getJLabel8(), new Constraints(new Leading(30, 10, 10), new Leading(55, 10, 10)));
			jInternalFrame1.add(getJTextField1(), new Constraints(new Leading(65, 206, 10, 10), new Leading(53, 10, 10)));
			jInternalFrame1.add(getJButton4(), new Constraints(new Leading(279, 12, 12), new Leading(50, 50, 50)));
			jInternalFrame1.add(getJLabel9(), new Constraints(new Leading(19, 10, 10), new Leading(90, 12, 12)));
			jInternalFrame1.add(getJLabel10(), new Constraints(new Leading(9, 10, 10), new Leading(132, 10, 10)));
			jInternalFrame1.add(getJLabel14(), new Constraints(new Leading(9, 10, 10), new Leading(164, 10, 10)));
			jInternalFrame1.add(getJLabel7(), new Constraints(new Leading(25, 12, 12), new Leading(16, 12, 12)));
			jInternalFrame1.add(getJTextField6(), new Constraints(new Leading(65, 201, 10, 10), new Leading(16, 12, 12)));
			jInternalFrame1.add(getJTextField0(), new Constraints(new Leading(65, 219, 10, 10), new Leading(89, 12, 12)));
			jInternalFrame1.add(getJTextField7(), new Constraints(new Leading(76, 285, 10, 10), new Leading(130, 12, 12)));
			jInternalFrame1.add(getJTextField8(), new Constraints(new Leading(101, 74, 10, 10), new Leading(162, 12, 12)));
			jInternalFrame1.add(getJLabel11(), new Constraints(new Leading(47, 12, 12), new Leading(235, 10, 10)));
			jInternalFrame1.add(getJTextField9(), new Constraints(new Leading(200, 84, 12, 12), new Leading(233, 12, 12)));
		}
		return jInternalFrame1;
	}

	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("Pagar dívida");
			jButton1.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton1ActionActionPerformed(event);
				}
			});
		}
		return jButton1;
	}

	private JTabbedPane getJTabbedPane0() {
		if (jTabbedPane0 == null) {
			jTabbedPane0 = new JTabbedPane();
			jTabbedPane0.addTab("Disponíveis", getJInternalFrame0());
			jTabbedPane0.addTab("Consultar divida", getJInternalFrame1());
			jTabbedPane0.addTab("Alocar hospede", getJInternalFrame2());
		}
		return jTabbedPane0;
	}

	private JInternalFrame getJInternalFrame0() {
		if (jInternalFrame0 == null) {
			jInternalFrame0 = new JInternalFrame();
			jInternalFrame0.setVisible(true);
			jInternalFrame0.setLayout(new GroupLayout());
			jInternalFrame0.add(getJLabel2(), new Constraints(new Leading(15, 12, 12), new Leading(179, 10, 10)));
			jInternalFrame0.add(getJTextField3(), new Constraints(new Leading(66, 95, 10, 10), new Leading(179, 12, 12)));
			jInternalFrame0.add(getJTextField4(), new Constraints(new Leading(66, 116, 10, 10), new Leading(215, 12, 12)));
			jInternalFrame0.add(getJLabel4(), new Constraints(new Leading(15, 12, 12), new Leading(96, 12, 12)));
			jInternalFrame0.add(getJLabel5(), new Constraints(new Leading(57, 304, 12, 12), new Leading(96, 12, 12)));
			jInternalFrame0.add(getJLabel3(), new Constraints(new Leading(18, 10, 10), new Leading(60, 10, 10)));
			jInternalFrame0.add(getJButton3(), new Constraints(new Leading(285, 12, 12), new Leading(55, 12, 12)));
			jInternalFrame0.add(getJLabel1(), new Constraints(new Leading(15, 12, 12), new Leading(23, 12, 12)));
			jInternalFrame0.add(getJTextField2(), new Constraints(new Leading(50, 286, 12, 12), new Leading(21, 12, 12)));
			jInternalFrame0.add(getJLabel6(), new Constraints(new Leading(200, 12, 12), new Leading(217, 12, 12)));
			jInternalFrame0.add(getJTextField5(), new Constraints(new Leading(253, 121, 10, 10), new Leading(213, 12, 12)));
			jInternalFrame0.add(getJLabel16(), new Constraints(new Leading(12, 12, 12), new Leading(217, 12, 12)));
			jInternalFrame0.add(getJButton6(), new Constraints(new Leading(291, 10, 10), new Leading(247, 12, 12)));
		}
		return jInternalFrame0;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("OK");
			jButton0.setEnabled(false);
			jButton0.addActionListener(new ActionListener() {
	
				public void actionPerformed(ActionEvent event) {
					jButton0ActionActionPerformed(event);
				}
			});
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

	private void jButton0ActionActionPerformed(ActionEvent event) {
		String cpf = jTextField0.getText();
		String nomeHotel = jTextField2.getText();
		String quarto = jTextField3.getText();
		String dataEntrada = jTextField4.getText();
		String dataSaida = jTextField5.getText();
		
		try{
			int num = Integer.parseInt(quarto);
			Servico.getServico().reservarQuarto(nomeHotel, num, cpf, dataEntrada, dataSaida);
			JOptionPane.showMessageDialog(null, "Reserva efetuada!","",JOptionPane.INFORMATION_MESSAGE);
		}catch(Exception e){}
	}

	private void jButton3ActionActionPerformed(ActionEvent event) {
		String cpf = jTextField0.getText();
		String nomeHotel = jTextField2.getText();
		try{
			Hospede h = (Hospede) Servico.getServico().getHospedeByCpf(nomeHotel, cpf);
			
			JOptionPane.showMessageDialog(null, "Reserva efetuada! " + h.getNome(),"",JOptionPane.INFORMATION_MESSAGE);
			
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "ERRO AO EFETUAR RESERVA! " + e.getMessage(),"",JOptionPane.INFORMATION_MESSAGE);
		}
	}

	private void jButton4ActionActionPerformed(ActionEvent event) {
		String cpf = jTextField1.getText();
		String nomeHotel = jTextField6.getText();
		
		try{
			Hospede h = (Hospede) Servico.getServico().getHospedeByCpf(nomeHotel, cpf);
			jTextField0.setText(h.getNome());
			jTextField7.setText(h.getEndereco());
			jTextField8.setText("R$ "+String.valueOf(h.getUltimaHospedagem().getDivida()));
		}catch(Exception e){
			
		}
	}

	private void jButton1ActionActionPerformed(ActionEvent event) {
		String v = jTextField9.getText();
		double valor = Double.parseDouble(v);
		
		try{
			String msg = Servico.getServico().pagarDivida(jTextField6.getText(), jTextField1.getText(), valor);
			JOptionPane.showMessageDialog(null, msg,"",JOptionPane.INFORMATION_MESSAGE);
		}catch(Exception e){
			
		}
	}

	private void jButton5ActionActionPerformed(ActionEvent event) {
		String nomeHotel = jTextField10.getText();
		String cpf = jTextField11.getText();
		String quarto = jTextField12.getText();
		int num = Integer.parseInt(quarto);
		String data = jTextField13.getText();
		
		try{
			Servico.getServico().alocarHospedeQuarto(nomeHotel, num, cpf, data);
		}
		catch(Exception e){}
	}

	private void jButton6ActionActionPerformed(ActionEvent event) {
		String cpf = jTextField0.getText();
		String nomeHotel = jTextField2.getText();
		try{
			Hospede h = (Hospede) Servico.getServico().getHospedeByCpf(nomeHotel, cpf);
			
			JOptionPane.showMessageDialog(null, "Reserva efetuada! " + h.getNome(),"",JOptionPane.INFORMATION_MESSAGE);
			
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "ERRO AO EFETUAR RESERVA! " + e.getMessage(),"",JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
