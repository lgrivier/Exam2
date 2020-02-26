package RoomTypes;

import edu.hfcc.Room;
import edu.hfcc.Space;

public class FamilyRoom extends Room {

	
	public FamilyRoom(int length, int width, boolean roomHaveCarpet) {
		super(length, width, roomHaveCarpet);
	}
	
	public FamilyRoom(int length, int width) {
		super(length, width);
		this.roomHaveCarpet = true;
	}

	
}
