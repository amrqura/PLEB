package edu.Bonn.BigData.PLEB.Beans;

public class PLEBQueryResullt {

	boolean Found;
	public boolean isFound() {
		return Found;
	}
	public void setFound(boolean found) {
		Found = found;
	}
	public Point getResult() {
		return result;
	}
	public void setResult(Point result) {
		this.result = result;
	}
	Point result;
	
	public PLEBQueryResullt(boolean found,Point point) {
		// TODO Auto-generated constructor stub
		this.Found=found;
		result=point;
		
	}
}
