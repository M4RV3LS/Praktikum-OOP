public class Bumblebee extends Robot{
	private int totalTransformation;

	//a constructor
	public Bumblebee(int numberOfParts , boolean isActive){
		super(numberOfParts , isActive);
		this.totalTransformation = 1;
	}

	//getter and setter
	public int getTotalTransformation(){
		return this.totalTransformation;
	}

	public void addTransformation(){
		this.totalTransformation++;
	}

	public long getPrice(){
		if(this.getIsActive()){
			return (this.getNumberOfParts() * 1000 * this.getTotalTransformation());
		}
		else{
			return( this.getNumberOfParts() * 1000);
		}
	}
}