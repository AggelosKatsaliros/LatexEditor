package commands;

import model.EnumList;

public class EnumListCommand implements Command {

	private EnumList enumList=new EnumList();
	@Override
	public String execute() {
		return enumList.getContent();

	}

}
