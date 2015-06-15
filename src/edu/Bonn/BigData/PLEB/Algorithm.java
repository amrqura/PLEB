package edu.Bonn.BigData.PLEB;

import java.util.ArrayList;
import java.util.List;

import edu.Bonn.BigData.PLEB.Beans.Ball;
import edu.Bonn.BigData.PLEB.Beans.PLEBPointStructure;
import edu.Bonn.BigData.PLEB.Beans.Point;
import edu.Bonn.BigData.PLEB.Util.Utility;
import edu.Bonn.BigData.PLEB.Util.binarySearchUtil;

public class Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point [] trainingPoints=new Point[5];
		// filling the points
		trainingPoints[0]=new Point(0, 0);
		trainingPoints[1]=new Point(0, 2);
		trainingPoints[2]=new Point(0, 4);
		trainingPoints[3]=new Point(2, 0);
		trainingPoints[4]=new Point(4, 0);
		
		double Epsilon=0.2;
		double R=Utility.getR(trainingPoints); // R is the max inter-Point distance
		System.out.println("the value of R is "+R);
		List<Double> r =new  ArrayList<Double>();
		List<PLEBPointStructure> trainingBalls=new ArrayList<PLEBPointStructure>();
		double insertedRValue=Math.pow((1.0+Epsilon), -1*Math.ceil((1+(Math.log(2)/Math.log(1.0+Epsilon)))));
		double maxInsertedValue=R/Epsilon;
		while(insertedRValue<=maxInsertedValue)
		{
			r.add(insertedRValue);
			// generate set of Balls
			for(int i=0;i<trainingPoints.length;i++)
				trainingBalls.add(new PLEBPointStructure(trainingPoints[i], insertedRValue,Epsilon));
			
			insertedRValue*=(1.0+Epsilon);
		}
		
		Point queryPoint=new Point(4, 3);
		// use binary search to find the smallest r that return "Yes"
		//Point result=binarySearchUtil.lineaarSearch(trainingBalls, queryPoint);
		Point result=binarySearchUtil.binarySearch(trainingBalls, queryPoint);

		System.out.println("the nearest point for the query point is="+result);
				
		
	}
	


}
