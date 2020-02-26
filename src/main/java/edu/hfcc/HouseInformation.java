package edu.hfcc;

import java.util.List;

import RoomTypes.FullBath;
import RoomTypes.HalfBath;

public class HouseInformation {
	
	public Output execute(List<Room> rooms) {
		
		Output output;
		
		int sqFt = 0;
		int totalSquareFoot = 0; 
		double roomPrice = 0;
		double totalHousePrice = 0;
		double quantity = 0;
		double totalBathrooms=0;
		
		
		for(Room aRoom: rooms) {
			sqFt = aRoom.calculateSquareFootage();
			roomPrice = aRoom.calculateRoomPrice();
			
			if(aRoom instanceof FullBath) {
				quantity = 1; 
			}
			else if (aRoom instanceof HalfBath ) {
				quantity = 0.5;
			}
			
			totalSquareFoot = totalSquareFoot + sqFt;
			totalHousePrice = totalHousePrice + roomPrice;
			totalBathrooms= totalBathrooms+quantity;
		}
		
		
		
		//calculate total square footage
				
		//calculate total room price
		
		//determine number of bathrooms
		
		
		return new Output(totalSquareFoot,totalHousePrice, totalBathrooms);
	}

	
}


