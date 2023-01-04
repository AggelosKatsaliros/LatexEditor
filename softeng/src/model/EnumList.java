package model;

public class EnumList implements Command {

	private String command;
	public EnumList() {
		command = "\n\\begin{enumerate}\r\n\n" + 
				"\\item ...\r\n\n" + 
				"\\item ...\r\n\n" + 
				"\\end{enumerate}\n";
	}
	@Override
	public Command clone() {
		EnumList enumlistObject = null;
		
		try {
			enumlistObject = (EnumList) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return enumlistObject;

	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return command;
	}

}
