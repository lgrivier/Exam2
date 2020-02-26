package RoomTypes;

import edu.hfcc.Room;
import edu.hfcc.Space;

public class FullBath extends Room {

	private static final int FULL_BATH = 60;
	
	
	public FullBath(int length, int width) {
		super(length, width);
		this.roomHaveCarpet = false;
	}

	@Override
	public int calculateRoomPrice() {
		
		return this.calculateSquareFootage()*FULL_BATH;
	}

	

}
