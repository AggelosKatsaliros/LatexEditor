package model;

public class Blank implements Document {
	private String content;
	public Blank() {
		content=" ";
	}
	@Override
	public Document clone() {
		// TODO Auto-generated method stub
		Blank blankObject = null;
		
		try {
			blankObject = (Blank) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return blankObject;
	}
	public String getContent() {
		return content;
	}
}
