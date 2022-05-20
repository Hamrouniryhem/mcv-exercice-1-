package Beans;
 public class RandomBean {
	private double nb;
	 
	
	public double getnb(){
		return nb;
	}
	public void setnb(double nb){
		this.nb=nb;
	}
	public RandomBean(){
		setnb(0);
	}
	
	public double calcule(double nb){
		 return Math.random()*nb;
	
	}
}