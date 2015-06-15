package edu.Bonn.BigData.PLEB.Util;

import java.util.List;

import edu.Bonn.BigData.PLEB.Beans.PLEBPointStructure;
import edu.Bonn.BigData.PLEB.Beans.PLEBQueryResullt;
import edu.Bonn.BigData.PLEB.Beans.Point;

public class binarySearchUtil {

	/**
	 * find the smallest r which the algorithm return "Yes" and return that point
	 * @param trainingBalls
	 * @param queryPoint
	 * @return
	 */
	public static Point search(List<PLEBPointStructure> trainingBalls,Point queryPoint)
	{
		/*
		double result=Double.MIN_VALUE;
		int LowIndex=0;
		int HighIndex=trainingBalls.size()-1;
		while(HighIndex >= LowIndex)
		{
			int middleIndex = (LowIndex + HighIndex) / 2;
			PLEBPointStructure tmpPoint=trainingBalls.get(middleIndex);
			
		}
		*/
		// for the query point , find the smallest r, which (epsilon,r)PLEB return "Yes" which point
		// p in P and return p if such r exist
		for(PLEBPointStructure tmpPoint:trainingBalls)
		{
			PLEBQueryResullt queryResult=tmpPoint.isEpsilonPLEB(queryPoint);
			if(queryResult.isFound())
				return queryResult.getResult();
			
		}
		
		// otherwise return any p in P
		return trainingBalls.get(0).getCenter();
	}
}
