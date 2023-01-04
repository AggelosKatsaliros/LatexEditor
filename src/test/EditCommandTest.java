package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.Blank;
import model.DocumentManager;
import model.Report;

public class EditCommandTest implements InterfaceTest {

	@Override
	@Test
	public void execute() {
		String temp="hello";
		
		Report report =new Report();
		report.addContent(temp);
		String temp4=report.getContent();
		//report.addContent(temp);
		String s="\\documentclass[11pt,a4paper]{report}\r\n" + 
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
				"\\end{document}hello";
		//System.out.println(temp2);
		assertEquals(s,temp4);
		
		
		Blank blank=new Blank();
		blank.addContent(temp);
		String temp2=blank.getContent();
		String s2="hello";
		assertEquals(s2,temp2);
	}

}
