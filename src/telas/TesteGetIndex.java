package telas;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.Window;

import javax.swing.JDialog;
import javax.swing.JLabel;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

//VS4E -- DO NOT REMOVE THIS LINE!
public class TesteGetIndex extends JDialog {

	private static final long serialVersionUID = 1L;
	private JLabel jLabel0;

	public TesteGetIndex() {
		initComponents();
	}

	public TesteGetIndex(Frame parent) {
		super(parent);
		initComponents();
	}

	public TesteGetIndex(Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
	}

	public TesteGetIndex(Frame parent, String title) {
		super(parent, title);
		initComponents();
	}

	public TesteGetIndex(Frame parent, String title, boolean modal) {
		super(parent, title, modal);
		initComponents();
	}

	public TesteGetIndex(Frame parent, String title, boolean modal,
			GraphicsConfiguration arg) {
		super(parent, title, modal, arg);
		initComponents();
	}

	public TesteGetIndex(Dialog parent) {
		super(parent);
		initComponents();
	}

	public TesteGetIndex(Dialog parent, boolean modal) {
		super(parent, modal);
		initComponents();
	}

	public TesteGetIndex(Dialog parent, String title) {
		super(parent, title);
		initComponents();
	}

	public TesteGetIndex(Dialog parent, String title, boolean modal) {
		super(parent, title, modal);
		initComponents();
	}

	public TesteGetIndex(Dialog parent, String title, boolean modal,
			GraphicsConfiguration arg) {
		super(parent, title, modal, arg);
		initComponents();
	}

	public TesteGetIndex(Window parent) {
		super(parent);
		initComponents();
	}

	public TesteGetIndex(Window parent, ModalityType modalityType) {
		super(parent, modalityType);
		initComponents();
	}

	public TesteGetIndex(Window parent, String title) {
		super(parent, title);
		initComponents();
	}

	public TesteGetIndex(Window parent, String title, ModalityType modalityType) {
		super(parent, title, modalityType);
		initComponents();
	}

	public TesteGetIndex(Window parent, String title,
			ModalityType modalityType, GraphicsConfiguration arg) {
		super(parent, title, modalityType, arg);
		initComponents();
	}

	private void initComponents() {
		setFont(new Font("Dialog", Font.PLAIN, 12));
		setBackground(Color.white);
		setForeground(Color.black);
		setLayout(new GroupLayout());
		add(getJLabel0(), new Constraints(new Leading(38, 202, 10, 10), new Leading(106, 49, 10, 10)));
		setSize(320, 240);
	}

	public JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setFont(new Font("Dialog", Font.BOLD, 20));
			jLabel0.setText("jLabel0");
		}
		return jLabel0;
	}

}
