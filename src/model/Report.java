
package model;


public class Report extends Document {
	public Report() {
		this.content = "\\documentclass[11pt,a4paper]{report}\r\n" + 
				"\r\n" + 
				"\\begin{document}\r\n" + 
				"\\title{Report Template: How to Structure a LaTeX Document}\r\n" + 
				"\\author{Author1 \\and Author2 \\and ...}\r\n" + 
				"\\date{\\today}\r\n" + 
				"\\maketitle\r\n" + 
				"\r\n" + 
				"\\begin{abstract}\r\n" + 
				"Your abstract goes here...\r\n" + 
				"...\r\n" + 
				"\\end{abstract}\r\n" + 
				"\r\n" + 
				"\\chapter{Introduction}\r\n" + 
				"\\section{Section Title 1}\r\n" + 
				"\\section{Section Title 2}\r\n" + 
				"\\section{Section Title.....}\r\n" + 
				"\r\n" + 
				"\\chapter{....}\r\n" + 
				"\r\n" + 
				"\\chapter{Conclusion}\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\\chapter*{References}\r\n" + 
				"\r\n" + 
				"\\end{document}";
	}
	
}
