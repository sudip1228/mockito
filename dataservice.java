package com.example.demo;

 public interface dataservice{
	int[]retrieve();
}
 
 class dataservicestub implements dataservice
 {

	@Override
	public int[] retrieve() {
		
		return  new int[]{24,6,15};
	}
	 
 }