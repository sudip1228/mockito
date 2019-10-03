package com.example.demo;

public class Somebusniessimpl {

	private dataservice data;
	
	
	
	public Somebusniessimpl(dataservice data) {
		super();
		this.data = data;
	}



	int findgreatestfromalldata() {
		int [] d=data.retrieve();
		int greatest= Integer.MIN_VALUE;
		for(int value:d)
		{
			if (value>greatest)
		{
			greatest=value;
		}
			
	}
		return greatest;
}
}
