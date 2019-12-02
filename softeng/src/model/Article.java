package model;

public class Article implements Document {
	private String content;
	public Article() {
		content="\\documentclass[11pt,twocolumn,a4paper]{article}\r\n" + 
				"\r\n" + 
				"\\begin{document}\r\n" + 
				"\\title{Article: How to Structure a LaTeX Document}\r\n" + 
				"\\author{Author1 \\and Author2 \\and ...}\r\n" + 
				"\\date{\\today}\r\n" + 
				"\r\n" + 
				"\\maketitle\r\n" + 
				"\r\n" + 
				"\\section{Section Title 1}\r\n" + 
				"\r\n" + 
				"\\section{Section Title 2}\r\n" + 
				"\r\n" + 
				"\\section{Section Title.....}\r\n" + 
				"\r\n" + 
				"\\section{Conclusion}\r\n" + 
				"\r\n" + 
				"\\section*{References}\r\n" + 
				"\r\n" + 
				"\\end{document}";
	}
	@Override
	public Document clone() {
		// TODO Auto-generated method stub
		Article articleObject = null;
		
		try {
			articleObject = (Article) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return articleObject;
	}
	public String getContent() {
		return content;
	}
}
