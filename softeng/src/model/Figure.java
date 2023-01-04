package model;

public class Figure implements Command {

	private String command;
	public Figure() {
		command = "\n\\begin{figure}\r\n\n" + 
				"\\includegraphics[width=...,height=...]{...}\r\n\n" + 
				"\\caption{....}\\label{...}\r\n\n" + 
				"\\end{figure}\n";
	}
	@Override
	public Command clone() {
		Figure figureObject = null;
		
		try {
			figureObject = (Figure) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return figureObject;

	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return command;
	}

}
