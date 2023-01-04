package model;

public class SubSection implements Command {

	private String command;
	public SubSection() {
		command = "\n\\subsection{}\n";
	}
	@Override
	public Command clone() {
		SubSection subsectionObject = null;
		
		try {
			subsectionObject = (SubSection) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return subsectionObject;

	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return command;
	}

}
