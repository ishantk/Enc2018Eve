class Counter{
	
	private int count;
	
	void setCount(int c){
		count = c;
	}
	
	int getCount(){
		return count;
	}
	
	void incrementCount(){
		count++;
	}
}
public class ObjectAgain {

	public static void main(String[] args) {
		
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = c1;
		
		c1.setCount(1);
		c2.setCount(1);
		c3.setCount(2);
		
		c1.incrementCount();
		c2.incrementCount();
		c3.incrementCount();
		
		c3.incrementCount();
		c3.incrementCount();
		c1.incrementCount();
		
		c1.incrementCount();
		c2.incrementCount();
		
		System.out.println("c1 count is: "+c1.getCount()); // 8 7 1 
		System.out.println("c2 count is: "+c2.getCount()); // 3 3 3 
		System.out.println("c3 count is: "+c3.getCount()); // 8 7 8

	}

}
