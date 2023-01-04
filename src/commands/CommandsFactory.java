package commands;

import java.util.HashMap;

public class CommandsFactory {
	private HashMap<String, Command> commands = new HashMap<String, Command>();
	public CommandsFactory() {
		ChapterCommand chapterCommand=new ChapterCommand();
		SectionCommand sectionCommand =new SectionCommand();
		SubSectionCommand subSectionCommand =new SubSectionCommand();
		SubSubSectionCommand subSubSectionCommand =new SubSubSectionCommand();
		ItemListCommand itemListCommand=new ItemListCommand();
		EnumListCommand enumListCommand=new EnumListCommand();
		TableCommand tableCommand =new TableCommand();
		FigureCommand figureCommand=new FigureCommand();
		
		commands.put("Chapter",chapterCommand);
		commands.put("Section",sectionCommand);
		commands.put("SubSection",subSectionCommand);
		commands.put("SubSubSection",subSubSectionCommand);
		commands.put("ItemList",itemListCommand);
		commands.put("EnumList",enumListCommand);
		commands.put("Table",tableCommand);
		commands.put("Figure",figureCommand);
	}
	public Command getCommand(String commandId) {
		return commands.get(commandId);
	}
}
