package com.Task3.Logger_Task4;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HouseContructionCost {
	private static final Logger LOGGER = LogManager.getLogger(HouseContructionCost.class);

	
		private int materialType;
		private boolean automatedHome;
		private double totalArea;

		HouseContructionCost(int materialType,boolean automatedHome,double totalArea){
			this.materialType=materialType;
			this.automatedHome=automatedHome;
			this.totalArea=totalArea;
		}
		double totalCostOfContruction() {
			double totalCost = 0 ;
			switch(materialType) {
			case 1:totalCost = 1200*totalArea;break;
			case 2:totalCost = 1500*totalArea;break;
			case 3:if(automatedHome) {
				totalCost = 2500*totalArea;
				} else {
					totalCost = 1800*totalArea;
				}
			break;
			}
			return totalCost;
		}

	}

	


