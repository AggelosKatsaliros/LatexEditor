package model;

public class Figure extends LatexCommands{

	public Figure() {
		this.command = "\n\\begin{figure}\r\n\n" + 
				"\\includegraphics[width=...,height=...]{...}\r\n\n" + 
				"\\caption{....}\\label{...}\r\n\n" + 
				"\\end{figure}\n";
	}
	

}
