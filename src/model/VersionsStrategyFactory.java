package model;

import java.util.HashMap;

import commands.Command;

public class VersionsStrategyFactory {
	private HashMap<String, VersionStrategy> strategyMap = new HashMap<String, VersionStrategy>();
	public VersionsStrategyFactory(){
		VolatileStrategy volatileStrategy =new VolatileStrategy();
		StableStrategy stableStrategy =new StableStrategy();
		strategyMap.put("Volatile",volatileStrategy);
		strategyMap.put("Stable",stableStrategy);
	}
	public VersionStrategy createStrategy(String strategy){
		return strategyMap.get(strategy); //returns either volatile or stable
	}
}
