package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import commands.CommandsFactory;
import model.Blank;
import model.Report;

public class AddLatexCommandTest implements InterfaceTest {

	@Override
	@Test
	public void execute() {
		
		Report report =new Report();
		CommandsFactory factory=new CommandsFactory();
		String temp=factory.getCommand("Chapter").execute();
		report.addContent(temp);
		String temp2=report.getContent();
		String s2="\\documentclass[11pt,a4paper]{report}\r\n" + 
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
				"\\end{document}\n\\chapter{...}\n";
		assertEquals(s2,temp2);
		
		Blank blank2=new Blank();
		temp=factory.getCommand("Section").execute();
		blank2.addContent(temp);
		temp2=blank2.getContent();
		s2="\n\\section{}\n";
		assertEquals(s2,temp2);
		
		Blank blank3=new Blank();
		temp=factory.getCommand("SubSection").execute();
		blank3.addContent(temp);
		temp2=blank3.getContent();
		s2="\n\\subsection{}\n";
		assertEquals(s2,temp2);
		
		Report report2 =new Report();
		temp=factory.getCommand("SubSubSection").execute();
		report2.addContent(temp);
		temp2=report2.getContent();
		s2="\\documentclass[11pt,a4paper]{report}\r\n" + 
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
				"\\end{document}\n\\subsubsection{}\n";
		assertEquals(s2,temp2);
		
		Blank blank5=new Blank();
		temp=factory.getCommand("ItemList").execute();
		blank5.addContent(temp);
		temp2=blank5.getContent();
		s2="\n\\begin{itemize}\r\n\n" + 
				"\\item ...\r\n\n" + 
				"\\item ...\r\n\n" + 
				"\\end{itemize}\n";
		assertEquals(s2,temp2);
		
		Blank blank6=new Blank();
		temp=factory.getCommand("EnumList").execute();
		blank6.addContent(temp);
		temp2=blank6.getContent();
		s2="\n\\begin{enumerate}\r\n\n" + 
				"\\item ...\r\n\n" + 
				"\\item ...\r\n\n" + 
				"\\end{enumerate}\n";
		assertEquals(s2,temp2);
		
		
		Blank blank7=new Blank();
		temp=factory.getCommand("Figure").execute();
		blank7.addContent(temp);
		temp2=blank7.getContent();
		s2="\n\\begin{figure}\r\n\n" + 
				"\\includegraphics[width=...,height=...]{...}\r\n\n" + 
				"\\caption{....}\\label{...}\r\n\n" + 
				"\\end{figure}\n";
		assertEquals(s2,temp2);
		
		
		Blank blank8=new Blank();
		temp=factory.getCommand("Table").execute();
		blank8.addContent(temp);
		temp2=blank8.getContent();
		s2="\n\\begin{table}\r\n\n" + 
				"\\caption{....}\\label{...}\r\n\n" + 
				"\\begin{tabular}{|c|c|c|}\r\n\n" + 
				"\\hline\r\n\n" + 
				"... &...&...\\\\\r\n\n" + 
				"... &...&...\\\\\r\n\n" + 
				"... &...&...\\\\\r\n\n" + 
				"\\hline\r\n\n" + 
				"\\end{tabular}\r\n\n" + 
				"\\end{table}\n";
		assertEquals(s2,temp2);
	}

}
