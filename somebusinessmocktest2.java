package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class somebusinessmocktest2 {
	
	dataservice datamock=mock(dataservice.class);
	Somebusniessimpl business= new Somebusniessimpl(datamock);
	
	@Test
	public void testdata() {
		when(datamock.retrieve()).thenReturn(new int[]{24,6,15});//here dataservice stub class is replaced by using mockito.
															//Mockito helps to reduce unnecessary code.here it reduces the class called dataservice.
		int result= business.findgreatestfromalldata();//any class object which calls retrieve method is retuned new int[]{24,6,15} value.
		assertEquals(24,result);
	}
	@Test
	public void testdata2() {
		when(datamock.retrieve()).thenReturn(new int[]{24,6});//here mockito helps to modify the data with only two array ssize.above we were passing 3 array size data.
		int result= business.findgreatestfromalldata();//so mockito gives you flexibility.
		assertEquals(24,result);//any class object which calls retrieve method is retuned new int[]{24,6} value.
	}
	
}
