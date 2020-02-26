package RoomTypes;

import edu.hfcc.Room;
import edu.hfcc.Space;

public class Bedroom extends Room {


	public Bedroom(int length, int width, boolean roomHaveCarpet) {
		super(length, width, roomHaveCarpet);
		
	}

	public Bedroom(int length, int width) {
		super(length, width);
		this.roomHaveCarpet = true;
	}


}
