package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
//unit testing with mockito and junit is a basic testing skills for java learners.
@RunWith(MockitoJUnitRunner.class)//same as configuration in springframework.
public class somebusiness_mockitotest_annotation {
	
	@Mock
	dataservice datamock;//similar to dataservice datamock=mock(dataservice.class);
	
	@InjectMocks
	Somebusniessimpl business;//similar to Somebusniessimpl business= new Somebusniessimpl(datamock);here mock is injected to somebusinessimpl.
	
	@Test
	public void testdata() {
		when(datamock.retrieve()).thenReturn(new int[]{24,6,15});//here dataservice stub class is replaced by using mockito.
															//Mockito helps to reduce unnecessary code.here it reduces the class called dataservice.
		//any class object which calls retrieve method is retuned new int[]{24,6,15} value.
		assertEquals(24,business.findgreatestfromalldata());//no need to implement the retrieve method from the dataservicce interface when you use mock.
		//inline feature of eclipse is used in result varaible.otherwise, this code looks like same as below.
	}
	@Test
	public void testdata2() {
		when(datamock.retrieve()).thenReturn(new int[]{24,6});//here mockito helps to modify the data with only two array ssize.above we were passing 3 array size data.
		int result= business.findgreatestfromalldata();//so mockito gives you flexibility.
		assertEquals(24,result);//any class object which calls retrieve method is retuned new int[]{24,6} value.
		//here inline feature of eclipse is not used.
	}	
		@Test
		public void testdata3() {
			when(datamock.retrieve()).thenReturn(new int[]{});
			int result= business.findgreatestfromalldata();
			assertEquals(Integer.MIN_VALUE,result);//here the min value is returned.

		
	}
	
}
