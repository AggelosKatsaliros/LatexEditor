package model;

import java.util.HashMap;

public class CommandManager {
	HashMap<String,Command> commandMap = new HashMap<String,Command>();
	public CommandManager() {
		Chapter chapter =new Chapter();
		Section section =new Section();
		SubSection subSection=new SubSection();
		SubSubSection subSubSection=new SubSubSection();
		ItemList itemList= new ItemList();
		EnumList enumList=new EnumList();
		Table table =new Table();
		Figure figure=new Figure();
		
		commandMap.put("Chapter",chapter);
		commandMap.put("Section",section);
		commandMap.put("SubSection",subSection);
		commandMap.put("SubSubSection",subSubSection);
		commandMap.put("ItemList",itemList);
		commandMap.put("EnumList",enumList);
		commandMap.put("Table",table);
		commandMap.put("Figure",figure);
	}
	public Command createCommand(String commandId) { //creates a new cloned Document from HashMap based on what id we have (report,letter etc)
		
		return commandMap.get(commandId).clone();
	}
}
