package controller;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.filechooser.FileNameExtensionFilter;

import commands.CommandsFactory;

import model.DocumentManager;
import model.StableStrategy;
import model.VersionsManager;
import model.VersionsStrategyFactory;
import model.VolatileStrategy;

public class LatexEditorController {
	static boolean flag=false;//to xrisimopoiw gia to version mechanism pote einai anoikto
	static boolean saveFlagVolatile=false;  //to xrisimopoiw gia to save button etsi wste na mhn ginetai otan dn vriskomai sto volatile
	static boolean saveFlagStable =false; // same as above
	
	/////  CREATE DOCUMENT //////
	public void createDocument(JTextArea txt,String templateId) {
		DocumentManager documentManager = new DocumentManager();
		txt.setText(documentManager.createDocument(templateId).getContent());
	}
	
	///// CREATE COMMAND ////
	public void createCommand(JTextArea txt,String commandId) {
		CommandsFactory commandsFactory = new CommandsFactory();
		txt.insert(commandsFactory.getCommand(commandId).execute(),txt.getCaretPosition());
	}
	/////// CREATE STRATEGY ////////
	public void createVolatileStable(JTextArea txt,String buttonStrategy) {
		if(buttonStrategy=="Volatile" && saveFlagVolatile==false) {
			JOptionPane.showMessageDialog(null, "You cannot use this command\n when Volatile is inactive", "InfoBox: " + "ERROR", JOptionPane.INFORMATION_MESSAGE);
			return;
		}else if (buttonStrategy=="Stable" && saveFlagStable==false) {
			JOptionPane.showMessageDialog(null, "You cannot use this command\n when Stable is inactive", "InfoBox: " + "ERROR", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		VersionsStrategyFactory factory = new VersionsStrategyFactory();
		VersionsManager versionsManager = new VersionsManager(factory.createStrategy(buttonStrategy));
		
		if(versionsManager.isEnabled()==true) {
			//versionsManager.setStrategy();
			versionsManager.setCurrentVersion(txt.getText());
			versionsManager.getEntireHistory();
			System.out.println(versionsManager.getEntireHistory());
		}else {
			JOptionPane.showMessageDialog(null, "You cannot use this command\n when Version Mechanism is inactive", "InfoBox: " + "ERROR", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	//////////  ENABLE BUTTON VERSION MECHANISM AND MAKE SURE THE TOGGLE BUTTONS WORK /// 
	public void enableVersionMechanism(JToggleButton button,JToggleButton stable) {
		VersionsStrategyFactory factory = new VersionsStrategyFactory();
		VersionsManager versionsManager =new VersionsManager(factory.createStrategy("Volatile"));
		if(flag!=true) {
			versionsManager.enable();
			flag=true;
			
		}else {
			versionsManager.disable();
			flag=false;
			
		}
		
		if(versionsManager.isEnabled()!=true) {
			saveFlagVolatile=false;
			button.setSelected(false);
			stable.setSelected(false);
		}else {
			saveFlagVolatile=true;
			button.setSelected(true);
		}
		
	}
	
	////////////     UNDO BUTTON AND ROLLBACK TO PREVIOUS VERSION///////////////////
	public void Undo(JTextArea txt,JToggleButton button,JToggleButton button2) {
		VersionsStrategyFactory factory = new VersionsStrategyFactory();
		if(button.isSelected()==true) {
			VersionsManager versionsManager =new VersionsManager(factory.createStrategy("Volatile"));
			txt.setText(versionsManager.rollbackToPreviousVersion());
		}else if(button2.isSelected()==true){
			VersionsManager versionsManager =new VersionsManager(factory.createStrategy("Stable"));
			txt.setText(versionsManager.rollbackToPreviousVersion());
		}	
	}
	
	////////////////////   DISABLE STRATEGY AND THEIR SAVE BUTTONS BUTTONS WHEN THEY ARE NOT USED //////////////
	public void disableStrategy(JToggleButton otherButton,String buttonStrategy,JToggleButton sameButton ) {
		if(flag==false) { //if version mechanism button is closed then close the strategy buttons
			sameButton.setSelected(false);
			saveFlagVolatile=false;
			saveFlagStable=false;
			JOptionPane.showMessageDialog(null, "You cannot use this command\n when Version Mechanism is inactive", "InfoBox: " + "ERROR", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		VersionsStrategyFactory factory = new VersionsStrategyFactory();
		VersionsManager versionsManager =new VersionsManager(factory.createStrategy(buttonStrategy));
		if(buttonStrategy=="Volatile") { //briskomai sto koumpi stable kai kanw disable to save tou volatile
			saveFlagVolatile=false;
			saveFlagStable=true;
		}else if(buttonStrategy=="Stable") {  //briskomai sto koumpi volatile kai kanw disable to koumpi tou stable
			saveFlagStable=false;
			saveFlagVolatile=true;
		}
		otherButton.setSelected(false);
	}
	
	
	public void Swap_History(JToggleButton otherButton,String buttonStrategy) {
		VersionsStrategyFactory factory = new VersionsStrategyFactory();
		VersionsManager versionsManager =new VersionsManager(factory.createStrategy("Stable"));
		VersionsManager versionsManager2 =new VersionsManager(factory.createStrategy("Volatile"));
		//System.out.println(versionsManager.getEntireHistory());
		if(buttonStrategy=="Volatile") {
			versionsManager2.change_Mechanism(versionsManager.getEntireHistory());
		}else if(buttonStrategy=="Stable") {
			versionsManager.change_Mechanism(versionsManager2.getEntireHistory());
		}
	}
	
	public void Save_File(JTextArea txt,JFileChooser fs) {
		fs.setDialogTitle("Save File");
		int result =fs.showSaveDialog(null);
		if(result==JFileChooser.APPROVE_OPTION) {
			String content=txt.getText();
			File fi=fs.getSelectedFile();
			try {
				FileWriter fw =new FileWriter(fi.getPath());
				fw.write(content);
				fw.flush();
			}catch(Exception e2) {
				JOptionPane.showMessageDialog(null,e2.getMessage());
			}
		}
		//fs.setFileFilter();
		
	}
	public void Load_File(JTextArea txt,JFileChooser fs) throws FileNotFoundException {
		String load_content="";
		if(fs.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
			File file =fs.getSelectedFile();
			Scanner input =new Scanner(file);
			while(input.hasNext()) {
				load_content+=input.nextLine();
				load_content+="\n";
			}
			txt.setText(load_content);
		}
	}
}
