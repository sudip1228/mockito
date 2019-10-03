package com.example.demo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class listinterfacetest {

	@Test
	public void testsize() {
		List listmock=mock(List.class);
		when(listmock.size()).thenReturn(10);//everytime you call.it returns 10.
		assertEquals(10,listmock.size());
		assertEquals(10,listmock.size());
		
	}
	@Test
	public void testsize_multiplereturn() {
		List listmock=mock(List.class);
		when(listmock.size()).thenReturn(10).thenReturn(20);//first time called returns 10 and second time returns 20,third time called returns last value which is 20.
		assertEquals(10,listmock.size());
		assertEquals(20,listmock.size());
		assertEquals(20,listmock.size());
		
	}
	@Test
	public void testget() {
		List listmock=mock(List.class);
		when(listmock.get(0)).thenReturn("somestring");
		assertEquals("somestring",listmock.getClass());
		assertEquals("somestring",listmock.get(0));
		assertEquals(null,listmock.get(1));//returns null
		
	}
	@Test
	public void testgetany_genericparameter() {
		List listmock=mock(List.class);
		when(listmock.get(Mockito.anyInt())).thenReturn("somestring");
		assertEquals("somestring",listmock.getClass());
		assertEquals("somestring",listmock.get(0));
		assertEquals("something",listmock.get(1));//now returns "something" because we used Mockito.anyInt().
		
		
	}
	

}
