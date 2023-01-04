package controller;

import javax.swing.JTextArea;

import model.CommandManager;
import model.DocumentManager;

public class LatexEditorController {
	public void createDocument(JTextArea txt,String templateId) {
		DocumentManager documentManager =new DocumentManager();
		//document.createDocument(templateId);
		txt.setText(documentManager.createDocument(templateId).getContent());
	}
	public void createCommand(JTextArea txt,String commandId) {
		CommandManager commandManager=new CommandManager();
		txt.insert(commandManager.createCommand(commandId).getContent(),txt.getCaretPosition());
	}
}
