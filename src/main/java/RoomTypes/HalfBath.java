package RoomTypes;

import edu.hfcc.Room;
import edu.hfcc.Space;

public class HalfBath extends Room  {

	private static final int HALF_BATH = 50;
	
	public HalfBath(int length, int width) {
		super(length, width);
		this.roomHaveCarpet = false;
	}

	@Override
	public int calculateRoomPrice() {
		
		return this.calculateSquareFootage()*HALF_BATH;
	}

	
	

}
