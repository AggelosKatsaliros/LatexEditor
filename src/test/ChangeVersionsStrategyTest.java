package test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.VersionStrategy;
import model.VersionsManager;
import model.VersionsStrategyFactory;
public class ChangeVersionsStrategyTest implements InterfaceTest{
	@Override
	@Test
	public void execute() {
		VersionsStrategyFactory factory= new VersionsStrategyFactory();
		//Volatile
		VersionStrategy strategy= factory.createStrategy("Volatile");
		VersionsManager manager =new VersionsManager(strategy);
		VersionStrategy strategy2= factory.createStrategy("Stable");
		VersionsManager manager2 =new VersionsManager(strategy2);
		manager.enable();
		boolean temp_enabled=manager.isEnabled();
		if(manager.isEnabled()) {
			manager2.disable();
		}
		boolean flag_stable=manager2.isEnabled();
		assertEquals(!temp_enabled,flag_stable);
		
		
		/////////////////////////////////////////////////
		
		//Stable
				VersionStrategy strategy_volatile= factory.createStrategy("Volatile");
				VersionsManager manager_volatile =new VersionsManager(strategy);
				VersionStrategy strategy_stable= factory.createStrategy("Stable");
				VersionsManager manager_stable =new VersionsManager(strategy2);
				manager_stable.enable();
				boolean temp_stable_enabled=manager_stable.isEnabled();
				if(manager_stable.isEnabled()) {
					manager_volatile.disable();
				}
				boolean flag_new_stable=manager_volatile.isEnabled();
				assertEquals(!temp_stable_enabled,flag_new_stable);
		
		
		
		
		
	}
}
