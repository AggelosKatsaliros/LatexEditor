package model;

public class Chapter implements Command {
	private String command;
	public Chapter(){
		command = "\n\\chapter{...}\n";
	}
	@Override
	public Command clone() {
		Chapter chapterObject = null;
		
		try {
			chapterObject = (Chapter) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return chapterObject;

	}

	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return command;
	}

}
