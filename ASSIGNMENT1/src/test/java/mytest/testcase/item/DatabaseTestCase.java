package mytest.testcase.item;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ay.coool.AppDB;

public class DatabaseTestCase {
private AppDB DatabaseClassTest;

	@Before
	public void setUp() throws Exception {
		DatabaseClassTest = new AppDB();
	}

	@Test
	public void testDatabase() {
		int partNumber = 1;
		int quantity = 2;
		//assertEquals(2, DatabaseClassTest.SubmitPartForManufacture(partNumber, quantity));
	}
	
}
