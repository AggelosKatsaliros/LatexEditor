package model;

public class Table implements Command {

	private String command;
	public Table() {
		command = "\n\\begin{table}\r\n\n" + 
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
	@Override
	public Command clone() {
		Table tableObject = null;
		
		try {
			tableObject = (Table) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tableObject;

	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return command;
	}

}
