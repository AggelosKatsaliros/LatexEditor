package model;

public class TestDocument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DocumentManager doc =new DocumentManager();
		System.out.println(doc.createDocument("Report").getContent());
	}

}
