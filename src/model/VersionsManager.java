package model;

import java.util.ArrayList;

public class VersionsManager {
	private VersionStrategy version;
	static boolean enabled=false;
	public VersionsManager(VersionStrategy version){
		this.version=version;
	}
	public void setStrategy(VersionStrategy versionStrategy) {
		version=versionStrategy;
	}
	public void setCurrentVersion(String newDocumentVersion){
		version.putVersion(newDocumentVersion);
	}
	public String rollbackToPreviousVersion(){
		String s=version.getVersion();
		version.removeVersion();
		
		return s;
	}
	public void enable() {
		enabled=true;
	}
	public void disable() {
		enabled=false;
	}
	public boolean isEnabled() {
		if(enabled==true) {
			return true;
		}
		return false;
	
	}
	public ArrayList<String> getEntireHistory() {
		return version.getArrayList();
	}
	public void change_Mechanism(ArrayList<String> array) {
		version.mechanism_Swap(array);
	}
}
