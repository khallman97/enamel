package enamel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class tempScenarioCreatorGUI {

	private JFrame frmScenarioCreatorWindow;
	private JTextField txtEnterAPositive;
	private JTextField txtEnterAPositive_1;
	private JTextField txtAudioFileName;
	private JTextField txtTypeTextHere;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tempScenarioCreatorGUI window = new tempScenarioCreatorGUI();
					window.frmScenarioCreatorWindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tempScenarioCreatorGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmScenarioCreatorWindow = new JFrame();
		frmScenarioCreatorWindow.setTitle("Scenario Creator Window");
		frmScenarioCreatorWindow.setBounds(100, 100, 632, 475);
		frmScenarioCreatorWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNumberOfCells = new JLabel("Number of Cells");
		lblNumberOfCells.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		txtEnterAPositive = new JTextField();
		txtEnterAPositive.setText("Enter a positive integer here");
		txtEnterAPositive.setColumns(10);
		
		JLabel lblNumberOfButtons = new JLabel("Number of Buttons");
		lblNumberOfButtons.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		txtEnterAPositive_1 = new JTextField();
		txtEnterAPositive_1.setText("Enter a positive integer here");
		txtEnterAPositive_1.setColumns(10);
		
		JLabel lblInsertAudioFile = new JLabel("Insert Audio File");
		lblInsertAudioFile.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		txtAudioFileName = new JTextField();
		txtAudioFileName.setText("Audio File Name");
		txtAudioFileName.setColumns(10);
		
		JButton btnUpload = new JButton("Upload");
		
		JButton removeAudioFileBtn = new JButton("Remove");
		removeAudioFileBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JLabel lblBrailleCell = new JLabel("Braille Cell");
		lblBrailleCell.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblInsertTexttospeech = new JLabel("Insert Text-To-Speech");
		lblInsertTexttospeech.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		txtTypeTextHere = new JTextField();
		txtTypeTextHere.setText("Type text here");
		txtTypeTextHere.setColumns(10);
		
		JSeparator separator = new JSeparator();
		
		JButton btnAdd = new JButton("Add ");
		
		JButton removeSpeechBtn = new JButton("Remove");
		
		JRadioButton radioButton_7 = new JRadioButton("");
		
		JRadioButton radioButton_8 = new JRadioButton("");
		
		JRadioButton radioButton_9 = new JRadioButton("");
		
		JRadioButton radioButton_10 = new JRadioButton("");
		
		JRadioButton radioButton_11 = new JRadioButton("");
		
		JRadioButton radioButton_12 = new JRadioButton("");
		
		JRadioButton radioButton = new JRadioButton("");
		
		JRadioButton radioButton_1 = new JRadioButton("");
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnSave = new JButton("Save");
		GroupLayout groupLayout = new GroupLayout(frmScenarioCreatorWindow.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(txtEnterAPositive, Alignment.LEADING)
						.addComponent(txtEnterAPositive_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
						.addComponent(lblNumberOfButtons, Alignment.LEADING)
						.addComponent(lblNumberOfCells, Alignment.LEADING)
						.addComponent(lblBrailleCell, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(10)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(radioButton_9, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(radioButton_10, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(radioButton_7, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(radioButton_8, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(radioButton_11, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(radioButton_12, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(radioButton, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(radioButton_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))))
					.addGap(38)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(41)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblInsertAudioFile)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblInsertTexttospeech, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(txtAudioFileName, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
								.addComponent(txtTypeTextHere, Alignment.LEADING))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(removeSpeechBtn, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addComponent(btnUpload, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(removeAudioFileBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
					.addContainerGap(398, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(437, Short.MAX_VALUE)
					.addComponent(btnSave, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(separator, GroupLayout.PREFERRED_SIZE, 357, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNumberOfCells)
								.addComponent(lblInsertAudioFile))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtEnterAPositive, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtAudioFileName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnUpload))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(18)
									.addComponent(lblNumberOfButtons)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtEnterAPositive_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblInsertTexttospeech, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(removeAudioFileBtn)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(txtTypeTextHere, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(15)
											.addComponent(lblBrailleCell, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(radioButton_8)
												.addComponent(radioButton_7))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(radioButton_10)
												.addComponent(radioButton_9))))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(radioButton_11)
										.addComponent(radioButton_12))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(radioButton)
										.addComponent(radioButton_1)))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnAdd)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(removeSpeechBtn)))
							.addGap(90)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnCancel)
								.addComponent(btnSave))))
					.addContainerGap())
		);
		frmScenarioCreatorWindow.getContentPane().setLayout(groupLayout);
	}
}