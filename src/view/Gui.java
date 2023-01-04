package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

import controller.LatexEditorController;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;

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
		
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("Volatile");
		JToggleButton tglbtnStable = new JToggleButton("Stable");
		
		JToggleButton tglbtnVersionmechanism = new JToggleButton("VersionMechanism");
		tglbtnVersionmechanism.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controller.enableVersionMechanism(tglbtnNewToggleButton_1,tglbtnStable);
			}
		});
		tglbtnVersionmechanism.setBounds(759, 157, 152, 25);
		frame.getContentPane().add(tglbtnVersionmechanism);
		
		
		tglbtnNewToggleButton_1.addActionListener(new ActionListener() { //volatile
			public void actionPerformed(ActionEvent e) {
				controller.disableStrategy(tglbtnStable,"Stable",tglbtnNewToggleButton_1);
				controller.Swap_History(tglbtnStable, "Volatile");
			}
		});
		tglbtnNewToggleButton_1.setBounds(648, 232, 137, 25);
		frame.getContentPane().add(tglbtnNewToggleButton_1);
		
		
		tglbtnStable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {   //stable
				controller.disableStrategy(tglbtnNewToggleButton_1,"Volatile",tglbtnStable);
				controller.Swap_History(tglbtnStable, "Stable");
			}
		});
		tglbtnStable.setBounds(857, 232, 137, 25);
		frame.getContentPane().add(tglbtnStable);
		
		JButton tglbtnSavev = new JButton("SaveV");
		tglbtnSavev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.createVolatileStable(textArea,"Volatile");
			}
		});
		tglbtnSavev.setBounds(648, 321, 137, 25);
		frame.getContentPane().add(tglbtnSavev);
		
		JButton tglbtnSaves = new JButton("SaveS");
		tglbtnSaves.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.createVolatileStable(textArea,"Stable");
			}
		});
		tglbtnSaves.setBounds(857, 321, 137, 25);
		frame.getContentPane().add(tglbtnSaves);
		
		JButton btnUndo = new JButton("Undo");
		btnUndo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controller.Undo(textArea,tglbtnNewToggleButton_1,tglbtnStable);
			}
		});
		btnUndo.setBounds(654, 401, 97, 25);
		frame.getContentPane().add(btnUndo);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fs=new JFileChooser(new File("c://"));
				controller.Save_File(textArea,fs);
			}
		});
		btnSave.setBounds(857, 13, 97, 25);
		frame.getContentPane().add(btnSave);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fs=new JFileChooser(new File("c://"));
				try {
					controller.Load_File(textArea,fs);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnLoad.setBounds(966, 13, 97, 25);
		frame.getContentPane().add(btnLoad);
	}
}
