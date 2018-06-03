package mytest.test.security;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ay.coool.Security;
import com.ay.coool.MYSecurity;


public class SecurityTest {
	public Security securityClassUnderTest;

	@Before
	public void setUp() throws Exception {
		securityClassUnderTest = new MYSecurity();

	}

	@Test
	public void testAuthenticateUser() {
		boolean isAuthorized = true;	 
		String delearId = "XXX-1234-ABCD-1234";
		String delearAccessKey = "kkklas8882kk23nllfjj88290";
		boolean val = securityClassUnderTest.IsDealerAuthorized(delearId, delearAccessKey);
		assertEquals(isAuthorized, val);
	}


}
