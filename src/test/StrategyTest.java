package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import model.DocumentManager;
import model.VersionStrategy;
import model.VersionsStrategyFactory;

public class StrategyTest implements InterfaceTest {

	@Override
	@Test
	public void execute() {
		DocumentManager manager= new DocumentManager();
		String s = manager.createDocument("Report").getContent();
		VersionsStrategyFactory factory= new VersionsStrategyFactory();
		//Volatile
		VersionStrategy strategy= factory.createStrategy("Volatile");
		strategy.putVersion(s);
		strategy.putVersion(s+"hello");
		ArrayList<String> sample =new ArrayList<String>();
		sample=strategy.getArrayList();
		//System.out.println(sample);
		assertEquals(sample.get(0),s);
		
		//Stable
		strategy= factory.createStrategy("Stable");
		strategy.putVersion(s);
		strategy.putVersion(s+"hello");
		sample=strategy.getArrayList();
		//System.out.println(sample);
		assertEquals(sample.get(0),s);
	}

}
