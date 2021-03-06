package enamel;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kyleh
 */
public class Home extends javax.swing.JFrame implements ActionListener {

	/**
	 * Creates new form Home
	 */
	JFileChooser chooser;

	public Home() {
		initComponents();
		initListeners();
		fileChooser();

	}

	public void initListeners() {
		// Add listeners in here text.addActionListener(new ActionListener()
		// Like this
		newB.setMnemonic(KeyEvent.VK_N); // Alt + N for new
		editB.setMnemonic(KeyEvent.VK_E); // Alt + E to edit
		runB.setMnemonic(KeyEvent.VK_R); // Alt + R to run
		exitB.setMnemonic(KeyEvent.VK_X); // Alt + X to exit

		newB.addActionListener(this);
		editB.addActionListener(this);
		runB.addActionListener(this);
		exitB.addActionListener(this);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		bg = new javax.swing.JPanel();
		buttonHolder = new javax.swing.JPanel();
		newB = new javax.swing.JButton();
		editB = new javax.swing.JButton();
		runB = new javax.swing.JButton();
		exitB = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		bg.setBackground(new java.awt.Color(1, 22, 56));
		bg.setName(""); // NOI18N

		buttonHolder.setBackground(new java.awt.Color(54, 65, 85));
		buttonHolder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		newB.setBackground(new java.awt.Color(205, 205, 205));
		newB.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
		newB.setForeground(new java.awt.Color(70, 70, 85));
		newB.setText("New");
		newB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		newB.setPreferredSize(new java.awt.Dimension(227, 111));

		editB.setBackground(new java.awt.Color(205, 205, 205));
		editB.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
		editB.setForeground(new java.awt.Color(70, 70, 85));
		editB.setText("Edit");
		editB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		editB.setPreferredSize(new java.awt.Dimension(227, 111));

		runB.setBackground(new java.awt.Color(205, 205, 205));
		runB.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
		runB.setForeground(new java.awt.Color(70, 70, 85));
		runB.setText("Run");
		runB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		runB.setPreferredSize(new java.awt.Dimension(227, 111));

		exitB.setBackground(new java.awt.Color(205, 205, 205));
		exitB.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
		exitB.setForeground(new java.awt.Color(70, 70, 85));
		exitB.setText("Exit");
		exitB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		exitB.setPreferredSize(new java.awt.Dimension(227, 111));

		javax.swing.GroupLayout buttonHolderLayout = new javax.swing.GroupLayout(buttonHolder);
		buttonHolder.setLayout(buttonHolderLayout);
		buttonHolderLayout.setHorizontalGroup(buttonHolderLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(buttonHolderLayout.createSequentialGroup().addGap(194, 194, 194)
						.addGroup(buttonHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(newB, javax.swing.GroupLayout.PREFERRED_SIZE, 227,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(editB, javax.swing.GroupLayout.PREFERRED_SIZE, 227,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(runB, javax.swing.GroupLayout.PREFERRED_SIZE, 227,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(exitB, javax.swing.GroupLayout.PREFERRED_SIZE, 227,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(194, Short.MAX_VALUE)));
		buttonHolderLayout
				.setVerticalGroup(buttonHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(buttonHolderLayout.createSequentialGroup().addGap(58, 58, 58)
								.addComponent(newB, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(45, 45, 45)
								.addComponent(editB, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(45, 45, 45)
								.addComponent(runB, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(45, 45, 45)
								.addComponent(exitB, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(58, Short.MAX_VALUE)));
		newB.getAccessibleContext().setAccessibleName("New Button");
		newB.getAccessibleContext().setAccessibleDescription("Create a new braille file");
		editB.getAccessibleContext().setAccessibleName("Edit Button");
		editB.getAccessibleContext().setAccessibleDescription("Edit an exisiting braille file");
		runB.getAccessibleContext().setAccessibleName("Run Button");
		runB.getAccessibleContext().setAccessibleDescription("Run a braille file");
		exitB.getAccessibleContext().setAccessibleName("Exit Button");
		exitB.getAccessibleContext().setAccessibleDescription("Exit the program");

		jLabel2.setBackground(new java.awt.Color(223, 248, 235));
		jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
		jLabel2.setForeground(new java.awt.Color(223, 248, 235));
		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setText("Welcome");

		javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
		bg.setLayout(bgLayout);
		bgLayout.setHorizontalGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(bgLayout.createSequentialGroup()
						.addComponent(buttonHolder, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						bgLayout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jLabel2).addGap(197, 197, 197)));
		bgLayout.setVerticalGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				bgLayout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jLabel2).addGap(40, 40, 40)
						.addComponent(buttonHolder, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));

		jLabel2.getAccessibleContext().setAccessibleDescription(
				"Welcome to the braille builder app. Below you are 4 buttons that allow you to create, edit and run files.");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(bg,
				javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(bg,
				javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>

	@Override
	public void actionPerformed(ActionEvent e) {
		// output.append("You Clicked: "+e.getActionCommand()+"\n");
		if (e.getActionCommand() == "New") {
			starter start = new starter();
			start.setVisible(true);

		} else if (e.getActionCommand() == "Edit") {
			File file = null;
			int rep = chooser.showOpenDialog(getContentPane());
			if (rep == JFileChooser.APPROVE_OPTION) {
				file = chooser.getSelectedFile();
			}
			if(file != null) {
				String path = file.getAbsolutePath();
				scenarioBuild sb = new scenarioBuild(path);
				sb.setVisible(true);
			} else {
				JOptionPane.showMessageDialog(null, "Error in reading the file","WARNING", JOptionPane.WARNING_MESSAGE);
			}
			

		} else if (e.getActionCommand() == "Run") {
			File file = null;
			int rep = chooser.showOpenDialog(getContentPane());
			if (rep == JFileChooser.APPROVE_OPTION) {
				file = chooser.getSelectedFile();
			}
			String filepath = file.getAbsolutePath();
			//System.out.println(filepath);
			ScenarioParser sp = new ScenarioParser(true);
			sp.setScenarioFile(filepath);

		} else if (e.getActionCommand() == "Exit") {
			System.exit(0);
		}

	}

	private void fileChooser() {
		chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Scenario Files", "txt", "wav");
		chooser.setFileFilter(filter);
		chooser.setAcceptAllFileFilterUsed(false);
		chooser.setCurrentDirectory(new File(System.getProperty("user.dir") + "/SavedScenarios"));
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Home().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JPanel bg;
	private javax.swing.JPanel buttonHolder;
	private javax.swing.JButton editB;
	private javax.swing.JButton exitB;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JButton newB;
	private javax.swing.JButton runB;
	// End of variables declaration

}

/*
 * JMenuBar menuBar = new JMenuBar(); JMenu file = new JMenu("File"); JMenuItem
 * newItem = new JMenuItem("New"); JMenuItem editItem = new JMenuItem("Edit");
 * JMenuItem runItem = new JMenuItem("Run"); JMenuItem exitItem = new
 * JMenuItem("Exit");
 * 
 * 
 * 
 * 
 * 
 * newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,
 * ActionEvent.CTRL_MASK));
 * editItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,
 * ActionEvent.CTRL_MASK));
 * runItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,
 * ActionEvent.CTRL_MASK));
 * exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,
 * ActionEvent.CTRL_MASK));
 * 
 * 
 * newItem.addActionListener(this);
 * 
 * editItem.addActionListener(this); runItem.addActionListener(this);
 * exitItem.addActionListener(this);
 * 
 * 
 */
