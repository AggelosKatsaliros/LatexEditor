package model;

public class Table extends LatexCommands{

	public Table() {
		this.command = "\n\\begin{table}\r\n\n" + 
				"\\caption{....}\\label{...}\r\n\n" + 
				"\\begin{tabular}{|c|c|c|}\r\n\n" + 
				"\\hline\r\n\n" + 
				"... &...&...\\\\\r\n\n" + 
				"... &...&...\\\\\r\n\n" + 
				"... &...&...\\\\\r\n\n" + 
				"\\hline\r\n\n" + 
				"\\end{tabular}\r\n\n" + 
				"\\end{table}\n";
	}
	

}
