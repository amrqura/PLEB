package edu.Bonn.BigData.PLEB.Beans;

public class PLEBPointStructure {

	Point center;
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public Ball getRedBall() {
		return redBall;
	}

	public void setRedBall(Ball redBall) {
		this.redBall = redBall;
	}

	public Ball getBlueBall() {
		return blueBall;
	}

	public void setBlueBall(Ball blueBall) {
		this.blueBall = blueBall;
	}

	Ball redBall;
	Ball blueBall;
	
	public PLEBPointStructure(Point center,double redius,double epsilon) {
		this.center=center;
		redBall=new Ball(center, redius);
		blueBall=new Ball(center, (1.0+epsilon)*redius);
		
	}
	
	/**
	 * check if the corresponding circles contain the point or not
	 * @param queryPoint
	 * @return
	 */
	public PLEBQueryResullt isEpsilonPLEB(Point queryPoint)
	{
		System.out.println("testing with  Point:"+center+" and redius "+redBall.getRedius());
		PLEBQueryResullt result=new PLEBQueryResullt(false, new Point(Double.MIN_VALUE, Double.MIN_VALUE));
		// 1- if the query point is contained in the red ball, then return "Yes" and the center of blue ball.
		if(redBall.isContainPoint(queryPoint))
		{
			System.out.println("The point "+center+" and redius "+redBall.getRedius() +" rteurn true in red circle");
			result.setFound(true);
			result.setResult(blueBall.getCenter());
		}
		//2- if there is no blue ball containing q , then return "No"
		else if(!blueBall.isContainPoint(queryPoint))
		{
			return result;
		}
		// 3- if the point is contained in the blue ball , but not in the red ball , then return either 
		//"yes" and center of blue ball containing the point or return  "NO"
		else if(blueBall.isContainPoint(queryPoint)&& !redBall.isContainPoint(queryPoint))
		{
			System.out.println("the point "+center+ "and redius "+redBall.getRedius() +" return true in blue circle, not in the red circle");

			result.setFound(true);
			result.setResult(blueBall.getCenter());
		}
		return result;
		
	}
}
