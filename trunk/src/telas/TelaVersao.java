package telas;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.Window;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

//VS4E -- DO NOT REMOVE THIS LINE!
public class TelaVersao extends JDialog {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel2;
	private JLabel jLabel1;
	private JLabel jLabel0;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";

	public TelaVersao() {
		initComponents();
	}

	public TelaVersao(Frame parent) {
		super(parent);
		initComponents();
	}

	public TelaVersao(Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
	}

	public TelaVersao(Frame parent, String title) {
		super(parent, title);
		initComponents();
	}

	public TelaVersao(Frame parent, String title, boolean modal) {
		super(parent, title, modal);
		initComponents();
	}

	public TelaVersao(Frame parent, String title, boolean modal,
			GraphicsConfiguration arg) {
		super(parent, title, modal, arg);
		initComponents();
	}

	public TelaVersao(Dialog parent) {
		super(parent);
		initComponents();
	}

	public TelaVersao(Dialog parent, boolean modal) {
		super(parent, modal);
		initComponents();
	}

	public TelaVersao(Dialog parent, String title) {
		super(parent, title);
		initComponents();
	}

	public TelaVersao(Dialog parent, String title, boolean modal) {
		super(parent, title, modal);
		initComponents();
	}

	public TelaVersao(Dialog parent, String title, boolean modal,
			GraphicsConfiguration arg) {
		super(parent, title, modal, arg);
		initComponents();
	}

	public TelaVersao(Window parent) {
		super(parent);
		initComponents();
	}

	public TelaVersao(Window parent, ModalityType modalityType) {
		super(parent, modalityType);
		initComponents();
	}

	public TelaVersao(Window parent, String title) {
		super(parent, title);
		initComponents();
	}

	public TelaVersao(Window parent, String title, ModalityType modalityType) {
		super(parent, title, modalityType);
		initComponents();
	}

	public TelaVersao(Window parent, String title, ModalityType modalityType,
			GraphicsConfiguration arg) {
		super(parent, title, modalityType, arg);
		initComponents();
	}

	private void initComponents() {
		setFont(new Font("Dialog", Font.PLAIN, 12));
		setBackground(Color.white);
		setForeground(Color.black);
		setLayout(new GroupLayout());
		add(getJLabel2(), new Constraints(new Leading(60, 10, 10), new Leading(153, 10, 10)));
		add(getJLabel1(), new Constraints(new Leading(99, 10, 10), new Leading(91, 10, 10)));
		add(getJLabel0(), new Constraints(new Leading(71, 10, 10), new Leading(41, 10, 10)));
		setSize(320, 240);
		setModal(true);
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("Sistema Gerenciador de Hotel");
		}
		return jLabel0;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("Versão 1.0.1.2687");
		}
		return jLabel1;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("Desenvolvido em Eclipse Jirombado");
		}
		return jLabel2;
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
				TelaVersao dialog = new TelaVersao();
				dialog.setDefaultCloseOperation(TelaVersao.DISPOSE_ON_CLOSE);
				dialog.setTitle("TelaVersao");
				dialog.setLocationRelativeTo(null);
				dialog.getContentPane().setPreferredSize(dialog.getSize());
				dialog.pack();
				dialog.setVisible(true);
			}
		});
	}

}
