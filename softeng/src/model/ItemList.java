package model;

public class ItemList implements Command {

	private String command;
	public ItemList() {
		command = "\n\\begin{itemize}\r\n\n" + 
				"\\item ...\r\n\n" + 
				"\\item ...\r\n\n" + 
				"\\end{itemize}\n";
	}
	@Override
	public Command clone() {
		ItemList itemlistObject = null;
		
		try {
			itemlistObject = (ItemList) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return itemlistObject;

	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return command;
	}

}
