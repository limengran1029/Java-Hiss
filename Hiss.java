package Java_Mengran_Li_Devops18_uppgift1;

public class Hiss {
	final int topfloor =  8;
	final int bottomfloor  = -2;
	private int startfloor;
	private String hissname;
    private int floor;
	
    //constructor
	public Hiss(int startfloor, String hissname) {
		super();
		this.startfloor = startfloor;
		this.hissname = hissname;
		floor = startfloor;
	}
	
	//floor control method
	public void run(int destfloor){
		
		if (destfloor<bottomfloor) {
			System.out.println("Error, the bottom floor is floor "+bottomfloor+"!\n");
		}
		else if (destfloor>topfloor) {
			System.out.println("Error, the top floor is floor "+topfloor+"!\n");
		}
		else if(destfloor == floor) {
			System.out.println("Error, you enter the current floor! \n");
		}
		else {			
			if(floor < destfloor) {
				goUp(destfloor);
			}
			else {
				goDown(destfloor);
			}
			System.out.println("Open the door"+"\n");
			
		}
	}

	//goUp method with delay
	public void goUp(int destfloor) {
		for (int i = floor+1; i <= destfloor; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e){} 
			System.out.println("pling … at floor "+i);
		}
		floor = destfloor;
	}
	
	//goDown method with delay
	public void goDown(int destfloor) {
		for (int i = floor-1; i >= destfloor; i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e){} 
			System.out.println("pling … at floor "+i);
		}
		floor = destfloor;
	}	
	
	//print out the elevator
	@Override
	public String toString() {
		return "Hiss [Hissname=" + hissname + ", topfloor=" + topfloor + ", bottomfloor=" + bottomfloor + ", currentfloor="
				+ floor + "]";
	}

	
	//get and set methods for instance variables
	public int getStartfloor() {
		return startfloor;
	}

	public void setStartfloor(int startfloor) {
		this.startfloor = startfloor;
	}

	public String gethissname() {
		return hissname;
	}

	public void sethissname(String hissname) {
		this.hissname = hissname;
	}

}
