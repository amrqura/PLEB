package edu.Bonn.BigData.PLEB.Beans;

public class Point {

	double x;
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	double y;
	
	public Point(double x,double y)
	{
		setX(x);
		setY(y);
		
	}
	
	public double distanceTo(Point other)
	{
		double result=Math.sqrt(Math.pow((x-other.x),2)+Math.pow((y-other.y),2));
		return result;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+x+","+y+")";
	}
}
