package model;

public class Section implements Command {

	private String command;
	public Section() {
		command = "\n\\section{}\n";
	}
	@Override
	public Command clone() {
		Section sectionObject = null;
		
		try {
			sectionObject = (Section) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sectionObject;

	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return command;
	}

}
