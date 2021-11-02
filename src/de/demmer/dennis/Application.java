package de.demmer.dennis;

public class Application {
	
	
	public static void main(String[] args) {
	

		
		Smartphone s1 = new Smartphone();
		Smartphone s2 = new Smartphone();
		Smartphone s3 = new Smartphone();
//		
//		
		s1.color = "schwarz";
		s2.color = "blau";
		s3.color = "grau";
		
		s1.model = "Samsung s20";
		s2.model = "huawei p20 pro";
		s3.model = "OnePlus 7t";
		
		Smartphone.osVersion = 5;
//		
		System.out.println(s1.color);
		System.out.println(s1.osVersion);
		System.out.println(s2.osVersion);
				
		Smartphone.update();
		
	}
	
}
