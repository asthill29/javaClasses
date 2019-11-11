package review1;

public class HotelRoom {

	public static void main(String[] args) {
		
		//for Loop
		for (int i = 1; i<=5; i++) {
			System.out.println("*");
		}

		//NestedLoop
		
		//room and floor
		// to print 1111 2222 we print the floor
		// and to print 1234 1234 we print the room
		for (int floor=1; floor<=4; floor++) {
			System.out.print("Floor"+ floor+" -> ");
			for (int room=1; room<=6; room++) {
			//	System.out.print(floor+"."+room+" ");
				System.out.print(room+" ");
			}
			System.out.println();

		}
		
		
		
		
		
		
	}

}
