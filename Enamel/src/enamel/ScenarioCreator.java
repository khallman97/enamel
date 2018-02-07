package enamel;


import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.*;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.accessibility.*;

/*This class creates the scenarios for the application*/


public class ScenarioCreator extends JFrame implements ActionListener {
	
	
	private String senName;
	private String fileName;
	
	private TextArea display;
	
	private Button cellAndButton; 
	private Button questions;
	private Button setBraille;
	private Button addTTS;
	private Button test;
	
	private boolean cellAndButtonEntered = false;
	
	private BufferedWriter writer;
	
	public  ScenarioCreator()  {
		popupForName();
		INT();
		elements();
		createEmptyDoc();
	}
	/*opens a window to create the name of the scen*/
	private void popupForName() {
		String name = JOptionPane.showInputDialog("Choose a scenario name");
		this.senName = name;
	}
	/*This creates the new file for the scenario */
	private void createEmptyDoc()  {
		try {
		     File file = new File("SavedScenarios/Scenario_"+senName+".txt"); 
		     fileName = "Scenario_"+senName+".txt";
		      writer = new BufferedWriter(new FileWriter("SavedScenarios/Scenario_"+senName+".txt"));
		     
	             boolean fvar = file.createNewFile();
		     if (fvar){
		          //System.out.println("File has been created successfully");
		     }
		     else{
		          //System.out.println("File already present at the specified location");
		     }
	    	} catch (IOException e) {
	    		//System.out.println("Exception Occurred:");
		        //e.printStackTrace();
		  }
		   
		
	}

	public void INT() {
		setLayout(new FlowLayout());
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		        if (JOptionPane.showConfirmDialog( 
		            getParent(), "Are you sure to close this window?", "Really Closing?", 
		            JOptionPane.YES_NO_OPTION,
		            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
		        	try {
						writer.close();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
		            System.exit(0);
		        }
		    }
		});
	}
	
	public void elements()  {
		//Text Fields
		display = new TextArea(15 , 50);
		display.setEditable(false);
		
		//Buttons
		cellAndButton = new Button("Set cell and button");
		questions = new Button("Add activity");
		addTTS = new Button("Add text to speach");
		test = new Button("Test Scenario");
		
		
		//action listiners 
		cellAndButton.addActionListener(this);
		questions.addActionListener(this);
		addTTS.addActionListener(this);
		test.addActionListener(this);
		
		//disable buttons until cell and button is eneted
		questions.setEnabled(false);
		addTTS.setEnabled(false);
		test.setEnabled(false);
		
		//add elements		
		add(display);
		add(cellAndButton);
		add(questions);
		add(addTTS);
		add(test);
	}
	
	public void actionPerformed(ActionEvent e) { 
	 
		if(e.getSource() == cellAndButton) {
			JTextField cell = new JTextField();
			JTextField button = new JTextField();
			Object[] cAB = {
					"cell:", cell , "Buttons:" , button }; 
			int option = JOptionPane.showConfirmDialog(null, cAB , "Enter the number of cells and buttons", JOptionPane.OK_CANCEL_OPTION);
			String cellNum = cell.getText();
			addCell(cellNum);
			String buttonNum = button.getText();
			addButton(buttonNum);
			this.cellAndButtonEntered = true;
			questions.setEnabled(true);
			addTTS.setEnabled(true);
			test.setEnabled(true);
			
		} else if (e.getSource() == questions) {
			
		} else if (e.getSource() == addTTS) {
			Object[] options = {
				"EnterText ", "Use Voice"
			};
			int response = JOptionPane.showOptionDialog(null, "Choose Input Method", "" ,   JOptionPane.YES_NO_OPTION, 
					JOptionPane.INFORMATION_MESSAGE ,null , options , options[0]);
			System.out.println(response);
			if (response == 0) {
				String tts = JOptionPane.showInputDialog("Enter your text to speach");
				addTTS(tts);
			} else if (response == 1) {
				JOptionPane.showMessageDialog(null, "not yet implimented");
			} else {
				
			}
			
		} else if (e.getSource() == test)  {
			try {
				writer.close();
				System.out.println("closed file");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			ScenarioParser sp = new ScenarioParser(true);
			sp.setScenarioFile(fileName);
		}
		
			
		
	}
	
	public void addCell(String cell) {
		try {
			
			writer.write("Cell "+cell+"\n");
			writer.newLine();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		display.append("Number of cells: " +cell+"\n");
	}
	
	public void addButton(String button) {
		try {
			
			writer.write("Button "+button+"\n");
			writer.newLine();
			System.out.println("should have printed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	    display.append("Number of buttons: "+button+"\n");
	}
	
	public void addSkip(int duration) {
		
	}
	
	public void addTTS (String tts) {
		try {
			writer.write(tts);
			writer.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		display.append("TTS: "+tts);
	}

	
	
	


	
}