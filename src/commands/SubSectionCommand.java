package commands;
import model.SubSection;

public class SubSectionCommand implements Command {

	private SubSection subSection=new SubSection();
	@Override
	public String execute() {
		return subSection.getContent();

	}

}
