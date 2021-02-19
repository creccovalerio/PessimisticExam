package logic;


public class ListOrder {
	
	private static final int ORDERS_SIZE = 6;
	private String[] items = new String[6];
	
	public boolean userOrderList(String[] orders) {
		
		boolean ret = true;
		int counter = 0;
		
		for(int i=0; i<orders.length; i++) {
			counter++;
			if(counter > ORDERS_SIZE) {
				ret = false;
				break;
			}
			else {
				this.items[i] = orders[i];
			}
		}
		return ret;
	}
}
