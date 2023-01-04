package commands;

import model.SubSubSection;

public class SubSubSectionCommand implements Command {

	private SubSubSection subSubSection=new SubSubSection();
	@Override
	public String execute() {
		return subSubSection.getContent();

	}

}
