package com.Task3.Logger_Task4;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
import java.io.*;

public class Client {
	private static final Logger LOGGER = LogManager.getLogger(Client.class);

	

		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			Scanner scan =new Scanner(System.in);
			Demo Interest = new Demo(4000.0,2.5,10.0);
			LOGGER.error("Simple Interest:".getBytes());
			LOGGER.error("%.2f\n",Interest.simpleInterest());
			LOGGER.error("Compound Interest:".getBytes());
			LOGGER.error("%.2f\n",Interest.compoundInterest());
			LOGGER.error("Press 1 for STANDARD MATERIAL\nPress 2 for ABOVE STANDARD MATERIAL\nPress 3 for HIGH STANDARD MATERIAL\n".getBytes());
			int materialType = scan.nextInt();
			boolean automatedHome;
			if(materialType==3) {
				LOGGER.error("If you want AUTOMATED HOME Enter true otherwise false\n".getBytes());
				automatedHome=scan.nextBoolean();
			}else {
				automatedHome = false;
			}
			LOGGER.error("Enter the total area of the house\n".getBytes());
			double totalArea=scan.nextDouble();
			HouseContructionCost houseCost = new HouseContructionCost(materialType,automatedHome,totalArea);
			LOGGER.error("%.2f\n",houseCost.totalCostOfContruction());
			scan.close();

		}


	
	}


