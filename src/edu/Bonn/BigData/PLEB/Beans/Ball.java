package edu.Bonn.BigData.PLEB.Beans;

public class Ball {

	private Point center;
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public double getRedius() {
		return redius;
	}

	public void setRedius(double redius) {
		this.redius = redius;
	}

	private double redius;
	
	public Ball(Point center,double redius)
	{
		this.center=center;
		this.redius=redius;
		
	}
	
	/**
	 * this function take one point as an argument and check if the current circle contains the point or not
	 * @param param
	 * @return
	 */
	public boolean isContainPoint(Point param)
	{
		if(center.distanceTo(param)<redius)
			return true;
		return false;
		
	}
}
