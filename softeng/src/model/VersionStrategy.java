package model;

public interface VersionStrategy {
	public void putVersion(Document document);
	public Document getVersion();
	public void removeVersion();
}
