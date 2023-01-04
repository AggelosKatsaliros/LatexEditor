package model;

public class Document implements Cloneable{
	protected String content;
	public Document() {
		
	}
	public Document clone() {
		// TODO Auto-generated method stub
		Document temp_Object = null;
		
		try {
			temp_Object = (Document) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp_Object;
	}
	public String getContent() {
		return content;
	}
	public void addContent(String s) {
		content+=s;
	}
}
