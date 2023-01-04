package model;

public interface Command extends Cloneable{
	public Command clone();
	public String getContent();	
	
}
