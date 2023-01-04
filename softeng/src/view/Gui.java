package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

import controller.LatexEditorController;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gui {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		LatexEditorController controller =new LatexEditorController();
		frame = new JFrame();
		frame.setBounds(100, 100, 1103, 748);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(22, 147, 603, 541);
		frame.getContentPane().add(textArea);
		
		JButton btnReport = new JButton("Report");
		btnReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controller.createDocument(textArea, "Report");
				
			}
		});
		btnReport.setBounds(0, 13, 97, 25);
		frame.getContentPane().add(btnReport);
		
		JButton btnBook = new JButton("Book");
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.createDocument(textArea, "Book");
				
			}
		});
		btnBook.setBounds(109, 13, 97, 25);
		frame.getContentPane().add(btnBook);
		
		JButton btnLetter = new JButton("Letter");
		btnLetter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.createDocument(textArea, "Letter");
				
			}
		});
		btnLetter.setBounds(218, 13, 97, 25);
		frame.getContentPane().add(btnLetter);
		
		JButton btnArticle = new JButton("Article");
		btnArticle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.createDocument(textArea, "Article");
				
				
			}
		});
		btnArticle.setBounds(326, 13, 97, 25);
		frame.getContentPane().add(btnArticle);
		
		JButton btnBlank = new JButton("Blank");
		btnBlank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.createDocument(textArea, "Blank");
				
			}
		});
		btnBlank.setBounds(435, 13, 97, 25);
		frame.getContentPane().add(btnBlank);
		
		JButton btnChapter = new JButton("Chapter");
		btnChapter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.createCommand(textArea, "Chapter");
			}
		});
		btnChapter.setBounds(0, 69, 97, 25);
		frame.getContentPane().add(btnChapter);
		
		JButton btnSection = new JButton("Section");
		btnSection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.createCommand(textArea, "Section");
			}
		});
		btnSection.setBounds(109, 69, 97, 25);
		frame.getContentPane().add(btnSection);
		
		JButton btnSubsection = new JButton("SubSection");
		btnSubsection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.createCommand(textArea, "SubSection");
			}
		});
		btnSubsection.setBounds(218, 69, 97, 25);
		frame.getContentPane().add(btnSubsection);
		
		JButton btnSubsubsection = new JButton("SubSubSection");
		btnSubsubsection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.createCommand(textArea, "SubSubSection");
			}
		});
		btnSubsubsection.setBounds(326, 69, 119, 25);
		frame.getContentPane().add(btnSubsubsection);
		
		JButton btnItemlist = new JButton("ItemList");
		btnItemlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.createCommand(textArea, "ItemList");
			}
		});
		btnItemlist.setBounds(470, 69, 97, 25);
		frame.getContentPane().add(btnItemlist);
		
		JButton btnEnumlist = new JButton("EnumList");
		btnEnumlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.createCommand(textArea, "EnumList");
			}
		});
		btnEnumlist.setBounds(579, 69, 97, 25);
		frame.getContentPane().add(btnEnumlist);
		
		JButton btnTable = new JButton("Table");
		btnTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.createCommand(textArea, "Table");
			}
		});
		btnTable.setBounds(688, 69, 97, 25);
		frame.getContentPane().add(btnTable);
		
		JButton btnFigure = new JButton("Figure");
		btnFigure.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.createCommand(textArea, "Figure");
			}
		});
		btnFigure.setBounds(814, 69, 97, 25);
		frame.getContentPane().add(btnFigure);
	}
}
