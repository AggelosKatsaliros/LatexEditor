package model;

import java.util.ArrayList;

public interface VersionStrategy {
	public void putVersion(String document);
	public String getVersion();
	public void removeVersion();
	public ArrayList getArrayList();
	public void mechanism_Swap(ArrayList<String> array);
}
