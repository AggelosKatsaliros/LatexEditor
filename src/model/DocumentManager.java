package model;

import java.util.HashMap;
public class DocumentManager {
	HashMap<String,Document> typeMap = new HashMap<String,Document>();
	public  DocumentManager() {  //initialize HasMap with the various Documents 
		Report report = new Report();
		Letter letter = new Letter();
		Book book = new Book();
		Article article = new Article();
		Blank blank = new Blank();
		
		typeMap.put("Report", report);
		typeMap.put("Letter", letter);
		typeMap.put("Book", book);
		typeMap.put("Article", article);
		typeMap.put("Blank", blank);
	}
	
	public Document createDocument(String templateId) { //creates a new cloned Document from HashMap based on what id we have (report,letter etc)
		
		return typeMap.get(templateId).clone();
	}
}
