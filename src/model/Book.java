package model;

public class Book extends Document {
	public Book() {
		this.content ="\\documentclass[11pt,a4paper]{book}\r\n" + 
				"\r\n" + 
				"\\begin{document}\r\n" + 
				"\\title{Book: How to Structure a LaTeX Document}\r\n" + 
				"\\author{Author1 \\and Author2 \\and ...}\r\n" + 
				"\\date{\\today}\r\n" + 
				"\r\n" + 
				"\\maketitle\r\n" + 
				"\r\n" + 
				"\\frontmatter\r\n" + 
				"\r\n" + 
				"\\chapter{Preface}\r\n" + 
				"% ...\r\n" + 
				"\r\n" + 
				"\\mainmatter\r\n" + 
				"\\chapter{First chapter}\r\n" + 
				"\\section{Section Title 1}\r\n" + 
				"\\section{Section Title 2}\r\n" + 
				"\\section{Section Title.....}\r\n" + 
				"\r\n" + 
				"\\chapter{....}\r\n" + 
				"\r\n" + 
				"\\chapter{Conclusion}\r\n" + 
				"\r\n" + 
				"\\chapter*{References}\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\\backmatter\r\n" + 
				"\\chapter{Last note}\r\n" + 
				"\r\n" + 
				"\\end{document}";
	}
}
