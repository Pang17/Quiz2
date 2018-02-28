import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {

	@Test
	public void test() {
		Car c = new Car(35000, 100, 60, 10);
		if ((c.Monthly() == 743.65) && (c.interestPaid() == 9618.79)) 
		{
			
		} else {
			fail("Values do not match");
		}
	}

}
