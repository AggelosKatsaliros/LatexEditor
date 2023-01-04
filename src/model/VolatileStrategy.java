package model;

import java.util.ArrayList;

public class VolatileStrategy implements VersionStrategy {
	static ArrayList<String> versions =new ArrayList<String>();
	static int counter=-1;
	
	@Override
	public void putVersion(String document) {
		// TODO Auto-generated method stub
		String txt =document;
		versions.add(txt);
		counter++;
		System.out.println(counter);
		
	}

	@Override
	public String getVersion() {
		if(counter!=-1) {
			return versions.get(counter);
		}
		return null;
	}

	@Override
	public void removeVersion() {
		if(counter==-1) {
			return;
		}else {
			versions.remove(counter);
			counter--;
		}
		

	}
	public ArrayList<String> getArrayList() {
		//System.out.println(versions);
		return versions;
	}
	public void mechanism_Swap(ArrayList<String> array) {
        counter=-1;
        int temp_size=versions.size();
    	for(int i=0; i<temp_size; i++) {
    		versions.remove(0);
    	}
    	
    	for(int i=0; i<array.size(); i++) {
    		versions.add(array.get(i));
    		counter++;
    	}
	}
}
