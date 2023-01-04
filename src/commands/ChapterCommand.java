package commands;

import model.Chapter;

public class ChapterCommand implements Command {
	private Chapter chapter=new Chapter();
	@Override
	public String execute() {
		return chapter.getContent();

	}

}
