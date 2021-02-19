package test;


import org.junit.Test;
import static org.junit.Assert.*;
import logic.ListOrder;

public class testOrderLiist {
	
	@Test
	public void testWindow() {
		boolean actual = false;
		String[] orderList = {"antipastoMare", "antipastoMontagna", "Spaghetti", "Risotto", "carne", "patatine", "acqua"};
		
		ListOrder listOrder = new ListOrder();
		actual = listOrder.userOrderList(orderList);
		
		assertEquals(true, actual);
	}
	
	
}
