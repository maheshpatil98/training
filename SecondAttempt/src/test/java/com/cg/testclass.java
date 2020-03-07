package com.cg;



import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testclass {

	private hello hi;
	
	@Before
	public void init() {
		hi = new hello();
	}
	
	@After
	public void clean() {
		hi = null;
	}
	
	@Test
	public void testsayhello() {
		assertEquals("Hello Boss",hi.sayhello());
	}
}
