package commands;

import model.Table;

public class TableCommand implements Command {

	private Table table=new Table();
	@Override
	public String execute() {
		return table.getContent();

	}

}
