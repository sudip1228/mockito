package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class somebusinessstubtest {
	Somebusniessimpl business= new Somebusniessimpl(new dataservicestub());
	@Test
	public void testdata() {
		int result= business.findgreatestfromalldata();
		assertEquals(24,result);
	}
}
