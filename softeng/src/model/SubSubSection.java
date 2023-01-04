package model;

public class SubSubSection implements Command {

	private String command;
	public SubSubSection() {
		command = "\n\\subsubsection{}\n";
	}
	@Override
	public Command clone() {
		SubSubSection subsubsectionObject = null;
		
		try {
			subsubsectionObject = (SubSubSection) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return subsubsectionObject;

	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return command;
	}

}
