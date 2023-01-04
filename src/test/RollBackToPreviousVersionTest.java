package test;
import static org.junit.Assert.assertEquals;


import org.junit.Test;

import model.VersionStrategy;
import model.VersionsManager;
import model.VersionsStrategyFactory;
import model.Book;

public class RollBackToPreviousVersionTest implements InterfaceTest {

	@Override
	@Test
	public void execute() {
		Book book =new Book();
		String content=book.getContent();
		VersionsStrategyFactory factory= new VersionsStrategyFactory();
		//Volatile
		VersionStrategy strategy= factory.createStrategy("Volatile");
		VersionsManager manager =new VersionsManager(strategy);
		manager.enable();
		strategy.putVersion(content);
		String content2=content+"hello";
	    content2=manager.rollbackToPreviousVersion();
		assertEquals(content,content2);
	}

}
