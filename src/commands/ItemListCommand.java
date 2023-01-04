package commands;

import model.ItemList;

public class ItemListCommand implements Command {

	private ItemList itemList=new ItemList();
	@Override
	public String execute() {
		return itemList.getContent();

	}

}
