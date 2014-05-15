package com.ruks.serivces;

public class CalculatorService {
	
	Calculator cal;
	
	public CalculatorService() {
		cal=Calculator.getCal();
	}
	
	public void setX(int x){		
		cal.setX(x);
//		System.out.println("set x: "+CalculatorService.X+" = "+x);
	}
	public void setY(int y){
		cal.setY(y);
//		System.out.println("set y: "+CalculatorService.Y+" = "+y);
	}
	public int getSum(){		
		return cal.getSum();		
	}
}
