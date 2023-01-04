package test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.junit.Test;

import model.VersionStrategy;
import model.VersionsManager;
import model.VersionsStrategyFactory;
import model.Book;
public class LoadFileTest implements InterfaceTest {

	@Override
	@Test
	public void execute() {
	    Book book =new Book();
	    String content="hello";
		JFileChooser f_new=new JFileChooser();
		f_new.setDialogTitle("Load File");
		String load_content="";
		if(f_new.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
			File file =f_new.getSelectedFile();
			Scanner input;
			try {
				input = new Scanner(file);
				while(input.hasNext()) {
					load_content+=input.nextLine();
					//load_content+="\n";
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		assertEquals(content,load_content);
	}

}