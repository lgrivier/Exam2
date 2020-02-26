package edu.hfcc;

import org.junit.jupiter.api.Test;

import RoomTypes.Bedroom;
import RoomTypes.FamilyRoom;
import RoomTypes.FullBath;
import RoomTypes.HalfBath;
import RoomTypes.Kitchen;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

class HouseInformationTest {
	
	@Test 
    public void verifyOneRoomHouseFamilyRoomWithCarpetInterface() {
    	Space inputRoom = new FamilyRoom(10,20);
    	
    	assertEquals(7000, inputRoom.calculateRoomPrice());
    	assertEquals(200, inputRoom.calculateSquareFootage());
    }
	
	@Test 
    public void verifyOneRoomHouseFamilyRoomWiithNoCarpet() {
    	List<Room> inputRooms = Arrays.asList(new FamilyRoom(10,20, false));
    	
    	Output actual = new HouseInformation().execute(inputRooms);
    	
    	assertEquals(200, actual.getTotalSquareFoot());
    	assertEquals(5000, actual.getTotalPriceOfHouse());
    	assertEquals(0, actual.getNumberOfBathrooms());
    }
   
	@Test 
    public void verifyOneRoomHouseFamilyRoomWithCarpet() {
    	List<Room> inputRooms = Arrays.asList(new FamilyRoom(10,20));
    	
    	Output actual = new HouseInformation().execute(inputRooms);
    	
    	assertEquals(200, actual.getTotalSquareFoot());
    	assertEquals(7000, actual.getTotalPriceOfHouse());
    	assertEquals(0, actual.getNumberOfBathrooms());
    }
	
	@Test 
    public void verifyRoomsAllDefault() {
    	List<Room> inputRooms = Arrays.asList(new FamilyRoom(10,20), new Kitchen(9,8),
    			new Bedroom(8, 7), new FullBath(7,6), new HalfBath(5,5));
    	
    	Output actual = new HouseInformation().execute(inputRooms);
    	
    	assertEquals(395, actual.getTotalSquareFoot());
    	assertEquals(14530, actual.getTotalPriceOfHouse());
    	assertEquals(1.5, actual.getNumberOfBathrooms());
    }
	
	@Test 
    public void verifyRoomsAllDefaultNoCarpet() {
    	List<Room> inputRooms = Arrays.asList(new FamilyRoom(10,20,false), new Kitchen(9,8),
    			new Bedroom(8, 7, false), new FullBath(7,6), new HalfBath(5,5));
    	
    	Output actual = new HouseInformation().execute(inputRooms);
    	
    	assertEquals(395, actual.getTotalSquareFoot());
    	assertEquals(11970, actual.getTotalPriceOfHouse());
    	assertEquals(1.5, actual.getNumberOfBathrooms());
    }
	
	@Test 
    public void verifyRoomsAllDefaultMixedCarpet() {
    	List<Room> inputRooms = Arrays.asList(new FamilyRoom(10,20,false), new Kitchen(9,8),
    			new Bedroom(8, 7), new FullBath(7,6), new FullBath(10,10),new HalfBath(5,5));
    	
    	Output actual = new HouseInformation().execute(inputRooms);
    	
    	assertEquals(495, actual.getTotalSquareFoot());
    	assertEquals(18530, actual.getTotalPriceOfHouse());
    	assertEquals(2.5, actual.getNumberOfBathrooms());
    }
	
	
}
