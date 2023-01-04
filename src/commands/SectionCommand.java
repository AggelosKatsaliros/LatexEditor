package commands;

import model.Section;

public class SectionCommand implements Command {
	private Section section=new Section();
	@Override
	public String execute() {
		return section.getContent();

	}

}
