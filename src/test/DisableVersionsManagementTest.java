package test;
import static org.junit.Assert.assertEquals;


import org.junit.Test;

import model.VersionStrategy;
import model.VersionsManager;
import model.VersionsStrategyFactory;
import model.Book;
public class DisableVersionsManagementTest implements InterfaceTest {

	@Override
	@Test
	public void execute() {
		// TODO Auto-generated method stub
		Book book =new Book();
		String content= book.getContent();
		VersionsStrategyFactory factory= new VersionsStrategyFactory();
		//Volatile
		VersionStrategy strategy= factory.createStrategy("Volatile");
		VersionsManager manager =new VersionsManager(strategy);
		manager.enable();
		strategy.putVersion(content);
		manager.disable();
		book.addContent("hello");
		String content2=book.getContent();
		if(manager.isEnabled()) {
			strategy.putVersion(content2);
		}
		//String new_content=book.getContent();
		String history_content=strategy.getVersion();
		assertEquals(content,history_content);
		
	}

}
