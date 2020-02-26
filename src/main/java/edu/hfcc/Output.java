package edu.hfcc;

public class Output {
	
	private double numberOfBathrooms;
	private int totalSquareFoot;
	private double totalPriceOfHouse;
	
	
	public Output(int totalSquareFoot, double totalPriceOfHouse, double numberOfBathrooms) {
		this.numberOfBathrooms= numberOfBathrooms;
		this.totalSquareFoot = totalSquareFoot;
		this.totalPriceOfHouse = totalPriceOfHouse;
	}
	

	public double getTotalSquareFoot() {
		return this.totalSquareFoot;
	}

	public double getTotalPriceOfHouse() {
		return this.totalPriceOfHouse;
	}
	
	public double getNumberOfBathrooms() {
		return this.numberOfBathrooms;
	}
	
	

}
