public class Sirik extends Robot{
	private int price;
	private int totalModel;

	//constructor
	public Sirik(int price){
		super(5,false);
		this.totalModel = 1;
		this.price = price;
	}

	//getter and setter
	public int getTotalModel(){
		return this.totalModel;
	}

	public void addModel(){
		this.totalModel++;
	}

	public long getPrice(){
		if(this.totalModel <= 2){
			return (this.price + (500 * this.getNumberOfParts() * this.getTotalModel()));
		}
		else{
			return (this.price + (500 * this.getNumberOfParts() - (100 * this.getTotalModel())));
		}
	}
}