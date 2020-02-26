package edu.hfcc;

public abstract class Room implements Space{

	private int length;
	private int width;
	protected boolean roomHaveCarpet;
	private static final int DEFAULT_PRICE = 25;
	private static final int CARPET_PRICE = 35;
	
	
	
	public Room(int length, int width, boolean roomHaveCarpet) {
		this.length = length;
		this.width = width;
		this.roomHaveCarpet = roomHaveCarpet;
	}
	
	public Room(int length, int width) {
		this.length = length;
		this.width = width;
		this.roomHaveCarpet = true;
		
	}
	
	
	public int getWidth() {
		return width;
	}
	public int getLength() {
		return length;
	}
	
	public boolean isRoomHaveCarpet() {
		return roomHaveCarpet;
	}
	
	
	
	public int calculateSquareFootage() {
		
		return this.getWidth()*this.getLength();
	}
	
	public int calculateRoomPrice() {
		
		if(isRoomHaveCarpet()==true) {
			return this.calculateSquareFootage()*CARPET_PRICE;
		}
		else {
			return this.calculateSquareFootage()*DEFAULT_PRICE;
		}
		
	}
	
	
	
}
