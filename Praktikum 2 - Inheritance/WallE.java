public class WallE extends Robot{
	private long mileage;

	//a constructor
	public WallE(long mileage , boolean isActive){
		super(10 , isActive);
		this.mileage = mileage;
	}

	//getter and setter

	public long getMileage(){
		return this.mileage;
	}

	public void addMileage(long increment){
		this.mileage += increment;
	}

	public long getPrice(){
		if(this.getIsActive()){
			return (1000 * this.getMileage());
		}
		else{
			return ((1000 * this.getMileage()) + 500);
		}
	}
}