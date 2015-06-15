package edu.Bonn.BigData.PLEB.Util;

import edu.Bonn.BigData.PLEB.Beans.Point;

public class Utility {

	public static double getR(Point [] points)
	{
		double result=Double.MIN_VALUE;
		String maxDistancePair="";
		for(int i=0;i<points.length;i++)
		{
			for(int j=i+1;j<points.length;j++)
			{
				if(points[i].distanceTo(points[j]) > result)
				{
					result=points[i].distanceTo(points[j]);
					maxDistancePair="distance between ("+points[i].getX()+","+points[i].getY()+") and ("+points[j].getX()+","+points[j].getY()+")" ;
				}
			}
		}
		System.out.println("the max distance is:"+maxDistancePair);
		return result;
	}
}
