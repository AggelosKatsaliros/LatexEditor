package model;

public class Letter extends Document {
	public Letter() {
		this.content="\\documentclass{letter}\r\n" + 
				"\\usepackage{hyperref}\r\n" + 
				"\\signature{Sender's Name}\r\n" + 
				"\\address{Sender's address...}\r\n" + 
				"\\begin{document}\r\n" + 
				"\r\n" + 
				"\\begin{letter}{Destination address....}\r\n" + 
				"\\opening{Dear Sir or Madam:}\r\n" + 
				"\r\n" + 
				"I am writing to you .......\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\\closing{Yours Faithfully,}\r\n" + 
				"\r\n" + 
				"\\ps\r\n" + 
				"\r\n" + 
				"P.S. text .....\r\n" + 
				"\r\n" + 
				"\\encl{Copyright permission form}\r\n" + 
				"\r\n" + 
				"\\end{letter}\r\n" + 
				"\\end{document}";
	}
	
}
