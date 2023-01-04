package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class StableStrategy implements VersionStrategy {
	static ArrayList<String> versions2 =new ArrayList<String>();
	 static int counter2=-1;
	 static int flagre=-1;
	@Override
	public void putVersion(String document) {
		// TODO Auto-generated method stub
		String txt =document;
		versions2.add(txt);
		counter2++;
		//System.out.println(counter2);
		File f = new File("stabledata");
		
		if(f.exists()) { 
			ArrayList<String> nameList=new ArrayList<String>(); //////////  diabazei to arxeio file pou ftiaksame gia to stable
	        try
	        {
	          FileInputStream fis = new FileInputStream("stabledata");
	          ObjectInputStream ois = new ObjectInputStream(fis);

	          nameList =  (ArrayList) ois.readObject();

	           ois.close();
	           fis.close();
	        }
	        catch (IOException ioe)
	        {
	          ioe.printStackTrace();
	          return;
	        }
	        catch (ClassNotFoundException c)
	        {
	          System.out.println("Class not found");
	          c.printStackTrace();
	          return;
	        }
	       
	        
	        try
	        {
	        	if(versions2.size()>0) {
	        		nameList.add(versions2.get(versions2.size()-1));
		            FileOutputStream fos = new FileOutputStream("stabledata");
		            ObjectOutputStream oos = new ObjectOutputStream(fos);
		            oos.writeObject(nameList);
		            oos.close();
		            fos.close();
	        	}
	        	
	    
	        }
	        catch (IOException ioe)
	        {
	            ioe.printStackTrace();
	        }
		}else {
			try
	        {
				
	            FileOutputStream fos = new FileOutputStream("stabledata");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(versions2);
	            oos.close();
	            fos.close();
	        }
	        catch (IOException ioe)
	        {
	            ioe.printStackTrace();
	        }
		}
		
    }
	

	@Override
	public String getVersion() {
		ArrayList<String> nameList=new ArrayList<String>(); //////////  diabazei to arxeio file pou ftiaksame gia to stable
        try
        {
          FileInputStream fis = new FileInputStream("stabledata");
          ObjectInputStream ois = new ObjectInputStream(fis);

          nameList =  (ArrayList) ois.readObject();

           ois.close();
           fis.close();
        }
        catch (IOException ioe)
        {
          ioe.printStackTrace();
          return null;
        }
        catch (ClassNotFoundException c)
        {
          System.out.println("Class not found");
          c.printStackTrace();
          return null;
        }
        for(String name : nameList) {
        	System.out.println(nameList.size());
        	System.out.println(nameList.get(nameList.size()-1));
        	break;
        }
        
        
        try
        {
        	if(nameList.size()>0) {
        		String s=nameList.get(nameList.size()-1);
            	nameList.remove(nameList.size()-1);
                FileOutputStream fos = new FileOutputStream("stabledata");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(nameList);
                oos.close();
                fos.close();
                return s;
        	}
        	
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
        
        
        //System.out.println(nameList);
        
		return null;
	}

	@Override
	public void removeVersion() {
		if(counter2==-1) {
			return;
		}else {
			versions2.remove(counter2);
			counter2--;
		}

	}
	public ArrayList<String> getArrayList() {
		return versions2;
	}
    public void mechanism_Swap(ArrayList<String> array) {
    	File f = new File("stabledata");
    	///if(array.size()!=0 && f.exists()==true) {
    		//counter2=-1;
        	//int temp_size=versions2.size();
        	//for(int i=0; i<temp_size; i++) {
        		//versions2.remove(0);
        	//}
        	for(int i=0; i<array.size(); i++) {
        		versions2.add(array.get(i));
        		counter2++;
        	}
        	//if(array.size()!=0 && f.exists()==false) {
        		try
                {
        			
                    FileOutputStream fos = new FileOutputStream("stabledata");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(versions2);
                    oos.close();
                    fos.close();
                }
                catch (IOException ioe)
                {
                    ioe.printStackTrace();
                }
        	//}
        	
    	//}
    	
    }
}
